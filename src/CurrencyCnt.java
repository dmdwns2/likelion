public class CurrencyCnt{
    public static void main(String[] args) {
        int currency50000 = 50000;
        int currency10000 = 10000;
        int currency5000 = 5000;
        int currency1000 = 1000;
        int currency500 = 500;

        int refund = 25000;

        System.out.printf("5만원권 %d장\n", refund / currency50000);
        System.out.printf("1만원권 %d장\n", refund / currency10000);
        System.out.printf("5천원권 %d장\n", refund / currency5000);
        System.out.printf("1천원권 %d장\n", refund / currency1000);
        System.out.printf("5백원 %d개\n", refund / currency500);



    }
}
