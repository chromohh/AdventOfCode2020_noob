package com.company.days;

import com.company.tools.ReadInputs;

import java.util.List;
import java.util.Scanner;

public class Day_2 {
    private final List<String> in;
    private Scanner scanner;

    public Day_2(){
        ReadInputs in = new ReadInputs("day2_inputs.txt");
        this.in = in.getInputs();
    }

    public void part1(){
        int finalcounter = 0;

        for(String s : in){
            int x = 0;
            int y = 0;

            String ints = s.replaceAll("[^\\d]", " ").trim().replace(" +", " ");
            scanner = new Scanner(ints);
            x = scanner.nextInt();
            y = scanner.nextInt();

            s = s.replaceAll("[0-9\\-:\\ ]","");
            char comparable = s.charAt(0);

            s = s.substring(1);

            int counter = 0;
            for(int i = 0; i < s.length(); i++){
                if(comparable == s.charAt(i)){
                    counter++;
                }
            }
            if(counter >= x && counter <= y){
                finalcounter++;
            }

        }
        System.out.println("The Answer of part 1 is " + finalcounter);
    }

    public void part2(){
        int finalcounter = 0;

        for(String s : in){
            int x = 0;
            int y = 0;

            String ints = s.replaceAll("[^\\d]", " ").trim().replace(" +", " ");
            scanner = new Scanner(ints);
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

            s = s.replaceAll("[0-9\\-:\\ ]","");
            char comparable = s.charAt(0);

            s = s.substring(1);

            if(s.charAt(x) == comparable  || s.charAt(y) == comparable){
                if(s.charAt(x) == comparable  && s.charAt(y) == comparable){
                }else{
                    finalcounter++;
                }
            }

        }
        System.out.println("The Answer of part 2 is " + finalcounter);
    }
}
