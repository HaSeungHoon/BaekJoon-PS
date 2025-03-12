package bj_정렬;

import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

public class bj_정렬_선택정렬 {
    static int getMinIdx(int[] arr, int len, int start, int end){
        int idx = start;

        for(int i = start; i<=end; i++){
            if(arr[idx] > arr[i]) {
                idx = i;
            }
        }
        return idx;
    }

    static void selectionSort(int[] arr, int len){

        for(int i =0; i<len; i++){
            //i를 증가해가며, 최소값의 인덱스를 찾음
            int minIdx = getMinIdx(arr, len, i, len-1);

            //최소값 원소를 i 원소와 swap
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //점의 개수 N입력
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        selectionSort(arr, N);

        for(int i = 0; i<N; i++){
            System.out.print(arr[i] + " ");
        }

        br.close();
    }
}
