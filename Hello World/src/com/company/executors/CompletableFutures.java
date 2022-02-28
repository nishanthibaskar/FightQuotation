package com.company.executors;

import java.util.concurrent.CompletableFuture;

 public class CompletableFutures {
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
    }

