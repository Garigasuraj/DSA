import java.util.*;

class valid_parentheses {
    static boolean check(String str){
        Stack<Character> obj = new Stack<Character>();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                obj.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}'){
                if(obj.empty())
                return false;
                
                Character element = obj.pop();
                
                if(element == '('){
                    if(str.charAt(i) != ')')
                    return false;
                }
                if(element == '['){
                    if(str.charAt(i) != ']')
                    return false;
                    
                }
                if(element == '{'){
                    if(str.charAt(i) != '}')
                    return false;
                    
                }
            }
        }
        if(!obj.empty())
        return false;
        return true;
    }
	public static void main (String[] args) {
	    Scanner Sc = new Scanner(System.in);
	    String str = Sc.next();
	    
		System.out.println(check(str));
	}
}
