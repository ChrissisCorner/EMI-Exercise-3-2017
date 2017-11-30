package de.mbranig.emiexercise3;

/**
 * Created by Chrissi on 30.11.2017.
 */

public class Contacts implements java.io.Serializable{
    private String title;
    private String firstname;
    private String lastname;
    private String addresse;
    private String zip;
    private String city;
    private String country;

    //Konstruktor
    Contacts(String title, String firstname, String lastname, String addresse, String zip, String city, String country){
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.addresse = addresse;
        this.zip = zip;
        this.city = city;
        this.country = country;

    }




    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }


    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }


    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }


    public String getAddresse(){
        return addresse;
    }
    public void setAddresse(String addresse){
        this.addresse = addresse;
    }


    public String getZip(){
        return zip;
    }
    public void setZip(String zip){
        this.zip = zip;
    }


    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }


    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }

}
