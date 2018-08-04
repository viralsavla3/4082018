
public class Stock implements Exchange {
	public Stock() {
	}

	@Override
	public void getQuote() {
		System.out.println("Getting Stock Quote");
	}

	@Override
	public void viewQuote() {
		System.out.println("Viewing Stock quote");
	}

	@Override
	public void setQuote() {
		System.out.println("Setting stock Quote");
	}

}
