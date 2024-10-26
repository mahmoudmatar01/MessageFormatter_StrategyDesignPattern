package org.MessageFormatter_StrategyDesignPattern;

interface MessageFormatter{
    String format(String message);
    String getType();
}