package address.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import address.Menu;


public class AddressBook {
     TreeMap<String, TreeSet<AddressEntry>> addressEntryList = new TreeMap<>();
     TreeSet<AddressEntry> getPre(String start_ln){
         SortedMap<String, TreeSet<AddressEntry>> tempMap;
         TreeSet<AddressEntry> tempSet = new TreeSet<>();
         tempMap = addressEntryList.subMap(start_ln, start_ln + Character.MAX_VALUE);
         for (Map.Entry<String, TreeSet<AddressEntry>> entry : tempMap.entrySet()){
             tempSet.addAll(entry.getValue());
         }
         return  tempSet;
     }
  //  TreeMap<String, AddressEntry> addressEntryList = new TreeMap<>();

    public void list() {
        int count = 1;

        // Set<Map.Entry<String, AddressEntry>> entries = addressEntryList.entrySet();
        for (Map.Entry<String, TreeSet<AddressEntry>> entry : addressEntryList.entrySet()) {

            //System.out.printf("%-3s" + entry + "\n\n", i + ":");
            System.out.printf("%-3s" + entry.getValue().toString() + "\n\n", count + ":");
            //System.out.println(count + ": " + entry.getValue().toString());
            count = count + 1;
//            System.out.println( entry.getKey() + " => "
//                    + entry.getValue().toString());
        }

    }
//    public void list() {
//        int count = 0;
//        Set<Map.Entry<String, TreeSet<AddressEntry>>> entries = addressEntryList.entrySet();
//        // Set<Map.Entry<String, AddressEntry>> entries = addressEntryList.entrySet();
//        for (Map.Entry<String, TreeSet<AddressEntry>> entry : entries) {
//            count = count + 1;
//            System.out.println(count + ": " + entry.getValue().toString());
////            System.out.println( entry.getKey() + " => "
////                    + entry.getValue().toString());
//        }
//
//    }





    public void add(AddressEntry addressEntry) {
        TreeSet<AddressEntry> value = new TreeSet<>();
        value.add(addressEntry);
        addressEntryList.put(addressEntry.getPrompt_LastName(),value);

    }

    public void find(String ln){
//       if (addressEntryList.containsKey(ln)){
//           System.out.println("yes its here" + addressEntryList.get(ln));
//       }
//       else
//           System.out.println("Sorrry" + ln + " isn;t in the addy");
        TreeSet<AddressEntry> s = this.getPre(ln);
        Scanner keyboard = new Scanner(System.in);
        ArrayList<AddressEntry> list = new ArrayList<>();
        int i = 1;
        System.out.println("The following entries were found in the address book,");

        for(AddressEntry entry : s){
            list.add(entry);
            System.out.printf("%-3s" + entry + "\n\n", i + ":");
            i++;
        }

    }
    public void remove(String ln){
        // first obtain a sect which

        TreeSet<AddressEntry> s = this.getPre(ln);
        Scanner keyboard = new Scanner(System.in);

        try{
            if(s.size()== 1){
                System.out.println(("The following entry was found in the address book. "));
                System.out.printf("%-3s" + s.first() + "\n",  " ");
                System.out.println("Hit 'y' to remove the entry or 'n' to return to main menu" );
                if (keyboard.nextLine().compareTo("y")==0)
                    addressEntryList.get(s.first().getPrompt_LastName()).remove(s.first());
            } else if(s.size() > 1){
                ArrayList<AddressEntry> list = new ArrayList<>();
                int i = 1;
                System.out.println("The following entries were found in the address book,"
                + "selectnumber of entry you wish to remove: \n");

                for(AddressEntry entry : s){
                    list.add(entry);
                    System.out.printf("%-3s" + entry + "\n\n", i + ":");
                    i++;
                }
                


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }





    public void readFromFile(String filename){
        try{
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            //counter number of entries
            String fn, ln ;

            //read from file
            while((line=br.readLine()) != null) {
                //this.add(new AddressEntry(line,line,line,line,line,Integer.parseInt(br.readLine()),line,line));
                add(new AddressEntry(line, br.readLine(), br.readLine(), br.readLine(), br.readLine(), Integer.parseInt(br.readLine()), br.readLine(), br.readLine()));

            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

}
