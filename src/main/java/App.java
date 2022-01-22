import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        boolean runCipher = true;

        while (runCipher) {


            System.out.println("choose encrypt or decrypt ");
            String choice = myScanner.nextLine();

            if((choice.equals("encrypt") || choice.equals("decrypt")) != true){
                System.out.println("Not the available option, try again! ");
            }

            else if (choice.equals("encrypt")) {
                //if they choose encrypt

                System.out.println("Enter message to be Encrypted Here");
                String input = myScanner.nextLine();

                System.out.println("Enter a key");
                int key = myScanner.nextInt();

                Encryption e = new Encryption(input,key);
                String encrypted = Encryption.encrypt(e);

                System.out.println("Encrypted message: " + encrypted);

            } else if (choice.equals("decrypt")) {
                //if they choose decrypt

                System.out.println(("Enter message to be Decrypted Here"));
                String msgInputD = myScanner.nextLine();

                System.out.println("Enter the key you used");
                int keyinputD = myScanner.nextInt();
                //here i passed the input value from terminal as my argument in d object of Decryption constructor
                Decryption d = new Decryption(msgInputD,keyinputD);
                String decrypted = Decryption.decrypt(d);

                System.out.println("Decrypted message: " + decrypted);

            }

           break;


        }
    }






    }

