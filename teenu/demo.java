package com.shivam.practice.teenu;

public class demo {
    public static void main(String[] args) {
        String st="[]][{}";
        if(isvalid("",st))
            System.out.println("valid");
        else
            System.out.println("not valid");

    }

    static boolean isvalid(String p,String up)
    {
        if(up.length()==0)
        {
            if (p.length()==0){

                return true;
            }

            else {

                return false;
            }
        }

        char ch=up.charAt(0);
        int l=p.length()-1;

        if(ch=='['|| ch=='{')  //  [   \\  {
        {
            return isvalid(p+ch,up.substring(1));
        }
        else if (ch==']')
        {
            if(l==-1)
                return isvalid(p+ch,up.substring(1));
            else if (p.charAt(l)=='[')   // [{][][ [
                return isvalid(p.substring(0,l),up.substring(1));
            else
                return isvalid(p+ch,up.substring(1));
        }
        else if (ch=='}')
        {
            if(l==-1)
                return isvalid(p+ch,up.substring(1));
            else if (p.charAt(l)=='{')   // [{][][ [
                return isvalid(p.substring(0,l),up.substring(1));
            else
                return isvalid(p+ch,up.substring(1));
        }
        else
            return isvalid(p+ch,up.substring(1));


    }

}
