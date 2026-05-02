  abstract class Animal{
    int no_of_legs;
    String name;
    
    abstract void sound();//abstract method
    void fly(){//non abstract method
        System.out.println("animal is flying");
    }


    void eat(){//non abstract method
        System.out.println("animal is eating.....wow it is so delicious");
    }
    
  }
   abstract class Bird extends Animal{
        
    abstract void colour();
    void fly(){
        System.out.println("bird is flying");
    }

  } 
class koyal extends Bird{
    void sound(){
        System.out.println("koyal is singing");
    }
    void colour(){
        System.out.println("koyal is black in colour");
    }
}
public class abstraction1 {
    public static void main(String[] args) {
        Animal a1=new koyal();
        a1.eat();
        a1.sound();
        a1.fly();
        a1.no_of_legs=2;
        System.out.println(a1.no_of_legs);


        

    }
}
