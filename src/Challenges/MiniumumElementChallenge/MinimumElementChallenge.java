package Challenges.MiniumumElementChallenge;

import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Number of elements to read in console");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = readIntegers(count);
        int returnedMin = finMin(returnedArray);

        System.out.println("Minumum Values :" + returnedMin);
    }

    public static int[] readIntegers(int count){
        int[] array =  new int[count];
        for(int i=0; i<array.length;i++){
            System.out.println("Enter a number : ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return  array;
    }

    public static int finMin(int[] array){
    int min = Integer.MAX_VALUE;
    for(int i=0;i<array.length;i++){
        if(array[i]<min){
            min = array[i];
        }
    }
       return min;
    }

}
