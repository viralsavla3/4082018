import java.util.Locale;
import java.util.ResourceBundle;

public class DemoInternationalization {
	public static void main(String[] args) {
		// i18n demo
		Locale loc = new Locale("hi","india");
		ResourceBundle bundle = ResourceBundle.getBundle("greeting",loc); // loading property files using locale
		System.out.println(bundle.getString("message"));
		

	}
}
