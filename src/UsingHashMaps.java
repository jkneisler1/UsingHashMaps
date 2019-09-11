import java.util.HashMap;
import java.util.Scanner;

public class UsingHashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        String userPrompt = "Enter a number: ";
        String endQu = "Press <enter> or enter Q to quit";
        String userResp;
        int userRespInt;
        Scanner key = new Scanner(System.in);
        boolean sessionActive = true;

        // Set up a couple of key - value pairs
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(3, "Three");


        while(sessionActive) {
            System.out.println(userPrompt);
            userResp = key.nextLine();
            userRespInt = Integer.parseInt(userResp);

            if (myMap.containsKey(userRespInt)) {
                System.out.println("The key is " + userRespInt + ", and the value is " + myMap.get(userRespInt));
            }
            else {
                System.out.println("Enter the name of the number that you entered.");
                userResp = key.nextLine();
                // System.out.println(userResp);        // used for testing
                myMap.put(userRespInt, userResp);
            }

            System.out.println(endQu);
            userResp = key.nextLine();
            if ( userResp.equalsIgnoreCase("q")) {
                sessionActive = false;
            }
        }
    }
}
