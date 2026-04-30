package common;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
public class SampleData {
    public static List<Order> orders() { return Arrays.asList(
        new Order(1,"C001","SEOUL","BOOK",12000,"PAID",LocalDate.of(2026,1,3),Arrays.asList("gift","mobile")),
        new Order(2,"C002","BUSAN","FOOD",30000,"PAID",LocalDate.of(2026,1,3),Arrays.asList("fresh")),
        new Order(3,"C001","SEOUL","IT",850000,"CANCEL",LocalDate.of(2026,1,4),Arrays.asList("pc","expensive")),
        new Order(4,"C003","DAEGU","BOOK",15000,"PAID",LocalDate.of(2026,1,5),Arrays.asList("mobile")),
        new Order(5,"C004","SEOUL","FOOD",22000,"READY",LocalDate.of(2026,1,5),Arrays.asList("fresh","coupon")),
        new Order(6,"C002","BUSAN","IT",1250000,"PAID",LocalDate.of(2026,1,6),Arrays.asList("pc")),
        new Order(7,"C005","JEJU","BOOK",9000,"READY",LocalDate.of(2026,1,7),Arrays.asList("coupon")),
        new Order(8,"C003","DAEGU","FOOD",45000,"PAID",LocalDate.of(2026,1,7),Arrays.asList("fresh","gift")),
        new Order(9,"C006","SEOUL","IT",450000,"PAID",LocalDate.of(2026,1,8),Arrays.asList("mobile")),
        new Order(10,"C004","SEOUL","BOOK",17000,"CANCEL",LocalDate.of(2026,1,8),Arrays.asList("gift")) ); }
    public static List<Employee> employees() { return Arrays.asList(
        new Employee(1,"Kim","BACKEND",5200,"kim@company.com","M001"), new Employee(2,"Lee","FRONTEND",4800,null,"M002"), new Employee(3,"Park","BACKEND",6100,"park@company.com","M001"), new Employee(4,"Choi","DATA",7000,"choi@company.com",null), new Employee(5,"Jung","FRONTEND",4300,null,"M002") ); }
    public static List<Product> products() { return Arrays.asList(
        new Product(1,"Keyboard","IT",70000,12,10), new Product(2,"Monitor","IT",260000,0,null), new Product(3,"Spring Book","BOOK",32000,5,15), new Product(4,"Coffee","FOOD",12000,30,null), new Product(5,"Mouse","IT",45000,21,5), new Product(6,"Clean Code","BOOK",36000,0,null) ); }
}
