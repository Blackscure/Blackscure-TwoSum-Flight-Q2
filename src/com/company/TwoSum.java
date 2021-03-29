package com.company;





public class TwoSum {

    public static Boolean twoSum(int[] duration, int destination) {
        for (int i = 0; i < duration.length; i++) {

            int first = duration[i];

            for (int j = i + 1; j < duration.length; j++) {
                int second = duration[j];
                int total = first + second;

                if (total == destination) {
                    return true;

                }
                else {
                    return false;
                }
            }

        }
        return null;
    }

    public static void main(String args[]) {


    }
}