import java.util.Arrays;

public class Main {

    public static int addArraySum(int[] givenArray) {    
        return Arrays.stream(givenArray).sum();
    }
	
}
