package bj_배열;
import java.io.*;//버퍼사용을 위한 import

public class bj_5597_배열_과제안내신분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[31];// 0을 제외한 1~30까지의 학생 존재

        for (int i = 1; i <= 28; i++) {// 28명만 과제제출
            int n = Integer.parseInt(br.readLine());// 출석번호 입력
            arr[n] = n;//해당 인덱스의 원소에 출석번호를 기입
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {// 출석번호가 기입되지 않은 인덱스는 int기본값 0임
                bw.write(i + "\n");//인덱스이자 출석번호 출력
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}