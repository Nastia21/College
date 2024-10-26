 import java.util.*;

        public class Main {
            static  class Employee {
                private String name;
                private String company;
                private double salary;
                private int age;

                public Employee(String name, String company, double salary, int age) {
                    this.name = name;
                    this.company = company;
                    this.salary = salary;
                    this.age = age;
                }

                public String getName() { return name; }
                public String getCompany(){ return company; }
                public double getSalary(){ return salary; }
                public int getAge(){ return age; }

                @Override
                public String toString() {
                    return "Employee{" +
                            "name='" + name + '\'' +
                            ", company='" + company + '\'' +
                            ", salary='" + String.format("%.2f", salary) + '\'' +
                            ", age='" + age +
                            '}';
                }
            }

            private static final List<String> NAMES = Arrays.asList("Alice", "Glory", "Charlie", "Diana", "Edward", "Fiona", "Felix", "Hannah", "Ivan", "Julia");
            private static final List<String> COMPANYES = Arrays.asList("TechCorp", "InnovateLLC", "SoftSystems", "GlobalTech", "DataSolutions", "AIWorks", "NetDynamics");

            public static List<Employee> generateRandomEmployees(int count) {
                List<Employee> employees = new ArrayList<>();
                Random rnd = new Random();

                for (int i=0; i<count; i++) {
                    String name = NAMES.get(rnd.nextInt(NAMES.size()));
                    String company = COMPANYES.get(rnd.nextInt(COMPANYES.size()));
                    double salary = 30000 + (rnd.nextDouble() * 70000);
                    int age = 18 + (rnd.nextInt(33));

                    employees.add(new Employee(name, company, salary, age));
                }
                return employees;
            }

            public static void main(String[] args){
                List<Employee> employees = generateRandomEmployees(10);

                employees.sort(Comparator.comparing(Employee::getName));
                System.out.println("Сортировка по имени:");
                employees.forEach(System.out::println);

                employees.sort(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary));
                System.out.println("\nСортировка по имени и зарплате:");
                employees.forEach(System.out::println);

                employees.sort(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary)
                        .thenComparing(Employee::getAge)
                        .thenComparing(Employee::getCompany));
                System.out.println("\nСортировка по имени, зарплате, возрасту и компании:");
                employees.forEach(System.out::println);

            }
        }












