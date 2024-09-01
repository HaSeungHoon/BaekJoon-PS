package bj_배열;
import java.util.*;
import java.io.*;//버퍼사용을 위한 import

public class bj_10811_배열_바구니뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];// 0번~N+1번까지의 바구니중 인덱스 1~N만 사용
        int M = Integer.parseInt(st.nextToken());// 반복횟수 M 저장

        for (int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
        }

        for (int a = 0; a < M; a++) {// M번 반복해, 바구니 순서 역순으로
            st = new StringTokenizer(br.readLine());
            // -1해주는 이유는 실제 인덱스는 바구니번호보다 1작으므로!
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            while (i < j) {// i번부터 j번 바구니보다 작을 때까지 swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;// 시작인덱스 i는 증가
                j--;// 맨끝인덱스 j는 감소하면서 서로 swap
            }
        }

        for (int a = 0; a < arr.length; a++) {
            bw.write(arr[a] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}