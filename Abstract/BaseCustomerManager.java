import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements CustomerService {
	//senaryoda her iki firmanýnda kaydý veritabanýna yapacaðýndan bahsediliyor
	//Eðer her iki firma kaydý farklý yerlere yapsaydý , o zaman interface kullanýrdýk
	//Çünkü sadece her ikisinde kaydetme metodu olurdu ama metodlarýn iþlemleri
	//yani gövdeleri farklý olurdu. Ama burada iki firma da veritabanýna kayýt yapacaðý
	//yani ayný iþlem olduðu için hem imzasý hem gövdesinin ayný olacaðý için 
	//gövdeli metodlar da yazabildiðimiz abstract classý kullanýrýz
	//Bu yüzden abstract class'ýnýn save metodunu tutan interfaceden implement almasýný saðlarýz
	

	@Override
	//ortak iþlemi abstract class içinde interface'i çaðýrarak yazdýk
	/*iki firma içinde ortak kod olduðu için abstract class içinde bu kodu interfaceden implement alarak yazdýk*/
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Save to db "+customer.FirstName);
		
	}
	

}
