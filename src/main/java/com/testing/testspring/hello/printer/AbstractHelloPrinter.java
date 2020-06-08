package com.testing.testspring.hello.printer;

public abstract class AbstractHelloPrinter {

    public String getHello(String name) {
        return String.format("Hello %s! %s", name, getMessage());
    }

    protected abstract String getMessage();

}
