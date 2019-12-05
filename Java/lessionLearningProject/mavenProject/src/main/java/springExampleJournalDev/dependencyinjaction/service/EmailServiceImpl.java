package springExampleJournalDev.dependencyinjaction.service;

public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec){
        System.out.println("Email send to rec" +rec+ "with Message"+msg );
    }
}
