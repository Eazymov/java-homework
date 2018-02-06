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
        long startTime;
        long finishTime;

        startTime = System.nanoTime();
        calculateHyp();
        finishTime = System.nanoTime();
        System.out.println("Затраченное время (мс): " + (finishTime - startTime));

        startTime = System.nanoTime();
        calculateHypLinked();
        finishTime = System.nanoTime();
        System.out.println("Затраченное время (мс): " + (finishTime - startTime));
        
        System.out.println("Сортировка массива:");
        ArraySort<Integer> intSorter = new ArraySort();
        ArraySort<String> strSorter = new ArraySort();
        ArraySort<Double> doubleSorter = new ArraySort();
        
        Integer[] sortArrInt = { 9, 5, 1 };
        intSorter.run(sortArrInt);

        String[] sortArrStr = { "1", "2", "3" };
        strSorter.run(sortArrStr);

        Double[] sortArrDouble = { 1.0, 2.0, 3.0 };
        doubleSorter.run(sortArrDouble);
    }

    private static void calculateHyp() {
        int sideA = 10;
        int sideB = 20;

        double hyp = Math.sqrt(sideA * sideA + sideB * sideB);

        System.out.println("Гипотенуза: " + hyp);
    }

    private static void calculateHypLinked() {
        Integer sideA = 10;
        Integer sideB = 20;

        Double hyp = Math.sqrt(sideA * sideA + sideB * sideB);

        System.out.println("Гипотенуза: " + hyp);
    }
}
