class Solution {
    public boolean isValid(String s) {
        
        int i=-1;
        char[] ch= new char[s.length()];
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                ch[++i]=c;
            }
            else{
                if(i>=0 && ((ch[i]=='(' && c==')')
                || (ch[i]=='[' && c==']')
                || (ch[i]=='{' && c=='}'))){
                    i--;
                }
                else{
                    return false;
                }
            }
        }
        return i==-1;
    }
}
