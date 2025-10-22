package se.lexicon;


import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
            StringArray();
            IntArray();
        ExpandingArray();
        MergedArray();
        twoDimensionalArray();
        int[] numbers={10,20,50,80,30};
        int result=FindingMaxNumber(numbers);
    }

    public static void StringArray(){
        String[] newString=new String[2];
        System.out.println(newString.length);
        newString[0]="Sindhuja";
        newString[newString.length-1]="Parthasarathy";
        System.out.println(newString[0]);
        System.out.println(newString[1]);

    }

    public static void IntArray(){
        int[] numArray={1,6,0,2,9,1};

        //Traditional For loop
        for(int i=0;i< numArray.length;i++){
            if(i==1){
                numArray[i]=5;
            }
            System.out.println("the numbers "+ i +" in the arrays are " +numArray[i]);
        }

        //Enhanced loop
        for(int number:numArray){
            if(number==0) number=1000;
            System.out.println(number);
        }

        for(int numbers:numArray){
            System.out.println(numbers); //display the array that has been declared first.
        }
    }

    public static void ExpandingArray(){
        int[] orgArray={4,5,8,7,6};
        System.out.println("The Original array:");
        for(int i:orgArray){
            System.out.println(i);
        }

        /// Adding a new array
        int[] newArray=new int[orgArray.length + 1];
        for(int i=0;i< orgArray.length;i++){
            newArray[i]=orgArray[i];
        }
        newArray[newArray.length-1]=9;
        System.out.println("The new Array:");
        for(int i:newArray){
            System.out.println(i);
        }
    }

    public static int FindingMaxNumber(int[] numbers){
        if(numbers.length==0) throw new IllegalArgumentException("The Array is empty");
        int maxNumber=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] >maxNumber) maxNumber=numbers[i];
        }

        System.out.println("The maximum number is "+ maxNumber);
        return maxNumber;
    }

    public static void MergedArray(){
        String[] array1={"banana","orange","pears"};
        String[] array2={"apple","strawberry","blueberry"};

        int mergedLenth= array1.length+ array2.length;
        String[] mergedArray=new String[mergedLenth];

        //copying the arrays to the merged array
        for(int i=0;i< array1.length;i++){
            mergedArray[i]=array1[i];
        }

        for(int i=0;i< array2.length;i++){
            mergedArray[array1.length+i]=array2[i];
        }

        System.out.println("The merged array is "+ Arrays.toString(mergedArray));
    }

    public static void twoDimensionalArray(){
        String[][] board=new String[3][3]; //3 columns and 3 rows

        //First array is row and the second array is the column
        board[0][0]="O";
        board[0][1]="X";
        board[0][2]="O";

        board[1][0]="X";
        board[1][1]="O";
        board[1][2]="X";

        board[2][0]="X";
        board[2][1]="X";
        board[2][2]="O";

        //Nested loop
        //Outer loop for each row
        for(int i=0;i< board.length;i++){
            //inner loop for each column of the current row
            for(int j=0;j< board.length;j++){
                System.out.println(board[i][j]+"\t");
            }
        }

        System.out.println("\n");

    }

}


