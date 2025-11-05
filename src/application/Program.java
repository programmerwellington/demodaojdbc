package application;
import model.entities.Department;
import model.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import java.util.List;
public class Program {
	public static void main (String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println("********** TEST 1 => seller findById **********\n" + seller + "\n");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		System.out.println("\n********** TEST 2 => seller findByDepartment **********");
		for (Seller s : list) {
			System.out.println(s);
		}
		
		List<Seller> listAll = sellerDao.findAll();
		System.out.println("\n********** TEST 3 => seller findAll **********");
		for (Seller sAll : listAll) {
			System.out.println(sAll);
		}
		
	}
}