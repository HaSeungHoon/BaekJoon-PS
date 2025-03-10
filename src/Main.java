import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] cnt  = new int[10];
        int N = Integer.parseInt(br.readLine());

        while(N > 0){
            cnt[N%10]++;
            N /= 10;
        }

        for(int i=9; i >=0; i--){
            while(cnt[i] > 0){
                sb.append(i);
                cnt[i]--;
            }
        }

        System.out.println(sb);

        br.close();
    }
}
