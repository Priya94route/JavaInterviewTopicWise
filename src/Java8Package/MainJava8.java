package Java8Package;
import java.util.List;
import java.util.stream.Collectors;


import java.util.Arrays;
import java.util.List;

class Department {

    private String teamName;
    private String location;

    public Department(String teamName, String location) {
        this.teamName = teamName;
        this.location = location;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return teamName + " - " + location;
    }
}

class Employee {

    private String name;
    private List<Department> departments;

    public Employee(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return name + " -> " + departments;
    }
}


public class MainJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            List<Integer> li=List.of(1,3,4,5,6);
            int sum=li.stream().filter(n->n%2==0).collect(Collectors.summingInt(x->(int)x));
	System.out.println(sum);
	
	   Employee emp1 = new Employee(
               "Aman",
               Arrays.asList(
                       new Department("Product", "Bangalore"),
                       new Department("Engineering", "Delhi")
               )
       );

       Employee emp2 = new Employee(
               "Neha",
               Arrays.asList(
                       new Department("HR", "Mumbai"),
                       new Department("Finance", "Pune")
               )
       );

       Employee emp3 = new Employee(
               "Simran",
               Arrays.asList(
                       new Department("Product", "Bangalore"),
                       new Department("Support", "Chennai")
               )
       );
	
	//Write code using streams to print the employee who works in Product Team and Is located in bangalore
	
       List<Employee> employees = Arrays.asList(emp1, emp2, emp3);
       employees.stream().flatMap(emp->emp.getDepartments().stream()).
       filter(x->"Product".equals(x.getTeamName())).filter(y->y.getLocation().equals("Bangalore"))
       .forEach(System.out::println);
       
       
       
       employees.stream()
       .filter(emp ->
               emp.getDepartments().stream()
                  .anyMatch(dept ->
                       "Product".equals(dept.getTeamName())
                       && "Bangalore".equals(dept.getLocation())
                  )
       )
       .map(Employee::getName)
       .forEach(System.out::println);
       
       
	}

}
