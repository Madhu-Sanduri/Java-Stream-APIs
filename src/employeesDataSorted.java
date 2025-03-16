import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class employeesDataSorted {

    public static void solution(ArrayList<Employee> list){
            list.stream()
                    .sorted(Comparator.comparing(Employee::getId).reversed())
                    .filter(Employee -> Employee.getSalary()>=27000)
                    .toList()
//                .sorted(Comparator.comparing(Employee::getName).reversed())
//                .filter(employee -> employee.getSalary()>=20000)
                .forEach(System.out::println);
    }
}
