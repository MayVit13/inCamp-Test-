/**
 * Created by Vit on 25.12.2016.
 */
public class Triangle implements PlaneFigureInterface {
    private double side1;
    private double side2;
    private double side3;
    private double perim;
    private double square;
    private double height;

    public Triangle(double side1, double side2, double side3, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": sideAB "+side1+" sideBC "+side2+" sideCD "+side3+" height "+height;
    }

    @Override
    public double perimeter() {
        if (side1 == 0||side2 == 0 || side3 == 0){
            System.out.println("Perimeter of triangle is UNKNOWN!");
            perim=0;
        }

        else{
        perim=side1+side2+side3;
        System.out.println("Perimeter of triangle is:" + perim );}

        return perim;
    }

    public double square(){
        if (side1 != 0 && side2 != 0 && side3 != 0 && height == 0) {
            square = Math.sqrt(perim / 2 * (perim / 2 - side1) * (perim / 2 - side2) * (perim / 2 - side3));
            System.out.println("Square of triangle is(S=sqrt(p*(p-a)*(p-b)*(p-c))):" + square);
        }
        if (side2 != 0 && height != 0){
            square = 0.5*side2 * height;
            System.out.println("Square of triangle is(S=1/2*a*h):" + square);
        }
        return square;
    }
}
