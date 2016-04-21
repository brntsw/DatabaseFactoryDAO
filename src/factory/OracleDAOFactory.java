package factory;

import dao.AccountDAO;
import dao.CustomerDAO;
import dao.OrderDAO;
import oracle_dao.OracleAccountDAO;
import oracle_dao.OracleCustomerDAO;
import oracle_dao.OracleOrderDAO;

public class OracleDAOFactory extends DAOFactory {

	@Override
	public CustomerDAO getCustomerDAO() {
		return new OracleCustomerDAO();
	}

	@Override
	public AccountDAO getAccountDAO() {
		return new OracleAccountDAO();
	}

	@Override
	public OrderDAO getOrderDAO() {
		return new OracleOrderDAO();
	}

}
