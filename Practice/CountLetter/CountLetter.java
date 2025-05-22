import java.util.Scanner; 

public class CountLetter
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] count1 = new int[26];   // 소문자 26개의 정수를 저장할 수 있는 배열 count를 선언하고 생성
        int[] count2 = new int[26];   // 대문자 26개의 정수를 저장할 수 있는 배열 count를 선언하고 생성 

        System.out.printf("문자열을 입력하세요 : ");
        String str = scan.nextLine();      // 입력받은 문자열을 str에 저장

        String buffer = str.replace(" ", "");  // str에서 문자 개수를 세기 위해 공백 제거 후 buffer에 저장

        for(int i=0; i<buffer.length(); i++)   // 각 문자가 등장하는 횟수를 대문자와 소문자로 나누어 계산해  count1, 2에 차례로 저장
        {
            char ch = buffer.charAt(i);
            if(ch>='a')
                count1[ch-'a']++; 
            else
                count2[ch-'A']++;
        }

        char letter1 = 'a';  //문자 letter1, 2의 초기값을 각각 a, A 로 선언
        char letter2 = 'A';

        System.out.println("---소문자---");    // 소문자가 출력됨을 알려주는 지표 출력
        for(int i=0; i<count1.length; i++)   // 배열에 저장된 횟수를 출력하는 반복 루프
        {
            if (count1[i] != 0){         // count1[i] 값이 0이 아닐 때, 즉 문자열에 그 값이 존재할 때 출력
                System.out.printf(" %c : %d\n", letter1, count1[i]);
            }
            letter1++;
        }
        System.out.println("---대문자---");   // 대문자가 출력됨을 알려주는 지표 출력
        for(int i=0; i<count2.length; i++)  // 배열에 저장된 횟수를 출력하는 반복 루프
        {
            if (count2[i] != 0){         // count2[i] 값이 0이 아닐 때, 즉 문자열에 그 값이 존재할 때 출력
                System.out.printf(" %c : %d\n", letter2, count2[i]);
            }
            letter2++;
        }
    }   
}