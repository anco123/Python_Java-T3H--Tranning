package springExampleJournalDev.dependencyinjaction.consumer;

import springExampleJournalDev.dependencyinjaction.service.MessageService;

public class MyDIApplicaton implements Consumer {
    private MessageService services;
    public MyDIApplicaton(MessageService svc){
        this.services = svc;
    }

    @Override
    public void processMessages(String msg, String rec){
        this.services.sendMessage(msg, rec);
    }

}
