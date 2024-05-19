package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static int calcSum(List<Integer> numbers){
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }

        return sum;
    }

    public static int calcMult(List<Integer> numbers){
        int mult = 1;
        for (int i: numbers) {
            mult *= i;
        }

        return mult;
    }

    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i: numbers) {
            if (max < i) max = i;
        }

        return max;
    }

    public static int findMin(List<Integer> numbers){
        int min = numbers.get(0);
        for (int i: numbers) {
            if (min > i) min = i;
        }

        return min;
    }

    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        try {
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        System.out.println("Minimum: " + findMin(numbers));
        System.out.println("Maximum: " + findMax(numbers));
        System.out.println("Sum: " + calcSum(numbers));
        System.out.println("Mult: " + calcMult(numbers));
    }
}