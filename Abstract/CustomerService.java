import java.rmi.RemoteException;

public interface CustomerService {
	//iki firmada m��terilerini kaydedicek
	//iki m��terimde de yani iki firmada da bu kaydetme i�lemi var Bu y�zden bu metod interface de yaz�ld�
	//Programda her zaman ortak olan unsurlar� interfacede toplar�z. Burada da
	//Starbucks ve Nero firmalar� ikisinde de ortak olanlar� interface de toplad�k
	//iki firmada ayn� veritaban�na kaydediyor. Ama birisi kaydederken , mernis do�rulamas� istiyor
		//Birisi istemiyor.O y�zden bir interface i�inde kaydetme fonksiyonunu yazd�m
	void Save(Customer customer) throws NumberFormatException, RemoteException;

}
