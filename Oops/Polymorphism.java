import java.util.*;

public class Polymorphism {
    public static void main(String[] args) {
        FunctionOverload fo = new FunctionOverload();
        System.out.println(fo.sum(10,5));
        
        Drive d = new Drive();
        d.print();
    }
}

class FunctionOverload{
    
    int sum(int a,int b){
        return a+b;
    }
    
    float sum(float a,float b){
        return a+b;
    }
}
class Base{
    void print(){
        System.out.println("I am Base Class");
    }
}
class Drive extends Base{
    void print(){
        System.out.println("I am Drive Class");
    }
}