package se.lexicon;

import java.util.Arrays;

public class ArrayUtilExamples {
    public static void main(String[] args){
        SortArray();
        CopyOfArray();
        combinedArray();
    }

    public static void SortArray(){
        String[] names={"Sindhu","adira","prachi","Pradeep"};
        System.out.println("the names are "+ Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("Sorted (Case Sensitive): "+ Arrays.toString(names));
        Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted (Case Insensitive): "+ Arrays.toString(names));

        Arrays.sort(names,String.CASE_INSENSITIVE_ORDER.reversed());
        System.out.println("Sorted (Case Insensitive: Reversed): "+ Arrays.toString(names));
    }

    public static void CopyOfArray(){
        int[] numbers={10,20,30,40};
        //To copy the old array with new Array
        int[] newArray=Arrays.copyOf(numbers,numbers.length+1);

        newArray[newArray.length-1]=50;
        System.out.println("New array using CopyOf:" + Arrays.toString(newArray));

        //Another method
        int[] newArr=new int[numbers.length+1];
        System.arraycopy(numbers,0,newArr,0,numbers.length);

        newArr[newArr.length-1]=60;
        System.out.println("New Array using arraycopy: " + Arrays.toString(newArr));

    }

    public static void combinedArray(){
        String[] strArr1={"Sindhu","Pradeep","Adira","Prachi"};
        String[]  strArr2={"Kapi","Tara"};

        String[] combined=Arrays.copyOf(strArr2,strArr1.length+strArr2.length);
        System.out.println("the combined array: "+Arrays.toString(combined));

        //Loop to copy the elements
        for(int i= strArr2.length, j=0; j<strArr1.length;i++,j++){
               combined[i]=strArr1[j];
        }
        System.out.println("Combined Array: " + Arrays.toString(combined));
    }
}
