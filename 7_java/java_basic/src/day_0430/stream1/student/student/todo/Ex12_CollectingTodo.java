package day_0430.stream1.student.student.todo;

import day_0430.stream1.student.common.Student;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex12_CollectingTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("홍길동", "남", 92),
            new Student("김수영", "여", 87),
            new Student("감자바", "남", 95),
            new Student("오해영", "여", 93)
        );

        // TODO 1: 남학생만 List로 수집
        List<Student> maleList = students.stream().filter(n->(n.getSex()).equals("남")).toList();
        maleList.stream().forEach(s-> System.out.println(s.getName()));
        // TODO 2: 이름을 key, 점수를 value로 Map 수집
        Map<String , Integer> scoremap  = students.stream().collect(Collectors.toMap(Student::getName, Student::getScore));
        System.out.println(scoremap);
        // TODO 3: 성별 기준 groupingBy로 그룹핑
        Map<String, List<Student>> genderMap = students.stream()
                .collect(Collectors.groupingBy(Student::getSex));
        List<Student> maleList1 = genderMap.get("남");
        maleList1.stream().forEach(System.out::println);
        List<Student> femaleList = genderMap.get("여");
        femaleList.stream().forEach(System.out::println);
        // TODO 4: 성별 기준 평균 점수 Map을 수집
        Map<String, Double> avgSex = students.stream()
                .collect(Collectors.groupingBy(Student::getSex, Collectors.averagingDouble(Student::getScore)));

        System.out.println("Todo 1 : " + maleList);
        System.out.println("Todo 2 : " + scoremap);
        System.out.println("Todo 3 : " + genderMap);
        System.out.println("Todo 4 : " + avgSex);
    }
}
