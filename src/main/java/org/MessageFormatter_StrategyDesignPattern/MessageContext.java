package org.MessageFormatter_StrategyDesignPattern;

class MessageContext{

    private MessageFormatter messageFormatter;

    // constructor
    public MessageContext(MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter;
    }

    // setter and getter methods
    public MessageFormatter getMessageFormatter() {
        return messageFormatter;
    }

    public void setMessageFormatter(MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter;
    }

    // Method to format a message using the current messageFormatter
    public String formatMessage(String message) {
        return messageFormatter.format(message);
    }

    // Method to get the type of the current messageFormatter
    public String getFormatterType() {
        return messageFormatter.getType();
    }
}