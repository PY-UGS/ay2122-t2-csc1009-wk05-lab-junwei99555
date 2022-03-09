package lab5_q2;

public class Triangle extends Shape {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    public double area() {
        System.out.println("Inside Area for Triangle.");
        return 0.5 * super.getDim1() * super.getDim2();
    }
}
