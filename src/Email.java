import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailCapacity = 500;
    private String email;
    private int defaultPasswordLegnth = 16;
    private String alternateEmail;
    private String companySuf = "otienoatuti.com";

    // constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println(" Email Created: " + this.firstName + " " + this.lastName);

        // call a method asking for the department
        this.department = setDepartment();
        System.out.println("Deparment: " + this.department);

        // call a method that resets a random password
        this.password = randomPassword(defaultPasswordLegnth);
        System.out.println("Your Password is " + this.password);

        // Combiningelements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuf;
        System.out.println("Your email is: " + email);

    }

    // ask for department
    private String setDepartment() {
        System.out.print(
                "Enter the department\n1 for sales\n2 for Developement\n3 for accounting\n4 for none\nEnter the Department Code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return " ";
        }
    }

    // Generate random password
    private String randomPassword(int legnth) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
        char[] password = new char[legnth];
        for (int i = 0; i < legnth; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    // set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailCapacity = capacity;
    }

    // set an alternate email
    public void setAlternateMail(String altMail) {
        this.alternateEmail = altMail;
    }

    // Change password
    public void SetPassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailCapacity;
    };

    public String getAlternateEmail() {
        return alternateEmail;
    };

    public String getPassword() {
        return password;
    };

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMAPANY EMAIL: " + email + "\nMAILBOX CAPACITY: "
                + mailCapacity + "mb";
    }

}
