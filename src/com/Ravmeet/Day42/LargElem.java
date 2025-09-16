package com.Ravmeet.Day42;
import java.util.*;
public class LargElem {
    public static void main(String[] args) {
        int[][] arr = {{12, 34, 7}, {45, 2, 89}, {5, 67, 23}};
        for (int i = 0; i < 3; i++) {
            int max = arr[i][0];
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
