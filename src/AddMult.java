/*
Directions
Write a program that can add any two integers using a method called
add and can multiply any two integers using a method called multiply
First, do it with methods in the same class as your
“public static void main(String[] args)” method.
Then, make a new class called “Calculator” with those methods and use
the calculator object to do the adding and multiplying.
*/

import java.util.Scanner;

public class AddMult {

    public static void main(String[] args) {

        Add();

        Multiply();

    }

    public static void Add(){

        int a, b, c;
        System.out.println("Enter two integers to calculate their sum ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = a + b;
        System.out.println("Sum of entered integers = " + c);

    }

    public static void Multiply(){

        int x, y, z;
        System.out.println("Enter two integers to multiply them ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x * y;
        System.out.println("Multiplied integers = " + z);

    }

}
