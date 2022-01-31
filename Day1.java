import java.util.*;
public class Day1{

  public static  void main(String [] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter user Name:");
	  String s=sc.nextLine();
	  System.out.println("Enter 5 tasks:");
      List<String> li=new ArrayList<>(5);
	  for (int i=0;i<5;i++) {
		  li.add(sc.nextLine());
	  }
	  System.out.println("User Name is: "+s);
	  for (int i = 0; i <5;i++) {
		  System.out.println("Value in task "  +(i+1)+ " is: "+li.get(i));	
	}
	  
	 Collections.sort( li);
	 System.out.println("Tasks in Increasing order: "+li);
	 Collections.sort(li,Collections.reverseOrder());
	 System.out.println("Tasks in decreasing order: "+li);
	 Set<String> ls=new TreeSet<>();
	 for (int i = 0; i <li.size(); i++) {
		 if(i<li.size()-1) {
			if(li.get(i).equals(li.get(i+1)))
		        ls.add(li.get(i));
		}
	 }
	 System.out.println("Repeated tasks: "+ls);
  }
}