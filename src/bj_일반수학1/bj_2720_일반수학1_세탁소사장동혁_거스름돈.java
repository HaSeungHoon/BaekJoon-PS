package bj_일반수학1;

import java.io.*;
import java.lang.*;

public class bj_2720_일반수학1_세탁소사장동혁_거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //쿼터(25센트),다임(10센트),니켈(5센트),페니(1센트)
        int T = Integer.parseInt(br.readLine());//테스트 케이스 수
        int[][] arr = new int[T][4];

        for(int i =0; i<T; i++){
            int n = Integer.parseInt(br.readLine());

            while (n >= 25){//쿼터(25센트)환산
                arr[i][0] = n/25;
                n %= 25;
            }
            while (n >= 10 && n < 25){//다임(10센트)환산
                arr[i][1] = n/10;
                n %= 10;
            }
            while (n >= 5 && n < 10){//니켈(5센트)환산
                arr[i][2] = n/5;
                n %= 5;
            }
            while (n >= 1 && n < 5){//페니(1센트)환산
                arr[i][3] = n/1;
                n %= 1;
            }
        }

        for(int i=0; i<arr.length; i++){//테스트 케이스 수
            for(int j=0; j<arr[i].length; j++) {//4개의 센트 단위의 수
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        br.close();
    }
}
