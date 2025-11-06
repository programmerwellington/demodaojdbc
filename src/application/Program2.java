package application;
import model.entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import java.util.List;
import java.util.Scanner;
public class Program2 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department department = departmentDao.findById(3);
		System.out.println("********** TEST 1 => department findById **********\n" + department + "\n");
		
		System.out.println("\n********** TEST 2 => department findAll **********");
		List<Department> listAll = departmentDao.findAll();
		for (Department dAll : listAll) {
			System.out.println(dAll);
		}
		
		
		System.out.println("\n********** TEST 3 => department insert **********");
		Department newDepartment = new Department(null, "Decoratives Objects");
		departmentDao.insert(newDepartment);
		System.out.println("New Department inserted: " + newDepartment.getId());
		
		
		
		System.out.println("\n********** TEST 4 => department update **********");
		department = departmentDao.findById(1);
		department.setName("Gifts");
		departmentDao.update(department);
		System.out.println(departmentDao.findById(1));
		
		System.out.println("\n********** TEST 5 => department delete **********");
		System.out.print("Enter the Id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println(departmentDao.findAll());
		
		sc.close();
	}
}