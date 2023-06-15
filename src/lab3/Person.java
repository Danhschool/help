
package lab3;


public class Person {
    private String id;
    private String name;
    private int dob;
    private double salary;

    public Person() {
    }

    public Person(String id, String name, int dob, double salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + '}';
    }
    
}
