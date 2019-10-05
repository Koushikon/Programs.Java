class Salaryshow  //Employees Salary Statement
{
	public static void main(String args[])
		{
			long basic=11000,da,hra,medi=300,net,ptax,gross,pf=700;
			System.out.println("Basic Pay :"+basic);
			
			da=basic*85/100;
			System.out.println("Dearness Allownces :"+da);	
			
			hra=basic*15/100;
			System.out.println("Home Rent Allownces :"+hra);
			
			System.out.println("Medical Pay :"+medi);
			
			gross=basic+da+hra+medi;
			System.out.println("Gross Pay :"+gross);
			
			System.out.println("Provident Fund :"+pf);
			
			if(gross>60000)
					ptax=800;
				else
					if(gross>50000)
						ptax=500;
					else
						if(gross>35000)
							ptax=400;
						else
							ptax=300;
			System.out.println("Professional Tax :"+ptax);
		
			net=gross-pf-ptax;
			System.out.println("Net Ammount :"+net);
		}
}