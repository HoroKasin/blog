package EnhancedForLoop;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] week = {"��", "��", "ȭ", 
				"��", "��", "��", "��"};
		
		for(String day : week) {
			System.out.println(day + "����");
		}
		
		System.out.println("---------------------");
		
		int[] scores = {95, 71, 84, 99, 83};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("���� ����: " + sum + "��");
		
		double avg = (double)sum / scores.length;
		System.out.println("���� ���: " + avg + "��");

	}

}
