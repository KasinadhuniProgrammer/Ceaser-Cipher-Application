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

  public void encrypt(Message userMessage) {
    String regularMessage = userMessage.getUserMessage();
    for(int i = 0; i < regularMessage.length(); i++) { 
      char currentLetter = regularMessage.charAt(i);
      int currentIndexOf = plainAlphabet.indexOf(currentLetter);
      System.out.print(cipherAlphabet.charAt(currentIndexOf));
    }
    
  }

  public void decrypt(Message userMessage) {
    String encryptedMessage = userMessage.getUserMessage();
    for(int i = 0; i < encryptedMessage.length(); i++) {
      char currentLetter = encryptedMessage.charAt(i);
      int currentIndexOf = cipherAlphabet.indexOf(currentLetter);
      System.out.print(plainAlphabet.charAt(currentIndexOf));
    }
    
  }

}
