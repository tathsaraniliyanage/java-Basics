public class ifelsejava{
    public static void main(String[] args){
            hey();
            hello();
            helllow();
    }
    public static void hey(){
        int a = 10;
        if(a>100){
            System.out.println("successfully");
        }else if(a>20){
            System.out.println("byebye");
        }else{
            System.out.println("lalai lilai lai");
        }
    }
    public static void hello(){
    int time = 20;
        if (time < 18) {
              System.out.println("Good day.");
        }else {
         System.out.println("Good evening.");
        }
    }
    public static void helllow(){
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }

}



// Short Hand if...else

// There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
// It can be used to replace multiple lines of code with a single line, and is most often used to replace simple 
// if else statements:


// variable = (condition) ? expressionTrue :  expressionFalse;





