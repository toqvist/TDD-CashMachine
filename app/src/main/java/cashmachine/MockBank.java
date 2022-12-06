package cashmachine;

public class MockBank {

    private int unlockAttempts = 0;
    private String correctPin = "0000";
    private float balance = 1000;

    public boolean cardIsLocked(String id) {
        if (unlockAttempts >= 3) {
            return true;
        }
        return false;
    }

    public boolean validPin(String id, String pin) {
        if (cardIsLocked(id)) {
            return false;
        }
        
        unlockAttempts++;
        if (pin.equals(correctPin)) {
            return true;
        }
        return false;
    }

    public int getUnlockAttempts () {
        return this.unlockAttempts;
    }

    public void setCorrectPin (String pin) {
        correctPin = pin;
    }

    public float getBalance () {
        return this.balance;
    }


    public static String getName() {
        return "Bank of Sweden";
    }

    public float deposit (int amount) {
        this.balance += amount;
        return this.balance;
    }

    public float withdraw (int amount) {
        if ( amount > this.balance) {
            return this.balance;
        }
        this.balance -= amount;
        return this.balance;
    }
    
    public void setBalance(float newBalance) {
        this.balance = newBalance;
    }


}
