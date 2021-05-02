package Challenge1;
// Challenge 1
// Write a method maximum that returns the largest integer in the list. You can assume that the list has at least one element.

public class Main {
    public static void main(String[] args) {
        Integer[] numList = {6, 2, 8, 4, 5};

        System.out.println(maximum(numList));
    }

    public static Integer maximum(Integer[] numList) {
        Integer maximumArray = numList[0];
        for (Integer i : numList) {
            if (i.hashCode() > maximumArray.hashCode()) {
                maximumArray = i;
            }
        }
        return maximumArray;
    }

}
