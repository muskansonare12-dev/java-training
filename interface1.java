interface Animal{
    void sound();

    default void eat(){
        System.out.println("animal is eating.....wow it is so delicious");
    }
}
class Bird implements Animal{
    public void sound(){
        System.out.println("bird is chirping");

    }
    void fly(){
        System.out.println("bird is flying");
    }

}

public class interface1 {
    public static void main(String[] args) {
        Bird a1=new Bird();
        a1.sound();
        a1.eat();
        a1.fly();
        
    }
}
