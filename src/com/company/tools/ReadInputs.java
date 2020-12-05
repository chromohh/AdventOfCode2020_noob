package com.company.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadInputs {
    private List<String> inputs = Collections.emptyList();

    public ReadInputs(String fileName) {
        try {
            this.inputs = Files.readAllLines(Paths.get("src\\com\\company\\inputs\\" + fileName), StandardCharsets.UTF_8);
        }catch(Exception e){
            System.out.println("Empty Filename");
        }
    }

    public List<String> getInputsAsString() {
        return inputs;
    }

    public List<Integer> getInputsAsInteger() {
        return  inputs.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public String getInputsAsOneString() {
        StringBuilder sb = new StringBuilder();
        for(String s:inputs){
            sb.append(s + "\n");
        }
        return sb.toString();
    }

    public String[] getJoinedStringArrWOLines(){
        return String.join("\n", getInputsAsString())
                .replaceAll("\\b\\n\\b", " ")
                .split("\\n\\n");
    }
}
