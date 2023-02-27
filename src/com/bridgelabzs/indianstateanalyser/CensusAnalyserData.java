package com.bridgelabzs.indianstateanalyser;

public class CensusAnalyserData {
    public String state;
    public long population;
    public long areaInSqKm;
    public int densityPerSqKm;

    public CensusAnalyserData() {
    }

    public CensusAnalyserData(String state, long population, long areaInSqKm, int densityPerSqKm) {
        this.state = state;
        this.population = population;
        this.areaInSqKm = areaInSqKm;
        this.densityPerSqKm = densityPerSqKm;

    }
}