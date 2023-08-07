
import java.util.Scanner;

public final class Main {

    private Main() {

    }
    public static void main(String[] args) {
        Scanner myOptionInput = new Scanner(System.in);
        Scanner myInput = new Scanner(System.in);
        Scanner myInputKey = new Scanner(System.in);
        System.out.println("This is a program that encrypts and decrypts data. \n Please select from the options provided");
        System.out.println("=============================================================================================");

        System.out.println("OPTIONS");
        System.out.println("1. ENCRYPT");
        System.out.println("2. DECRYT");
        System.out.println("3. EXIT");
        boolean exit = false;
        int option, key = 1;
        String data, result;
        Cipher cipher = new Cipher();
        System.out.println("=============================================================================================");
        do {
            System.out.println("Enter an option to continue");
            System.out.println("=============================================================================================");
            option = Helper.isValidNumber(myOptionInput.nextLine());
            if (option == 1 || option == 2) {
                System.out.println("Please enter key. Key should be a number between 1-25");
                key = Helper.isValidNumber(myInputKey.nextLine(), key);
                cipher.setSteps(key);
            }
