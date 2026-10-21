import java.util.*;

public class Inheritance {
    public static void main(String[] args) {
        Add a = new Add(10,5);
        System.out.println(a.add());
    }
}
class Base{
    int a;
    int b;
    Base(int a,int b){
        this.a = a;
        this.b = b;
    }
}
class Add extends Base{
    Add(int a, int b) {
        super(a, b);
    }
    int add(){
        return a+b;
    }
}
class Sub extends Base{
    Sub(int a, int b) {
        super(a, b);
    }
    int sub(){
        return a-b;
    }
}
class Mul extends Base{
    Mul(int a, int b) {
        super(a, b);
    }
    int mul(){
        return a*b;
    }
}
class Div extends Base{
    Div(int a, int b) {
        super(a, b);
    }
    int div(){
        return a/b;
    }
}
class Mod extends Base{
    Mod(int a, int b) {
        super(a, b);
    }
    int mod(){
        return a%b;
    }
}