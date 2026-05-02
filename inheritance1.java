class Car{
    String colour;
    String model;
    String brand;
    int mileage;
    int no_of_gears;

    Car(String colour,String model,String brand,int mileage,int no_of_gears){
        this.colour=colour;
        this.model=model;
        this.brand=brand;
        this.mileage=mileage;
        this.no_of_gears=no_of_gears;

    }



    void applybreak(){
        System.out.println("breaking the car");
    }
    void applySpeed(){
        System.out.println("applying speed");
    }
    void shiftGear(){
        System.out.println("shifting the gear");
    }
}

class Verna extends Car{
       int capacity;

    Verna(String colour,String model,String brand,int mileage,int no_of_gears,int capacity){
        super(colour,model,brand,mileage,no_of_gears);
         this.capacity=capacity;


    }
 


    void airbags(){
        System.out.println("verna has airbags");
    }


}


public class inheritance1 {
    public static void main(String[] args) {
  Verna v1=new Verna("black","sedan","hyundai",15,6,5);
    v1.applybreak();
    v1.applySpeed();
    v1.shiftGear();
    v1.airbags();
    System.out.println(v1.colour);
    System.out.println(v1.model);
    System.out.println(v1.brand);
    
  
}

        
    }
   
