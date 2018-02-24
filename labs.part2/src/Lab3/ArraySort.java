/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author user
 */
public class ArraySort {

    static int cnt = 0;

    static private <T> boolean less(T v, T w) {
        cnt++;
        return Integer.parseInt(v.toString()) < Integer.parseInt(w.toString());
    }

    static private <T> void exch(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static private <T> void compExch(T[] a, int i, int j) {
        if (less(a[j], a[i])) {
            exch(a, i, j);
        }
    }

    static private <T> void sort(T[] a, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            for (int j = i; j > l; j--) {
                compExch(a, j - 1, j);
            }
        }
    }

    static public <T> void run(T[] a) {
        try {
            int N = a.length;

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
