#include <stdio.h>
/*
scanf()
- scanf("�Է¼��Ĺ���", �Է���ġ(�ּ�));
  scanf_s("�Է¼��Ĺ���", �Է���ġ(�ּ�), �Է����ũ��(byte));
  - SDL �˻� ���ÿ��� scanf_s() �� ����ؼ� �ڵ带 �ۼ��ؾ� �Ѵ�
  - ���������� �Է¿��� �Է����ũ�⸦ �������� �ʾƵ� �ȴ�
    ����, ���ڿ��� �Է¿��� �Է����ũ�� ���� �� �����ؾ� �Ѵ�
*/
int main() {
	// 1byte �Է�
	//char a;
	//printf("1byte �Է� : ");
	//a = getchar();
	//printf("a : %c\n", a);
	//putchar(a);

	// ���� �Է�
	//int n;
	//printf("���� �Է� : ");
	//scanf("%d", &n);  // �⺻Ÿ��
	//scanf_s("%d", &n);
	//printf("n : %d\n", n);

	// �Ǽ� �Է�
	// - float �� �Ǽ� �Է½ÿ��� ���Ĺ��� '%f' ����ϰ�,
	//   double �� �Ǽ� �Է½ÿ��� ���Ĺ��� '%lf' ����ؾ� �Ѵ�
	//float ff;
	//double dd;
	//printf("�Ǽ� 2�� �Է� : ");
	////scanf("%f%lf", &ff, &dd); // �⺻Ÿ��
	//scanf_s("%f%lf", &ff, &dd);
	//printf("ff : %f, dd : %f\n", ff, dd);

	// ���� �Է�
	//char ch;
	//printf("���� �Է� : ");
	////scanf("%c", &ch); // �⺻Ÿ��
	//while (getchar() != '\n') {}  
	// �ѹ��� �Է� ���� �Ŀ� ���ڰ��� �Է¹������� ���� �ڵ带 �Է¾տ� �ۼ��Ѵ�
	//scanf_s("%c", &ch, 1);
	//printf("ch : %c\n", ch);

	// ���ڿ� �Է�
	// - ���ڿ� �Է½ÿ��� �Է���ġ�� '&'�� ������� �ʾƵ� �ȴ�
	//   �迭�� ��ü�� �ּ��̴�..
	// - ���� �Է��Ҽ� �ִ� ���ڿ��� ũ�� : �Է����ũ�� - 1
	//char word[10];
	//printf("�ܾ� �Է� : ");
	//scanf("%s", word); // �⺻Ÿ��
	//scanf_s("%s", word, sizeof(word));//scanf_s("%s", word, 10);
	//printf("word : %s\n", word);

	//char word2[10];
	//printf("�ܾ� �Է�2 : ");
	//while(getchar()!='\n'){}
	//scanf_s("%s", word2, sizeof(word2));
	//printf("word2 : %s\n", word2);

	// ���� �Է�
	char stn[50];
	printf("���� �Է� : ");
	//gets(stn); 
	gets_s(stn, sizeof(stn));
	printf("stn : %s\n", stn);
	puts(stn);

}