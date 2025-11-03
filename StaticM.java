class Demo {
    private int x;
    private int y;

    void fun1() {
        x = 5;
        y = 6;
    }

    void fun2() {
        System.out.println(x);
        System.out.println(y);
    }
}

class StaticM{
    public static void main(String args[]){
        Demo d1=new Demo();
        d1.fun1();
        d1.fun2();
        
        
        // System.out.println(d1.x);
        //  System.out.println(d1.y);

    }
}