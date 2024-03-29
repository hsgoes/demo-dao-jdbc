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
		
		/*
		System.out.println("=== TESTE 2: department findById =====");
		System.out.print("Enter DepartmentId to be found: ");
		int id = sc.nextInt();
		Department dep = departmentDao.findById(id);
		
		if(dep != null) {
			System.out.println(dep);
		} else {
			System.out.println("Theres not exist any deparment with Id: " + id);
		}
		*/
		
		/*
		System.out.println("=== TESTE 3: department delete test =====");
		System.out.print("Enter DepartmentId to be deleted: ");
		int id = sc.nextInt();
		departmentDao.deletById(id);
		System.out.println("Delete completed");
		*/
		
		
		System.out.println("=== TESTE 4: department update =====");
		System.out.print("Enter DepartmentId to be updated: ");
		int id = sc.nextInt();
		Department dep = departmentDao.findById(id);
		dep.setName("T.I");
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		sc.close();

	}

}
