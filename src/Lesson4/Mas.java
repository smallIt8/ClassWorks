package src.lesson4;

public class Mas {

    public static void main(String[] args) {

        int x = 10; // примитив
        int[] arr = new int[6];

        arr[3] = 45;

        System.out.println(arr[3]);

        //

        int[] numbers = new int[10];

        int[] newNumArr = new int[]{3, 4, 5, 6, 7, 8, 9};

        int[] newArr = {3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 7; i++) {
            System.out.println(newArr[i]);
        }

        for (int h : newArr){
            int result = (h + 10) * 34;
            System.out.println(result);
        }


    }
}
