import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter thine First Name: ");
        Scanner scan = new Scanner(System.in);
        String nameFirst = scan.next();

        System.out.print("Enter thine Second Name: ");
        Scanner scann = new Scanner(System.in);
        String nameSecond = scann.next();

        Email em1 = new Email(nameFirst, nameSecond);
        System.out.println(em1.showInfo());
    }
}
