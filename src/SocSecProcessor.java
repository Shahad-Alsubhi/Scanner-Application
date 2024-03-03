import java.util.Scanner;

public class SocSecProcessor {
	 public static void main(String[] args)
	   {
		 String name,ssn,cont;
		 do {
		 
		 Scanner k=new Scanner(System.in);
		 System.out.println("name:");
		 name=k.next();
		 System.out.println("ssn:");
		 ssn=k.next();
		 
		 
		 
		
		 try {
		    throw new SocSecException("kk");
			//isvalid(ssn);+name
			//System.out.println("name: ");
			 //System.out.println("ssn: "+ssn);
			
		 }
		 catch(SocSecException e) {
			 System.out.println(e.getMessage());
			 System.out.println("name: "+name);
				System.out.println("ssn: "+ssn);
		 }
		 System.out.println("again? :");
		 cont=k.next();
	   }
		 while (cont.equals("yes"));
	 }
	 public static boolean isvalid(String ssn) throws SocSecException {
		 char[] a=ssn.toCharArray();
		 
		 if(ssn.length()!=11) {
			
			throw new SocSecException("wrong number ofcharacters");
			
			
		 }
		 else if( !( ( Character.toString(a[3]) ).equals("-") ) ){
			
			 throw new SocSecException("Dashes in the wrong spots.");
			 
				 	
		
		 }
		 else if( ! ( (Character.toString(a[6])).equals("-") ) ){
				
			 throw new SocSecException("Dashes in the wrong spots.");
			 
			
		 }
		 
		 else {
			return  true;
		 }
		 
	 }

}
