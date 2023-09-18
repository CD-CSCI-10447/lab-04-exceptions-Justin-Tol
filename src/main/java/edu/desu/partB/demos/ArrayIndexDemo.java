package edu.desu.partB.demos;

public class ArrayIndexDemo {

    public static void main(String args[])
    {
        try {
            int[] nums = {1, 2, 3};
            nums[3] = 10;
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Sorry could not process");
        }

    }

}