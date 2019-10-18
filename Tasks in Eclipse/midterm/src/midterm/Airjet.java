package midterm;

import java.io.IOException;

public class Airjet extends except {

	public Airjet( ) throws IOException{

		try {
			throw new IOException();
		} catch (IOException e)
		{
			System.out.println("IOEXception Airjet");
		}
	}

}
