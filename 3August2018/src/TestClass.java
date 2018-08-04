
public class TestClass {

	public static void main(String[] args) {
		Holder h = Stocksingleton.getStock();
		h.viewQuote();
		
		Broker b = Stocksingleton.getStock();  //This wont create different objects!!
		b.viewQuote();
		b.getQuote();
		
		System.out.println(h == b);
		
	}

}
