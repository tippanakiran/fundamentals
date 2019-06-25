package kiranreddy;

public class Test19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,j=0,num=Integer.parseInt(args[0]);
		
		for(i=0;i<num;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
