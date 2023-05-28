package ru.netology.stats;

import org.junit.jupiter.opi.Test;

import static org.junit.jupiter.opi.Assertions.*;

class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8+ 15+ 13+ 15+ 17+ 20+ 7+ 14+ 14+ 18;

        Assertions.assertEquals(expected, actual);
    }
}

class StatsServiceTest {
    @Test


}