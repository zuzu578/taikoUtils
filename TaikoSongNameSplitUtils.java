public class TaikoSongNameSplitUtils{
	
	public void utils(){
		
		String test = "続・〆ドレー2000 5 7 8 10 -";
		String[] temp = {};
		String test2 = "憎悪と醜悪の花束 NEW! SECRET! t+pazolite 5 7 8 10 10";

		test2.replace("-", "").trim();

		if (test.contains("2000")) {

			temp = test.split(" ");
			// for (int i = 0; i < temp.length; i++) {
			// System.out.println(temp[i]);
			// }
		} else {
			System.out.println("2000 시리즈곡 x");

		}

		List<String> difficulty = new ArrayList<String>();

		for (int i = test2.length() - 1; i >= 0; i--) {

			difficulty.add(Character.toString(test2.charAt(i)));

			System.out.println(test2.charAt(i));
			if (i == test2.length() - 11) {

				break;
			}
		}

		difficulty.forEach(item -> System.out.println("난이도!!!" + item));
		StringBuffer sb = new StringBuffer(String.join("", difficulty));
		String difficult = sb.reverse().toString();
		System.out.println("reverse!!!!" + difficult);
		System.out.println("test2===>"
				+ test2.replace(difficult, "").replace("NEW!", "").replace("-", "").replace("SECRET!", "").trim());
		
	}
}
		
