public class FunctionProb {

    public static void fizzbuzz(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (value % 3 == 0 ) {
            System.out.println("Fizz");
        } else if (value % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Not fizzbuzz");
        }
    }

    public static double calculateCircleArea(float radius) {
        return Math.PI * Math.pow(radius,2);
    }

    public static double calculateTrianglePerimeter(double edge1, double edge2, double edge3) {
        return edge1 + edge2 + edge3;
    }


    private static void cannotCallMe(){
        System.out.println("Can only call inside this class");
    }

}
