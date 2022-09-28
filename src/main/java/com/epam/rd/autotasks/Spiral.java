package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int minRow = 0, maxRow = rows - 1, minCol = 0, maxCol = columns - 1;
        int count = 1;
        int max = (rows * columns);
        while (count < (max+1)) {
            for (int i = minCol; i <= maxCol; i++) {
                if (array[minRow][i] == 0) {
                    array[minRow][i] = count;
                    count++;
                }
                else {break;}
            }
            minRow = minRow +1;
            for (int i = minRow; i <= maxRow; i++) {
                if (array[i][maxCol] ==0) {
                    array[i][maxCol] = count;
                    count++;
                }
                else {break;}
            }
            maxCol = maxCol -1;
            for (int i = maxCol; i >= minCol; i--) {
                if (array[maxRow][i] == 0) {
                    array[maxRow][i] = count;
                    count++;
                }
                else {
                    break;
                }
            }
            maxRow = maxRow -1;
            for (int i = maxRow; i >= minRow; i--) {
                if (array[i][minCol] == 0) {
                    array[i][minCol] = count;
                    count++;
                }
                else {
                    break;
                }
            }
            minCol = minCol +1;
        }
       /* for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println("");
        }*/
        return array;
    }
}
