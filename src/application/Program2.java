package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("=== TESTE 1: department insert =====");
		Department newDepartment = new Department(null, "Music");
		
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		*/
		
		System.out.println("=== TESTE 2: department findById =====");
		System.out.print("Enter DepartmentId to be found: ");
		int id = sc.nextInt();
		Department dep = departmentDao.findById(id);
		
		if(dep != null) {
			System.out.println(dep);
		} else {
			System.out.println("Theres not exist any deparment with Id: " + id);
		}
		
		
		sc.close();

	}

}
