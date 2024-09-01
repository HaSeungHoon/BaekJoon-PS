package bj_배열;
import java.util.*;
import java.io.*;//버퍼사용을 위한 import

public class bj_1546_배열_평균 {
    public static double max(double[] arr, int len) {// 최대원소 반환 메소드
        double m = arr[0];
        for (int i = 1; i < len; i++) {
            if (m < arr[i])
                m = arr[i];
        }
        return m;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한줄 읽어서 과목수만큼 배열생성
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];

        // 점수 한줄에 입력하고 각 원소로 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double M = max(arr, arr.length);// 최고점 M 저장 후
        double sum = 0;
        for (int a = 0; a < arr.length; a++) {// 모든점수를 점수/M*100으로 고치고
            arr[a] = arr[a] / M * 100;// 몫의연산(/)는 피연산자중 하나가 실수형인경우 실제나눗셈 연산함
            sum += arr[a];
        }
        System.out.println(sum / arr.length);

        br.close();
    }
}
