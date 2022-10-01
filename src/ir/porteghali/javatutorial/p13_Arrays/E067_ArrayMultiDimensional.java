package ir.porteghali.javatutorial.p13_Arrays;

public class E067_ArrayMultiDimensional {

    public E067_ArrayMultiDimensional() {
        int [][] matrix = new int[3][4];

        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[1][0] = 1;
        matrix[1][3] = 4;
        matrix[2][1] = 3;
        matrix[2][2] = 4;

        System.out.println(matrix[0][0]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[2][1]);

        /*
              0     1     2     3
           -------------------------
        0  |  0  |  1  |     |     |
           -------------------------
        1  |  1  |     |     |  4  |
           -------------------------
        2  |     |  3  |  4  |     |
           -------------------------
         */
    }
}
