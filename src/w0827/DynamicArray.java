package w0827;

import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        int[][] dArray = {{1,2}, {3,4,5}, {6}};

//        Array 저장된 값을 출력
        for (int i =0; i < dArray.length; i++) {
            for (int j =0; j < dArray[i].length; j++) {
                System.out.print(dArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
