package com.testing.testspring.hello.printer;

import org.springframework.stereotype.Component;

@Component
public class NiceHelloPrinter extends AbstractHelloPrinter {
    @Override
    protected String getMessage() {
        return "I like you!";
    }
}
