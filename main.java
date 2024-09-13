class main{
    public static void main(String[] args){
        mango();
        System.out.println("Hello Java");
        apple();
        number(10,20);
    }

    public static void mango(){
        System.out.println("my mango");
    }

    public static void apple(){
        System.out.println("my apple");
    }

    public static void number(int a, int b){
        System.out.println("my number");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a*b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(b/a);
        System.out.println(a%b);
        System.out.println(b%a);
        
        System.out.println((a+b)*a);

    }
}