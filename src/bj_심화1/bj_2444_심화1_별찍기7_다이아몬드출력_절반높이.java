package bj_심화1;
import java.io.*;//버퍼사용을 위한 import

public class bj_2444_심화1_별찍기7_다이아몬드출력_절반높이 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {// 0~4번째 줄
            //다음줄 갈수록 " "한개씩 적어지므로 N-i, -1을 해줘야 스페이스바 개수가 맞음
            for (int j = 0; j < N-i-1; j++) {
                System.out.print(" ");
            }
            //*은 1,3,5이렇게 증가하므로 <= i*2해줌
            for (int k = 0; k <= i * 2 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = N-2; i >= 0; i--) {// 3~0번째 줄, i는 3부터
            for (int j = 0; j < N-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        br.close();
    }
}
