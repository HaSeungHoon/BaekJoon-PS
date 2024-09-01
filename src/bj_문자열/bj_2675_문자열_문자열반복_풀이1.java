package bj_문자열;

import java.io.*;//버퍼사용을 위한 import


public class bj_2675_문자열_문자열반복_풀이1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());// 테스트케이스 개수입력

        for (int i = 0; i < T; i++) {

            String[] str = br.readLine().split(" ");// 문자열 한줄읽어 공백기준으로 분리해 저장

            int R = Integer.parseInt(str[0]);// 각 테스트 케이스 횟수
            String S = str[1];// 각 문자열 저장

            for (int j = 0; j < S.length(); j++) {// 각 문자열 길이만큼 반복
                for (int k = 0; k < R; k++) {// 각 문자마다 테스트케이스만큼 반복
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }

        br.close();
    }
}
