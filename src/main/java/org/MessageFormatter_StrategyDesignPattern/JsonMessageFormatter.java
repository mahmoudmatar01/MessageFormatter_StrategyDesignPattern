package org.MessageFormatter_StrategyDesignPattern;

class JsonMessageFormatter implements MessageFormatter{

    @Override
    public String format(String message) {
        return "{ \"message\": \"" + message + "\" }";
    }

    @Override
    public String getType() {
        return "JSON";
    }
}