package cloudscape_dao;

import dao.CustomerDAO;

public class CloudscapeCustomerDAO implements CustomerDAO {

	@Override
	public String insertCustomer() {
		return "Cloudscape: customer inserted";
	}

	@Override
	public String deleteCustomer() {
		return "Cloudscape: customer deleted";
	}

	@Override
	public String findCustomer() {
		return "Cloudscape: customer found";
	}

	@Override
	public String updateCustomer() {
		return "Cloudscape: customer updated";
	}

	@Override
	public String selectCustomer() {
		return "Cloudscape: customer selected";
	}

	@Override
	public String selectCustomersTo() {
		return "Cloudscape: all customers selected";
	}

}
