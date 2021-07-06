package com.github.osisoft.ocs_sample_library_preview.community;

public class StreamSearchResult {
    public StreamSearchResult() {}

    private String Id;
    private String Name;
    private String TypeId;
    private String Description;
    private String Self;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getTypeId() {
      return TypeId;
    }

    public void setTypeId(String typeId) {
      this.TypeId = typeId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getSelf() {
        return Self;
    }

    public void setSelf(String self) {
        this.Self = self;
    }
}