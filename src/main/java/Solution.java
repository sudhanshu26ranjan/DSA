public class Solution {
    public void printPermutation(String prefix, String s){
        if(s.length() == 0){
            System.out.println(prefix);return;
        }
        for(int i=0; i<s.length();i++){
            prefix = prefix+(s.charAt(i));
            String rem = s.substring(0,i)+s.substring(i+1,s.length());
            printPermutation(prefix,rem);
            prefix = prefix.substring(0,prefix.length()-1);
        }
    }
    public static void main(String[] args)throws InterruptedException{
        Solution obj = new Solution();
        obj.printPermutation("","abc");
    }
}
