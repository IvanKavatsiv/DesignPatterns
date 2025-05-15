package com.kaiv.patterns.Structural.Proxy;

public class LoggingProxy implements Service {
    private final Service realService;

    public LoggingProxy(Service realService) {
        this.realService = realService;
    }

    @Override
    public void perform() {
        System.out.println("LoggingProxy: Before call");
        realService.perform();
        System.out.println("LoggingProxy: After call");
    }
}
