package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	//setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
//constractir injection
 // public CustomerManager(ICustomerDal customerDal) {
		//this.customerDal = customerDal;
	//}
public void add() {
	  //is kurullar
	  customerDal.add();
  }
}
