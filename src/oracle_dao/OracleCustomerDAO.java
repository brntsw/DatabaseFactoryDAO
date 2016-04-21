package oracle_dao;

import dao.CustomerDAO;

public class OracleCustomerDAO implements CustomerDAO {

	@Override
	public String insertCustomer() {
		return "Oracle: customer inserted";
	}

	@Override
	public String deleteCustomer() {
		return "Oracle: customer deleted";
	}

	@Override
	public String findCustomer() {
		return "Oracle: customer found";
	}

	@Override
	public String updateCustomer() {
		return "Oracle: customer updated";
	}

	@Override
	public String selectCustomer() {
		return "Oracle: customer selected";
	}

	@Override
	public String selectCustomersTo() {
		return "Oracle: all customers selected";
	}

}
