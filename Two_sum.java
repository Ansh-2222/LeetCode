import java.util.*;

public class Two_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int num = sc.nextInt();
        System.out.println("Enter number to store in array");

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter the Target number : ");

        int target = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + "," + j);
                    count++;
                }
            }

        }

        if (count == 0)
            System.out.println("There is no 2 number that they add up to target.");

            sc.close();
        }
      
}