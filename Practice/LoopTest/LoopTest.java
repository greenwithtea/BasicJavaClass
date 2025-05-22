public class LoopTest {
    public static void main(String[] args) {
        forTest();                                             // for문을 사용하는 메서드 호출
        whileTest();                                          // while문을 사용하는 메서드 호출
        dowhileTest();                                      // do-while문을 사용하는 메서드 호출
    }

    public static void forTest() {                        // for문을 사용하느 ㄴ메서드
        int sum, i;                                           // 변수 선언
        System.out.println("for문 이용");
        for(sum=0, i=1; i<=100; i++) {
            if(i%2==0) continue;                          // 짝수이면 실행하지 않고 다음으로 건너뜀
                sum+=i;
        }
        System.out.printf("\tsum = %d%n", sum);  // 결과값 출력
    }

    public static void whileTest() {                     // while문을 사용하는 메서드
        int sum = 0, p =1;                               // 변수 선언
        System.out.println("while문 이용");
        while(p<=100) {
            if(p%2 == 1)                                  // p 값이 홀수이면 실행
                sum += p;
                p++;
        }
        System.out.printf("\tsum = %d%n", sum); // 결과값 출력
    }
    
    public static void dowhileTest() {                 // do-while 문을 사용하는 메서드
        int sum=0, q=1;                                  // 변수 선언
        System.out.println("do-while문 이용");
        do{
            if(q%2 == 1)                                  // q 값이 홀수이면 실행
                sum += q;
                q++;
        }while(q <= 100);                                 // do 안의 내용을 먼저 실행한 후 조건 판단
        System.out.printf("\tsum = %d\n", sum); // 결과값 출력
    }
}
