package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToFiftyThen650() {
        int start = 1;
        int finish = 50;
        int result = Counter.sumByEven(start, finish);
        int expected = 650;
        Assert.assertEquals(expected, result);
    }
}