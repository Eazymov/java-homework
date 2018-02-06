package Lab1;

import java.util.Arrays;

public class ArraySort {

    static int cnt = 0;

    static boolean less(double v, double w) { // метод сравнивает два элемента
        cnt++;
        return v < w;
    }

    static void exch(double[] a, int i, int j) { // метод обменивает два элемента
        double t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static void compExch(double[] a, int i, int j) { // метод сравнивает и обменивает два элемента
        if (less(a[j], a[i])) {
            exch(a, i, j);
        }
    }

    static void sort(double[] a, int k, int r) {
        for (int i = k + 1; i <= r; i++) {
            for (int j = i; j > k; j--) {
                compExch(a, j - 1, j);
            }
        }
        System.out.print(Arrays.toString(a));
    }

    public static void main(String[] args) {
        try {
            int N = 10;
            double a[] = new double[N];
            for (int i = 0; i < N; i++) {
                a[i] = Math.random();
            }
            System.out.println("Несортированный массив: ");
            if (N < 100) {
                for (int i = 0; i < N; i++) {
                    System.out.println(a[i] + "");
                }
            }
            sort(a, 0, N - 1);
            System.out.println("Сортированный массив: ");
            if (N < 100) {
                for (int i = 0; i < N; i++) {
                    System.out.println(a[i] + "");
                }
            }
            System.out.println("Использовано сравнений: " + cnt);
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
            e.printStackTrace();
        }

    }
}
