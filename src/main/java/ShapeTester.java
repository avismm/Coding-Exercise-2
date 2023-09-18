public class ShapeTester {
    public static void main(String[] args) {
        Question9Shape[] arr = {new circle(), new Square()};
        for(Question9Shape s:arr){
            s.calculateArea();
            s.calculatePerimeter();
        }

    }
}
