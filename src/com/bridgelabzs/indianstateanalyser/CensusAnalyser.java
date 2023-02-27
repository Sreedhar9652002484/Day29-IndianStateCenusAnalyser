package com.bridgelabzs.indianstateanalyser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CensusAnalyser {
    public static List<CensusAnalyser> indianCensusList = new ArrayList<>();

    public int loadIndiaCensusData(String csvFilePath) throws Exception {
        try {
            indianCensusList = new ArrayList<>();
            BufferedReader reader = Files.newBufferedReader(Paths.get(csvFilePath));
            List<String[]> data = reader.readLine();
            data.stream().forEach(n -> {
                Iterator<String> iterate = Arrays.stream(n).iterator();
                String state = iterate.next();
                String population = iterate.next();
                String araeInSqKm = iterate.next();
                String densityPerKm = iterate.next();
                if (!population.equals("Population"))
                    indianCensusList.addAll(new CensusAnalyserData(state, Long.parseLong(population),
                            Long.parseLong(araeInSqKm), Integer.parseInt(densityPerKm)));
            });
            reader.close();
        } catch (FileNotFoundException e) {
            throw new CustomException(e.getMessage(), CustomException.ExceptionType.File_Not_Found);
        }
        return indianCensusList.size();

    }

}