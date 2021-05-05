import java.rmi.*;
import tr.gov.nvi.tckimlik.WS.*;
public class MernisServiceAdapter implements CustomerCheckService{

	
	@Override
	
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException  {
		
		 KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.NationalityId),customer.FirstName,customer.LastName.toUpperCase(),customer.DateOfBirth.getYear());
		// TODO Auto-generated method stub
		 
		 
		
	}
	

}
