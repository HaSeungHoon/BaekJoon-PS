package bj_심화1;
import java.io.*;
import java.lang.*;

public class bj_1316_심화1_그룹단어체커_prev알고리즘 {
    public static boolean GroupWord(String str) {
        //한번이라도 사용된 문자인지 체크를 위함, 기본값 false
        boolean[] arr = new boolean[26];
        char prev = 0;//이전 문자

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);//현재 문자

            //이전 문자와 현재(i)문자가 다르다면, 이미 나온 문자인지 검사필요
            if (prev != cur) {//첫문자는 0과 비교하므로, 반드시 if문을 실행하게됨

                //처음 나온 문자인 경우: true로 바꾸고 prev를 처음 나온 문자로 교체
                if (arr[cur - 'a'] == false) {
                    arr[cur - 'a'] = true;
                    prev = cur;
                }
                //한번이라도 사용된 문자인 경우: 그룹단어가 아니므로 종료(false)
                else {
                    return false;
                }
            }
            //이전 문자와 현재(i)문자 같으면 다음문자 검사
            else {
                continue;
            }
        }
        return true;//도중에 종료되지 않으면 그룹단어(true)
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());//단어개수 입력
        int ans = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (GroupWord(str))//그룹단어(true)면, 1증가
                ans++;
        }

        System.out.println(ans);//총 그룹단어의 수 출력
        br.close();
    }
}
