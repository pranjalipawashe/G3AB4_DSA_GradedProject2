import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class SkyScrapper {
	int floors;
	int flrSize[];
	Scanner sc = new Scanner(System.in);
	
	public void getInformation() {
		
		System.out.println("enter the total no of floors in the building");
		floors = sc.nextInt();
		flrSize = new int[floors];
		int size ;
		
		for(int i =0; i< floors ; i++)
		{
			System.out.println("enter the floor size given on day "+ ++i);
			i--;
			
			size = sc.nextInt();
			if(size > floors)
			{
				System.out.println("floor size is greater than floor count. Floors : " + this.floors +  " try again...");
				i--;
				continue;   
			}
			
			for(int j = 0 ; j < i; j++)
			{
				if(flrSize[j] == size)
				{
					System.out.println("Duplication not allowed.");
				    i--;
				    break;
				}
			}
			flrSize[i] = size;			
		}
		
		for(int i =0 ; i<this.floors;i++)
		{
			System.out.println("Floor sizes :");
			System.out.println(flrSize[i]);
			
		}
		System.out.println();
				
	}
	
	public void assembleFloors() {
	
		PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
		
		int day;
		int lastDay = this.floors;
		int flr = this.floors;
		System.out.println("The order of construction is as follows");
		for(int i = 0; i < this.floors ; i++) {
			day = i+1;
			System.out.println("Day " + day);
			
			if(flr != this.flrSize[i] )  
			{
				System.out.println();
				pq.add(this.flrSize[i]);				
			}
			else
			{	
				System.out.print(this.flrSize[i]); 
			    int a = this.flrSize[i];
			    a--;
			    if(!pq.isEmpty()  )
			    {
			    	if(pq.peek() == a)
			    	{
			    		while(!pq.isEmpty())
			    		{
			    			System.out.print(" "+ pq.peek());
				        	pq.poll();
				        	flr--;
			    		}
			    	} 
			    }
			    flr--;				
			}		
			System.out.println();
		 } 
	}
}
