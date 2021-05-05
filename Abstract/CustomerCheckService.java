import java.rmi.RemoteException;

public interface CustomerCheckService {
	//bir class'�n i�ine yazd���m metodu yazarken , sadece ona �zg� m� diye d���nmeliyiz!!
	//E�er ortak olacak bir metod ise, mutlaka interface i�inde yaz�lmal�d�r!!
	//Daha sonra ba�ka class'lar�nda kullanabilmesi i�in bu gereklidir!!
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
