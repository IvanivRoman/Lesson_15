package org.example;

import java.util.Calendar;
import java.util.function.*;

public class App {
    static UnaryOperator<Integer> fib;

    public static void printRandomNumber(int n) {
        IntConsumer random = number -> System.out.println(Math.round(Math.random() * number));
        random.accept(n);
    }

    public static int dayOfWeek() {
        IntSupplier dayOfWeek = () -> Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        return dayOfWeek.getAsInt();
    }

    public static long convertDoubleToLong(double number) {
        DoubleToLongFunction convert = Math::round;
        return convert.applyAsLong(number);
    }

    public static int getFibonacciNumber(int index) {
        fib = n -> {
            if (n == 0)
                return 0;
            else
                return n == 1 || n == 2 ? 1 : fib.apply(n - 1) + fib.apply(n - 2);
        };
        return fib.apply(index);
    }

    public static boolean isPrime(int n) {
        IntPredicate prime = number -> {

            if(n == 0 || n == 1)
                return false;

            if (number % 2 == 0) {
                return number == 2;
            }

            int limit = (int)(0.1 + Math.sqrt(number));
            for (int i = 3; i <= limit; i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };
        return prime.test(n);
    }

    public static void main(String[] args) {
        System.out.println("Random number from 0 to 10");
        for (int i = 0; i < 3; i++) {
            printRandomNumber(10);
        }

        System.out.println("********************************************************");

        System.out.println("Number of this day is: " + dayOfWeek());

        System.out.println("********************************************************");

        System.out.println("Convert double to long");
        System.out.println("4.2 -> " + convertDoubleToLong(4.2));
        System.out.println("4.4 -> " + convertDoubleToLong(4.4));
        System.out.println("4.5 -> " + convertDoubleToLong(4.5));

        System.out.println("********************************************************");

        System.out.println("Fibonacci number by index");
        System.out.println("index: 1 -> " + getFibonacciNumber(1));
        System.out.println("index: 7 -> " + getFibonacciNumber(7));
        System.out.println("index: 13 -> " + getFibonacciNumber(13));

        System.out.println("********************************************************");

        System.out.println("Check is number prime");

        for (int i = 0; i < 21; i++) {
            System.out.println("is prime: " + i + " " + isPrime(i));
        }

    }
}