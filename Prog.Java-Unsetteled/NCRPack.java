package Facts;
public class NCRPack
{
	public int fact(int n)
	{
		int fact=1;
		for(int i=2;i<=n;i++)
			fact=fact*i;
		return(fact);
	}
}