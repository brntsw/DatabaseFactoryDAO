package oracle_dao;

import dao.AccountDAO;

public class OracleAccountDAO implements AccountDAO {

	@Override
	public String insertAccount() {
		return "Oracle: account inserted";
	}

	@Override
	public String deleteAccount() {
		return "Oracle: account deleted";
	}

	@Override
	public String findAccount() {
		return "Oracle: account found";
	}

	@Override
	public String updateAccount() {
		return "Oracle: account updated";
	}

	@Override
	public String selectAccount() {
		return "Oracle: account selected";
	}

	@Override
	public String selectAccountTo() {
		return "Oracle: all accounts selected";
	}

}
