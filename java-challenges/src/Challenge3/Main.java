package Challenge3;
// Challenge 3: Check Odd/Even
//Write a method called checkOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
//Hint n is an even number if (n % 2) is 0; otherwise, it is an odd number. Use == for comparison, e.g., (n % 2) == 0.
public class Main {
    public static void main(String[] args) {
        checkOddEven(6);
    }

    public static void checkOddEven(int num) {
        if (num%2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
