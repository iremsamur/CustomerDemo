import java.rmi.RemoteException;

public interface CustomerService {
	//iki firmada müþterilerini kaydedicek
	//iki müþterimde de yani iki firmada da bu kaydetme iþlemi var Bu yüzden bu metod interface de yazýldý
	//Programda her zaman ortak olan unsurlarý interfacede toplarýz. Burada da
	//Starbucks ve Nero firmalarý ikisinde de ortak olanlarý interface de topladýk
	//iki firmada ayný veritabanýna kaydediyor. Ama birisi kaydederken , mernis doðrulamasý istiyor
		//Birisi istemiyor.O yüzden bir interface içinde kaydetme fonksiyonunu yazdým
	void Save(Customer customer) throws NumberFormatException, RemoteException;

}
