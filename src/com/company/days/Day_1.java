package com.company.days;


import com.company.tools.ReadInputs;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Day_1 {
    private final List<Integer> in;

    public Day_1(){
        ReadInputs in = new ReadInputs("day1_inputs.txt");
        this.in = in.getInputsAsInteger();

    }

    public void part1(){

        int int1 = 0;
        int int2 = 0;

        for(Integer i : in){
            for(Integer y : in){
                if(i+y == 2020){
                    int1 = i;
                    int2 = y;
                    break;
                }
            }
        }
        System.out.println("The answer of part 1 is = " + (int1 * int2));
    }

    public void part2(){

        int int1 = 0;
        int int2 = 0;
        int int3 = 0;
        for(Integer i : in){
            for(Integer y : in){
                for(Integer j : in){
                    if(i+y+j == 2020){
                        int1 = i;
                        int2 = y;
                        int3 = j;
                        break;
                    }
                }
            }
        }
        System.out.println("The answer of part 2 is = " + (int1 * int2 * int3));
    }
}
