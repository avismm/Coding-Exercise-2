import java.util.ArrayList;
import java.util.List;

/*You have a list of strings and, you want to keep only those that start
with “A” and you want to return them in lower case"
*/
public class Question7KeepingStringsStartingWithA {

    public static void main(String[] args) {

        ArrayList<String> arr1= new ArrayList<>();
        arr1.add("Anthem");
        arr1.add("Sugar");
        arr1.add("Television");
        arr1.add("Shoes");
        arr1.add("Apples");
        List<String> resultList = new ArrayList<>();
        for(String c:arr1){
            if(c.startsWith("A")){
                    resultList.add(c.toLowerCase());
            }
        }
        System.out.println(resultList);
    }
}

