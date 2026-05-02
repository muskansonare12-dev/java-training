
    interface Animal{
    void sound();

    default void eat(){
        System.out.println("animal is eating.....wow it is so delicious");
    }
}
 interface Bird extends Animal{
    public void fly();
        default void sleep(){
        System.out.println("bird is chirping");

    }
}
    
    class sparrow extends Bird
        
       public void fly(){
        System.out.println("bird is flying");
    }
    

}

public class interface2 {
    public static void main(String[] args) {
        Bird a1=new sparrow();
        a1.sound();
        a1.eat();
        a1.fly();
        a1.sleep();
        
    }
}


