package model.dao;
import db.DB;
import model.dao.impl.SellerDaoImplJDBC;
import model.dao.impl.DepartmentDaoImplJDBC;
public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoImplJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoImplJDBC(DB.getConnection());
	}
}