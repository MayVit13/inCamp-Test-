/**
 * Created by Vit on 25.12.2016.
 */
public abstract class Quadrilateral implements PlaneFigureInterface {
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;
    protected double perim;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": sideAB "+side1+" sideBC "+side2+" sideCD "+side3+" sideDA "+side4;
    }

    @Override
    public double perimeter() {
        if (side1 == 0 || side2 == 0 || side3 == 0 || side4 == 0){
            System.out.println("Perimeter of quadrilateral is UNKNOWN!");
            perim=0;
        }
        else{
        perim=side1+side2+side3+side4;
        System.out.println("Perimeter of quadrilateral is:" + perim );}

        return  perim;
    }

    public abstract double square();
}
