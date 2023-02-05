package DXC;




	import java.util.*;

	public class WhiteSpace{

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String inp = sc.nextLine();
			String wsr=inp.replaceAll(" ", "");
			System.out.println(wsr);
		}

	}
