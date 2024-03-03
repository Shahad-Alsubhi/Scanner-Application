import java.io.*;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Scanner {
	public static void main(String[] args) throws IOException {
		 
            File  ft= new File("TrueCode.txt");
           // File  ft= new File("FalseCode.txt");
          
            BufferedReader br=new BufferedReader(new FileReader(ft));
            String g; int i=0;
            while ((g= br.readLine())!= null) {
            	String[] oneline=g.split(" ");
            	int x=oneline.length;
            	i++;
            	for(int v=0;v<x;v++) {
            		if(isoperation(oneline[v]))
            			System.out.println("<"+"operation,"+oneline[v]+">");
            		else if(isLogicalOp(oneline[v]))
            			System.out.println("<"+"Logic operation,"+oneline[v]+" >");
            		else if(isKeyword(oneline[v]))	
            			System.out.println("<"+"keyword,"+oneline[v]+">");
            		else if(isinteger(oneline[v]))
            			System.out.println("<"+"integer,"+oneline[v]+">");
            		else if(identifier(oneline[v]))	
            			System.out.println("<"+"identifier,"+oneline[v]+">");
            		else if(comment(oneline[v]))
            			System.out.println("<"+"comment,"+oneline[v]+">");
            		else
            			System.out.println("error in line "+i+" ,"+ oneline[v]+" not allowed");
            			
            			
            			
            			
            	}
            }
		
		
		
		
		}
	
		//operation
		static boolean isoperation(String g) 
		{
		String[] operationArray= {"+","-","/","*"} ;
		if(operationArray[0].equals(g) || operationArray[1].equals(g) 
				|| operationArray[2].equals(g) ||operationArray[3].equals(g)) {
			return true;}
		else
			{return false;}
		
		}
		
		//logical operation
		static boolean isLogicalOp(String g) 
		{
			String[] LogOpArray= {"||","&&","==","!=",">","<"};
			if(LogOpArray[0].equals(g) || LogOpArray[1].equals(g) ||LogOpArray[2].equals(g)
					||LogOpArray[3].equals(g)||LogOpArray[4].equals(g)||LogOpArray[5].equals(g)) 
			{
				return true;}
			else
				{return false;}
		}	
			
		
		//keyword
		static boolean isKeyword(String g) {
			String[] keywords= {"for","do","if","while","else","int"};
			if(keywords[0].equals(g) || keywords[1].equals(g) ||keywords[2].equals(g)
					||keywords[3].equals(g)||keywords[4].equals(g)||keywords[5].equals(g)) 
			{
				return true;}
			else
				{return false;}
		}
			
		
		static boolean isinteger(String g) {
			
			String intg="0|[1-9][0-9]*";
			
			return (Pattern.matches(intg, g));
		}
		
		
		
		static boolean identifier(String g) {
             String    idRE="[a-zA-Z][0-9|a-zA-Z]*";			
			return(Pattern.matches(idRE, g));
			
		}
	
		
	static boolean comment(String g) {
		String co="//[0-9|a-zA-z]*";
		return(Pattern.matches(co, g));
	}

}
