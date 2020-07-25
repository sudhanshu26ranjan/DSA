/*
    Problem :
    ---------
    Write a program to print all permutations of a given string
    Ex :
    -----
    Below are the permutations of string ABC.
    ABC ACB BAC BCA CBA CAB
 */

class Solution {
    public void printPermutation(String prefix, String str){
        if(str.length() == 0){
            System.out.println(prefix);
            return;
        }
        for(int i=0; i<str.length(); i++){
            prefix = prefix+str.charAt(i);
            printPermutation(prefix,str.substring(0,i)+str.substring(i+1,str.length()));
            prefix = prefix.substring(0,prefix.length()-1);
        }
    }
    public void printUniquePermutation(String str ){
        printPermutation("",str);
    }
    public static void main(String[] args){
        new Solution().printUniquePermutation("abc");
    }
}
