package com.company.days;

import com.company.tools.ReadInputs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day_4 {
    private final String[] in;
    private Scanner scanner;

    public Day_4(){
        ReadInputs in = new ReadInputs("day4_inputs.txt");
        this.in = in.getJoinedStringArrWOLines();
    }

    public void part1(){
        String[] keys = {
                "byr:",
                "iyr:",
                "eyr:",
                "hgt:",
                "hcl:",
                "ecl:",
                "pid:"
        };
        int total = 0;
        for(String s: in){
            boolean check = true;
            for(String k : keys){
                check &= s.contains(k);
            }
            if(check){
                total++;
            }
        }

        System.out.println("The answer of part1 is : " + total);
    }


}
