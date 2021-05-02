package Challenge2;

import java.util.HashMap;

public class Version2 {
    public static void main(String[] args) {

        System.out.println(printNumberInWord(10));
    }

    public static String printNumberInWord(int num) {
        HashMap<Integer, String> serialNumbers = new HashMap<Integer, String>();

        serialNumbers.put(1, "ONE");
        serialNumbers.put(2, "TWO");
        serialNumbers.put(3, "THREE");
        serialNumbers.put(4, "FOUR");
        serialNumbers.put(5, "FIVE");
        serialNumbers.put(6, "SIX");
        serialNumbers.put(7, "SEVEN");
        serialNumbers.put(8, "EIGHT");
        serialNumbers.put(9, "NINE");

        String findNumber = serialNumbers.get(num);
        if (findNumber == null){
            findNumber = "OTHER";
        }

        return findNumber;
    }
}
