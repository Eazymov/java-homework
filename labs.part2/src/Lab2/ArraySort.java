/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author user
 * 
 * @param <T> type of array elements
 */
public class ArraySort<T extends Comparable> {

    static int cnt = 0;

    private boolean less(T v, T w) { // метод сравнивает два элемента
        cnt++;
        return Integer.parseInt(v.toString()) < Integer.parseInt(w.toString());
    }

    private void exch(T[] a, int i, int j) { // метод обменивает два элемента
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private void compExch(T[] a, int i, int j) { // метод сравнивает и обменивает два элемента
        if (less(a[j], a[i])) {
            exch(a, i, j);
        }
    }

    private void sort(T[] a, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            for (int j = i; j > l; j--) {
                compExch(a, j - 1, j);
            }
        }
    }

    public void run(T[] a) {
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
