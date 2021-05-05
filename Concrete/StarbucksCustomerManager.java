import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	//abstract class� extends ederek interface 'deki save dolayl� olarak miras alm�� oldu
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException  {
		// TODO Auto-generated method stub
		//base classdaki metodu ezdim. ��nk�
		//starbucksda veritaban�na kay�tlarda, mernis do�rulamas� istiyor. Di�er firma bunu istemiyor
		//O y�zden metodunu o �ekilde yaz�yorum
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person"); 
			
		}
		
		
		
	}
	
	

	
	

}
