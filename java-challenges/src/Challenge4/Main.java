package Challenge4;
//Challenge 4: Calculate the average
// Write a method average that returns the average of the integer in the list. You can assume that the list has at least one element.

public class Main {

    public static void main(String[] args) {
        Integer [] numList = {1, 2, 1};
        System.out.println(average(numList));

    }

    public static double average(Integer[] numList) {
        double totalSum = 0;
        double averageNumber;
        for (int i=0; i<numList.length; i++){
            totalSum += numList[i];
        }
        averageNumber = totalSum/numList.length;
        return averageNumber;
    }

}
