public interface Question9Shape {

    public void calculateArea();
    public void calculatePerimeter();

}

class circle implements Question9Shape {
    @Override
    public void calculateArea() {
        double area;
        double radius=23.5;
        area=Math.PI*radius*radius;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter;
        double radius=23.5;
        perimeter=Math.PI*radius*2;
        System.out.println(perimeter);
    }
}
class Square implements Question9Shape {

    @Override
    public void calculateArea() {
        double area;
        double length=23.5;
        double width=23.5;
        area=length*width;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter;
        double length=23.5;
        double width=23.5;
        perimeter=(length+width)*2;
        System.out.println(perimeter);
    }
}
