package lab5_q2;

public class Circle extends Shape {

    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    public double area() {
        System.out.println("Inside Area for Circle.");
        return (double) Math.round((super.getPI() * super.getDim1() * super.getDim2()) * 10)/10;
    }
}
