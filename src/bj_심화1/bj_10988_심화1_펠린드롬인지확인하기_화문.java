package bj_심화1;
import java.io.*;//버퍼사용을 위한 import

public class bj_10988_심화1_펠린드롬인지확인하기_화문 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int ans = 1;

        for (int i = 0; i < str.length()/2; i++) {
            //맨앞과 맨끝인덱스부터 가운데로 다가오면서 비교, 같으면 continue
            if ( str.charAt(i) != str.charAt(str.length() - i-1)){
                ans = 0;
            }
        }
        System.out.println(ans);
        br.close();
    }
}

