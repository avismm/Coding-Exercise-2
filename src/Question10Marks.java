public abstract class Question10Marks {

    abstract double getPercentage();
}

class A extends Question10Marks{
   private int mark1;
   private int mark2;
  private  int mark3;

    public A(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    double getPercentage() {
        double percentage;
        percentage=(mark1+mark2+mark3)/3;
        return percentage;
    }
}
class B extends Question10Marks{
    private int mark1;
   private int mark2;
    private int mark3;
   private int mark4;

    public B(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    double getPercentage() {
        double percentage;
        percentage=(mark1+mark2+mark3+mark4)/4;
        return percentage;

    }
}
