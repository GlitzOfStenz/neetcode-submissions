class Solution {
    private boolean isPalin(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
        i++;
    }
     while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
        j--;
    }
if (Character.toLowerCase(str.charAt(i)) !=
        Character.toLowerCase(str.charAt(j))) {
        return false;
    }

    i++;
    j--;
        }
        return true;
    }
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
        return isPalin(s);
    }
}
