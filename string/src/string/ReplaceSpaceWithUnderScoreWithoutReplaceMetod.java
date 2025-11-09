package string;

import java.util.Scanner;
class ReplaceSpaceWithUnderScoreWithoutReplaceMetod{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
        		System.out.print("Enter string: ");
			String s=sc.nextLine();
			String result=replaceSpaceWithUnderScoreWithoutReplaceMetod(s);
			System.out.println(result);
			sc.close();
      	}
	public static String replaceSpaceWithUnderScoreWithoutReplaceMetod(String s){
			if(s==null)
				return null;
			StringBuilder sb=new StringBuilder("");
			for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c==' ')
				sb.append('_');
			else
				sb.append(c);
			}
		return sb.toString();		
	}
} 
