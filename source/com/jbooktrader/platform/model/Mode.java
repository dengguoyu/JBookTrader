package com.jbooktrader.platform.model;

/**
 * @author Eugene Kononov
 */
public enum Mode {
    Trade("Trading"),
    BackTest("Back Testing"),
    ForwardTest("Forward Testing"),
    Optimization("Optimizing");

    private final String name;

    Mode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
