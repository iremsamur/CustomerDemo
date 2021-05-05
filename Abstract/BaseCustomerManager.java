import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements CustomerService {
	//senaryoda her iki firman�nda kayd� veritaban�na yapaca��ndan bahsediliyor
	//E�er her iki firma kayd� farkl� yerlere yapsayd� , o zaman interface kullan�rd�k
	//��nk� sadece her ikisinde kaydetme metodu olurdu ama metodlar�n i�lemleri
	//yani g�vdeleri farkl� olurdu. Ama burada iki firma da veritaban�na kay�t yapaca��
	//yani ayn� i�lem oldu�u i�in hem imzas� hem g�vdesinin ayn� olaca�� i�in 
	//g�vdeli metodlar da yazabildi�imiz abstract class� kullan�r�z
	//Bu y�zden abstract class'�n�n save metodunu tutan interfaceden implement almas�n� sa�lar�z
	

	@Override
	//ortak i�lemi abstract class i�inde interface'i �a��rarak yazd�k
	/*iki firma i�inde ortak kod oldu�u i�in abstract class i�inde bu kodu interfaceden implement alarak yazd�k*/
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Save to db "+customer.FirstName);
		
	}
	

}
