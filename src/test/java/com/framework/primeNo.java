package com.framework;

public class primeNo {

    public static void main(String [] args){
        String str ="My name is Chirag";
        char[] charArr =str.toLowerCase().toCharArray();
        int[] freq = new int[str.length()];
        for(int i=0; i<str.length();i++){
            freq[i]=1;

            for(int j=i+1;j<str.length();j++){
                if(charArr[i]==charArr[j]){
                    freq[i]++;
                    charArr[j]='0';
                }
            }
        }

        System.out.println("****************");
        for(int k=0; k<freq.length;k++){
            if(charArr[k]!=' ' && charArr[k]!='0'){
                System.out.println(charArr[k]+" ---- "+freq[k]);
            }
        }
    }
}
