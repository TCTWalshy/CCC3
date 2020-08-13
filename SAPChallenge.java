public class SAPChallenge {
	
	private static void removeJoiner(String emoji) {
		System.out.println(emoji.replace("\u200D", ""));
	}
	
	private static void addJoiner(String emojis) {
		String joinedValues = "";
		for (int i = 0; i < emojis.length(); i++) {
			if (i % 2 == 0 && i > 0 ) {
				joinedValues += "\u200D";
			}
			joinedValues += emojis.charAt(i);
		}
		
		System.out.println(joinedValues);
	}
	
	
	public static void main(String args[]) {
		removeJoiner("👩‍💻");
		removeJoiner("‍👨‍👩‍👧‍👦");
		
		addJoiner("👩💻");
		addJoiner("👨👧");
	}
}
