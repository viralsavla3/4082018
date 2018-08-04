
public final class Stocksingleton {
	private static Stock lti = null; // null unless its call getstock method

	private Stocksingleton() {
	}

	public static Stock getStock() {

		if (lti == null) // as good as new return Stock object so we have declaration of private Stock
			lti = new Stock();
		return lti;
	}

}
