/**
 * Created by Vit on 25.12.2016.
 */
public class Parallelogram extends Quadrilateral {
    private double angleABC;
    private double angleAOB;
    private double square;
    private double height;
    private double diagonal1;
    private double diagonal2;


    public Parallelogram(double side1, double side2, double side3, double side4, double angleABC, double height, double diagonal1, double diagonal2, double angleAOB) {
        super(side1, side2, side3, side4);
        this.angleABC = angleABC;
        this.height = height;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.angleAOB = angleAOB;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": sideAB "+side1+" sideBC "+side2+" sideCD "+side3+" sideDA "+side4+" diagonal1 "+diagonal1+" diagonal2 "+diagonal2+" angleAOB "+angleAOB+" angleABC "+angleABC+" height "+height;
    }

    @Override
    public double square() {
        if (side3 != 0 && angleABC != 0)  {
            square = Math.sin(angleABC) * side3 * side3;
            System.out.println("Square of parallelogram is (S=a^2*sin(alfa)):" + square);
        }
        if (side3 != 0 && height != 0){
            square = side3*height;
            System.out.println("Square of parallelogram is (S=a*h):" + square);
        }

        if (diagonal1 != 0 && diagonal2 != 0 && angleAOB != 0){
            square = 0.5*(diagonal1*diagonal2*Math.sin(angleAOB));
            System.out.println("Square of parallelogram is (S=1/2*d1*d2*sin(gama)):" + square);

        }
        return square;
    }
}
