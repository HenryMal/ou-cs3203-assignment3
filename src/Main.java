import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        
        int[] userArray;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ENTER THE NUMBER OF ELEMENTS: ");
        userArray = new int[scanner.nextInt()];
        
        System.out.println("ENTER THE ELEMENTS: ");
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = scanner.nextInt();
        }
        
        System.out.println("SUM OF THE ELEMENTS: " + addArraySum(userArray));
        System.out.println("PRODUCTS OF THE ELEMENTS: " + multiplyArrayElements(userArray));
        
        scanner.close();

    }

    public static int addArraySum(int[] givenArray) {    
        return Arrays.stream(givenArray).sum();
    }
    
    public static int multiplyArrayElements(int[] givenArray) {
        return Arrays.stream(givenArray).boxed().reduce(1, (a, b) -> a * b);
    }
	
}
