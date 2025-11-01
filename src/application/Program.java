package application;
import model.entities.Department;
import model.entities.Seller;
import java.util.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;
public class Program {
	public static void main (String[] args) {
		Department obj = new Department(1, "Electronics");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000., obj);
		System.out.println(seller);
		
		SellerDao sd = DaoFactory.createSellerDao();
		
	}
}