package bj_배열;
import java.io.*;//버퍼사용을 위한 import
import java.util.StringTokenizer;

public class bj_10810_배열_공넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];// 1번~N번의 바구니 생성
        int M = Integer.parseInt(st.nextToken());// 공을 넣을 횟수


        for (int a = 0; a < M; a++) {//M번 반복
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            //i-1로 초기화하는 이유는 바구니의 번호와 인덱스간의 차이 -1이므로!
            for (int b = i-1; b < j; b++) {//i번~j번 바구니까지 k번 번호 공넣기
                arr[b] = k;
            }
        }

        //비어있는 바구니는 int 기본값 0으로 채워짐
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
