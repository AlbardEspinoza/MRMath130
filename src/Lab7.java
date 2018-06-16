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
        System.out.println("Here is a printout of the original array:");
        printArray(arr);
        System.out.println("The sum of all the elements in the array:\n" + getTotal(arr));
        System.out.println("The average of all elements in the array: ");
        System.out.printf("%.2f", getAverage(arr));
        System.out.println("\nHighest:\n" + getHighest(arr));
        System.out.println("Lowest:\n" + getLowest(arr));
        System.out.println("What value would you like to check if it's in the array?");
        if (contains(arr, in.nextInt())) {
            System.out.println("The value you entered is in the array.");
        } else {
            System.out.println("The value you entered isn't in the array.");
        }
        System.out.println("What other value would you like to check if it's in the array?");

        if (contains(arr, in.nextInt())) {
            System.out.println("The value you entered is in the array.");
        } else {
            System.out.println("The value you entered isn't in the array.");
        }
        int[] newArray = post4(arr);
        System.out.println("Here is a printout of the new post4 array after invoking\nthe post4 method");
        printArray(newArray);
        if (checkDuplicates(arr)) {
            System.out.println("The checkDuplicates method has found duplicates in this array.");
        } else {
            System.out.println("There are no duplicates in the array.");
        }
        //int[] tmp = arr;//TODO; Ask professor Rasky about this line i store a reference of an array, is the abs. length going to be the one in that array?
        Arrays.sort(arr);
        System.out.println("Here is a printout of the original array after it is sorted: ");
        printArray(arr);
        System.out.printf("The median of the original array is:\n%.2f", getMedian(arr));

    }


    public static void printArray(int[] arr) {//TODO; Make it more elegant. Assume arr != null.
        int index = 0;
        for (int x = 0; index < arr.length; x++) {
            if (index % 8 == 0 && index != 0) {
                System.out.println();
            }
            System.out.printf("%4d", arr[index]);//If else maybe for different arr index left?
            index++;
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
