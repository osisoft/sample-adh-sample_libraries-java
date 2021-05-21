package com.github.osisoft.ocs_sample_library_preview.dataviews;

import com.github.osisoft.ocs_sample_library_preview.sds.SdsSummaryType;

public class Field {
    private FieldSource Source;
    private String[] Keys;
    private String Label;
    private boolean IncludeUom;
    private SummaryDirection SummaryDirection;
    private SdsSummaryType SdsSummaryType;

    public Field(FieldSource source, String[] keys, String label) {
        this.Source = source;
        this.Keys = keys;
        this.Label = label;
        this.IncludeUom = false;
        this.SummaryDirection = com.github.osisoft.ocs_sample_library_preview.dataviews.SummaryDirection.Forward;
        this.SdsSummaryType = com.github.osisoft.ocs_sample_library_preview.sds.SdsSummaryType.None;
    }

    public Field(FieldSource source, String[] keys, String label, boolean includeUom) {
        this.Source = source;
        this.Keys = keys;
        this.Label = label;
        this.IncludeUom = includeUom;
        this.SummaryDirection = com.github.osisoft.ocs_sample_library_preview.dataviews.SummaryDirection.Forward;
        this.SdsSummaryType = com.github.osisoft.ocs_sample_library_preview.sds.SdsSummaryType.None;
    }

    public Field(FieldSource source, String[] keys, String label, boolean includeUom, SummaryDirection summaryDirection, SdsSummaryType sdsSummaryType) {
        this.Source = source;
        this.Keys = keys;
        this.Label = label;
        this.IncludeUom = includeUom;
        this.SummaryDirection = summaryDirection;
        this.SdsSummaryType = sdsSummaryType;
    }

    public Field(Field field) {
        this.Source = field.Source;
        this.Keys = field.Keys;
        this.Label = field.Label;
        this.IncludeUom = field.IncludeUom;
        this.SummaryDirection = field.SummaryDirection;
        this.SdsSummaryType = field.SdsSummaryType;
    }

    public FieldSource getSource() {
        return Source;
    }

    public void setSource(FieldSource source) {
        this.Source = source;
    }

    public String[] getKeys() {
        return Keys;
    }

    public void setKeys(String[] keys) {
        this.Keys = keys;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        this.Label = label;
    }

    public boolean getIncludeUom() {
        return IncludeUom;
    }

    public void setIncludeUom(boolean includeUom) { this.IncludeUom = includeUom; }

    public SummaryDirection getSummaryDirection() { return SummaryDirection; }

    public void setSummaryDirection(SummaryDirection summaryDirection) { this.SummaryDirection = summaryDirection; }

    public SdsSummaryType getSdsSummaryType() { return SdsSummaryType; }

    public void setSdsSummaryType(SdsSummaryType sdsSummaryType) { this.SdsSummaryType = sdsSummaryType; }
}
