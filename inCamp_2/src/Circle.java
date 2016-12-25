/**
 * Created by Vit on 25.12.2016.
 */
public class Circle implements PlaneFigureInterface {

    private double radius;
    private double length;
    private double square;

    public Circle(double radious) {
        this.radius = radious;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": radius "+radius;
    }

    @Override
    public double perimeter() {
        length = 2*3.16*radius;
        System.out.println("Length of circle is:" + length);
        return length;
    }

    public double square(){
        square = 3.16*radius*radius;
        System.out.println("Square of circle(S=pi*r^2):"+square);
        return square;
    }
}
