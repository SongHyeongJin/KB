package day_0420;

public class RempVo extends Employee{
    public String deptid; //부서코드
    RempVo(){
        super();//나의 부모의 생성자를 호출
    }
    RempVo(String name, int age, String phone, String empDate, String dept, boolean marriage){
        super(name, age, phone, empDate, dept, marriage);
    }

}
