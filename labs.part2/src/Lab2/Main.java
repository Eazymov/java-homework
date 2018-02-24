/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {

        calculateHyp();
        calculateHypLinked();
        
        System.out.println("Сортировка массива:");
        ArraySort<Integer> intSorter = new ArraySort();
        ArraySort<String> strSorter = new ArraySort();
        ArraySort<Double> doubleSorter = new ArraySort();
        
        Integer[] sortArrInt = { 9, 5, 1 };
        intSorter.run(sortArrInt);

        String[] sortArrStr = { "1", "2", "3" };
        strSorter.run(sortArrStr);
    }

    private static void calculateHyp() {
        long startTime = System.nanoTime();
        int sideA = 10;
        int sideB = 20;
        double hyp = 0;

        for (int idx = 0; idx < 1000000; idx++) {
            hyp = Math.sqrt(sideA * sideA + sideB * sideB);
        }

        System.out.println("calculateHyp. Гипотенуза: " + hyp);
        System.out.println("Затраченное время (мс): " + (System.nanoTime() - startTime));
    }

    private static void calculateHypLinked() {
        long startTime = System.nanoTime();
        Integer sideA = 10;
        Integer sideB = 20;
        Double hyp = 0.0;

        for (int idx = 0; idx < 1000000; idx++) {
            hyp = Math.sqrt(sideA * sideA + sideB * sideB);
        }

        System.out.println("calculateHypLinked. Гипотенуза: " + hyp);
        System.out.println("Затраченное время (мс): " + (System.nanoTime() - startTime));
    }
}
