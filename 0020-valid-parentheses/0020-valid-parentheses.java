class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(') st.push(')');
            else if(ch=='{') st.push('}');
            else if(ch=='[') st.push(']');
            else if(st.isEmpty() || st.pop()!=ch) return false;
        }

        return st.isEmpty();


        // Stack<Character> st = new Stack<>();
        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     //opening
        //     if(ch == '(' ||  ch=='{' || ch=='[') st.push(ch);
        //     else{
        //         if(st.isEmpty()) return false;
        //         //closing
        //         else if((ch==')' && st.peek()=='(') || 
        //                 (ch=='}' && st.peek()=='{') ||
        //                 (ch==']' && st.peek()=='[')){
        //                     st.pop();
        //                 }
        //         else return false;
        //     }
        // }
        //     return st.isEmpty();
    }
}