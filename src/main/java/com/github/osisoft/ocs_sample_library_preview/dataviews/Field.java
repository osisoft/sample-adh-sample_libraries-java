package com.github.osisoft.ocs_sample_library_preview.dataviews;

import com.github.osisoft.ocs_sample_library_preview.*;
import com.github.osisoft.ocs_sample_library_preview.sds.*;

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
        this.SummaryDirection = SummaryDirection.Forward;
        this.SdsSummaryType = SdsSummaryType.None;
    }

    public Field(Field field) {
        this.Source = field.getSource();
        this.Keys = field.getKeys();
        this.Label = field.getLabel();
        this.IncludeUom = field.getIncludeUom();
        this.SummaryDirection = field.getSummaryDirection();
        this.SdsSummaryType = field.getSdsSummaryType();
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
