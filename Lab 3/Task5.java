
import java.util.Scanner;


class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    //constructor
    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    // getters
    public double get_a() {
        return a;
    }

    public double get_b() {
        return b;
    }

    public double get_c() {
        return c;
    }

    // methods
    public double getDiscriminant() {
        return (b*b)- (4*a*c);
    }

    public double getRoot1() {
        if(getDiscriminant() > 0) {
            return (-b + Math.sqrt(b*b - 4*a*c) ) / 2*a;
        }

        else {
            return 0;
        }
        
    }

     public double getRoot2() {
        if(getDiscriminant() > 0) {
            return (-b - Math.sqrt(b*b - 4*a*c) ) / 2*a;
        }

        else {
            return 0;
        }
        
    }


}

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for 'a': ");
        double a = input.nextInt();

        System.out.print("Enter a value for 'b': ");
        double b = input.nextInt();

        System.out.print("Enter a value for 'c': ");
        double c = input.nextInt();

        
        QuadraticEquation eq = new QuadraticEquation(a, b, c);

        if(eq.getDiscriminant() > 0) {
            System.out.println("System has two roots: ");
            System.out.println("Root 1: " + eq.getRoot1());
            System.out.println("Root 2: " + eq.getRoot2());
        }

        else if (eq.getDiscriminant() == 0) {
            System.out.println("Only one root exists!");
            System.out.println("Root: " + eq.getRoot1());
        }

        else {
            System.out.println("The Equation Has No Roots!");
        }

    }
}
