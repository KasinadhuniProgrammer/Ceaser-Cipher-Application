public class Cipher {
  private String plainAlphabet;
  private String cipherAlphabet;
  

  public Cipher(int shift) {
    plainAlphabet = "abcdefghijklmnopqrstuvwxyz";
    cipherAlphabet = createCipherAlphabet(shift);
  }

  private String createCipherAlphabet(int thShift) {
    return "";
  }

  public Message encrypt(Message theMessage) {
    return theMessage;
  }

  public Message decrpyt(Message theMessage) {
    return theMessage;
  }

}
