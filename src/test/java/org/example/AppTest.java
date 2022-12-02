package org.example;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.*;

class AppTest {
    @Test
    void testDayOfWeek() {
        int todayDay = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        assertThat(todayDay).isEqualTo(App.dayOfWeek());
    }

    @Test
    void testConvertDoubleToLong() {
        long n1 = Math.round(4.0);
        long n2 = Math.round(4.1);
        long n3 = Math.round(4.2);
        long n4 = Math.round(4.3);
        long n5 = Math.round(4.4);
        long n6 = Math.round(4.5);
        long n7 = Math.round(4.6);
        long n8 = Math.round(4.7);
        long n9 = Math.round(4.8);
        long n10 = Math.round(4.9);

        assertThat(n1).isEqualTo(App.convertDoubleToLong(4.0));
        assertThat(n2).isEqualTo(App.convertDoubleToLong(4.1));
        assertThat(n3).isEqualTo(App.convertDoubleToLong(4.2));
        assertThat(n4).isEqualTo(App.convertDoubleToLong(4.3));
        assertThat(n5).isEqualTo(App.convertDoubleToLong(4.4));
        assertThat(n6).isEqualTo(App.convertDoubleToLong(4.5));
        assertThat(n7).isEqualTo(App.convertDoubleToLong(4.6));
        assertThat(n8).isEqualTo(App.convertDoubleToLong(4.7));
        assertThat(n9).isEqualTo(App.convertDoubleToLong(4.8));
        assertThat(n10).isEqualTo(App.convertDoubleToLong(4.9));
    }

    @Test
    void testGetFibonacciNumber() {
        assertThat(App.getFibonacciNumber(0)).isZero();
        assertThat(App.getFibonacciNumber(1)).isEqualTo(1);
        assertThat(App.getFibonacciNumber(2)).isEqualTo(1);
        assertThat(App.getFibonacciNumber(3)).isEqualTo(2);
        assertThat(App.getFibonacciNumber(4)).isEqualTo(3);
        assertThat(App.getFibonacciNumber(5)).isEqualTo(5);
        assertThat(App.getFibonacciNumber(6)).isEqualTo(8);
        assertThat(App.getFibonacciNumber(7)).isEqualTo(13);
        assertThat(App.getFibonacciNumber(8)).isEqualTo(21);
        assertThat(App.getFibonacciNumber(9)).isEqualTo(34);
        assertThat(App.getFibonacciNumber(10)).isEqualTo(55);
    }

    @Test
    void testPrimeNumbers() {
        assertThat(App.isPrime(7)).isTrue();
        assertThat(App.isPrime(9)).isFalse();
        assertThat(App.isPrime(12)).isFalse();
        assertThat(App.isPrime(17)).isTrue();
        assertThat(App.isPrime(19)).isTrue();
    }
}
