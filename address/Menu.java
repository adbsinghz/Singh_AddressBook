package address;

import address.data.AddressBook;
import address.data.AddressEntry;

import java.util.Scanner;

public class Menu {

    public static AddressEntry NewEntry() {

        String fn = prompt_FirstName();
        String ln = prompt_LastName();
        String street = prompt_Street();
        String city = prompt_City();
        String state = prompt_State();
        Integer zip = prompt_Zip();
        String email = prompt_Email();
        String phone = prompt_Telephone();



        AddressEntry ab = new AddressEntry(fn,ln,street,city,state,zip,email,phone);
        return ab;


    }


    public static String prompt_FirstName(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("First Name: ");
        return keyboard.nextLine();
    }
    public static String prompt_LastName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Last Name: ");
        return keyboard.nextLine();
    }
    public static String prompt_Street() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Street: ");
        return keyboard.nextLine();
    }
    public static String prompt_City() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("City: ");
        return keyboard.nextLine();
    }
    public static String prompt_State() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("State: ");
        return keyboard.nextLine();
    }

    public static Integer prompt_Zip() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Zip: ");
        return Integer.parseInt(keyboard.nextLine());
    }

    /**
     * Prompts the user for an Telephone address
     * @return a String that is a PhoneNumber
     */
    public static String prompt_Telephone() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Telephone: ");
        return keyboard.nextLine();
        }

    /**
     * Prompts the user for an email address
     * @return a string
     */
    public static String prompt_Email() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Email: ");
        return keyboard.nextLine();
    }

    /**
     * Displays the menu for user to select any operation thats listed
     * in AddressBook
     */
    public static void display_Menu() {
        System.out.print("\n\n********************\n" +
                "Please enter your menu selection\n"+
                "a) Loading From File\n"+
                "b) Addition\n"+
                "c) Remove \n" +
                "d) Find\n"+
                "e) Listing\n"+
                "f) Quit\n" +
                "**************************** \n\n");
    }



}

