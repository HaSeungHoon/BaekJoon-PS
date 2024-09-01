package bj_심화1;
import java.io.*;//버퍼사용을 위한 import
import java.util.*;

public class bj_3003_심화1_킹퀸룩비숍나이트폰 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[6];//흰색 피스
        int[] brr = new int[6];//검은색 피스

        for (int i = 0; i < arr.length; i++) {//각인덱스에 차례로 1,1,2,2,2,8개씩 있어야함
            //총 6번 흰색 피스의 개수 입력받기
            arr[i] = Integer.parseInt(st.nextToken());

            //각 인덱스 i마다 case에 이동해 남은 짝의 수를 계산해 brr에 넣어준다.
            switch(i) {
                case 0://킹 1개
                    brr[0] = 1 - arr[0];
                    break;
                case 1://퀸 1개
                    brr[1] = 1 - arr[1];
                    break;
                case 2://룩 2개
                    brr[2] = 2 - arr[2];
                    break;
                case 3://비숍 2개
                    brr[3] = 2 - arr[3];
                    break;
                case 4://나이트 2개
                    brr[4] = 2 - arr[4];
                    break;
                case 5://폰 8개
                    brr[5] = 8 - arr[5];
                    break;
            }
        }

        for (int i: brr) {//짝에 맞는 검은색 피스 출력
            System.out.print(i+ " ");
        }

        br.close();
    }
}
