package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
//	//constructor injection
//	public CustomerManager(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}

	public void add() {
		//İş kuralları
		customerDal.add();
		
	}

	//setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

}
