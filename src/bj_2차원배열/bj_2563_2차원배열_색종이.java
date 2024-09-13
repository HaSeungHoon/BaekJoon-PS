package bj_2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2563_2차원배열_색종이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());//색종이의 수(가로 세로 10)
        int[] x = new int[n];//x좌표
        int[] y = new int[n];//y좌표


        for(int i=0; i<n; i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());//원점으로부터 x좌표
            y[i] = Integer.parseInt(st.nextToken());//원점으로부터 y좌표

            if (i > 0 ){
                if (x[i-1] < x[i] && x[i] < x[i-1]){

                }
            }
        }

        br.close();
    }
}
