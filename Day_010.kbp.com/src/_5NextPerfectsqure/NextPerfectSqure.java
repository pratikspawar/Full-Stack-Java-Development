package _5NextPerfectsqure;

public class NextPerfectSqure {
 public static int NextPerfectSqure(int num ){
	double c=Math.sqrt(num);
	if(c%1==0) {
		num= (int) ((c+1)*(c+1));
		}
	else {
		num=-1;
	}
	return num;
	}
 
}
