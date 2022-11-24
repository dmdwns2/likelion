package Study221004_221006.Study221006.Map;

public class IsAlphabet {

    public boolean isAlphabet(char num) {
        if ((num >= 'A' && num <= 'Z') || (num >= 'a' && num <= 'z')){
            return true;
        }
        else return false;
    }
}
