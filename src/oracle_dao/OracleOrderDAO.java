package oracle_dao;

import dao.OrderDAO;

public class OracleOrderDAO implements OrderDAO {

	@Override
	public String insertOrder() {
		return "Oracle: order inserted";
	}

	@Override
	public String deleteOrder() {
		return "Oracle: order deleted";
	}

	@Override
	public String findOrder() {
		return "Oracle: order found";
	}

	@Override
	public String updateOrder() {
		return "Oracle: order updated";
	}

	@Override
	public String selectOrder() {
		return "Oracle: order selected";
	}

	@Override
	public String selectOrderTo() {
		return "Oracle: all orders selected";
	}

}
