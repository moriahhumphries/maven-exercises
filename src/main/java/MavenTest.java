import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class MavenTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userInput = scanner.nextLine();
        System.out.println("UserInput: " + userInput);
        System.out.println("Numeric? : " + StringUtils.isNumeric(userInput));

    System.out.println("Swap case : " + StringUtils.swapCase(userInput));

        System.out.println("Swap case : " + StringUtils.reverse(userInput));
}


}
