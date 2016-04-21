package cloudscape_dao;

import dao.AccountDAO;

public class CloudscapeAccountDAO implements AccountDAO {

	@Override
	public String insertAccount() {
		return "Account inserted";
	}

	@Override
	public String deleteAccount() {
		return "Account deleted";
	}

	@Override
	public String findAccount() {
		return "Account found";
	}

	@Override
	public String updateAccount() {
		return "Account updated";
	}

	@Override
	public String selectAccount() {
		return "Account selected";
	}

	@Override
	public String selectAccountTo() {
		return "All accounts selected";
	}

}
