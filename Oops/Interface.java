import java.util.*;

public class Interface{
    public static void main(String[] args) {
        Right r = new Right();
        r.dir();
    }
}
interface Direction{
    void dir();
}

class Right{
    void dir(){
        System.out.println("Right");
    }
}

class Left{
    void dir(){
        System.out.println("Left");
    }
}

class Up{
    void dir(){
        System.out.println("Up");
    }
}

class Down{
    void dir(){
        System.out.println("Down");
    }
}