package nick.sqtb.pft.framework;

public class MyFirstProgram {

    // example of method or function
    public static void main(String[] args) {
        hello("java");
        hello("Nick");

        double x = 5;
        System.out.println("Result " + x + " = " + area(x));

        double a = 4;
        double b = 5;
        System.out.println("Result " + a + " and " + b + " = " + area2(a, b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l) {
       return l * l;
    }

    public static double area2(double a, double b) {
        return a * b;
    }

}
