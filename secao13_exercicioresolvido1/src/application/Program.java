package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

    public static void main(String[] args) throws ParseException { // throws ... ainda n foi estudado so foi colocado para n dar erro na linha 45 foi autocorreção

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // usado para formatar a data
        // Lendo dados do trabalhador :
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName)); // instanciando um novo objeto do tipo worker e passando seus dados

        // departmentName esta  associado a Worker ele foi alocado em um novo objeto do tipo Department
        // departamento é um outro objeto do tipo departamento (isso é uma composição de objetos) n worker vai precisar instanciar um departamento passando o nome digitado e ai sim vai fazer a associoação do trabalhador e o departamento

        // -------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Lendo dados do contrato :

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next()); // vai pegar a data em string e converter ela com o .parse
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours); // instanciando os dados do contrato
            worker.addContract(contract); // adicionando o contrato na lista associando o contrato ao trabalhador
            // vai ser criado objetos do tipo HourContract com os valores passados e vao estar associados a Worker
        }

        // ------------------------------------------------------------------------------------------------------------------------------------------------------------

        // Pedindo para inserir o mes e o ano dos contratos para calcular quanto ganhou

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2)); // recortando o mes com o substring e convertendo para interiro com Interger.parseInt vai pegar na string e recortar a posicao 0 e 1
        int year = Integer.parseInt(monthAndYear.substring(3)); // vai recortar a partir da posicao 3 para alocar como ano e depois converte para inteiro
        System.out.println("Name: " + worker.getName()); // pegando o nome
        System.out.println("Department: " + worker.getDepartment().getName()); // composição de objetos vai acessar o objeto departamento  e vai acessar o getName dele vai pegar o nome

        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month))); // formatando com String.format


        sc.close();
    }
}