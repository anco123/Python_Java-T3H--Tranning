package springExampleJournalDev.dependencyinjaction.injection;

import springExampleJournalDev.dependencyinjaction.consumer.Consumer;
import springExampleJournalDev.dependencyinjaction.consumer.MyDIApplicaton;
import springExampleJournalDev.dependencyinjaction.service.EmailServiceImpl;
import springExampleJournalDev.dependencyinjaction.service.MessageService;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer(){
        return new MyDIApplicaton(new EmailServiceImpl());
    }
}
