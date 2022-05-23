package StreamsDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee{
    String name;
    int salary;
    boolean isActive=true;
    String team;

    static int count =0;

    Employee(){
        name= "name" + count;
        isActive=count %2==0?true:false;
        team=count %2==0?"Team-A":"Team-B";
        salary=count *100;
        count++;
    }

    public int getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }
    public String getTeam(){
        return this.team;
    }

    public boolean getActive(){
        return this.isActive;
    }

}

public class StreamsExample {
    public static void main(String[] args) {
        int[] numbers = {4,1,12,90,16,2,2};

        int min = IntStream.of(numbers).min().getAsInt();
         
        //creating IntStrams
        IntStream.range(1, 101);
        IntStream.rangeClosed(1, 20);
        //if Array is empty error may occur
        IntStream.of(numbers).min().ifPresent(System.out::println);
        IntStream.of(numbers).max().ifPresent(System.out::println);
        IntStream.of(numbers).average().ifPresent(System.out::println);
        System.out.println(IntStream.of(numbers).sum());
        System.out.println(IntStream.of(numbers).count());
         

        //to get top three numbers
        //it will work on copy of arrays
        System.out.println("\nto get top three numbers");
        IntStream.of(numbers)
        .distinct()
        .sorted()
        .limit(3)
        .forEach(System.out::print);
 
        System.out.println("\nto skip first 3");
        //to skip first 3
        IntStream.of(numbers)
        .skip(3)
        .forEach(System.out::print);
         
        System.out.println("\nfilter even numbers");
        //filter and map only even
        //System.out.println(numbers);
        IntStream.of(numbers)
        .filter(num -> num % 2 == 0)
        .map(num -> {
            return num;
        })
        .forEach(System.out::print);

        //to convert int to Integer and to collect to list
        IntStream.of(numbers)
        .boxed()
        .collect(Collectors.toList());

        //to collect in to array
        IntStream.of(numbers).toArray();
        //to collect in to list
 
        //to match 
        System.out.println("\nany match and all match");
        System.out.println(IntStream.of(numbers).anyMatch(num -> num %2 == 1));//to check any one is odd
        System.out.println(IntStream.of(numbers).allMatch(num -> num %2 == 2));//to check all are even



        System.out.println("\n---------------Streams Objects-----------");
          
        ArrayList<Employee> employees = new ArrayList<Employee>(5);

        IntStream.range(0, 5).forEach(num -> employees.add(new Employee()));
        
        employees.stream()
        .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
        .filter(Employee::getActive)
        .limit(3)
        .map(Employee::getName)
        .forEach(System.out::println);

        System.out.println(" ------------- Collectors ----------");
        
        //toList
        List<String> listOfEmp = employees.stream().map(Employee::getName).collect(Collectors.toList());

        //toDept
        Set<String> setOfDept = employees.stream().map(Employee::getName).collect(Collectors.toSet());

        //toMap
        Map<String,Boolean> mapOfEmp = employees.stream().collect(Collectors.toMap(Employee::getName,Employee::getActive));
        
        //to joining
        String AllName = employees.stream().map(Employee::getName).collect(Collectors.joining(", "));
        
        //group BY
        Map<String,List<Employee>> grpOfTeam = employees.stream().collect(Collectors.groupingBy(Employee::getTeam));

        //count of each emp in team 
        Map<String,Long> empCountByTeam = employees.stream().collect(Collectors.groupingBy(Employee::getTeam, Collectors.counting()));

        //parallel  - useful only when data is really large
        Map<String,List<Employee>> parallelTeam = employees.stream().parallel().collect(Collectors.groupingBy(Employee::getTeam));

        System.out.println(listOfEmp);
        System.out.println(setOfDept);
        System.out.println(mapOfEmp);
        System.out.println(AllName);
        System.out.println(grpOfTeam);
        System.out.println(empCountByTeam);

        Stream.iterate(1, i -> i + 1)
                .filter(n -> n <= 10)
                .map(x -> x * x)
                .forEach(System.out::println); 
         
    }
    
}
