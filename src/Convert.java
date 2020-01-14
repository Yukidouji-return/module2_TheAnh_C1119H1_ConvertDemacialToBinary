import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        int number,result;
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number you want revert: ");
        number = scanner.nextInt();
        while (number > 1) {

            result = number % 2;
            stack.push(result);
            number = number / 2;
        }
        System.out.println(stack);

    }
}
