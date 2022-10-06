package Study221006.Map;

public class IsAlphabet {

    public boolean isAlphabet(char num) {
        if ((num > 64 && num < 91) || (num > 96 && num < 123)){
            return true;
        }
        else return false;
    }
}
