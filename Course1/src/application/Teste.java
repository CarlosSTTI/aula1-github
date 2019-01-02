package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Emplyoee " + i + 1);
			System.out.println("ID ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name ");
			String name = sc.nextLine();
			System.out.println("Salary ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));	
		}

			System.out.println();
			System.out.println("Enter the employee id that will have salary increase: ");
			int id = sc.nextInt();
			Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (emp == null) {
				System.out.println("This id does not exist! ");
				
			}
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			
			System.out.println();
			System.out.println("List of employee ");
			for (Employee obj: list) {
				System.out.println(obj);
			}
			sc.close();
			
	}
	

}
