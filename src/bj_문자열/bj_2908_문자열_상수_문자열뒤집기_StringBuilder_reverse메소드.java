package bj_문자열;

import java.io.*;//버퍼사용을 위한 import
import java.lang.*;
import java.util.*;

public class bj_2908_문자열_상수_문자열뒤집기_StringBuilder_reverse메소드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        // 문자열을 뒤집기 위해서 StringBuilder(A).reverse().toString()를 사용함
        String reA = new StringBuilder(A).reverse().toString();
        String reB = new StringBuilder(B).reverse().toString();

        // 문자열을 정수로 변환할땐 parseInt()메소드
        int nA = Integer.parseInt(reA);
        int nB = Integer.parseInt(reB);

        if (nA > nB) {// 이제 쉽게 정수비교만 하면 된다.
            System.out.println(nA);
        } else {
            System.out.println(nB);
        }
    }
}
