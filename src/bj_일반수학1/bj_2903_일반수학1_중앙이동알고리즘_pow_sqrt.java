package bj_일반수학1;

import java.io.*;
import java.lang.*;

public class bj_2903_일반수학1_중앙이동알고리즘_pow_sqrt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());//과정을 거칠 횟수

        //1회 -> 4개, 2회 -> 16개: 4의N승
        int rec = (int) Math.pow(4,N);//사각형의 개수

        //1회이상 실시(사각형이 1개 초과)
        if(N >= 1) {
            rec = (int) Math.sqrt(rec);///2회->16개면 사각형은 4*4개
            //점의개수는 (4+1)*(4+1)개
            System.out.println((rec+1)*(rec+1));
        }
        else{
            System.out.println((rec)*(rec));
        }

        br.close();
    }
}
