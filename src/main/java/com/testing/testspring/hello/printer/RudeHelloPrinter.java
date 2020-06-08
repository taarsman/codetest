package com.testing.testspring.hello.printer;

import org.springframework.stereotype.Component;

@Component
public class RudeHelloPrinter extends AbstractHelloPrinter {

    @Override
    protected String getTheMessage() {
        return "I don't like you very much.. :(";
    }

}
