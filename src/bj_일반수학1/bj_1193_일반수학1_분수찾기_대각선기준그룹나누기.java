package bj_일반수학1;

import java.io.*;
import java.lang.*;

public class bj_1193_일반수학1_분수찾기_대각선기준그룹나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //X번째 분수 구하기
        int X = Integer.parseInt(br.readLine());

        //층마다 분모+분자=T라고 하면,
        //1층 2, 2층 3, 3층 4 ... 이다.

        //현재 대각선 개수는 1~n까지 1씩 증가함= 대각선수 홀수: 올라가는방향, 대각선수 짝수: 내려가는 방향
        int prev_cnt = 0;//직전 대각선 누적 합
        int cnt = 1;//현재 대각선 개수

        while(true){

            //이러면 X번째 블록이 현재 대각선 cnt에 존재하는 것
            if(X <= prev_cnt + cnt){

                //현재 대각선 개수 홀수면 올라가는 방향
                if(cnt%2==1){//분자가 큰 수로 시작
                    //분자: 현재대각선 수-(X번째-누적블럭수)+1, 블럭은 1부터 시작하므로 +1해줌
                    //ex) 5번째: 3-(5-3)+1 = 2로,
                    //큰수로 시작하므로 (현재대각선 최댓값)에서 (현재대각선에서의 번호+1)을 빼줌

                    //분모: X번째 - 누적 블럭수 = 현재 대각선에서의 번호
                    //ex) 5번째: 5-3 = 2로 현재 대각선 중 2번째 값 출력
                    System.out.println( (cnt - (X-prev_cnt-1)) + "/" + (X-prev_cnt) );
                    break;

                }
                //현재 대각선 개수가 짝수면 내려가는 방향
                else{//분모가 큰 수로 시작하므로 홀수일때와 반대로 출력
                    System.out.println( (X-prev_cnt) + "/" + (cnt - (X-prev_cnt-1)) );
                }   break;
            }
            else{
                prev_cnt += cnt;//현재 대각선도 누적 합에 포함 후
                cnt++;//다음 대각선 수로 1 증가
            }
        }
        br.close();
    }
}
