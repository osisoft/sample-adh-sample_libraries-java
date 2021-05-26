package com.github.osisoft.ocs_sample_library_preview.sds;

public enum SdsSummaryType {

    None("None"),
    Count("Count"),
    Minimum("Minimum"),
    Maximum("Maximum"),
    Range("Range"),
    Mean("Mean"),
    StandardDeviation("StandardDeviation"),
    PopulationStandardDeviation("PopulationStandardDeviation"),
    Total("Total"),
    Skewness("Skewness"),
    Kurtosis("Kurtosis"),
    WeightedMean("WeightedMean"),
    WeightedStandardDeviation("WeightedStandardDeviation"),
    WeightedPopulationStandardDeviation("WeightedPopulationStandardDeviation");

    private final String SdsSummaryType;

    private SdsSummaryType(String id) {
        this.SdsSummaryType = id;
    }

    public String getValue() {
        return SdsSummaryType;
    }
}
