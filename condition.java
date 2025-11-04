import java.util.Scanner;

public class condition {
    public static void main(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("enter a number");
          int x=s1.nextInt();
        if(x>0){
            System.out.println(x+"is possitive");
        }else if(x==0){
             System.out.println(x+" is niether negative nor positive");
        }else{
             System.out.println(x+" is negative");
        }
        
    }
    
}
