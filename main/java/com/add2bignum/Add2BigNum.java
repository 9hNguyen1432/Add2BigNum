/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.add2bignum;

/**
 *
 * @author Lenovo
 */
public class Add2BigNum {
    public static String sum(String stn1, String stn2){
        // bien nho
        boolean rememberVar = false;

//        stn1 = new StringBuilder(stn1).reverse().toString();
//        stn2 = new StringBuilder(stn2).reverse().toString();
        // do dai 2 so
        int len1 = stn1.length();
        int len2 = stn2.length();
        // them ky tu 0 de cung do dai, them du 1 so 0 cho truong hop tran so
        if (len1 > len2){
            stn1 = "0" + stn1;
            stn2 = "0".repeat(len1-len2+1) + stn2;
        }
        else {
            stn2 = "0" + stn2;
            stn1 = "0".repeat(len2-len1+1) + stn1;
        }
        
        int continueLoop = stn1.length();
        String result = "";
        while (continueLoop > 0){
            continueLoop--;
 
            int temp = (int)((stn1.charAt(continueLoop) - '0') + (stn2.charAt(continueLoop)-'0')) 
                    + (rememberVar?1:0);
            rememberVar = false;
            if (temp>=10){
                temp = temp -10;
                rememberVar = true;
            }
            result = Integer.toString(temp) + result;
        }
        
        if(result.charAt(0)=='0'){
            result = result.substring(1);
        }
        return result;
        
    }
    
    public static void main(String[] args) {
        String s1 = "90";
        String s2 = "9";
        String str = sum(s1, s2);
        System.out.println(s1 +"+" + s2 +"="+str );
    }

}

