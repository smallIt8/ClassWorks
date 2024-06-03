package src.Lesson4;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        while (x < 5) {
            System.out.println("Тело цикла while " + x);
            x += 1;
        }

        System.out.println("Код после цикла while");

        int y = 0;

        do {
            System.out.println("Тело цикла do while " + y);
        }
        while (false);

        System.out.println("Код после цикла do while");

        for (int i = 0; i < 5; i++) {
            System.out.println("Тело цикла for " + i);
        }

        System.out.println("Код после цикла for");

        for (int b = 1; b < 10; b++) {
            for (int c = 1; c < 10; c++) {
                System.out.print(b * c + " ");
        }

        System.out.println(" ");
        }

        int f = 0;
        while (f < 5) {
            if (f == 2) {
                break;
            }
            System.out.println("Тело цикла while " + f);
            f++;
        }



    }


}
