package ie.atu.encapsulation;

public class SecretMessage{
    private String message;

        //Constructor//
        public SecretMessage(String message){
            this.message= message;    
        }
       //Display the secret message
       public void displayMessage(){
        System.out.println("Secret Message: " + message);
    }
}
