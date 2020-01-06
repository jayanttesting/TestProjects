package Parsing;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class dataparsing {
	
public static List<String>  readusingfilereader(String filename) throws IOException
{
	File file = new File(filename);
	FileReader fr = new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	String line;
	System.out.println("Reading text file using filereader");
	List<String> str = new ArrayList<>();
	while((line = br.readLine())!=null)
	{
		
		str.add(line); 
	}
	br.close();
	return str;
	}

@SuppressWarnings("static-access")
public static void main(String[] args) throws IOException {
	dataparsing parse = new dataparsing();
	List<String> resultlist = parse.readusingfilereader("C:/Users/jgupta/Desktop/Automationdata/testdata.txt");
	System.out.println("Below is the parsed data" +" "+ resultlist);
	resultlist.get(1);
	resultlist.get(2);
//	String jayant = "C:/Users/jgupta/Desktop/Automationdata/testdata.txt";
//	System.out.println(parse.readusingfilereader(jayant));
	
}

	}

