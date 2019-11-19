package springExampleJournalDev.dependencyinjaction.injection;

import springExampleJournalDev.dependencyinjaction.consumer.Consumer;

public interface MessageServiceInjector {
    public Consumer getConsumer();
}
