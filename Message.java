
public class Message
{
    // instance variables - replace the example below with your own
    private String theMessage;
    private boolean isEncrypted;

    /**
     * Constructor for objects of class Message
     */
    public Message()
    {
        // initialise instance variables
       theMessage = "this is a test";
       isEncrypted = false;
    }

    public Message(String theMessage, boolean isEncrypted)
    {
        // // initialise instance variables
       this.theMessage = theMessage;
       this.isEncrypted = isEncrypted;
    }
    
    public String getMessage()
    {
        return theMessage;
    }
    
    
    public boolean isEncrypted()
    {
        return isEncrypted;
    }
}
