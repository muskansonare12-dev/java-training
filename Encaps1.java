 class student{
 private int rollno;
private String name;
private int age;
private String section;

student(int r,String name,int age,String sec){
    this.rollno=r;
    this.name=name;
    this.age=age;
    this.section=sec;
}


 private void study(){
    System.out.println("dont disturb me i am studying");
}
private void sleep(){
    System.out.println("i am sleeping");
}

public int getRollNo(){
    return this.rollno;
}
public void setRollNo(int rollno){
    this.rollno=rollno;

}
public String getname(){
    return this.name;
}
public void setName(String name){
    this.name=name;

}
public int getAge(){
    return this.age;
}
public void setAge(int age){
    this.age=age;

}
public String getSection(){
    return this.section;
}
public void setSection(String sec){
    this.section=sec;

}
public void callstudy(){
    this.study();


}
public void callsleep(){
    this.sleep();
}

 }

 
 
 public class Encaps1 {
    public static void main(String[] args) {
        student s1=new student(123,"muskan",20,"H");

        System.out.println(s1.getname());
        s1.callstudy();
       
       
    }
    
}
 