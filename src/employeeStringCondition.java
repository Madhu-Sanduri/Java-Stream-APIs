import java.util.ArrayList;

public class employeeStringCondition {

    public static void solution(ArrayList<Employee> list){
        //list --> getting input data from Main Class & setEmployees() method;

        list.stream()
                .filter( employee -> employee.getName().startsWith("M"))
                .forEach(System.out::println);
    }
}
