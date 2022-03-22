package Abstraction.PopularCars;

public class Test {
    
    public static void main(String[] args) {
        Series series = new Series();
        Models model = new Models();   
        model.accelerate();
        model.commonFunc();
        series.accelerate(); 
        series.commonFunc();
    }
}
