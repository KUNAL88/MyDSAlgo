package com.kunal.java.question;

public class CompareVersionNum {

    public static void main(String[] args) {

        String version1="4444371174137455";
        String version2="5.168";
        System.out.println(new CompareVersionNum().compareVersion(version1,version2));
    }

    public int compareVersion(String A, String B) {

        String[] atemp=A.split("\\.");
        String[] btemp=B.split("\\.");
        int result=0;
        if(atemp.length==btemp.length){
            result= getResult(atemp,btemp,atemp.length);
        }else if(atemp.length>btemp.length){
            result=getResult(atemp,btemp,btemp.length);
            if(result==0){
                for(int i=btemp.length;i<atemp.length;i++){
                    result=Integer.parseInt(atemp[i]);
                    if(result>0){
                        result=1;
                        break;
                    }
                }
            }
        }else {

            result = getResult(atemp,btemp,  atemp.length);
            if (result == 0) {
                for (int i = atemp.length; i < btemp.length; i++) {
                    result = Integer.parseInt(btemp[i]);
                    if (result > 0) {
                        result = -1;
                        break;
                    }
                }
            }

        }

        return result;
    }


    private int getResult(String[] version1,String[] version2,int limit){

        int result=0;
        for(int i=0;i<limit;i++){

            if(Integer.parseInt(version1[i])>Integer.parseInt(version2[i])){
                result=1;
                break;
            }

            if(Integer.parseInt(version1[i])<Integer.parseInt(version2[i])){
                result=-1;
                break;
            }

        }

        return result;
    }
}
