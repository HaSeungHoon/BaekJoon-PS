package bj_배열;
import java.io.*;//버퍼사용을 위한 import
import java.util.HashSet;

public class bj_3052_배열_나머지_HashSet사용 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> h = new HashSet<Integer>();// 42로 나올수 있는 나머지에 해당하는 배열생성

        for (int i = 0; i < 10; i++) {// 수 10개 입력받고
            // 나머지값을 HashSet의 add()메소드로 저장함
            h.add(Integer.parseInt(br.readLine()) % 42);
            // 중복된 나머지의 경우 저장되지 않음
        }

        bw.write(h.size() + "\n");// 저장된 원소의 개수 반환

        br.close();
        bw.flush();
        bw.close();
    }
}
