package com.company.days;

import com.company.tools.ReadInputs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day_4 {
    private final String in;
    private Scanner scanner;

    public Day_4(){
        ReadInputs in = new ReadInputs("day4_inputs.txt");
        this.in = in.getInputsAsOneString();
    }

    public void test(){
        System.out.println(in);
    }
}
