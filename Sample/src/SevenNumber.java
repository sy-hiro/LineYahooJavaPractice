
public class SevenNumber {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i <= 100; i++) {
			if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.println("crap");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
