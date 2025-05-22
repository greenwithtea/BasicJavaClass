public class BankAccountTest {
    public static void main(String[] args)
    {
        BankAccount a1 = new BankAccount();

        a1.deposit(100.45);  // a1의 잔고를 100.45으로 한다.
        a1.withdraw(60.78);  // a1에서 60.78을 인출한다.

        a1.printBalance(); // 잔액 출력
        System.out.println("a1의 연 이자는 : " + a1.addInterest());
        a1.withdraw(50.698); // a1에서 50.698을 인출한다.
        a1.printBalance();
        a1.withdraw(40.412); //a1에서 40.412을 인출한다.
        a1.printBalance();
        a1.withdraw(10.387); // a1에서 10.387을 인출하다.
        a1.printBalance();
        
    }
}
