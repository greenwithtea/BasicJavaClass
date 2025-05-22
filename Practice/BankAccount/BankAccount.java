class BankAccount {
    double balance;
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println(amount + " 원이 예금되었습니다.");
    }
    void withdraw(double amount)
    {
        if (balance < amount)
        {
            if (balance == 0)
            {
                System.out.println("잔고가 없습니다. 인출 실패!!");
            }
            System.out.println("잔액이 모자랍니다. 인출 실패!!");
        }
        else
        {
            balance -= amount;
            System.out.println(amount + " 원이 인출되었습니다.");
        }
    }
    void printBalance()
    {
        System.out.println("현재 잔액 : " + balance);
    }
    double addInterest()
    {
        double balance1;
        balance1 = (double)(balance * 0.075);
        return balance1;
    }
}