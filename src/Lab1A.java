import java.util.Scanner;

public class Lab1A {

    public static void print(String x){
        System.out.println(x);
    }

    public static void main(String[] args){
        print("Hello my name is Albard." + "\nMy  height is:" + " 6\"0'.");

        Scanner x = new Scanner(System.in);
        print(x.nextLine());//Accessing what was stores in the instance variable of x in the scanner class. nextLine() is basically a get method,



    }

}

