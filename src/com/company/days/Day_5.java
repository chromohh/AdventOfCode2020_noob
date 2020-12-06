package com.company.days;

import com.company.tools.ReadInputs;

import java.math.BigInteger;
import java.util.*;

public class Day_5 {
    private final List<String> in;

    public Day_5(){
        ReadInputs a = new ReadInputs("day5_inputs.txt");
        this.in = a.getInputsAsString();
    }

    public void part1(){
        Set<Integer> allSeats = new HashSet<>(in.size());

        for(String i : in){
            allSeats.add(Integer.parseInt(i.replaceAll("[BR]","1").replaceAll("[FL]","0" ), 2));
        }

        System.out.println(Collections.max(allSeats));
    }

}
