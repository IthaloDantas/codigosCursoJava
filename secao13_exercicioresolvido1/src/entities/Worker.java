package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {  // Nessa classe worker ele tem um departamento e varios contratos por isso o for

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;  // tem apenas um departamento
                                                                // associações, fazendo uma composição de objetos
    private  List<HourContract> contracts = new ArrayList<>(); /* tem varios contratos e vai representar esses varios contratos com uma lista
                                                                a lista vai ser instanciada por padrão na classe não vai instanciar ela no construtor
                                                                Quando se tem uma composição que tem muitos que no caso é a lista  vc n inclui ele no construtor
                                                                simplesmente inicia ela vazia na classe*/

    public Worker() {
    }               // construtor vazio/ construtor padrão

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;                   // construtor com argumentos não vai colocar a lista ela é para ser instanciada na classe
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;                           // pegando os contratos
    }

    /* o metodo set foi apagado pq n poderia ter ele nesse codigo pq esse eu vou ter o metodo para adicionar e remover
    * contratos se o metodo set existir ele vai ficar pegando uma nova lista e substituir pela outra e isso n pode acontecer */

    public void addContract(HourContract contract) {        // metodo para adicionar contrato
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);                             // metodo para remover contrato
    }

    public double income(int year, int month) {  // metodo quanto ele ganha baseado no ano e o mes

        double sum = baseSalary; // criando uma var local que vai receber o salario base

        Calendar cal = Calendar.getInstance(); // vai ser usado para extrair o ano e o mes da data desse contrato C

        for (HourContract c : contracts) {  /* vai percorrer a lista de contratos para saber quanto ele ganhou no contrato informado para cada contrato na lista c
                                              na lista de contratos , vai testar se esse contrato c é do ano e o mes informado caso ele seja vai acrescentar o valor
                                              do contrato a soma */

            cal.setTime(c.getDate()); // pegou a data do contrato e definiu essa data como sendo a data do calendario

            int c_year = cal.get(Calendar.YEAR); // var para pegar o ano daqyela data
            int c_month = 1 + cal.get(Calendar.MONTH); // var para pegar o mes daquela data esse +1 é pq o mes do calendar começa com 0
            if (year == c_year && month == c_month) {
                sum += c.totalValue();         // condição para adicionar o valor ganho se o contrato for do mes e ano informado
            }
        }
        return sum;
    }
}