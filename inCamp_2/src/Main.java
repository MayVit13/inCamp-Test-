/**
 * Created by Vit on 25.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        PlaneFigureInterface circle = new Circle(5);
        System.out.println(circle);
        circle.perimeter();
        circle.square();
        System.out.println("-----------------------------------------------------\n");

        PlaneFigureInterface triangle = new Triangle(4, 4, 4, 0);
        System.out.println(triangle);
        triangle.perimeter();
        triangle.square();
        System.out.println("-----------------------------------------------------\n");


        PlaneFigureInterface triangle2 = new Triangle(0, 5, 0, 6);
        System.out.println(triangle2);
        triangle2.perimeter();
        triangle2.square();
        System.out.println("-----------------------------------------------------\n");


        PlaneFigureInterface trapezoid = new Trapezoid(5, 4, 6, 4, 0);
        System.out.println(trapezoid);
        trapezoid.perimeter();
        trapezoid.square();
        System.out.println("-----------------------------------------------------\n");


        PlaneFigureInterface parallelogram = new Parallelogram(0, 0, 0, 0, 0, 0, 10, 8, 45);
        System.out.println(parallelogram);
        parallelogram.perimeter();
        parallelogram.square();
        System.out.println("-----------------------------------------------------\n");

        PlaneFigureInterface parallelogram1 = new Parallelogram(5, 4, 5, 4, 20, 0, 0, 0, 0);
        System.out.println(parallelogram1);
        parallelogram1.perimeter();
        parallelogram1.square();
        System.out.println("-----------------------------------------------------\n");

    }
}
