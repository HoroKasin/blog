package Logical;

public class LogicalExample1 {

	public static void main(String[] args) {

		//���� Ÿ���� ������ ������ ���� �޸�(,)�� ������ ����
		int x = 10, y = 20;
		
		//if�ڿ� ���ǽ��� ����� true�� if ��� ������ �ڵ带 ����
		//false�� else��� ������ �ڵ带 ����
		
		if((x != 10) & (++y ==21)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("x:>" + x + ", y:>" + y);
	}

}
