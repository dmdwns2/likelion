package Study1005;
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.userInput();
        calculator = new Calculator(calculator.a,calculator.b);
        calculator.plus();
        calculator.minus();
        calculator.multiple();
        calculator.devide();
    }
}
