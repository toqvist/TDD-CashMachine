package cashmachine;

public class CashMachine {

    //Mock the bank backend
        // Login user using ID + PIN
        // Track login attempts
        // Login attempts >= 3 locks the card 
        // Bank can give successful attempts left
        // Successful login returns authentication token
        // Auth-token verification is mocked
        // Can get bank account balance
        // Check if enough money in account, authourize withdrawal, decrement


    //Mock bank machine hardware API
        //Mock the card-reader
            // Get and ID from the card reader, identifying user
            // Mock card-inserted sensor
    
        //Mock pin-pad
            // Get an inputted pin

        // Cash handler
            // Take money
            // Withdraw money

    //Cash machine
        // Check with bank if card is locked
        // Can check balance from bank account
        // Can withdraw money
        // Verify that withdraw function on bank is run
        // Can deposit money
        // Verify that deposit function on bank is run
        // Can exit process
        // Machine verifies which bank it's connected to


}
