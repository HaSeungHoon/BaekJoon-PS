package bj_문자열;

import java.io.*;

public class bj_10809_문자열_알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int[] arr = new int[26];
        // 알파벳 모든 원소에 초기값 -1대입
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            // ch-'a'를 함으로써 각 문자 ch의 알파벳 인덱스에 해당하는 원소에만 접근할 수 있게 된다
            // 그곳에 아직 -1이 대입되어있다면, 문자열의 인덱스 i를 대입해주는것이다.
            if (arr[ch - 'a'] == -1)
                arr[ch - 'a'] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        br.close();
    }
}
