package entities;

public class Employee {

    public String name;
    public double grosssalary;
    public double imposto;

    public double netSalary(){
        return grosssalary - imposto;
    }

    public void increaseSalary(double percentage){
        grosssalary += grosssalary * percentage /100;
    }

    public String toString(){
        return name + ", $" + String.format("%.2f", netSalary());
    }
}
