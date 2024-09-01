package bj_문자열;

import java.io.*;//버퍼사용을 위한 import

public class bj_1152_문자열_단어의개수_풀이1_빈문자열예외처리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().strip();// 문자열 입력받고 앞뒤 공백제거

        // 공백을 입력받은경우 strip() 결과가 빈 문자열("")이므로 이에 대한 예외처리

        if (s == "") {// 빈문자열("")인 경우 null가리키게 하고, 길이 0출력
            s = null;
            System.out.println(0);
        } else {// 일반적인 경우 공백기준으로 split해서 배열의 길이 출력
            String[] str = s.split(" ");
            System.out.println(str.length);
        }

        br.close();
    }
}
