package cashmachine;

public class Hardware {
    boolean cardIsInserted = true;

    public boolean cardIsInserted () {
        return this.cardIsInserted;
    }    

    public void ejectCard () {
        this.cardIsInserted = false;
    }

    public String getCardID () {
        if (cardIsInserted()) {
            return "123456789";
        }
        return "000000000";
    }

    private void openBanknoteTray () {
    }

    private void closeBanknoteTray () {
    }

    private int countInsertedAmount (int amount) {
        return amount;
    }

    public boolean receivedMoney (int amount) {
        openBanknoteTray();
        boolean waitForMoney = true;
        while (waitForMoney) {
            if (countInsertedAmount(amount) == amount) {
                closeBanknoteTray();
                waitForMoney = false;
                return true;
            }
        }
        return false;
    }

    public void dispenseMoney (int amount) {
        openBanknoteTray();
        System.out.println("WHRRRrRrRrRrrRRRrrrRrRrrr!");
        closeBanknoteTray();
    }
}
