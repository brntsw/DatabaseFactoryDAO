import dao.CustomerDAO;
import factory.DAOFactory;

public class Application {
	public static void main(String[] args){
		//Create the DAOFactory as cloudscape
		DAOFactory cloudscapeFactory = DAOFactory.getDAOFactory(DAOFactory.CLOUDSCAPE);
		
		//create the customer DAO for cloudscape
		CustomerDAO customerCloudscape = cloudscapeFactory.getCustomerDAO();
		
		//create a new customer with cloudscape
		System.out.println(customerCloudscape.insertCustomer());
		
		//Create the DAOFactory as Oracle
		DAOFactory oracleFactory = DAOFactory.getDAOFactory(DAOFactory.ORACLE);
		
		//create the customer DAO for Oracle
		CustomerDAO customerOracle = oracleFactory.getCustomerDAO();
		
		//create a new customer with Oracle
		System.out.println(customerOracle.insertCustomer());
	}
}
