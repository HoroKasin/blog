package api.util.stringtoken;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String str1 = "The weather is very hot and sunny today.";
		String str2 = "2018/09/04";

		//stringtoken
		StringTokenizer t1 = new StringTokenizer(str1);

		//method countTokens() to determine the number of tokens in the string
		System.out.println("Number of strings in t1: " + t1.countTokens());

		//method nextToken() to get the values of each torque in turn
		// String word = t1.nextToken();
		// System.out.println(word);

		//nextToken() no longer has tokens to import
		//create exception
		//so when looping nextToken()
		//Call a message to check if there are any more tokens to pull out.
		while(t1.hasMoreTokens()) {
			String word = t1.nextToken();
			System.out.println(word);
		}

		System.out.println(t1.countTokens());

		System.out.println("---------------------------");

		StringTokenizer t2 = new StringTokenizer(str2, "/");

		while(t2.hasMoreTokens()) {
			System.out.println(t2.nextToken());			
		}

		String str3 = "https://www.naver.com/search.naver?query=hello&query=Dinner"
				+ "&query=chicken";

		int i = str3.indexOf("q");
		str3 = str3.substring(i);
		System.out.println(str3);

		System.out.println("----------------------------");
		StringTokenizer t3 = new StringTokenizer(str3, "=&");

		while(t3.hasMoreTokens()) {

			String str = t3.nextToken();
			if(!str.equals("query")) {
				System.out.println(str);
			}
		}

	}

}





