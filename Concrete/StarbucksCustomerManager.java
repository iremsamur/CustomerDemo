import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	//abstract classý extends ederek interface 'deki save dolaylý olarak miras almýþ oldu
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException  {
		// TODO Auto-generated method stub
		//base classdaki metodu ezdim. Çünkü
		//starbucksda veritabanýna kayýtlarda, mernis doðrulamasý istiyor. Diðer firma bunu istemiyor
		//O yüzden metodunu o þekilde yazýyorum
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person"); 
			
		}
		
		
		
	}
	
	

	
	

}
