import java.util.Scanner;

public class Message { 
  private String userMessage;
  private String userQuestion;
  private boolean ifEncrypted;
  private Scanner theScanner = new Scanner(System.in);


  public Message() {
    userMessage = "Hello World";
    ifEncrypted = false;

  }

  public Message(String userMessage, boolean ifEncrypted) {
    this.userMessage = userMessage;
    this.ifEncrypted = ifEncrypted;
  }

  public String getUserMessage() {
    System.out.println("Enter your message: ");
    userMessage = theScanner.nextLine();
    return userMessage;
  }

  public boolean messageEncrypted() {
    System.out.println("Enter CRYPT if your message is Encrypted, else enter DECRYPT");
    userQuestion = theScanner.nextLine();
    if(userQuestion == "CRYPT") {
      ifEncrypted = true;
    } else {
      ifEncrypted = false;
    }
    return ifEncrypted;
  }

  public String convertString(String a) {
    userMessage = a; 
    return a; 

  }


}
