package day_0420;

public class EmpTest {
    public static void main(String[] args) {
        RempVo vo = new RempVo();
        vo.name = "홍길동";
        vo.deptid = "1111";
        System.out.println(vo.name + "deptid: "+vo.deptid);

        Employee emp = new Employee();
        emp.name ="김승리";
        emp.age = 30;
        emp.phone = "010-1234-5678";
        emp.empDate = "2010-01-01";
        emp.dept = "개발부";
        emp.marriage = true;
        System.out.println(emp.name +" 나이 : "+emp.age+" 전화번호: "+emp.phone+" 입사일: "+emp.empDate+" 부서"+emp.dept+" 결혼여부: "+emp.marriage);

    }

}
