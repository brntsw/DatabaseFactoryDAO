package sybase_dao;

import dao.AccountDAO;

public class SybaseAccountDAO implements AccountDAO {

	@Override
	public String insertAccount() {
		return "Sybase: account inserted";
	}

	@Override
	public String deleteAccount() {
		return "Sybase: account deleted";
	}

	@Override
	public String findAccount() {
		return "Sybase: account found";
	}

	@Override
	public String updateAccount() {
		return "Sybase: account updated";
	}

	@Override
	public String selectAccount() {
		return "Sybase: account selected";
	}

	@Override
	public String selectAccountTo() {
		return "Sybase: all accounts selected";
	}

}
