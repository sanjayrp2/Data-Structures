package Study;

public class HashTableExample {
    // Calculate the ASCII value for a given input string
    public static int calculateHash(String input) {
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash = input.charAt(i);
        }
        return hash;
    }

    public static void main(String[] args) {
        String userInput = "AI&CSD";
        
        // Calculate hash value
        int hashValue = calculateHash(userInput);

        System.out.println("User input: " + userInput);
        System.out.println("Hash value: " + hashValue);
    }
}
