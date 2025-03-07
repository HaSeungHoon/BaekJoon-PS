package bj_정렬;

import java.io.*;
import java.lang.*;

public class bj_0000_MergeSort {
    static void MS(int[] A, int l, int h){
        if (h <= l)
            return;
        int m = (h+l)/2;
        MS(A, l, m);
        MS(A, m+1, h);
        merge(A, l, m, h);
    }

    static void merge(int[] A, int l, int m, int h){
        int i = l;
        int j = m+1;
        int k = 0;

        int[] temp = new int[h-l+1];

        while(i<=m && j <= h){
            if(A[i]<A[j]){
                temp[k++] = A[i++];
            }
            else{
                temp[k++] = A[j++];
            }
        }
        while(i<=m){
            temp[k++] = A[i++];
        }
        while(j<=h){
            temp[k++] = A[j++];
        }
        for(i=l, k=0; i <= h; i++){
            A[i] = temp[k++];
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        //N개의 수 입력
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        MS(arr, 0, arr.length-1);

        //3. 결과 출력
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        br.close();
    }
}
