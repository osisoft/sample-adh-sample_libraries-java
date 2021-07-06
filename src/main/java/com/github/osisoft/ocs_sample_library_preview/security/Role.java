package com.github.osisoft.ocs_sample_library_preview.security;

public class Role {
    public Role() {}

    private String Id;
    private String Name;
    private String Description;
    private Integer RoleScope;
    private String TenantId;
    private String CommunityId;
    private String RoleTypeId;

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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public Integer getRoleScope() {
        return RoleScope;
    }

    public void setRoleScope(Integer roleScope) {
        this.RoleScope = roleScope;
    }

    public String getTenantId() {
        return TenantId;
    }

    public void setTenantId(String tenantId) {
        this.TenantId = tenantId;
    }

    public String getCommunityId() {
        return CommunityId;
    }

    public void setCommunityId(String communityId) {
        this.CommunityId = communityId;
    }

    public String getRoleTypeId() {
        return RoleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.RoleTypeId = roleTypeId;
    }
}