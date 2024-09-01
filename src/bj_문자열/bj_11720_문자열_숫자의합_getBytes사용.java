package bj_문자열;

import java.io.*;//버퍼사용을 위한 import

public class bj_11720_문자열_숫자의합_getBytes사용 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;
        for (byte value : br.readLine().getBytes()) {
            // getBytes()는 문자의 유니코드값 반환하므로 -'0'해줘서 숫자로 변환
            sum += (value - '0');
        }

        System.out.println(sum);

        br.close();
    }
}
