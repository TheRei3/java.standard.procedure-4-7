package ex4no7;

import java.util.Scanner;

public class ex4no7 {   // 150p
	public static void main(String[] args) {
		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int)(Math.random() * 3)+1;
		
		System.out.println("����� " + user + "�Դϴ�.");
		System.out.println("���� " + com + "�Դϴ�.");
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0: 
			System.out.println("�����ϴ�.");
			break;	
		}
	}

}
