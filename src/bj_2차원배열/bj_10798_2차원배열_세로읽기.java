package bj_2차원배열;

import java.io.*;
import java.lang.*;

public class bj_10798_2차원배열_세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //5줄의 입력, 한행에 최대 15글자의 단어
        char[][] arr = new char[5][15];
        int max = 0;

        //배열원소 초기화(A~Z, a~z, 0~9)
        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();//한줄 입력받아

            //가장 긴 행의 길이 찾기
            if (max < str.length()) {
                max = str.length();
            }
            //해당 행의 문자열 길이만큼 반복하며 한문자씩 저장
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        //세로로 공백없이 출력
        for (int j = 0; j < max; j++) {//가장 긴 행을 기준이 되는 열로 잡음
            for (int i = 0; i < 5; i++) {//5행

                //해당 문자가 초기화되지 않아 NULL('\0')인 경우 건너뜀
                if (arr[i][j] == '\0') {
                    continue;
                }
                System.out.print(arr[i][j]);
            }
        }

        br.close();
    }
}
