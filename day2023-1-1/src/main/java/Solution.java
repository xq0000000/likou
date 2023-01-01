class Solution {
    public static char repeatedCharacter(String s) {
        char[] a = new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            int j;
            for ( j = i+1; j <s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    a[j]=s.charAt(j);
                    break;
                }
            }
        }
        int k;
        for (k = 0; k < a.length; k++) {
            if(a[k]!=0){
                break;
            }
        }
        return a[k];
    }

    public static void main(String[] args) {
        String s="abcdd";
        System.out.println(repeatedCharacter(s));
    }
}
