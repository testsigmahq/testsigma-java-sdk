package com.testsigma.sdk;


import lombok.Data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
public class TestDataProfile {

    private List<TestDataSet> testDataSets;

    public TestDataProfile(List<TestDataSet> testDataSets) {
        this.testDataSets = testDataSets;
    }

    public Optional<TestDataSet> getSetByName(String name){
        return testDataSets.stream().filter(testDataSet -> testDataSet.getName().equals(name))
                .collect(Collectors.toList()).stream().findFirst();
    }

}