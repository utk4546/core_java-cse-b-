import java.util.Scanner;

 class greater {
    public static void main(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("enter two number");
          int x=s1.nextInt();
          int y=s1.nextInt();
        if(x>y){
            System.out.println(x+ "is greater");
        }else if(x==y){
             System.out.println("both are equal ");
        }else{
             System.out.println(y+" is greater");
        }
        
    }
    
}

