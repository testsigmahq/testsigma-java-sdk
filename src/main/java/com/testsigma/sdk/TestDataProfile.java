package com.testsigma.sdk;


import com.google.gson.Gson;
import lombok.Data;
import org.json.JSONArray;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
public class TestDataProfile {

    private List<TestDataSet> testDataSets;

    public TestDataProfile(JSONArray testDataSets){
        Gson gson = new Gson();
        this.testDataSets = gson.fromJson(String.valueOf(testDataSets),List.class);
    }

    public Optional<TestDataSet> getSetByName(String name){
        return testDataSets.stream().filter(testDataSet -> testDataSet.getName().equals(name))
                .collect(Collectors.toList()).stream().findFirst();
    }

}