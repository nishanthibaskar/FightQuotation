package com.company.executors;

public class CompletableFuturesCode {

    public static void show() {
        var service = new FlightService();
        service.getQuote("site1")
                .thenAccept(System.out::println);

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        var CompletableFuturesCode = new CompletableFuturesCode();
        CompletableFuturesCode.show();
    }


}

