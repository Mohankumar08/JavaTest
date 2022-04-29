package base;

import org.continent.Africa;
import org.continent.Asia;
import org.continent.Europe;

public class America {
	public void newyork() {
		System.out.println("Capital");
	}

		public static void main(String[] args) {
			America am = new America();
			am.newyork();
			Europe e = new Europe();
			e.spain();
			e.germany();
			Asia a = new Asia();
			a.china();
			a.india();
			Africa af = new Africa();
			af.southAfrica();
		}
}
