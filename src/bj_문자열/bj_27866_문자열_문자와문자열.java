package bj_문자열;

import java.io.*;//버퍼사용을 위한 import

public class bj_27866_문자열_문자와문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 한줄을 읽어 str에 저장
        String str = br.readLine();
        // 정수하나 입력받음(n번째 문자는 n-1번 인덱스이므로 -1)
        int n = Integer.parseInt(br.readLine())-1;

        System.out.println(str.charAt(n));

        br.close();
    }
}
