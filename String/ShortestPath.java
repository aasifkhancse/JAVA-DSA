import java.util.*;

public class ShortestPath{
    public static float shortestpath(String path) {
        int x = 0;
        int y = 0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i) == 'N'){
                y++;
            }
            else if(path.charAt(i) == 'S'){
                y--;
            }
            else if(path.charAt(i) == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X = x*x;
        int Y = y*y;
        return (float)Math.sqrt(X + Y);
    }
    public static void main(String[] args) {
        System.out.println(shortestpath("NNNW"));
    }
}