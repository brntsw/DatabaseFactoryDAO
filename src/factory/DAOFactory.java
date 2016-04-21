package factory;

import dao.AccountDAO;
import dao.CustomerDAO;
import dao.OrderDAO;

public abstract class DAOFactory {
	public static final int CLOUDSCAPE = 1;
	public static final int ORACLE = 2;
	public static final int SYBASE = 3;
	
	public abstract CustomerDAO getCustomerDAO();
	public abstract AccountDAO getAccountDAO();
	public abstract OrderDAO getOrderDAO();
	
	public static DAOFactory getDAOFactory(int whichFactory){
		switch(whichFactory){
			case CLOUDSCAPE:
				return new CloudscapeDAOFactory();
			case ORACLE:
				return new OracleDAOFactory();
			case SYBASE:
				return new SybaseDAOFactory();
			default:
				return null;
		}
		
	}
}
