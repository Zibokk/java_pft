package nick.sqtb.pft.framework;

public class MyFirstProgram {

    // example of method or function
    public static void main(String[] args) {
        hello("java");
        hello("Nick");

        Square s = new Square(5);
//        s.l = 5;
        System.out.println("Result " + s.l + " = " + s.area());


        Rectangle r = new Rectangle(4, 5);
//        r.a = 4;
//        r.b = 5;
        System.out.println("Result " + r.a + " and " + r.b + " = " + r.area2());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

//    public static double area(Square s) {
//       return s.l * s.l;
//    }

//    public static double area(Rectangle r) {
//        return r.a * r.b;
//    }

}
