class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length()%2==1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }

                char top = st.peek();{
                    if(s.charAt(i)==')' && top != '('){
                        return false;
                    }else if(s.charAt(i)=='}'&& top != '{'){
                        return false;
                    }else if(s.charAt(i)==']'&& top != '['){
                        return false;
                    }else{
                        st.pop();
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}