package cashmachine;

public class Bank {

    private int unlockAttempts = 0;
    private String correctPin = "0000";
    private float balance = 1000;

    public boolean cardIsLocked(String id) {
        return false;
    }

    public boolean validPin(String id, String pin) {
        if (pin == correctPin) {
            return true;
        }
        unlockAttempts++;
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

    public void deposit (int amount) {
        balance += amount;
    }

    public void withdraw (int amount) {
        balance -= amount;
    }


}
