package bj_정렬;

import java.io.*;
import java.lang.*;

public class bj_2750_정렬_버블정렬_오름차순 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());//값 입력
        int[] arr = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<N; i++){//모든 원소수만큼 반복
            //인접한 두 원소끼리 비교해나가며 정렬
            for(int j=0; j<N-1-i; j++){

                if (arr[j] <= arr[j+1]){
                    continue;
                }
                //이전게 더 큰경우에만 swap
                else if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i =0; i<N; i++){
            System.out.println(arr[i]);
        }
        br.close();
    }
}
