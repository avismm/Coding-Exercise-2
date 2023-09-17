public class MarksTester {
    public static void main(String[] args) {
        Question10Marks[] arr = {new A(34,76,76), new B(34,87,12,45)};
        for(Question10Marks s:arr){
            System.out.println( s.getPercentage());
        }


    }
}
