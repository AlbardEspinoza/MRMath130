import java.util.Arrays;

public class Lab7 {

    public static void main(String[] args) {

        System.out.printf("%d %C %s", 10, 'A', "Yeah");
        int[] ll = {12, 78, 4, 98, 67, 87, 56, 34, 65, 45, 76, 78, 123, 4};
        int[] xx = {5, 5, 3, 1};
        printArray(ll);
        System.out.println(getAverage(xx));
        double k = 2;
        double d = 3;
        double f = k / d;
        System.out.println(f);
        boolean b = contains(xx, 4);
        int[] m = new int[0];//It is valid to create in java an array of length 0.
        System.out.println(Arrays.toString(m));
        System.out.println(b);
        System.out.println("\n" + Arrays.toString(post4(ll)));
        System.out.println(checkDuplicates(xx));

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
                    System.out.println(a[x] + " " + a[y] + " " + count);
                }
            }
        }
        if (count == 2) {
            flag = true;
        }
        return flag;
    }

}





