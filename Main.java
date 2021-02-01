import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Satvik's Cipher Application!");
    System.out.println("-------------------------------------------");
    Scanner mainScanner = new Scanner(System.in);
    System.out.println("Enter the shift: ");
    int userCipherShift = mainScanner.nextInt();
    Cipher testerCipher = new Cipher(userCipherShift);
    Message mainMessage = new Message();
    System.out.print("enter E if you want to encrypt this message, else enter D: ");
    char userChoice = mainScanner.next().charAt(0);
    if(userChoice == 'E') {
      testerCipher.encrypt(mainMessage);
    } else {
      testerCipher.decrypt(mainMessage);
    }

    //Cipher testCipher = new Cipher(5);
    //Message userMessage = new Message();
    //testCipher.encrypt(userMessage);
  }
}
