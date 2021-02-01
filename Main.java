class Main {
  public static void main(String[] args) {
    Cipher testCipher = new Cipher(5);
    Message userMessage = new Message();
    userMessage.getUserMessage();
    testCipher.encrypt(userMessage);
  }
}
