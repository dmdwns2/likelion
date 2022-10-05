package CodeupSelfTest;

import java.util.Scanner;

class Product { // 가격과 이름만 가지고 있으면 됨

    final private int price;
    final private String name;

    Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
}

class Computer extends Product {
    public Computer() {
        super(5000000, "Computer");
    }

    public String toString() { // 이게 없으면 해시코드값을 내보냄
        return "Computer";
    }
}

class TV extends Product {
    TV() {
        super(1000000, "TV");
    }

    public String toString() {
        return "TV";
    }
}

class Audio extends Product {
    Audio() {
        super(500000, "Audio");
    }

    public String toString() {
        return "Audio";
    }
}


// 이 클래스는 멤버변수로 돈(money)과 장바구니(cart)를 가지고 있다.
class Buyer {
    private int money; // 돈은 유저입력
    final private static int cartLength = 2; // 장바구니 2칸시작
    private int i = 0, escape = 0;

    Product[] cart = new Product[cartLength - 1];


    // 돈 세팅
    public void setMoney(int money) {
        this.money = money;
    }


    /*    메서드명 : buy

        기능 : 지정된 물건을 구입한다. 가진 돈(money)에서 물건의 가격을 빼고, 장바구니(cart)에 담는다.
        만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.

        반환타입 : 없음
        매개변수 : Product p - 구입할 물건

        (1) 아래의 로직에 맞게 코드를 작성하시오 .
        1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
        1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고 1.3 장바구니에 구입한 물건을 담는다.(add 메서드 호출 )
     */
    public void buy(Product p) {
        compareMoneyWithPrice(p);
        buyProduct(p);
    }

    private void compareMoneyWithPrice(Product p) {
        if (money < p.getPrice()) {
            System.out.println("가진 돈이 부족합니다.");
            return;
        }
        escape = 1;
    }

    private void buyProduct(Product p) {
        if (escape == 1) {
            money -= p.getPrice();
            escape = 0;
            add(p);
        }
    }

    /*
        메서드명 : add

        기능 : 지정된 물건을 장바구니에 담는다.
        만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린 다음에 담는다.

        반환타입 : 없음
        매개변수 : Product p - 구입할 물건


         (2) 아래의 로직에 맞게 코드를 작성하시오.
         1.1 i의 값이 장바구니의 크기보다 같거나 크면 1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
         1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
         1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다. 1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
		 */

    public void add(Product p) {
        cartFullCheck();
        addProduct(p);
    }

    private void cartFullCheck() {
        if (i < cart.length) {
            return;
        }
        Product[] newCart = new Product[cart.length * 2];
        for (int j = 0; j < cart.length; j++) {
            newCart[j] = cart[j];
        }
        cart = newCart;

    }

    private void addProduct(Product p) {
        cart[i] = p;
        i++;
    }

    /*
        메서드명 : summary

        기능 : 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.

        반환타입 : 없음
        매개변수 : 없음


		 (3) 아래의 로직에 맞게 코드를 작성하시오 .
		 1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다 .
		 1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
		 1.3 물건을 사고 남은 금액 를 출력한다(money).
    */
    public void summary() {
        int sum = 0;

        System.out.println("장바구니 목록 : ");
        for (Product show : cart
        ) {
            if (show != null)
                System.out.println(show); // cart의 해시코드값을 내보냄. 위에서 toString처리를 해줘야 프리미티브값이 나옴.
        }

        // 장바구니 안 가격 계산
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null)
                sum += cart[i].getPrice();
        }
        System.out.println("장바구니 안 가격 합계 : " + sum);
        System.out.println("현재 남은 금액 : " + this.money);
    }
}


public class BuyerTest {

    public static Product returnUserInput() {

        // 상품 입력
        try {
            System.out.println("사고싶은 물건을 입력해주세요 (Computer, TV, Audio) : ");
            String productName = (new Scanner(System.in)).nextLine().trim();
            switch (productName) {
                case "Computer":
                    return new Computer();
                case "computer":
                    return new Computer();
                case "TV":
                    return new TV();
                case "tv":
                    return new TV();
                case "Audio":
                    return new Audio();
                case "audio":
                    return new Audio();
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        Buyer buyer = new Buyer();

        //가진 돈 세팅
        while (true) {
            try {
                System.out.println("얼마를 가지고 계십니까?");
                int userInputMoney = (new Scanner(System.in)).nextInt();
                buyer.setMoney(userInputMoney);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("비정상적인 숫자를 입력하셨습니다.");
            }
        }


        while (true) {

            try {
                //동작
                System.out.println("동작 결정 : 1. buy 2. summary 3. exit");
                int work = (new Scanner(System.in)).nextInt();
                switch (work) {
                    case 1: {
                        //push 동작
                        buyer.buy(returnUserInput());
                        break;
                    }
                    //summary
                    case 2: {
                        buyer.summary();
                        break;
                    }
                    case 3: {
                        System.exit(0);
                        break;
                    }
                    default:
                        System.out.println("1,2,3 중 하나만 입력 해 주세요");
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

