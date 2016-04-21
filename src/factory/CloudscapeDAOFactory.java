package factory;

import cloudscape_dao.CloudscapeAccountDAO;
import cloudscape_dao.CloudscapeCustomerDAO;
import cloudscape_dao.CloudscapeOrderDAO;
import dao.AccountDAO;
import dao.CustomerDAO;
import dao.OrderDAO;

public class CloudscapeDAOFactory extends DAOFactory {

	@Override
	public CustomerDAO getCustomerDAO() {
		return new CloudscapeCustomerDAO();
	}

	@Override
	public AccountDAO getAccountDAO() {
		return new CloudscapeAccountDAO();
	}

	@Override
	public OrderDAO getOrderDAO() {
		return new CloudscapeOrderDAO();
	}

}
