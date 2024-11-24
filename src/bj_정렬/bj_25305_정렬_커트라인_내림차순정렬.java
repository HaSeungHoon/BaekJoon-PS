package bj_정렬;

import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

public class bj_25305_정렬_커트라인_내림차순정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());//응시자 수
        int k = Integer.parseInt(st.nextToken());//상 받는 사람의 수
        int[] arr = new int[N];
        int cut = 0;

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){//응시자 점수 입력
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //버블 정렬- 내림차순
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] >= arr[j + 1]) {
                    continue;
                } else if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //수상자 수만큼 반복
        for(int i=0; i<k; i++){
            cut = arr[i];//커트라인 점수 저장
        }
        System.out.println(cut);
        br.close();
    }
}
