package org.MessageFormatter_StrategyDesignPattern;

class XmlMessageFormatter implements MessageFormatter{

    @Override
    public String format(String message) {
        return "<message>" + message + "</message>";
    }

    @Override
    public String getType() {
        return "XML";
    }
}