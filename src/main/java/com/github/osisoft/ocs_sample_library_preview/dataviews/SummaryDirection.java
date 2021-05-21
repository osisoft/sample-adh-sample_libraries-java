package com.github.osisoft.ocs_sample_library_preview.dataviews;

public enum SummaryDirection {
    Forward("Forward"), Backward("Backward");

    private final String SummaryDirection;

    private SummaryDirection(String id) {
        this.SummaryDirection = id;
    }

    public String getValue() {
        return SummaryDirection;
    }
}
