// GFG
class Solution{
    String modify(String s){
        
        if(Character.isLowerCase(s.charAt(0))){
            s = s.toLowerCase();
        }else if(Character.isUpperCase(s.charAt(0))){
             s = s.toUpperCase();
        }
        
        return s;
    }
}

// Solution 2

class Solution2{
    String modify(String s){
        
        StringBuilder sb = new StringBuilder("");
        
        boolean isLowerCase = true;
        if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'){
            isLowerCase = false;
        }
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' &&  ch <= 'Z' && isLowerCase == true){
                 ch = (char)(ch + 32);
            }else if(ch >= 'a' && ch <= 'z' && isLowerCase == false){
                ch = (char)(ch - 32);
            }
            
            sb.append(ch);
        }
        
        return sb.toString();
    }
}

