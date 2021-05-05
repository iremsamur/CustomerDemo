import java.rmi.RemoteException;

public interface CustomerCheckService {
	//bir class'ýn içine yazdýðým metodu yazarken , sadece ona özgü mü diye düþünmeliyiz!!
	//Eðer ortak olacak bir metod ise, mutlaka interface içinde yazýlmalýdýr!!
	//Daha sonra baþka class'larýnda kullanabilmesi için bu gereklidir!!
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
