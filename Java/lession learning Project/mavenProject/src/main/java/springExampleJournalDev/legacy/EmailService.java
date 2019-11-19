package springExampleJournalDev.legacy;

public class EmailService {
    public void sendEmail(String message, String receive){
        System.out.println("Your email is send to"+receive+ "with message" + message);

    }
}
