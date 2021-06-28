package kiemtramangthuong;

import java.util.Scanner;

public class MangThuong {
    Scanner sc = new Scanner(System.in);
    int[] arr = {23, 56, 21, 87, 123, 768, 65, 124, 76, 32};

    public void add() {
        int[] arr1 = new int[arr.length + 1];
        int num = sc.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i];
            arr1[arr1.length] = num;
        }
    }

    public void remove() {
        int[] arr2 = new int[arr.length - 1];
        int num2 = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < num2) {
                arr2[i] = arr[i];
            } else if (num2 == arr[i]) {
                arr2[i] = arr[i + 1];
            }
        }
    }

    public void edit() {
        int[] arr3 = new int[arr.length];
        int num3 = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr.equals(num3)) {
                int newnum=sc.nextInt();
                arr3[i] = newnum;
            }

        }
    }
}
