package cloudscape_dao;

import dao.OrderDAO;

public class CloudscapeOrderDAO implements OrderDAO {

	@Override
	public String insertOrder() {
		return "Order inserted";
	}

	@Override
	public String deleteOrder() {
		return "Order deleted";
	}

	@Override
	public String findOrder() {
		return "Order found";
	}

	@Override
	public String updateOrder() {
		return "Order updated";
	}

	@Override
	public String selectOrder() {
		return "Order selected";
	}

	@Override
	public String selectOrderTo() {
		return "All orders selected";
	}

}
