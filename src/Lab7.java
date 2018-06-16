import java.util.Arrays;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many integers are you typing? ");
        int[] arr = new int[in.nextInt()];
        for (int x = 0; x < arr.length; x++) {
            System.out.println("Please enter an integer: ");
            arr[x] = in.nextInt();
        }
        printArray(arr);
        System.out.println("Total of typed integers:" + getTotal(arr));
        System.out.println("Average of typed integers:");
        System.out.printf("%.2f", getAverage(arr));
        System.out.println("Highest: " + getHighest(arr));
        System.out.println("Lowest: " + getLowest(arr));
        System.out.println("What value would you like to check if its in the array?");
        System.out.println(contains(arr, in.nextInt()));
        System.out.println("What other value would you like to check if its in the array?");
        System.out.println(contains(arr, in.nextInt()));
        int[] newArray = post4(arr);
        printArray(newArray);
        System.out.println(checkDuplicates(arr));
        Arrays.sort(arr);
        printArray(arr);
        System.out.printf("Median: %.2f", getMedian(arr));

    }


    public static void printArray(int[] arr) {//TODO; Make it more elegant. Assume arr != null.
        int index = 0;
        for (int x = 0; index < arr.length; x++) {
            System.out.println();
            for (int y = 0; y < 8 && index < arr.length; y++) {
                System.out.printf("%4d", arr[index]);//If else maybe for different arr index left?
                index++;
            }
        }
        System.out.println();//Try to remove this line.
    }

    public static int getTotal(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }
        return sum;
    }

    public static double getAverage(int[] arr) {
        double y = getTotal(arr);
        double average = y / arr.length;
        return average;
    }

    public static int getHighest(int[] arr) {
        int largest = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (largest < arr[x]) {
                largest = arr[x];
            }
        }
        return largest;
    }

    public static int getLowest(int[] arr) {
        int smallest = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (smallest > arr[x]) {
                smallest = arr[x];
            }
        }
        return smallest;
    }

    public static boolean contains(int[] a, int x) {
        boolean z = false;
        for (int y = 0; y < a.length; y++) {
            if (x == a[y]) {
                z = true;
            }
        }
        return z;
    }

    public static int[] post4(int[] a) {
        int[] arr = new int[0];
        int index = 0;
        for (int x = 0; x < a.length; x++) {
            if (a[x] == 4) {
                index = x + 1;
            }
        }
        if (a.length - index >= 1) {
            arr = new int[a.length - index];
            for (int x = 0; x < arr.length; x++) {//Parameter variable life.
                arr[x] = a[index++];
            }
        }
        return arr;
    }

    public static boolean checkDuplicates(int[] a) {
        boolean flag = false;
        int count = 0;
        for (int x = 0; x < a.length && count < 2; x++) {
            count = 0;
            for (int y = 0; y < a.length && count < 2; y++) {
                if (a[x] == a[y]) {
                    count++;
                }
            }
        }
        if (count == 2) {
            flag = true;
        }
        return flag;
    }

    public static double getMedian(int[] arr) {
        double median;
        if (arr.length % 2 != 0) {
            median = arr[arr.length / 2];
        } else {
            median = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
        }
        return median;
    }

}





