package ru.netology.sqr;
public class SQRService {
    public int calcSqrt(int start, int finish) {
        int number = 0;
        for (int i =  10; i <= 99; i++) {
            if ((i * i >= start) & (i * i <= finish)) {
                number = number + 1;
            }
        }
        return number;
    }
}
