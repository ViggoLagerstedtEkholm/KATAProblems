package com.company.solution_4kyu;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadedCounting {
    /*public static void countInThreads(Counter counter){
        ExecutorService[] executorServices = createExecutorServices();
        try{
            for(int i = 0; i < 100; i++){
                //i % 3 will make sure every thread iterates every three iterations.
                //Or as stated in the instructions: 3n, 3n+1, 3n+2.
                int executorIndex = i % 3;
                final int count = i+1;
                executorServices[executorIndex].submit(() -> counter.count(count)).get();
            }
        }catch (InterruptedException | ExecutionException e) {}
    }


    //Create 3 execution services, each will be responsible for iterating every third iteration.
    private static ExecutorService[] createExecutorServices(){
        ExecutorService[] executorServices = new ExecutorService[3];

        for(int i = 0; i < executorServices.length; i++){
            executorServices[i] = Executors.newSingleThreadExecutor();
        }
        return executorServices;
    }
    */
}
