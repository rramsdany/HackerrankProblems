

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int height = 0;
        int valleys = 0;
        for(int i = 0; i < steps; i++){
            if(path.charAt(i) == 'U'){
                if(height == -1)
                    valleys++;
                height++;
            }
            else if(path.charAt(i) == 'D'){
                height--;
            }

        }

        return valleys;

    }

    public static void main(String[] args) {
        String test1 = "UDDDUDUU";
        System.out.println("Number of valleys in test 1: " + countingValleys(8, test1));

        String test2 = "UUUDDDDU";
        System.out.println("Number of valleys in test 2: " + countingValleys(8, test2));

        String test3 = "DUDUDUDU";
        System.out.println("Number of valleys in test 3: " + countingValleys(8, test3));

        String test4 = "DDDUUDUU";
        System.out.println("Number of valleys in test 4: " + countingValleys(8, test4));

    }
}
