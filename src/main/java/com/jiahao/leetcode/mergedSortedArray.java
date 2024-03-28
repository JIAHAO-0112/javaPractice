package com.jiahao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mergedSortedArray {
    public static void merged(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,0,0,0));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,5,6));
        int m = 3;
        int n = 3;

        cutList(list1, m);
        cutList(list2, n);

        list1.addAll(list2);
        Collections.sort(list1);

        System.out.println(list1);
    }

    private static void cutList(List<Integer> list, int num){
        num = num - 1;
        for (int i = list.size() - 1; i > num; i--){
            list.remove(i);
        }
    }
}
