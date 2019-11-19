package springExampleJournalDev.dependencyinjaction.service;

public class SMService implements MessageService {
    @Override
    public void sendMessage(String msg, String rec){
        System.out.println("Sms sent to "+rec+ "with message" +msg);
    }
}
