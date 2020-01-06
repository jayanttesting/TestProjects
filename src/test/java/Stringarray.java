
public class Stringarray {

	public static void findduplicatearray(int[] inputarray)
			{
		for(int i=0;i<inputarray.length;i++)
		{
			for(int j=i+1;j<inputarray.length;j++)
			{
				if(inputarray[i]==inputarray[j])
				{
					System.out.println("Duplicatearray"+inputarray);
				}
			}
		}
	}

}
