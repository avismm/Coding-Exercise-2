public class CarTester {
    public static void main(String[] args) {
        Question11Car[] arr = {new Sedan(45000,"blue",459), new Truck(45000,"white",4000)};
        for(Question11Car s:arr){
            System.out.println( s.calculateSalePrice());
        }


    }
}
