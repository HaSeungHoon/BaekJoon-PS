package bj_문자열;

import java.io.*;//버퍼사용을 위한 import

public class bj_2675_문자열_문자열반복_풀이2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자열의 변경이 이루어질 것이므로 StringBuilder를 사용한다. apppend() 사용가능
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());// 테스트케이스 개수입력

        for (int i = 0; i < T; i++) {

            String[] str = br.readLine().split(" ");// 문자열 한줄읽어 공백기준으로 분리해 저장

            int R = Integer.parseInt(str[0]);// 각 테스트 케이스 횟수

            // for-each문을 사용함, 각 문자열을 byte형 배열로 반환해 value에 저장
            for (byte value : str[1].getBytes()) {
                for (int k = 0; k < R; k++) {// 각 문자마다 테스트케이스만큼 반복
                    sb.append((char) value);
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);// 최종적으로 한번만 print()해줘도 됨!

        br.close();
    }
}