package com.company.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadInputs {
    private List<String> inputs = Collections.emptyList();

    public ReadInputs(String fileName) {
        try {
            this.inputs = Files.readAllLines(Paths.get("src\\com\\company\\inputs\\" + fileName), StandardCharsets.UTF_8);
        }catch(Exception e){
            System.out.println("Empty Filename");
        }
    }

    public List<String> getInputs() {
        return inputs;
    }
}
