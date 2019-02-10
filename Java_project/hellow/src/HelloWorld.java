
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meraj Ali
 */
public class HelloWorld {
    
    public static void main (String[] agrs){
        
    String colors[] = {"Violate", "Blue", "Cyan", "Green", "Yellow", "Orange", "Red"};
		int i=0;
		while(i<7)
		{
			System.out.print(colors[i]);
			if(i<6)
			//System.out.print(", ");
			i++;
		}

    }
}
