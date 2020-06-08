package com.testing.testspring.hello;

import com.testing.testspring.hello.printer.AbstractHelloPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloWorldController {

    public Random random = new Random();

    @Autowired
    public AbstractHelloPrinter helloPrinter1;

    @Autowired
    public AbstractHelloPrinter helloPrinter2;

    /**
     * Returns randomly rude or nice message.
     * Request format should be %host%/api/hello?name=Bob
     * @param name name of the user that wants to gamble the message
     * @return Rude or nice message, depending on the luck.
     */
    @RequestMapping("")
    public String getHelloMessage(@PathVariable String name) {
        int nextRandom = random.nextInt();
        if (nextRandom == 0) {
            return helloPrinter1.getHello(name);
        } else if (nextRandom == 1) {
            return helloPrinter2.getHello(name);
        } else {
            throw new RuntimeException("Oops! I don't know how to handle " + nextRandom);
        }
    }

}
