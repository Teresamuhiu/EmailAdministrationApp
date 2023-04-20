package com.TeresaMuhiu;


import java.util.Scanner;

public class Email {
    //create objects

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10; //set length of random password
    private String department;
    private String email;
    private String alternateEmailAddress;
    private String companySuffix = "xyzcompany.com";
    private int mailCapacity = 500;


    //Create a constructor to receive the first and last name
    //Constructor take String firstName and String lastName as the parameters

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
       // System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);

        //Call a method asking for department
        //Return the department
        this.department = setDepartment();
        System.out.println("Your department is: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate email
        //first name and last name
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your email is: " + email);
    }

    //Determine the department
    private String setDepartment() {
        System.out.print("Worker: " + firstName + "\n" + "Choose Your Department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n");
        //read the above option using scanner
        Scanner userInput = new Scanner(System.in);
        int departmentChoice = userInput.nextInt();//User will enter either 0, 1, 2, 3

        if (departmentChoice == 1) {
            return "Sales";
        }else if(departmentChoice == 2){
            return "Development";
        }else if (departmentChoice == 3){
            return "Accounting";
        }else {
            return ""; //return nothing
        }

    }


    //Generate a random password
    private String randomPassword(int length){
        String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$%&*";
        char[] passwordChar = new char[length];
        for (int i = 0; i < length; i++){
           int randomValue =  (int)(Math.random() * setPassword.length());
           passwordChar[i] = setPassword.charAt(randomValue);
        }
        return new String(passwordChar);
    }

    //Set the mailbox capacity

    //encapsulation
    public void setMailCapacity(int capacity) {
        this.mailCapacity = capacity;
    }

    //Set the alternate email

    public void setAlternateEmailAddress(String alternateEmail){
        this.alternateEmailAddress = alternateEmail;
    }

    //Change the password

    public void changePassword(String passwordNew ){
        this.password = passwordNew;
    }

    //get methods


    public int getMailCapacity() {
        return mailCapacity;
    }

    public String getAlternateEmailAddress(){
        return alternateEmailAddress;
    }

    public String getPassword(){
        return password;
    }

    public String showInformation() {
        return "DISPLAY NAME IS: " + firstName + " " + lastName + "\n" +
                "YOUR COMPANY EMAIL IS: " + email + "\n" + "YOUR MAILBOX CAPACITY IS: " +
                mailCapacity + "MB";
    }


}
