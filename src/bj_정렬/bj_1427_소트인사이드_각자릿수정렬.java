package bj_정렬;
import java.io.*;
import java.lang.*;

public class bj_1427_소트인사이드_각자릿수정렬 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] cnt  = new int[10];
        int N = Integer.parseInt(br.readLine());

        //일의자리~n의 자리까지 카운팅배열로 정렬
        while(N > 0){
            cnt[N%10]++;
            N /= 10;
        }

        //내림차순이므로 9부터 sb에 저장
        for(int i=9; i >=0; i--){
            while(cnt[i] > 0){
                sb.append(i);
                cnt[i]--;
            }
        }

        System.out.println(sb);

        br.close();
    }
}
