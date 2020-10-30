package lol;
import java.util.*;
public class convert{
	
	public static void main(String[] args) {
		
		Scanner cn=new Scanner(System.in);
		int tm=cn.nextInt(); // tm shows no. of minutes.
		int y,d,rtm; //Here y shows year, d shows day, rtm shows remaining minutes.
		y=tm/525600;
		rtm=tm%525600;
		d=rtm/1440;
		System.out.println(tm+" minutes is approximately " + y +" years and " + d +" days");
		
		
	}
}