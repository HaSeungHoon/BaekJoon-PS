package bj_정렬;

import java.io.*;
import java.lang.*;

public class bj_10989번_수정렬하기_카운팅정렬 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] counting = new int[10001];

        int N = Integer.parseInt(br.readLine());
        //N개의 수 입력
        for(int i=0; i<N; i++){
            //입력된 value를 인덱스로 하는 counting배열을++ 해줘 정렬해줌
            counting[Integer.parseInt(br.readLine())]++;
        }


        //정렬된 counting 배열을 출력해줌
        for(int i=1; i<counting.length; i++){
            //count된 수에 대해서만
            while(counting[i] > 0){
                sb.append(i).append('\n');
                counting[i]--;//count된 횟수만큼 출력
            }
        }
        System.out.println(sb);

        br.close();
    }
}
