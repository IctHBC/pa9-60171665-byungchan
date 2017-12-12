/* 이름:한병찬
 * 학번:60171665
 * 프로그램 기능 설명: Built-in class인 Calendar class를 사용하지 않고 사용자로부터 년,월,일을 입력받아서 
 * 달력의 기능을 수행하는 프로그램이다.
 */
import java.util.Scanner;
public class MyCalendar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] months = new int[] {
			31,28,31,30,31,30,31,31,30,31,30,31
	};
	char weekday[] = {'일','월','화','수','목','금','토'};
	int y, m, d, leep,week,i;
	do {
		System.out.println("연도를 입력하세요:");
		y=sc.nextInt();
	}while(y<0);
	do {
		System.out.println("월을 입력하세요:");
		m=sc.nextInt();
	}while(m<1 || m>12);

	do {
		System.out.println("일을 입력하세요:");
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
        System.out.printf("%d년 %d월 %d일이고,요일은 %c요일입니다. \n",y,m,d,weekday[week]);
}
}