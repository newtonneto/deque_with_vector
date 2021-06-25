package com.newton;

import com.newton.exceptions.DequeVazioException;
import com.newton.tests.DequeTest;

public class Main {

    public static void main(String[] args) {
        DequeTest dequeTest = new DequeTest();

        try {
            dequeTest.execute();
        } catch (DequeVazioException error) {
            System.out.println(error);
        }
    }
}
