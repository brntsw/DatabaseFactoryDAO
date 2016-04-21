package factory;

import dao.AccountDAO;
import dao.CustomerDAO;
import dao.OrderDAO;
import sybase_dao.SybaseAccountDAO;
import sybase_dao.SybaseCustomerDAO;
import sybase_dao.SybaseOrderDAO;

public class SybaseDAOFactory extends DAOFactory {

	@Override
	public CustomerDAO getCustomerDAO() {
		return new SybaseCustomerDAO();
	}

	@Override
	public AccountDAO getAccountDAO() {
		return new SybaseAccountDAO();
	}

	@Override
	public OrderDAO getOrderDAO() {
		return new SybaseOrderDAO();
	}

}
