(import java.util.Scanner;

class TestEmployee {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Employee[] a;  // 배열 참조 변수를 선언
        String r; 
        int n;

        a = new Employee[2];  //배열을 생성

        for(int i = 0; i<a.length; i++)  // 배열의 수 만큼 정보 입력 반복
        {
            a[i] = new Employee();

            System.out.print("이름을 입력하세요 [직원번호" + (i+1) + "] : ");
            a[i].setName(scan.next());
            System.out.print("주소를 입력하세요 [직원번호" + (i+1) + "] : ");
            a[i].setAddress(scan.next());
            System.out.print("연봉을 입력하세요 [직원번호" + (i+1) + "] : ");
            a[i].setannual_salary(scan.next());
            System.out.print("전화번호를 입력하세요 [직원번호" + (i+1) + "] : ");
            a[i].setphone(scan.next());

        }

        while (true)
        {
            System.out.println("수정하시겠습니까?[y or n] ");  // r에 수정 여부를 받음
            r = scan.next();
            if (r.equals("y"))  // 수정할 경우
            {
                while (true)
                {
                    System.out.println("수정하고싶은 직원번호를 입력하세요[1 or 2] : ");  // n에 수정할 직원번호를 받음
                    n = scan.nextInt();
                    if (n == 1 || n == 2)  // 수정할 직원번호가 1 또는 2이면, 탈출하여 다음 과정 진행
                    {
                        break;
                    }
                    else  // 아닐 경우, 직원번호 다시 입력
                    {
                        System.out.println("다시 입력하세요.");
                        continue;
                    }
                }
                a[n-1] = new Employee();  // 배열은 0부터 시작하므로 입력받은 직원번호에서 1을 뺀 후 진행

                System.out.print("이름을 입력하세요 : ");
                a[n-1].setName(scan.next());
                System.out.print("주소를 입력하세요 : ");
                a[n-1].setAddress(scan.next());
                System.out.print("연봉을 입력하세요 : ");
                a[n-1].setannual_salary(scan.next());
                System.out.print("전화번호를 입력하세요 : ");
                a[n-1].setphone(scan.next());
                break;
            }
            else if (r.equals("n"))  // 수정하지 않을 경우, 탈출 후 다음 과정 진행
            {
                break;
            }
            else
            {
                System.out.println("y 혹은 n 으로 입력하세요.");  //y 혹은 n이 아닌 다른 문자를 입력한 경우
                continue;
            }
        }

        for(int i = 0; i<a.length; i++)  // 입력받은 정보를 토대로 출력
        {
            System.out.print("직원번호[" + (i+1) + "]");
            System.out.print("  ");
            System.out.print("name : " + a[i].getName());
            System.out.print("  ");
            System.out.print("Address : " + a[i].getAddress());
            System.out.print("  ");
            System.out.print("annual_salary : " + a[i].getannual_salary());
            System.out.print("  ");
            System.out.println("phone : " + a[i].getphone());
        }
        
    }
}
