package com.java9feature;

/*
* java 9 provide the orTimeOut() method to best handy the task in if task not completed within given time then throw the exception as response.
* */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class CompletableFutureFeature {

    private static final int TIMEOUT = 3;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CompletableFuture<String> future =
                doWork("Task ")
                        .orTimeout(TIMEOUT, TimeUnit.SECONDS)
                        .whenComplete((result, error) -> {
                            if (error == null) {
                                System.out.println("The result is: " + result);
                            } else {
                                System.out.println("Sorry, timeout in " + TIMEOUT + " seconds.");
                            }
                        });

        String content;
        content = future.get();
        System.out.println("Result >> " + content);

    }

    private static CompletableFuture<String> doWork(String s) {

        return CompletableFuture.supplyAsync(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("running inside doWork()... " + i + " s");
            }
            return "Task Completed !";
        });
    }
}
