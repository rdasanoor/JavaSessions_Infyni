package ExceptionHandling.interfacePkg;

public class Rectangle implements Shape, Shape1{
    @Override
    public void drawShape() {
        System.out.println("**Rectangle shape");
    }

    @Override
    public void drawShape1() {

    }
}
