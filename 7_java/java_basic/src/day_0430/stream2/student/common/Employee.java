package common;
import java.util.Optional;
public class Employee {
    private final long id; private final String name; private final String department; private final int salary; private final Optional<String> email; private final Optional<String> managerId;
    public Employee(long id, String name, String department, int salary, String email, String managerId) { this.id=id; this.name=name; this.department=department; this.salary=salary; this.email=Optional.ofNullable(email); this.managerId=Optional.ofNullable(managerId); }
    public long getId(){return id;} public String getName(){return name;} public String getDepartment(){return department;} public int getSalary(){return salary;} public Optional<String> getEmail(){return email;} public Optional<String> getManagerId(){return managerId;}
    public String toString(){return "Employee{id="+id+", name='"+name+'\''+", department='"+department+'\''+", salary="+salary+", email="+email+", managerId="+managerId+'}';}
}
