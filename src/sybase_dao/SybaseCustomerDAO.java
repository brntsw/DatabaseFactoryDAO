package sybase_dao;

import dao.CustomerDAO;

public class SybaseCustomerDAO implements CustomerDAO {

	@Override
	public String insertCustomer() {
		return "Sybase: customer inserted";
	}

	@Override
	public String deleteCustomer() {
		return "Sybase: customer deleted";
	}

	@Override
	public String findCustomer() {
		return "Sybase: customer found";
	}

	@Override
	public String updateCustomer() {
		return "Sybase: customer updated";
	}

	@Override
	public String selectCustomer() {
		return "Sybase: customer selected";
	}

	@Override
	public String selectCustomersTo() {
		return "Sybase: all customers selected";
	}

}
