package bj_심화1;

import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;
// 전공 평점 = {학점 * 과목평점(등급)} / 학점총합
// 과목 평점 = 등급에 따른 학점(P는 계산에서 제외)

public class bj_25206_심화1_너의평점은_평균학점출력 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double total = 0.0;//학점*과목평점
        double totscore = 0;//학점의 총합

        for (int i = 0; i < 20; i++) {//20과목 입력
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            String object = st.nextToken();//과목명
            double score = Double.parseDouble(st.nextToken());//학점
            String grade = st.nextToken();//등급

            if (grade.equals("A+")) {
                total += 4.5 * score;
                totscore += score;
            } else if (grade.equals("A0")) {
                total += 4.0 * score;
                totscore += score;
            } else if (grade.equals("B+")) {
                total += 3.5 * score;
                totscore += score;
            } else if (grade.equals("B0")) {
                total += 3.0 * score;
                totscore += score;
            } else if (grade.equals("C+")) {
                total += 2.5 * score;
                totscore += score;
            } else if (grade.equals("C0")) {
                total += 2.0 * score;
                totscore += score;
            } else if (grade.equals("D+")) {
                total += 1.5 * score;
                totscore += score;
            } else if (grade.equals("D0")) {
                total += score;
                totscore += score;
            } else if (grade.equals("F")) {
                totscore += score;
            } else if (grade.equals("P")){//패논패인 경우
                continue;
            } else {
                System.out.println("등급을 잘못 입력했습니다.");
            }
        }

        System.out.printf("%.6f" , total / totscore);
        br.close();
    }
}
