import java.util.Scanner;
 
class Employee {
    private String name;  // 직원 이름
    private String Address;  // 주소
    private String annual_salary;  // 연봉
    private String phone;  // 전화번호

    Scanner scan = new Scanner(System.in);
     
    public String getName()  // 입력받았던 name을 내보냄
     {
         return name;
     }
    public void setName(String name) // 문자열 name을 재정의
     {
        this.name = name;
     }
     public String getAddress()  // 입력받았던 Address를 내보냄
     {
        return Address;
     }
     public void setAddress(String Address)  // 문자열 Address를 재정의
     {
        this.Address = Address;
     }
     public String getannual_salary()  // 입력받았던 annual_salary을 내보냄
     {
        return annual_salary;
     }
     public void setannual_salary(String annual_salary)  // 문자열 annual_salary를 재정의
     {
        this.annual_salary = annual_salary;
     }
     public String getphone()  // 입력받았던 phone을 내보냄
     {
        return phone;
     }
     public void setphone(String phone)  // 문자열 phone을 재정의
     {
        this.phone = phone;
     }
}
