package src.lesson20;

import java.util.Arrays;

public class Main {
    public static int[] abc = {13, 25, 16, 8, 56, 11, 50, 1};

    public static void main(String[] args) {
        for (int i = 0; i < abc.length - 1; i++) {
            for (int i2 = 0; i2 < abc.length - 1; i2++) {
                    if (abc[i2] > abc[i2 + 1]) {
                    int temp = abc[i2];
                    abc[i2] = abc[i2 + 1];
                    abc[i2 + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(abc));
    }
}