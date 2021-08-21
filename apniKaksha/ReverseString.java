package apniKaksha;
// the sky is blue

//blue is sky the
class Solution
{
	
	public String reversewords(String s)
	{
		int i = s.length()-1;
		String ans ="";  //empty string
		
		while(i>=0)
		{
			while(i>=0&&s.charAt(i)==' ')
				i--;
			int j=i;
			if(i<0)
				break;
			while(i>=0&&s.charAt(i)!=' ')	
				i--;
			if(ans.isEmpty())
			{
				ans=ans.concat(s.substring(i+1,j+1));
			}
			else
			{
				ans=ans.concat(" "+s.substring(i+1,j+1));
			}
		}
		System.out.println(ans);
		return ans;
		
	}
	
	
}
public class ReverseString {

	public static void main(String[] args) {
		Solution obj= new Solution();
		obj.reversewords("the sky is blue");
		
        
	}

}
