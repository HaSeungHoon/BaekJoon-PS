package bj_문자열;

import java.io.*;//버퍼사용을 위한 import
import java.util.*;

public class bj_1152_문자열_단어의개수_풀이2_countTokens메소드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열 입력받고 공백기준으로 토큰을 나눔
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //countTokens()메소드로 토큰 개수 출력해줌
        System.out.println(st.countTokens());

        br.close();
    }
}
