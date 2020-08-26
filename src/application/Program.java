package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int n = entrada.nextInt();
		
		for(int i = 1; i <= n; i ++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.println("Outsourced (y/n)? ");
			char c = entrada.next().charAt(0);
			System.out.println("Name: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			System.out.println("Hours: ");
			Integer hours = entrada.nextInt();
			System.out.println("Value per Hour: ");
			Double valuePerHour = entrada.nextDouble();
			if(c == 'y') {
				System.out.println("Additional charge: ");
				Double additonalCharge = entrada.nextDouble();
				emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additonalCharge));
			}		
			if(c=='n'){emp.add(new Employee(name, hours, valuePerHour));
			}
		}
	
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee e : emp) {
			System.out.println(e.getName() + ", $" + e.payment());
		}
	}

}
