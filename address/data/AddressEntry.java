package address.data;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/**
 * purpose: This class is used to contain and provide data necessary
 */


public class AddressEntry implements Comparable<AddressEntry> {
    private String prompt_FirstName ;
    private String prompt_LastName;
    private String prompt_Street;
    private String prompt_City;
    private String prompt_State;
    private Integer prompt_Zip;
    private String prompt_Telephone;
    private String prompt_Email;

    public AddressEntry(){

    }
    public AddressEntry(String prompt_FirstName, String prompt_LastName, String prompt_Street, String prompt_City, String prompt_State, Integer prompt_Zip, String prompt_Email, String prompt_Telephone) {
        this.prompt_FirstName = prompt_FirstName;
        this.prompt_LastName = prompt_LastName;
        this.prompt_Street = prompt_Street;
        this.prompt_City = prompt_City;
        this.prompt_State = prompt_State;
        this.prompt_Zip = prompt_Zip;
        this.prompt_Telephone = prompt_Telephone;
        this.prompt_Email = prompt_Email;
    }
    public String toString() {
        return (this.prompt_FirstName  + " " +this.prompt_LastName + "\n" +
           this.prompt_Street + "\n" + this.prompt_City  + ", " + this.prompt_State + " " + this.prompt_Zip  +
                "\n" + this.prompt_Email + "\n" + this.prompt_Telephone + "\n");
    }

    public String getPrompt_FirstName() {
        return prompt_FirstName;
    }

    public void setPrompt_FirstName(String prompt_FirstName) {
        this.prompt_FirstName = prompt_FirstName;
    }

    public String getPrompt_LastName() {
        return prompt_LastName;
    }

    public void setPrompt_LastName(String prompt_LastName) {
        this.prompt_LastName = prompt_LastName;
    }

    public String getPrompt_Street() {
        return prompt_Street;
    }

    public void setPrompt_Street(String prompt_Street) {
        this.prompt_Street = prompt_Street;
    }

    public String getPrompt_City() {
        return prompt_City;
    }

    public void setPrompt_City(String prompt_City) {
        this.prompt_City = prompt_City;
    }

    public String getPrompt_State() {
        return prompt_State;
    }

    public void setPrompt_State(String prompt_State) {
        this.prompt_State = prompt_State;
    }

    public Integer getPrompt_Zip() {
        return prompt_Zip;
    }

    public void setPrompt_Zip(Integer prompt_Zip) {
        this.prompt_Zip = prompt_Zip;
    }

    public String getPrompt_Telephone() {
        return prompt_Telephone;
    }

    public void setPrompt_Telephone(String prompt_Telephone) {
        this.prompt_Telephone = prompt_Telephone;
    }

    public String getPrompt_Email() {
        return prompt_Email;
    }

    public void setPrompt_Email(String prompt_Email) {
        this.prompt_Email = prompt_Email;
    }


    @Override
    public int compareTo(AddressEntry o) {
        return this.getPrompt_LastName().compareTo(o.getPrompt_LastName());
//        if(this.getPrompt_Zip() > o.getPrompt_Zip()){
//            return 1;
//        }
//        else
//            return -1;
    }
}
