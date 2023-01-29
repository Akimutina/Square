package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/data.csv")
    public void testLimitValues(int expected, int start, int finish) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(start, finish);

        Assertions.assertEquals(expected, actual);
    }
}
