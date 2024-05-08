
public class IfElseIfSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int score = 59;  //成績
		
//		if (score == 100) {
//			System.out.println("満点です!ご褒美をあげます!");
//		}
//		else if (score >= 80) {  //80点以上
//			System.out.println("よくできました!");
//		}
//		else if (score >= 60) {  //60点以上
//            System.out.println("合格です!");
//		}
//		else {                  //60点未満
//			System.out.println("赤点です...補講を行ないます");
//        }

		
		//60-79点が単なる合格、80-99点がよくできました、100点が満点となる場合
		if (score == 100) {
            System.out.println("満点です！ご褒美をあげます！");
        } 
		else if (score >= 80 && score <= 99) {
            System.out.println("よくできました！");
        } 
        else if (score >= 60 && score <= 79) {
            System.out.println("合格です！");
        } 
        else {
            System.out.println("赤点です...補講を行ないます");
        }
	}
}
