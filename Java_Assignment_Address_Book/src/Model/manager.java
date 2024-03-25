package Model;

import View.ConfirmationFrameAdd;
import View.ConfirmationFrameDelete;
import View.ConfirmationFrameUpdate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class manager extends addressBook{
    ArrayList<addressBook> aB = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();
    final private String filePath = "C://Users//Disha M Patil//Downloads//Document from Manas//Java_Assignment_Address_Book//src//Model//Contacts.json";
    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;

    public manager(){
        readJsonFile(filePath);
    }

    public ArrayList<addressBook> readJsonFile(String filePath){
        aB.removeAll(aB);
        try{
            JsonNode node = objectMapper.readTree(new File(filePath));

            if(node.isArray()){
                for (JsonNode node1 : node){
                    String name = node1.get("name").asText();
                    String phoneNumber = node1.get("phoneNumber").asText();
                    String emailAddress = node1.get("emailAddress").asText();
                    String Address = node1.get("address").asText();

                    addressBook aB_temp = new addressBook(name,phoneNumber,emailAddress,Address);
                    aB.add(aB_temp);
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return aB;
    }

    public void writeJsonFile(String filePath, ArrayList<addressBook> aB) throws IOException {
        objectMapper.writeValue(Paths.get(filePath).toFile(), aB);
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("Name");
        headers.add("Phone Number");
        headers.add("Email ID");
        headers.add("Address");

        return headers;
    }

    public ArrayList<String> getLine(int line) {
        ArrayList<String> AddressBookDetails = new ArrayList<String>();

        AddressBookDetails.add(aB.get(line).getName());
        AddressBookDetails.add(String.valueOf(aB.get(line).getPhoneNumber()));
        AddressBookDetails.add(aB.get(line).getEmailAddress());
        AddressBookDetails.add(aB.get(line).getAddress());

        return AddressBookDetails;
    }

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> AddressBook_subset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            AddressBook_subset.add(getLine(i));
        }
        return AddressBook_subset;
    }

    public int getFirstLineToDisplay() {
        return this.firstLineIndex;
    }


    public int getLastLineToDisplay() {
        setLastLineToDisplay(this.firstLineIndex + this.linesBeingDisplayed - 1);
        return this.lastLineIndex;
    }


    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }


    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineIndex = firstLine;
    }


    public void setLastLineToDisplay(int lastLine) {
        this.lastLineIndex = lastLine;
    }


    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesBeingDisplayed = numberOfLines;
    }

    public ArrayList<addressBook> getTable(){
        readJsonFile(filePath);
        return aB;
    }

    public void addNewContact(String name, String phoneNumber, String emailAddress, String Address){
        readJsonFile(filePath);
        aB.add(new addressBook(name, phoneNumber, emailAddress,Address));
        try{
            writeJsonFile(filePath, aB);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        ConfirmationFrameAdd confirmationFrame = new ConfirmationFrameAdd();
    }

    public void delContact(String name){
        readJsonFile(filePath);
        for (int i = 0; i < aB.size(); i++) {
            if (name.equals( aB.get(i).getName())){
                aB.remove(i);
            }
        }
        try {
            writeJsonFile(filePath, aB);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ConfirmationFrameDelete del=new ConfirmationFrameDelete();
    }

    public ArrayList<String> searchContact(String name){
        ArrayList<String > details = new ArrayList<>();
        readJsonFile(filePath);
        for (int i = 0; i < aB.size(); i++){
            if(name.equals(aB.get(i).getName())){
                details.add(aB.get(i).getName());
                details.add(String.valueOf(aB.get(i).getPhoneNumber()));
                details.add(aB.get(i).getEmailAddress());
                details.add(aB.get(i).getAddress());
                break;
            }
        }

        return details;

    }
    public void searchContact(String namesearch, String name, String phoneNumber, String emailAddress, String Address)
    {
        readJsonFile(filePath);
        for (int i=0; i<aB.size(); i++){
            if(namesearch.equals(aB.get(i).getName())){
                aB.get(i).setName(name);
                aB.get(i).setPhoneNumber(phoneNumber);
                aB.get(i).setEmailAddress(emailAddress);
                aB.get(i).setAddress(Address);
                break;
            }
        }
    }

    public void editContact(String namesearch, String name, String phoneNumber, String emailAddress, String Address){
        readJsonFile(filePath);
        for (int i = 0; i < aB.size(); i++) {
            if (namesearch.equals( aB.get(i).getName())){
                aB.get(i).setName(name);
                aB.get(i).setPhoneNumber(phoneNumber);
                aB.get(i).setEmailAddress(emailAddress);
                aB.get(i).setAddress(Address);
                break;
            }
        }

        try {
            writeJsonFile(filePath, aB);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ConfirmationFrameUpdate cf=new ConfirmationFrameUpdate();
    }


}
