package src.lesson4;

public class Work {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[5] = 1;

        // 0 ,1 ,2,3,4

        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0)
                System.out.println("Ура, у меня счастливый пельмень " + "под индексом " + i);

        }

    }
}
