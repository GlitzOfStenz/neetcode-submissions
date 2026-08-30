class Solution {
    private boolean isPali(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        String[] str = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        int n = str.length;
        for(int i=0;i<n;i++){
            String temp = str[i];
            for(int j=0;j<temp.length();j++){
                if(Character.isLetter(temp.charAt(j)) || Character.isDigit(temp.charAt(j))){
                    sb.append(Character.toLowerCase(temp.charAt(j)));
                }
            }
        }
        return isPali(sb.toString());
    }
}
