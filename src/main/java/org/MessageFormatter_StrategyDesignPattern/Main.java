package org.MessageFormatter_StrategyDesignPattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create a new message formatter 
        MessageContext messageContext = new MessageContext(new JsonMessageFormatter());
        System.out.println(messageContext.getFormatterType()+" Format ");
        System.out.println(messageContext.formatMessage("Hello,World!"));

        // change message formatter
        messageContext.setMessageFormatter(new XmlMessageFormatter());
        System.out.println(messageContext.getFormatterType()+" Format ");
        System.out.println(messageContext.formatMessage("Hello,World!"));

        //change message formatter
        messageContext.setMessageFormatter(new PlainTextMessageFormatter());
        System.out.println(messageContext.getFormatterType()+" Format ");
        System.out.println(messageContext.formatMessage("Hello,World!"));

    }
}
