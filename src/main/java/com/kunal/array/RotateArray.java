package com.kunal.array;

public class RotateArray {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};

        int d=6;
        int n=a.length;

        if(d>n-2){
            System.out.println(" Array Can not be rotated beyond limit "+(n-2));
            System.exit(0);
        }

        if(d<0){
            System.out.println(" -ve Rotation is not possible ");
            System.exit(0);
        }

        if(d>0){
            int[] temp=new int[d];


            int key=0;

            for(int i=0;i<d;i++){

                key=(i+d)%n;
                temp[i]=a[key];
                a[key]=a[i];
                // a[key]=temp;
            }
            int i=key+1;
            int tempVal;
            while (i>((d-1))){
                key=i%d;
                i=i%n;
                tempVal=a[i];
                a[i]=temp[key];
                temp[key]=tempVal;

                if(d==1 && i==0)
                    break;
                i++;
            }


            for(int x=0;x<d-1;x++){
                key=(i+1)%d;
                if(d>(double)(n/2)){
                    //key=key-2;
                    a[i]=temp[x];
                }else {
                    a[i]=temp[key];
                }

                i++;
            }

        }

        for(int j=0;j<n;j++)
            System.out.print(a[j]+" ");
        }

}
