package bj_문자열;
import java.io.*;//버퍼사용을 위한 import

public class bj_9086_문자열_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());//테스트 횟수 입력받음

        for (int i = 0; i < T; i++) {
            String str = br.readLine();//문자열 입력받고
            System.out.print(str.charAt(0));//첫인덱스 문자형으로 출력
            System.out.println(str.charAt(str.length()-1));//마지막 문자형으로 출력
        }

        br.close();
    }
}

