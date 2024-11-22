package bj_일반수학1;
import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

public class bj_2745_일반수학1_진법변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();//값 입력
        int B = Integer.parseInt(st.nextToken());//B진법
        int result =0;//10진수 결과
        int x = 1;//1의자리부터 시작

        for(int i =N.length()-1; i >= 0; i--){
            char ch = N.charAt(i);//맨 아래부터 한문자씩 검사

            if(ch>='0' && ch<='9'){
                //-'0' 해줘서 진짜 숫자로 변경후 자릿수 곱해 더함
                result += (ch-'0') * x;
            }
            else{
                //10부터 'A' 사용하므로 'A'로부터 떨어진 거리에 10더해준다
                //ch 'F'면 6+10= 16이 저장되는 것이다.
                result += (ch - 'A' + 10) * x;
            }
            //10진법이면 10의자리, 100의자리다. 즉, B의 자리만큼 곱해줌
            x *= B;
        }

        System.out.println(result);
        br.close();
    }
}
