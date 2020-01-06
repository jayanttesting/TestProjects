import java.util.HashSet;

public class abstarctclass
{
public static void main(String[] args) {
	
	int[] a = {1,2,2,54,4,4,69,87};
	int[] temp = new int[a.length];

int j=0;


for(int i =0;i<a.length-1;i++)
{
	if(a[i]!=a[i+1])
	{
		temp[j]=a[i];
		j++;
	}
	temp[j]=a[a.length-1];
	for(i=0;i<temp.length;i++)
	{
		System.out.println(temp[i]);
	}
}
}

//unsorted array
public static void main1(String[] args) {
	
	int[] arrayunsorted = {1,56,25,48,15};
	
	HashSet<Integer> hs = new HashSet<>();
	
	for(int i=0;i<arrayunsorted.length;i++)
	{
		hs.add(arrayunsorted[i]);
		
	}
	for(int unarray:hs)
	{
		System.out.println("this is my unsorted array" +" "+ unarray);
	}
}
// print first duplicate element


	public static void main3(String[] args) {
		int[] a = {1,3,5,2,6,8,8,5};
	int temp=0;
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println("first duplicate element"+" "+a[i]);
				temp=temp+1;
				break;
			}
		}
		if(temp>0)
		{
			break;
		}
	}
	}
// Print first duplocate element in array collection


public static void main5(String[] args) {

int[] a = {1,5,8,9,5,7,4};
int temp=-1;
HashSet<Integer> hs = new HashSet<>();
for(int i=a.length-1;i>=0;i--)
{
	if(hs.contains(a[i]))
	{
		temp=i;
	}
	else
	{
		hs.add(a[i]);
	}
	}
if(temp!=-1)
{
	System.out.println("First duplicat elemnt is"+" "+a[temp]);
}
else
{
	System.out.println("no duplicate element present in list");
	}
	}

//Swapping of numbers and find largset int in array

public static void main6(String[] args) {
	
	
	int[] a = {1,23,5,8,10,67,56};
	int temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
			}
		}
	System.out.println("Second largest element"+" "+a[1]);
	}





// Using xor and find single elemnt in array


public static void main8(String[] args) {
int[] a = {1,1,5,5,2,4,4};
 int result = a[0];
 
for(int i=1;i<a.length;i++)
{
	result = result^a[i];
	}
System.out.println("Single elemnent is"+result);

}


// insert element in an array

public static void main10(String[] args) {
int[] a = {1,2,65,8,9};

int pos = 3;
int element = 100;

for(int i=a.length-1;i>pos-1;i--)
{
	a[i]=a[i-1];
	
	}
a[pos-1] = element;
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
	}
}
}
















		
	

