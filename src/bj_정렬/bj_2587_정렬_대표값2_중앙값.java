package bj_정렬;
import java.io.*;
import java.lang.*;

public class bj_2587_정렬_대표값2_중앙값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];//다섯개의 자연수 입력
        int sum = 0, idx = 0;//총합, 중간값 인덱스

        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] <= arr[j + 1]) {
                    continue;
                } else if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        idx = arr.length/2;

        System.out.println(sum/arr.length);
        System.out.println(arr[idx]);
        br.close();
    }
}
