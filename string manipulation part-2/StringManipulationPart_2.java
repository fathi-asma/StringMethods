package stringPart2;


import java.util.Scanner;
import java.util.ArrayList;

    public class StringManipulationPart_2 {

        //method to slice a string
        public static String slice(String value,int start,int end,int step){
            String result=" ";
            for (int i = start; i < end; i+=step){
                result+=value.charAt(i);
            }
            return result;

        }

        // method to get all indices of a character
        public static ArrayList<Integer> getIndices(String value,char find){
            ArrayList<Integer>indices = new ArrayList<>();
            for (int i =0; i < value.length(); i++) {
                if (value.charAt(i) == find){
                    indices.add(i);
                }
            }
            return indices;
        }

        //main method
        public static void main(String[] args){
            Scanner input=new Scanner (System.in);

            System.out.print("Enter a String: ");
            String enterString=input.nextLine();

            System.out.print("Enter start index: ");
            int startIndex=input.nextInt();

            System.out.print("Enter the last index: ");
            int EndIndex=input.nextInt();

            System.out.print("Enter step value: ");
            int step = input.nextInt();

            System.out.print("Enter the character to find: ");
            char finder=input.next().charAt(0);

            System.out.println();

            String sliceString = slice(enterString,startIndex,EndIndex,step);
            System.out.println("slices String:"+sliceString);

            ArrayList<Integer> indices = getIndices(enterString, finder);
            System.out.println("Indices of '" + finder + "': " + indices);


        }




    }




