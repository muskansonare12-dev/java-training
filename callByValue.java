public class callByValue {
   
       public static void add(int a,double b,String msg){
            a=50;
            b=80.0;
            double c=a+b;
            msg="hellooo";
            System.out.println(c);
        }
        public static void main(String[] args) {
        int a=10 ;
         double b=20.0;
         String msg="hi";//manage jvm string class
        // callByValue c=new callByValue();
        add(a,b,msg);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("msg:"+msg);

}
}

