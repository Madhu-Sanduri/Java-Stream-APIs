import java.util.ArrayList;

public class employeeSalaryGT {

    public static void solution(ArrayList<Employee> list){

        //list --> getting input data from Main Class & setEmployees() method;
        list.stream().
                filter(employee -> employee.getSalary()>=25000)
                .toList()
                .forEach(System.out::println);

    }
}
