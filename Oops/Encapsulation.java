import java.util.*;

public class Encapsulation{
    public static void main(String[] args) {
        Data d = new Data();
        d.setName("Aasif");
        d.setAge(22);
        System.out.println(d.getName());
        System.out.println(d.getAge());
    }
}
class Data{
    String name;
    int age;
    
    String getName(){
        return this.name = name;
    }
    int getAge(){
        return this.age = age;
    }
    
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
}