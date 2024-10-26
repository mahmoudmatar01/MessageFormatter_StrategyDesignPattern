package org.MessageFormatter_StrategyDesignPattern;

class PlainTextMessageFormatter implements MessageFormatter{

    @Override
    public String format(String message) {
        return message;
    }

    @Override
    public String getType() {
        return "PLAIN_TEXT";
    }
}