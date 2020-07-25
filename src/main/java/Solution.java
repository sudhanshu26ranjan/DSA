public class Solution {
    public void printPermutation(String prefix, String s){
        if(s.length() == 0){
            System.out.println(prefix);return;
        }
        for(int i=0; i<s.length();i++){
            prefix = prefix+(s.charAt(i));
            String rem = s.substring(0,i)+s.substring(i+1,s.length());
            printPermutation(prefix,rem);
//            s = s.substring(0,i+1)+s.substring(i+1,s.length());
            prefix = prefix.substring(0,prefix.length()-1);
        }
    }
    public static void main(String[] args)throws InterruptedException{
//        Thread.sleep(10000);
//        System.out.println("Starting our application...");
//        int i;
//        for(i=-3; i!=0; i--);
//        System.out.println(i);
//        System.out.println("Terminating our application...");
        Solution obj = new Solution();
        obj.printPermutation("","abc");
    }
}
