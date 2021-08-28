package solid;

class Main {
    public static void main(String[] args) {
        TransferMoneyProcess p1 = new ThailandBankAccount();
        p1.transferMoney(new BankAccount(), 1000);

        TransferMoneyProcess p2 = new InterBankAccount();
        p2.transferMoney(new BankAccount(), 1000);
    }
}

enum AccountType {
    Thailand,
    International
}

class BankAccount {

}

interface TransferMoneyProcess {
    void transferMoney(BankAccount targetAccount, int amount);
}

class ThailandBankAccount implements TransferMoneyProcess {
    @Override
    public void transferMoney(BankAccount targetAccount, int amount) {
        System.out.println("Transfer money in Thailand");
    }
}

class  InterBankAccount implements TransferMoneyProcess {
    @Override
    public void transferMoney(BankAccount targetAccount, int amount) {
        System.out.println("Transfer money in Inter...");
    }
}