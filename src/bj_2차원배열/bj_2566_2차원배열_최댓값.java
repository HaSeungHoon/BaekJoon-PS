package bj_2차원배열;

import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

public class bj_2566_2차원배열_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];
        int max = 0;
        int row = 1;
        int column = 1;

        for(int i=0; i<arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]= Integer.parseInt(st.nextToken());
                if(max < arr[i][j]){//최댓값 저장
                    max = arr[i][j];
                    row = i+1;//1행부터 세므로 +1
                    column = j+1;//1열부터 세므로 +1
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " "+ column);
        br.close();
    }
}
