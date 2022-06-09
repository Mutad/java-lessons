package com.company.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class L2Exs {
    public static String getMaxTimeFromNumbers(String nums) throws Exception {
        if (nums.length() != 4)
            throw new Exception("Not enough caracters in string");

        List<Integer> ar = parseNumbers(nums);

        getMaxTimeOf(createMatrixOfNumbers(ar));

        return "test";
    }

    private static ArrayList<ArrayList<Integer>> createMatrixOfNumbers(List<Integer> nums) {
        ArrayList<ArrayList<Integer>> mtx = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ;i<4;i++){
            mtx.add(new ArrayList<Integer>());
        }

        for (Integer n : nums) {
            if (n<=2)
                mtx.get(0).add(n);
            if (n<=5)
                mtx.get(2).add(n);
            mtx.get(1).add(n);
            mtx.get(3).add(n);
        }

        return mtx;
    }

    private static List<Integer> getMaxTimeOf(ArrayList<ArrayList<Integer>> mtx) {

    }

    private static List<Integer> parseNumbers(String nums) {
        List<Integer> arr = new ArrayList<Integer>();

        for (char ch : nums.toCharArray()) {
            arr.add(Character.digit(ch, 10));
        }

        return arr;
    }
}
