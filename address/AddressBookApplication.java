package address;

import address.data.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class AddressBookApplication {
    /**
     * Creates an AddressBook initializes the AddressBook with some AddressEntry
     *then prompts the user to add, delete, list and search from the entries.
     * @param args command line arguments passed to main
     */
    public static void main(String[] args) {

        //creates instance of AddressBook
        AddressBook ab = new AddressBook();
       // initAddressBookExercise(ab);


        //Allows the user to select an option from Menu
        Scanner keyboard = new Scanner(System.in);
        String answer;

        boolean continue_ = true;
        while(continue_){

            //Displaying menu
            Menu.display_Menu();
            answer = keyboard.nextLine();
            System.out.println("\n\n");

            switch(answer){
                case "a" -> {
                  // System.out.println("Enter in FileName: ");
                    //ab.readFromFile(keyboard.nextLine());
                    ab.readFromFile("/Users/arshdeepsingh/Desktop/testfile.txt");
                }
                case "b" -> ab.add(Menu.NewEntry());
                case "c"-> {//remove an address entry
                    System.out.println("Enter in Last Name of contract to remove");
                    ab.remove(keyboard.nextLine());
                }
                case "d" ->{
                    System.out.println("Enter in all or beginnig of last name");
                    ab.find(keyboard.nextLine());
                }
                case "e" -> ab.list(); //sorted address entry
                case "f" -> {
                    System.out.println("Quitting. ");
                    continue_=false;
                }
                default -> System.out.println("Error "+ answer + " is not a valid entry");



            }
        }



       // initAddressBookExercise(ab);
       // AddressBookApplication jk = new AddressBookApplication();

        //jk.init("/Users/arshdeepsingh/Downloads/PDF slides/testinto.txt");
//        ab.readFromFile("/Users/arshdeepsingh/Desktop/testfile.txt");
//        ab.list();
////          Menu aj = new Menu();
////          ab.add(aj.NewEntry());
//          ab.find(keyboard.nextLine());
////        ab.list();



    }

    public static void initAddressBookExercise(AddressBook ab) {
      //  AddressEntry ab1 = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"209-455-4111","arshsingha00@gmail.com");
     //   AddressEntry ab3 = new AddressEntry("Arfsdsh","Sinfdfdgh","Refdfdd Ribbon","Mantfdfdeca","CgdgA",953337,"209-45f5-4111","arshsinggha00g@gmail.com");

       // AddressEntry ab2 = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"209-455-4111","arshsingha00@gmail.com");

      //  AddressEntry ab2 = new AddressEntry();
       // ab.readFromFile("/Users/arshdeepsingh/Downloads/PDF slides/testinto.txt");
    //    ab.add(ab1);
       // ab.remove(ab2);
      //  ab.add(ab2);


    }
//    public static void init(String filename){
//        String [] A;
//        int i = 0;
//        A = new String[8];
//        try {
//            File myObj = new File(filename);
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                //String data = myReader.nextLine();
//                //System.out.println(data);
//
//                A[i] = myReader.nextLine();
//
//                System.out.println(A[i]);
//                i++;
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
}
