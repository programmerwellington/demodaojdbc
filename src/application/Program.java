package application;
import model.entities.Department;
import model.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import java.util.List;
import java.util.Date;
public class Program {
	public static void main (String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println("********** TEST 1 => seller findById **********\n" + seller + "\n");
		
		System.out.println("\n********** TEST 2 => seller findByDepartment **********");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n********** TEST 3 => seller findAll **********");
		List<Seller> listAll = sellerDao.findAll();
		for (Seller sAll : listAll) {
			System.out.println(sAll);
		}
		
		System.out.println("\n********** TEST 4 => seller insert **********");
		Seller newSeller = new Seller(null, "Liliana D", "liliana@gmail.com", new Date(), 4000., department);
		sellerDao.insert(newSeller);
		System.out.println("New Seller inserted: " + newSeller.getId());

		
		// System.out.println(DaoFactory.createSellerDao().findById(8));
		
	}
}