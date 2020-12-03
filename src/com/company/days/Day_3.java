package com.company.days;

import com.company.tools.ReadInputs;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class Day_3 {
    private final List<String> in;
    private Scanner scanner;

    public Day_3(){
        ReadInputs in = new ReadInputs("day3_inputs.txt");
        this.in = in.getInputs();
    }

    public int part1(int row){
        int counter = 0;
        int treeCounter = 0;
        for(String s : in){

            if(s.charAt(counter) == '#'){
                treeCounter++;
            }


            if(in.get(0).length()-1 < counter + row){
                counter = (counter + row) - in.get(0).length();
            }else{
                counter = counter + row;
            }

        }

        return treeCounter;
    }

    public void part2() {
        int int1 = part1(1);
        int int2 = part1(3);
        int int3 = part1(5);
        int int4 = part1(7);

        int counter = 0;
        int treeCounter = 0;
        for (String s : in) {
            if (in.indexOf(s) % 2 == 0) {
                if (s.charAt(counter) == '#') {
                    treeCounter++;
                }
                if (in.get(0).length() - 1 < counter + 1) {
                    counter = (counter + 1) - in.get(0).length();
                } else {
                    counter = counter + 1;
                }
            }
        }

        BigInteger result = new BigInteger(String.valueOf(int1));
        result = result.multiply(BigInteger.valueOf(int2));
        result = result.multiply(BigInteger.valueOf(int3));
        result = result.multiply(BigInteger.valueOf(int4));
        result = result.multiply(BigInteger.valueOf(treeCounter));

        System.out.println("The answer of part 2 is : " + result);
    }

}
