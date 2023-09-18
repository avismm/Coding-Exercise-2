public class Question11Car {
    double carPrice;
    String color;

    public Question11Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice(){
        return carPrice;
    }

}
class Sedan extends Question11Car{
double length;
    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    public double calculateSalePrice(){
        if(length>20){

            //calculating the new price and casting the multiplier factor to double
            carPrice= carPrice*((double) 95 /100);
        }else {
            carPrice= carPrice*((double) 90 /100);
        }
        return carPrice;
    }
}
class Truck extends Question11Car{
    double weight;

    public Truck(double carPrice, String color,double weight) {
        super(carPrice, color);
        this.weight=weight;
    }
@Override
    public double calculateSalePrice(){
        if(weight>2000){

            //calculating the new price and casting the multiplier factor to double
        carPrice= carPrice*((double) 90 /100);
        }else {
            carPrice= carPrice*((double) 80 /100);
        }
     return carPrice;
    }

}
