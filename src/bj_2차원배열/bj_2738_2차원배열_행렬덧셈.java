package bj_2차원배열;
import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

public class bj_2738_2차원배열_행렬덧셈 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //N행 M열 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //2차원 배열 A,B 초기화
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        //배열 A 원소 입력
        for (int i=0; i<N; i++) {//행
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++){//열
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //배열 B 원소 입력
        for (int i=0; i<N; i++) {//행
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++){//열
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //행렬 A+B 결과 출력
        for (int i=0; i<N; i++) {//행
            for (int j=0; j<M; j++){//열
                System.out.print(A[i][j]+B[i][j]+" ");
            }
            System.out.println();
        }

        br.close();
    }
}
