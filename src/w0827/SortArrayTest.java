package w0827;

import java.util.Arrays;

import java.util.Collections;

public class SortArrayTest {
    public static void main(String[] args) {
        int[] arr = {77, 55, 42, 63, 91, 31, 86, 13, 26};
        String[] strArr = {"인공지능", "폴리텍", "한국", "소프트웨어", "대학", "1학년", "2학년", "하이테크"};

//        오름차순 정렬
        Arrays.sort(arr);

        for(int num : arr) {
            System.out.print(num + "\t");
        }

        System.out.println();

//        내림차순 정렬

        Arrays.sort(strArr, Collections.reverseOrder());

        for(String str : strArr) {
            System.out.print(str + "\t");
        }
    }
}
