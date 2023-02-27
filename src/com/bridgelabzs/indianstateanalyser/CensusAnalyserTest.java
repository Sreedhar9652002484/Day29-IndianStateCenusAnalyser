package com.bridgelabzs.indianstateanalyser;

import org.junit.Test;

public class CensusAnalyserTest {
    private static final String INDIA_CENSUS_CSV_FILE_PATH = "IndiaStatesCensusData.csv";
    IndianCensusAnalyser analyser = new IndianCensusAnalyser();
    private static final String INDIAN_CSV_STATE_PATH = "StateCodes.csv";

    @Test
    public void returnSize() throws Exception {
        try {
            Assertions.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldExecuteProperly_IfRecordsAreEqual() throws Exception {
        try {
            Assertions.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnRecordsif_CSVFileIsDetected() throws Exception {
        try {
            Assertions.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnCustomException_ifDelimiterIncorrect() throws Exception {
        try {
            Assertions.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturCustomException_ifCSVHeaderIncorrect() throws Exception {
        try {
            Assertions.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    // State

    @Test
    public void returnSizeState() throws Exception {
        try {

            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldExecuteProperly_IfRecordsAreEqualState() throws Exception {
        try {
            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnRecordsif_CSVFileIsDetectedState() throws Exception {
        try {
            Assertions.assertEquals(37, analyser.loadStateData("xyz.csv"));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnCustomException_ifDelimiterIncorrectState() throws Exception {
        try {

            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldRetureCustomException_ifCSVHeaderIncorrectState() throws Exception {
        try {
            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

}