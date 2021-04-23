import java.util.*;

public class JumpingOnTheClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        int i = 0;
        while(i < c.size() - 1){
            if(i+2 == c.size() || c.get(i+2) == 1){
                i++;
                jumps++;
            }
            else{
                i += 2;
                jumps++;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        ArrayList<Integer> test1 = new ArrayList<Integer>();


        }
    
}
