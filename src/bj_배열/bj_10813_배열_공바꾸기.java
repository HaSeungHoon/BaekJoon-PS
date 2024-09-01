package bj_배열;
import java.io.*;//버퍼사용을 위한 import
import java.util.StringTokenizer;

public class bj_10813_배열_공바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];// N개(인덱스는 N-1)의 바구니 생성
        int M = Integer.parseInt(st.nextToken());// 공을 바꿀 횟수 M

        for (int a = 0; a < arr.length; a++) {//각 바구니에 바구니번호와 같은
            arr[a]= a+1;
        }

        for (int a = 0; a < M; a++) {// M번 반복
            st = new StringTokenizer(br.readLine());
            // 공을 바꿀 바구니 2개 선택
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 그리고 두 바구니에 들어있는 공 swap
            int temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

