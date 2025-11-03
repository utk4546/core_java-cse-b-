import java.util.Scanner;
class Scan1{
    public static void main (String args[]){
        Scanner s1 =new Scanner(System.in);
        System.out.print("enter 2 numbers :");
        int x=s1.nextInt();
        int y=s1.nextInt();
        int z=x+y;
        System.err.println("addition is :"+z);
    }
}