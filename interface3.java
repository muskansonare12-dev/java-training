interface A{
    void show();
}
interface B{
    void show();
}
interface C extends A,B{


    public void show(){
    System.out.println("this is show A");
    }
    public void show(){
        System.out.println("this is show B")
    }
}





public class interface3 { 
    C obj=new C();
    obj.show();
    obj.show();



    
}


