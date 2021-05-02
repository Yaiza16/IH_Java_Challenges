package Challenge2;
// Challenge 2: Print number in word
// Write a program called printNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. Use:

public class Version1 {
    public static void main(String[] args) {

        System.out.println(printNumberInWord(12));
    }

    public static String printNumberInWord(int num) {
        String numberInWord;
        switch (num){
            case 1:
                numberInWord = "ONE";
                break;
            case 2:
                numberInWord = "TWO";
                break;
            case 3:
                numberInWord = "THREE";
                break;
            case 4:
                numberInWord = "FOUR";
                break;
            case 5:
                numberInWord = "FIVE";
                break;
            case 6:
                numberInWord = "SIX";
                break;
            case 7:
                numberInWord = "SEVEN";
                break;
            case 8:
                numberInWord = "EIGHT";
                break;
            case 9:
                numberInWord = "NINE";
                break;
            default:
                numberInWord = "OTHER";
                break;
        }
        return numberInWord;
    }
}
