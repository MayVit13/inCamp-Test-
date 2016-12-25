/**
 * Created by Vit on 25.12.2016.
 */
public class Trapezoid extends Quadrilateral{

    private double height;
    private double square;

    public Trapezoid(double side1, double side2, double side3, double side4, double height) {
        super(side1, side2, side3, side4);
        this.height = height;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": sideAB "+side1+" sideBC "+side2+" sideCD "+side3+" sideDA "+side4+" height "+height;
    }

    @Override
    public double square() {
        if (height==0){
            square = ((side1+side3)/Math.abs(side1-side3))*Math.sqrt((perim/2-side1)*(perim/2-side3)*(perim/2-side1-side2)*(perim/2-side1-side4));
            System.out.println("Square of trapezoid(S = ((a+b)/Math.abs(a-b))*Math.sqrt((p-a)*(p-b)*(p-a-c)*(p-a-d))):"+square);
        }
        else{
            square=1/2*(side1+side3)*height;
            System.out.println("Square of trapezoid(S=1/2(a+b)*h):"+square);
        }
        return square;
    }

}
