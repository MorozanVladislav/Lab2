public class Clasa8{
	static int cmmdc(int m,int n)
	{
		while(m!=n)
			if(m>n)
				m-=n;
			else
				n-=m;
			return m;
	}
	public static void main(String[] args){
		int m=Integer.parseInt(cin.Token());
		int n=Integer.parseInt(cin.Token());
		int cm=cmmdc(m,n);
		System.out.System.out.println(cm);
	}
}