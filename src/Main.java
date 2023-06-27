import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation : ");
        String list = """
                1.sum
                2.subtract
                3.multiply
                4.division
                """;
        System.out.println(list);
        int op = sc.nextInt();

        switch (op) {
            case  1 -> {
                Double firstNumber = sc.nextDouble();
                Double secondNumber = sc.nextDouble();
                BinaryOperator<Double> sum = (a, b) -> a + b;
                System.out.println(sum.apply(firstNumber,secondNumber));
            }
            case 2 -> {
                Double firstNumber = sc.nextDouble();
                Double secondNumber = sc.nextDouble();
                BinaryOperator<Double> sub = (a, b) -> a - b;
                System.out.println(sub.apply(firstNumber,secondNumber));
            }

            case  3 -> {
                Double firstNumber = sc.nextDouble();
                Double secondNumber = sc.nextDouble();
                BinaryOperator<Double> multiply = (a, b) -> a * b;
                System.out.println(multiply.apply(firstNumber,secondNumber));
            }

            case 4 -> {
                Double firstNumber = sc.nextDouble();
                Double secondNumber = sc.nextDouble();
                BinaryOperator<Double> div = (a, b) -> a * b;
                System.out.println(div.apply(firstNumber,secondNumber));
            }

            default -> throw new IllegalStateException("Unexpected value: " + op);
        }
    }
}