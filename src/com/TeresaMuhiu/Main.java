package com.TeresaMuhiu;

public class Main {

    public static void main(String[] args) {
	// Email Application
        //Generate an email: firstname.lastname@department.company.com
        //Show: department(sales, development, accounting), if none leave blank
        //Generate a random String for a password
        //Set methods to change password, set mail capacity, define alternate email address
        //Get methods to display name, email and mail capacity


        //create object
        Email emailObject1 = new Email("Teresa", "Muhiu");

        //call showInfomation method defined in Email class
        System.out.println(emailObject1.showInformation());




    }
}
