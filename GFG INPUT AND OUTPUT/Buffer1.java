
import java.io.*;

class Buffer1 {
	public static void main(String[] args)
		throws IOException
	{
		
		BufferedReader bfn = new BufferedReader(
			new InputStreamReader(System.in));

		// String reading internally
		String str = bfn.readLine();

		// Integer reading internally
		int it = Integer.parseInt(bfn.readLine());

		// Printing String
		System.out.println("Entered String : " + str);

		// Printing Integer
		System.out.println("Entered Integer : " + it);
	}
}

    
