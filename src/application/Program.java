package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		List <Employee> list = new ArrayList<>();
		
		for (int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer idConfirmation = sc.nextInt();
		
		
		
		
		
		sc.close();

	}
}
