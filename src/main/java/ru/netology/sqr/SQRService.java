package ru.netology.sqr;

public class SQRService {
    public int calculate(int NewLimit, int OldLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++){
            if(i * i >= NewLimit & i * i <= OldLimit){
                count++;
            }
        }
        return count;
    }
}
