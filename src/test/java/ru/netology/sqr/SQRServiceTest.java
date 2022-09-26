package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
     public void shouldSquareRootOnlyOne() {
        SQRService service = new SQRService();
        int NewLimit = 100;
        int OldLimit = 100;
        int expected = 1;

        int actual = service.calculate(NewLimit, OldLimit);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCounterTill200() {
        SQRService sqrService = new SQRService();
        int NewLimit = 100;
        int OldLimit = 200;
        int expected = 5;

        int actual = sqrService.calculate(NewLimit, OldLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSquareRootZero() {
        SQRService sqrService = new SQRService();
        int NewLimit = 10;
        int OldLimit = 20;
        int expected = 0;

        int actual = sqrService.calculate(NewLimit, OldLimit);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSquareRootForUpBorder() {
        SQRService sqrService = new SQRService();
        int NewLimit = 9801;
        int OldLimit = 9801;
        int expected = 1;

        int actual = sqrService.calculate(NewLimit, OldLimit);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSquareRootForDifferentBorders() {
        SQRService sqrService = new SQRService();
        int NewLimit = 100;
        int OldLimit = 9801;
        int expected = 90;

        int actual = sqrService.calculate(NewLimit, OldLimit);

        assertEquals(expected, actual);
    }
}
