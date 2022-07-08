package dateModules;

public class Date
{
	private int dd;
	private int mm;
	private int yy;
	
	public Date()
	{
		super();
		dd=0;
		mm=0;
		yy=0;
	}

	public Date(int dd, int mm, int yy)
	{
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void showDate(String str)
	{
		System.out.println("The date is "+dd+str+mm+str+yy);
		System.out.println();
	}
}