package bj_정렬;

import java.io.*;
import java.lang.*;

public class bj_2751_정렬_수정렬하기2_힙정렬_nlogn시간_오름차순 {

    //HeapUp방식으로 힙 재정렬
    static void HeapUp(int H[], int k){//인덱스 k  
        if(k> 1){
            int p = k/2;
            if(H[k]>H[p]){
                int temp = H[k];
                H[k] = H[p];
                H[p] = temp;
                HeapUp(H, p);
            }
        }
    }

    //힙에 노드를 생성하고, 새로운 노드에 대해 최대 힙(P>L,R)으로 재정렬
    static void HeapAdd(int H[], int N, int key){
        H[++N] = key;
        HeapUp(H,N);
    }

    //현재위치 k와 L,R중 가장 큰 값의 인덱스를 반환하는 메소드
    static int MaxIndex(int H[], int k, int L, int R) {
        //k>L일때
        if (H[k] >= H[L]) {
            if (H[k] >= H[R]) {//k>R이면 k최대
                return k;
            }
            else {//k<R이면 R최대
                return R;
            }
        }
        //k<L일때
        else {
            if (H[L] >= H[R]) {//L>R이면 L최대
                return L;
            }
            else {//L<R이면 R최대
                return R;
            }
        }
    }

    //R이 힙에서 제외된 현재인덱스 k인 경우, k와 L중 최대값 인덱스 반환 메소드
    static int MaxIndex2(int H[], int k, int L) {
        //k>L일때
        if (H[k] >= H[L]) {
            return k;
        }
        //k<L일때
        else {
            return L;
        }
    }

    //현재위치 k가 비단말노드(N/2)인 경우부터 다운힙해 힙 재정렬 - 오름차순
    static void HeapDown(int H[], int k, int N){//현재인덱스 k, 현재size N
        if(k <= N/2){//k가 비단말노드인 경우

            //만약 비단말노드 중 R이 이미 제외된 노드라면
            if(N < 2*k+1) {
                int L = 2 * k;

                //자식이 L뿐이므로 L하고만 비교해 swap후, 바뀐 현재위치 M으로 다운힙 순환
                int M = MaxIndex2(H, k, L);
                if (k != M) {
                    //L,R중 큰것과 swap
                    int temp = H[k];
                    H[k] = H[M];
                    H[M] = temp;
                    HeapDown(H, M, N);
                }
            }
            //비단말노드 중 L,R 모두 힙사이즈에서 제외되지 않은 경우라면
            else{
                int L = 2*k;
                int R = 2*k+1;

                //셋 값중 Max인 것과 k swap후, 바뀐 현재위치 M으로 다운힙 순환
                int M = MaxIndex(H, k, L, R);
                if(k != M){
                    //L,R중 큰것과 swap
                    int temp = H[k];
                    H[k] = H[M];
                    H[M] = temp;
                    HeapDown(H,M,N);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //수의 개수+1 해줘서 1~N 인덱스 사용함
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];//1~N(1~5)까지의 인덱스 사용
        int[] H = new int[N+1];//(0~5인덱스 사용가능한 힙 배열만듬)
        int len = H.length;//(6)

        //1. 입력한 값들로 최대힙 만들기
        for(int i =1; i < N+1; i++){//1~N에 수 입력
            arr[i] = Integer.parseInt(br.readLine());

            //0번 보내야 H[++N]에 넣게 되므로 1번부터 들어감
            HeapAdd(H, i-1, arr[i]);
        }

        //2. 다운힙 알고리즘 - 오름차순 정렬
        for(int i =1; i<N+1; i++){
            //(1)루트와 힙의 맨 끝 노드 교환
            int temp = H[1];
            H[1] = H[len-1];
            H[len-1] = temp;

            //(2)힙사이즈 하나 줄이고
            len--;//5, 4

            //(3)루트값 변경된 힙을 다운힙으로 재정렬
            //항상 다운힙 시작은 루트부터, 힙사이즈는 정렬된 값 하나씩 제외될때마다 줄어듬
            HeapDown(H, 1, len-1);

        }

        //3. 결과 출력
        for(int i=1; i<N+1; i++){
            System.out.println(H[i]);
        }

        br.close();
    }
}
