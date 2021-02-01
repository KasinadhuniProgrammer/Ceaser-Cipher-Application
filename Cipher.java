
public class Cipher {
  private String plainAlphabet;
  private String cipherAlphabet;
  

  public Cipher(int shift) {
    plainAlphabet = "abcdefghijklmnopqrstuvwxyz";
    cipherAlphabet = createCipherAlphabet(shift);
  }

  public String createCipherAlphabet(int theShift) {
    plainAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String substitutionLetters = plainAlphabet.substring(0, theShift);
    String remainingAlphabet = plainAlphabet.substring(theShift, plainAlphabet.length());
    cipherAlphabet = remainingAlphabet + substitutionLetters;
    return cipherAlphabet;
  }

  public Message encrypt(Message userMessage) {
    String cipherLetter = "";
    if(userMessage.messageEncrypted() == true) {
      System.out.println("ERROR: MESSAGE IS ALREADY ENCRYPTED");
    } else {
      String plainText = userMessage.getUserMessage();
      String cipherText = "";
      for(int i = 0; i < plainText.length(); i++) {
        char currentChar = plainText.charAt(i);
        int currentIndexOf = plainAlphabet.indexOf(currentChar);
        //System.out.println(currentIndexOf);
        System.out.println(+cipherAlphabet.charAt(currentIndexOf));

      }

    }
    return userMessage;
  }

  public Message decrpyt(Message userMessage) {
    return userMessage;
  }

}
