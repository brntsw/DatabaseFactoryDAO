package sybase_dao;

import dao.OrderDAO;

public class SybaseOrderDAO implements OrderDAO {

	@Override
	public String insertOrder() {
		return "Sybase: order inserted";
	}

	@Override
	public String deleteOrder() {
		return "Sybase: order deleted";
	}

	@Override
	public String findOrder() {
		return "Sybase: order found";
	}

	@Override
	public String updateOrder() {
		return "Sybase: order updated";
	}

	@Override
	public String selectOrder() {
		return "Sybase: order selected";
	}

	@Override
	public String selectOrderTo() {
		return "Sybase: all orders selected";
	}

}
