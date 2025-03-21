package bj_정렬;

import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_11650_정렬_좌표정렬_Comparator {
    /*
    일반함수
    int c = sum(a,b);
    public int sum(int a, int b){
        return a + b;
    }

    람다식 함수
    int c = (int a, int b) -> {return a + b;}
    */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //점의 개수 N입력
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());//x좌표
            arr[i][1] = Integer.parseInt(st.nextToken());//y좌표
        }

        // array.sort() 는 2차원 배열 인자로 X
        // 따라서 int[]타입의 배열 int[][]를 넣는다고 봐야한다.
        // arr[x][y]있으면, e1,e2 = arr[x]가 되고, e1[y] = arr[x][y]인 것이다.
        // sort()의 두번째 인자가 Comparator
        Arrays.sort(arr, (e1, e2) -> {

                    //x가 같은경우
                    if(e1[0]==e2[0]){
                        return e1[1] - e2[1];//x>y면 양수반환
                    }
                    else{
                        return e1[0] - e2[0];
                    }
                }
        );

        //정렬 결과 출력
        for(int i =0; i<N; i++){
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);

        br.close();
    }
}
