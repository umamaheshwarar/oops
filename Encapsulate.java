package opps;

public class Main {
    public static void main(String[] args) {



        Encapsulate emp = new Encapsulate();
        emp.setName("mahesh");
        emp.setAge(28);
        emp.setSalary(40000);
        

        System.out.println("Name :"+emp.getName());
        System.out.println("Age :"+emp.getAge());
        System.out.println("Salary :"+emp.getSalary());



    }
}

class Encapsulate {
    private String name;
    private int age;
    private int salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

