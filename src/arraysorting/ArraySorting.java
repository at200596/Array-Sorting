package arraysorting;

import java.util.Scanner;

public class ArraySorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] numbersSorted = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            int enteredNumber = input.nextInt();

            numbers[i] = enteredNumber;
        }
        System.out.println("Before Sorting: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        //using bubble sort
        for (int i = 0; i < numbers.length; i++) {
            int sorter = 0;
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {
                    sorter = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = sorter;
                    
                    
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting: ");
    
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        
        //finding average
        int total = 0;
        int average = 0;
        for(int i = 0; i<numbers.length; i++){
            total = total + numbers[i];
            
        }
        System.out.println();
        average = total / numbers.length;
        System.out.println("Your average is: " + average);
        
        //maximum and minimum
        System.out.println("Your maximum is: " + numbers[9]);
        System.out.println("Your minimum is: " + numbers[0]);
    }

}
