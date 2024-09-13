package bj_심화1;

import java.io.*;
import java.lang.*;

public class bj_2941_심화1_크로아티아알파벳_if문중첩 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();//변경된 상태의 문자열 입력
        int len = str.length();
        int cnt = 0;//크로아티아 알파벳의 개수

        for (int i = 0; i < len; i++) {
            char cur = str.charAt(i);

            //c로 시작하고 i가 맨끝 인덱스보다 작을때
            if (cur == 'c' && i < len - 1 ) {
                //"c=" or "c-"면
                if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-'){
                    // i+1까지 단어이므로 cur을 i+1로 이동
                    i++;
                }
            }

            //d로 시작하고 i가 맨끝 인덱스보다 작을때
            else if (cur == 'd' && i < len - 1) {

                //"d-"경우(
                if(str.charAt(i+1) == '-'){
                    i++;
                }

                //dz로 시작하고 i+2가 가능할 때
                else if (str.charAt(i+1) == 'z' && i < len - 2) {
                    //"dz="경우 cur을 i+2로이동
                    if(str.charAt(i+2) == '=') {
                        i += 2;
                    }
                }
            }

            //l 또는 n으로 시작하고 i가 맨끝 인덱스보다 작을때
            else if ((cur == 'l' || cur == 'n') && i < len - 1) {
                //"lj" or "nj"인경우
                if(str.charAt(i + 1) == 'j'){
                    i++;
                }
            }

            //l 또는 n으로 시작하고 i가 맨끝 인덱스보다 작을때
            else if ((cur == 's' | cur == 'z') && i < len - 1) {
                //"s=" or "z="인경우
                if(str.charAt(i+1) == '='){
                    i++;
                }
            }

            //위 조건문들에 걸리지 않은 일반알파벳이면, i증가 없이 카운트
            cnt++;
        }

        System.out.println(cnt);
        br.close();
    }
}
