package cashmachine;

public class Bank {

    private int loginAttempts = 0;

    public boolean cardIsLocked(String id) {
        return false;
    }

    public boolean validateCard(String id, String pin) {
        return true;
    }




    public static String getName() {
        return "Bank of Sweden";
    }


}
