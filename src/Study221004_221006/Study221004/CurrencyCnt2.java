package Study221004_221006.Study221004;

public class CurrencyCnt2{
    public static void main(String[] args) {
        int currency50000 = 50000;
        int currency10000 = 10000;
        int currency5000 = 5000;
        int currency1000 = 1000;
        int currency500 = 500;
        int currency100 = 100;
        int currency50 = 50;
        int currency10 = 10;

        int refund = 25000;

        System.out.printf("5만원권 %d장 , 거스름돈 %d원\n", refund / currency50000 , refund % currency50000);
        refund %= currency50000;
        System.out.printf("1만원권 %d장 , 거스름돈 %d원\n", refund/ currency10000, refund % currency10000);
        refund %= currency10000;
        System.out.printf("5천원권 %d장 , 거스름돈 %d원\n", refund / currency5000 , refund  % currency5000 );
        refund %= currency5000;
        System.out.printf("1천원권 %d장 , 거스름돈 %d원\n", refund/ currency1000 ,refund % currency1000);
        refund %= currency1000;
        System.out.printf("5백원 %d개 , 거스름돈 %d원\n", refund / currency500 , refund % currency500);
        refund %= currency100;
        System.out.printf("1백원 %d개 , 거스름돈 %d원\n", refund / currency500 , refund % currency500);
        refund %= currency50;
        System.out.printf("5십원 %d개 , 거스름돈 %d원\n", refund / currency500 , refund % currency500);
        refund %= currency10;
        System.out.printf("십원 %d개 , 거스름돈 %d원\n", refund / currency500 , refund % currency500);



    }
}
