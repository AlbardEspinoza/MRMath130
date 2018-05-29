import java.util.ArrayList;
import java.util.Scanner;

public class Lab9PartI {

    //TODO; Methods should be at the bottom of the page for better visuals.
    //TODO; Make it neater.
    public static void count(String s) {//Remember methods inside your main class have to be static. You will get it because of the way they're called since you don't have instance variables and no object is calling it.
        int sum = 0;
        for (int x = 0; x < s.length(); x++) {
            if (s.charAt(x) == 'b' && s.length() > x + 2 && s.charAt(x + 1) == 'o' && s.charAt(x + 2) == 'b') {
                sum++;
                x++;
            }
        }
        System.out.println("Number of times bob occurs: " + sum);
    }

    public int getTotal(ArrayList<Integer> x) {
        int sum = 0;
        for (int m = 0; m < x.size(); m++) {
            sum += x.get(m);
        }
        return sum;
    }

    public static void main(String[] args) {
        /*ArrayList<Integer> x = new ArrayList<>();
        //int numbers = 0;//Uninitialized variables ina method even in main don't have a default value of zero they don't have anything within.
        Scanner y = new Scanner(System.in);//Creates a new Scanner variable, but does not take any input from the user yet.
        System.out.print("Hello! How many numbers would you like to input? ");
        int numbers = y.nextInt();
        for (int m = 0; m < numbers; m++) {
            System.out.print("Enter an integer: ");
            x.add(y.nextInt());
        }*/

        String m = "oboooboboobooyobjbo";
        count(m);
    }
}
