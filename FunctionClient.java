public class FunctionClient {
    public static void main(String[] args) {
        FunctionProb.fizzbuzz(6);
        FunctionProb.fizzbuzz(7);
        FunctionProb.fizzbuzz(3);
        FunctionProb.fizzbuzz(10);


        double area = FunctionProb.calculateCircleArea(5);
        double area1 = FunctionProb.calculateCircleArea(10);
        System.out.println(area);
        System.out.println(area1);

        double edge1 = 5;
        double edge2 = 6;
        double edge3 = 8;
        double perimeter1 = FunctionProb.calculateTrianglePerimeter(edge3, edge2, edge1);
    }
}

