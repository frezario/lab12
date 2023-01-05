package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of denominators: ");
        int length = input.nextInt();

        System.out.println("Enter the target sum: ");
        int required = input.nextInt();

        int[] numbers = new int[length];

        System.out.println("Enter the denominators through space: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        Chain chain = new Chain(numbers, 0);
        System.out.println(chain.transmit(required, 0));
    }
}