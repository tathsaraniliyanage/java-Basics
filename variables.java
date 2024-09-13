public class variables{
    public static void john(){
        String apple = "redapple";
        System.out.println(apple);
    }
    public static void main(String[] args){
        number();
        john();
        kamal();
        ama();
    }
    public static void kamal(){
        int a = 100;
        int b=20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a*b);
    }
    public static boolean ama(){
        if(100>50){
            System.out.println("t");
              
        }else{
            System.out.println("f");
           
        }
       return true;
    }
    public static void number(){
        int a= 100;
        a =80;
        System.out.println(a);

        float n = 45.78f;
        n=67.89f;
        System.out.println(n);

        String flower = "rose";
        flower = "pichcha";
        System.out.println(flower);

        Double d = 89.90;
        d=56.78;
        System.out.println(d);

        char mymonth = 'j';
        mymonth= 'y';
        System.out.println(mymonth);
    }

}