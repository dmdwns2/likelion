package Study1005.Calculator0;

public class Calculator {
    NumberGenerator numberGenerator;
    private int baseNum;
    public Calculator(NumberGenerator numberGenerator){
        this.numberGenerator = numberGenerator;
        this.baseNum = 10;
    }
    //메소드 오버로딩
    public Calculator(NumberGenerator numberGenerator, int baseNum){
        this.numberGenerator = numberGenerator;
        this.baseNum = baseNum;
    }
    public void plus(int num){
        System.out.println(num + numberGenerator.make(baseNum));
    }
}
