//Mykhailo Hnylytskyi T00257938
import java.util.Collections;
import java.util.Comparator;

public class Q1 {
    public static void main(String[] args) {
        /*In older version below Intellij IDEA 2024.3.5 it's look like ArrayList <Employee> person = new ArrayList<Employee>();
        but in new version it's look like below code and work correctly I am worked on Intellij IDEA 2024.3.5, because machine in
        lab was wiped and Intellij IDEA 2024.2.4 don't work for me and I download new one*/
        java.util.ArrayList <Employee> person = new java.util.ArrayList<Employee>();

        //1. Create new ArrayList of 5 employee objects.
        person.add(new Employee("Mykhailo", 1150, 20,"Computing"));
        person.add(new Employee("Mike", 532, 23,"Health Care"));
        person.add(new Employee("Zenda", 253355, 43,"Sport"));
        person.add(new Employee("Fedir", 252355, 56,"Computing"));
        person.add(new Employee("Gven", 3333, 34,"Cooking"));

        //2. Removing 3rd object
        person.remove(2);

        //3. Insert a new employee at position 4 that is index 3 in the ArrayList
        person.set(3, new Employee("Terese", 2454, 35, "Sport"));

        //4. Print of the Updated ArrayList
        System.out.println("4. Print of the Updated ArrayList:");
        for(Employee e: person){
            System.out.println(e);
        }

        //Just for space between outputs
        System.out.println();

        //5.Using the Collections class and comparators to sort employee's by name
        System.out.println("5(a). Sort by name:");
        Collections.sort(person, Comparator.comparing(employee -> employee.getName()));
        for(Employee e: person){
            System.out.println(e);
        }

        //Just for space between outputs
        System.out.println();

        System.out.println("5(b). Sort by salary:");
        Collections.sort(person, Comparator.comparing(employee -> employee.getSalary()));
        for(Employee e: person){
            System.out.println(e);
        }

        //Just for space between outputs
        System.out.println();

        //5(c) Sort by Department and the age in 2 different ways

        System.out.println("5(c). Sort by Department and then age:");
        Collections.sort(person, Comparator.comparing(Employee::getAge));
        Collections.sort(person, Comparator.comparing(e->e.getDepartment()));

        //Output of sorted arrays
        for(Employee e: person){
            for(int i = 0; i < person.size(); i++){
                if(e.getDepartment().equals(person.get(i).getDepartment())){
                    System.out.println(e);
                }else if(e.getAge() == person.get(i).getAge()){
                    System.out.println(e);
                }
            }
        }





    }
}
