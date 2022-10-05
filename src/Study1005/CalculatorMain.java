package Study1005;
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.userInput();
        calculator.plus(calculator.a,calculator.b);
        calculator.minus(calculator.a,calculator.b);
        calculator.multiple(calculator.a,calculator.b);
        calculator.devide(calculator.a,calculator.b);
    }
}
