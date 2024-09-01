import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1157_심화1_단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] arr = new int[26];//알파벳 개수만큼 배열생성(대문자로 가정)

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //대소문자 구분없이 각 알페벳 인덱스에 ++
            if ('A' <= ch && ch <= 'Z') {//대문자면 인덱스0이 'A'이므로
                // -'A'해서 해당인덱스의 알파벳 ++
                arr[ch - 'A']++;
            } else if ('a' <= ch && ch <= 'z') {//소문자면
                // -'a'해서 해당인덱스의 알파벳 ++
                arr[ch - 'a']++;
            } else {
                System.out.println("알파벳을 입력하세요");
            }
        }

        int max = arr[0];
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {//전체 알파벳중 가장 많이 쓴 것 찾기
            //알파벳이 사용되었고, 더 큰 경우 max대입
            if (arr[i] != 0 && max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }

        char ans = (char) (idx + 'A');
        for (int i = idx + 1; i < arr.length; i++) {
            if (max == arr[i])
                ans = '?';
        }
        System.out.println(ans);
        br.close();
    }
}
