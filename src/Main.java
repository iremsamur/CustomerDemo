import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager baseCustomer = new NeroCustomerManager();//Hangi firmay� g�nderirsek o m��teriye g�re �al���r
		
		Date d1 = new Date(2000, 11, 21);
		baseCustomer.Save(new Customer(1,d1,"Engin","Demiro�","12345678"));

	}

}

