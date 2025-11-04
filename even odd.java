   
import java.util.Scanner;

 class even {
    public static void main(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("enter a number:"); int x=s1.nextInt();
        //   int x=s1.nextInt();
        //   int y=s1.nextInt();
        if(x%2==0){
            System.out.println(x+" "+"is even");
       
        }else{
             System.out.println(x+" is odd");
        }
        
    }
    
}


