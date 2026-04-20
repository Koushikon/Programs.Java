//This program copy the texts from one file to another...
class Textcopy
{
	public static void main(String []args)
	{
		FILE *f1,*f2;
		char c;
		System.out.println("Data input");
		f1=fopen("radhe.txt","w");
		while((c==get char())!=EOF)
			putc(c,f1);
		fclose(f1);
		f1=fopen("radhe.txt","r");
		f2=fopen("output.txt","w");
		while((c==get char(f1))!=EOF)
			putc(c,f2);
		fclose(f1);
		fclose(f2);
		System.out.print("Data output from copied file is...\n");
		f2=fopen("output.txt","r");
		while((c==get char(f2))!=EOF)
			System.out.print(c);
		fclose(f2);
	}
}