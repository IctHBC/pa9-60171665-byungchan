/* �̸�:�Ѻ���
 * �й�:60171665
 * ���α׷� ��� ����: Built-in class�� Calendar class�� ������� �ʰ� ����ڷκ��� ��,��,���� �Է¹޾Ƽ� 
 * �޷��� ����� �����ϴ� ���α׷��̴�.
 */
import java.util.Scanner;
public class MyCalendar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] months = new int[] {
			31,28,31,30,31,30,31,31,30,31,30,31
	};
	char weekday[] = {'��','��','ȭ','��','��','��','��'};
	int y, m, d, leep,week,i;
	do {
		System.out.println("������ �Է��ϼ���:");
		y=sc.nextInt();
	}while(y<0);
	do {
		System.out.println("���� �Է��ϼ���:");
		m=sc.nextInt();
	}while(m<1 || m>12);

	do {
		System.out.println("���� �Է��ϼ���:");
		d=sc.nextInt();
	}while(d<1 || d>31);
        if (y%4==0&& y%100 !=0|| y%400 ==0);
        months[1] =29;
        leep = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
        int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;
        
        for(i=0; i<m-1;i++) {
        	leep = leep+months[i];
        }
        leep += d;
        week = leep%7;
        System.out.printf("%d�� %d�� %d���̰�,������ %c�����Դϴ�. \n",y,m,d,weekday[week]);
}
}