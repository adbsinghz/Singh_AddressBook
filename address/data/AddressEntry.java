package address.data;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/***
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

    /***
     *
     * @return to string method to display
     */
    public String toString() {
        return (this.prompt_FirstName  + " " +this.prompt_LastName + "\n" +
           this.prompt_Street + "\n" + this.prompt_City  + ", " + this.prompt_State + " " + this.prompt_Zip  +
                "\n" + this.prompt_Email + "\n" + this.prompt_Telephone + "\n");
    }

    /***
     *
     * @return the First Name
     */

    public String getPrompt_FirstName() {
        return prompt_FirstName;
    }

    /***
     *
     * @param prompt_FirstName Sets the First name in Strings
     */

    public void setPrompt_FirstName(String prompt_FirstName) {
        this.prompt_FirstName = prompt_FirstName;
    }
    /***
     *
     * @return the Last Name in Strings
     */

    public String getPrompt_LastName() {
        return prompt_LastName;
    }
    /***
     *
     * @return Sets the First Name in Strings
     */

    public void setPrompt_LastName(String prompt_LastName) {
        this.prompt_LastName = prompt_LastName;
    }
    /***
     *
     * @return the Street Name in Strings
     */

    public String getPrompt_Street() {
        return prompt_Street;
    }
    /***
     *
     * @return Set the Street Name in Strings
     */
    public void setPrompt_Street(String prompt_Street) {
        this.prompt_Street = prompt_Street;
    }

    /***
     *
     * @return the City Name in Strings
     */

    public String getPrompt_City() {
        return prompt_City;
    }
    /***
     *
     * @return Sets the City Name in Strings
     */

    public void setPrompt_City(String prompt_City) {
        this.prompt_City = prompt_City;
    }
    /***
     *
     * @return the States Name in Strings
     */

    public String getPrompt_State() {
        return prompt_State;
    }
    /***
     *
     * @return Sets the States Name in Strings
     */

    public void setPrompt_State(String prompt_State) {
        this.prompt_State = prompt_State;
    }
    /***
     *
     * @return the Zip Number in Int
     */


    public Integer getPrompt_Zip() {
        return prompt_Zip;
    }
    /***
     *
     * @return Set the Zip Number in Int
     */

    public void setPrompt_Zip(Integer prompt_Zip) {
        this.prompt_Zip = prompt_Zip;
    }
    /***
     *
     * @return the Phone Number in String
     */

    public String getPrompt_Telephone() {
        return prompt_Telephone;
    }
    /***
     *
     * @return Set the Phone Number in String
     */

    public void setPrompt_Telephone(String prompt_Telephone) {
        this.prompt_Telephone = prompt_Telephone;
    }
    /***
     *
     * @return the Email in String
     */

    public String getPrompt_Email() {
        return prompt_Email;
    }
    /***
     *
     * @return Sets the Email in String
     */

    public void setPrompt_Email(String prompt_Email) {
        this.prompt_Email = prompt_Email;
    }

    /***
     *
     * @param o Passes other object and compare with last name
     * @return if its true or false
     */

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
