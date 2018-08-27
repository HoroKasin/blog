package While_.Basic;

public class WhileQuiz {

	public static void main(String[] args) {
		//출석 체크 하는 출력명령을 만들기 ;; 1 ~ 10번
		
		int student = 1;
		
		while(student <= 10) {
			System.out.println(student + "번 학생의 출석을 체크합니다.");
			
			student++;
		}
	}

}
