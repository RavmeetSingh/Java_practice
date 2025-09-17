package com.Ravmeet.Day42;
    public class FirstLastRow {
        public static void main(String[] args) {
            int[][] arr = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            int rows = arr.length;
            int cols = arr[0].length;
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[0][j] + " ");
            }
            System.out.println();
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[rows - 1][j] + " ");
            }
        }
    }