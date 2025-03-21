package bj_정렬;

import java.io.*;
import java.lang.*;

public class bj_2292_수학1_벌집_공비규칙찾기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 1;//벌집 중앙 1포함 카운팅
        int range = 2;//m층의 최소값- 기본값은 2층의 최소값 2로

        //1층~m층까지 증가할 때마다 공간 방 수 6씩 증가
        //1층:1개, 2층:6개, 3층:12개, 4층:18개 ...
        //각 층의 최소값 range = 2층:2~, 3층:2+6*1=8~, 4층:8+6*2=20, 5층:20+6*3=38
        if(N==1){
            System.out.println(1);
        }
        else {
            while(true){
                //N이 다음 층의 최소값보다 작으면, cnt++하지 않고 탈출
                if(N < range){
                    break;
                }
                range = range + (6 * cnt);//다음 층 최소값 계산 8 20 38
                cnt++;                     //                2층 3  4
            }

            System.out.println(cnt);
        }
        br.close();
    }
}
