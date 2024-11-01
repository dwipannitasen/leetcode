class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int count = 0;
        for(char curr : s.toCharArray()){
            if(curr == prev) count++;
            else count=1;

            if(count<=2) sb.append(curr);
            prev=curr;
        }
        //sb.append(s.charAt(0));
        // int freq=1;
        // for(int i=1;i<s.length();i++){
        //     if(s.charAt(i)==s.charAt(i-1))
        //         freq++;
        //     else freq=1;
        //     if(freq<=2) sb.append(s.charAt(i));
                
        // }

        return sb.toString();
    }
}