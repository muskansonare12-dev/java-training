class A{
    void add(int a,int b){
        System.out.println("total from A="+(a+b));

    }
}
class B extends A{

    void add(int a,int b){
            super.add(a,b);
        System.out.println("total from B="+(a+b));
    }
}





public class overriding {
    public static void main(String[] args) {
        B b=new B();
        b.add(10,20);
    }
}
