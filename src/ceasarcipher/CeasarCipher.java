
package ceasarcipher;

import java.util.Scanner;

public class CeasarCipher {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter WORDS to Encrypt : ");
        String text = sc.nextLine();
        
        System.out.print("\nNUMBER OF KEY to Encrypt/Decrypt : ");
        int key = sc.nextInt();
        
        int selection;
        System.out.println("\nMenu : ");
        
        System.out.println("1)Encryption");
        System.out.println("2)Decryption");
        System.out.print("Enter your Choices: ");
        selection = sc.nextInt();
        
        
        switch (selection) {
            case 1:
                {
                    System.out.print("\nEncrypted Word is : ");
                    char[] chars = text.toCharArray();
                    for(char c : chars){
                        c += key;
                        System.out.print(c);
                    }       System.out.println("\n");
                    break;
                }
            case 2:
                {
                    System.out.print("\nDecrypted Word is : ");
                    char[] chars = text.toCharArray();
                    for(char c : chars){
                        c -= key;
                        System.out.print(c);
                    }       System.out.println("\n");
                    break;
                }
            default:
                System.out.println("None of the Choices");
                
        }
    }
    
}
