import java.util.Arrays;

public class Main {

    public static int addArraySum(int[] givenArray) {    
        return Arrays.stream(givenArray).sum();
    }
    
    public static int multiplyArrayElements(int[] givenArray) {
        return Arrays.stream(givenArray).boxed().reduce(1, (a, b) -> a * b);
    }
	
}
