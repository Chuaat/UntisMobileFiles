// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class UserInformationDto
{
    @JsonProperty("departments")
    private List<WuDepartmentDto> departments;
    @JsonProperty("tenant")
    private WuCurrentTenantDto tenant;
    @JsonProperty("ui2020")
    private Boolean ui2020;
    @JsonProperty("user")
    private WuCurrentUserDto user;
    
    public UserInformationDto() {
        this.departments = new ArrayList<WuDepartmentDto>();
        this.tenant = null;
        this.user = null;
    }
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public UserInformationDto addDepartmentsItem(final WuDepartmentDto wuDepartmentDto) {
        if (this.departments == null) {
            this.departments = new ArrayList<WuDepartmentDto>();
        }
        this.departments.add(wuDepartmentDto);
        return this;
    }
    
    public UserInformationDto departments(final List<WuDepartmentDto> departments) {
        this.departments = departments;
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final UserInformationDto userInformationDto = (UserInformationDto)o;
            if (!Objects.equals(this.departments, userInformationDto.departments) || !Objects.equals(this.tenant, userInformationDto.tenant) || !Objects.equals(this.ui2020, userInformationDto.ui2020) || !Objects.equals(this.user, userInformationDto.user)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty("")
    public List<WuDepartmentDto> getDepartments() {
        return this.departments;
    }
    
    @ApiModelProperty("")
    public WuCurrentTenantDto getTenant() {
        return this.tenant;
    }
    
    @ApiModelProperty("")
    public Boolean getUi2020() {
        return this.ui2020;
    }
    
    @ApiModelProperty("")
    public WuCurrentUserDto getUser() {
        return this.user;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.departments, this.tenant, this.ui2020, this.user);
    }
    
    public void setDepartments(final List<WuDepartmentDto> departments) {
        this.departments = departments;
    }
    
    public void setTenant(final WuCurrentTenantDto tenant) {
        this.tenant = tenant;
    }
    
    public void setUi2020(final Boolean ui2020) {
        this.ui2020 = ui2020;
    }
    
    public void setUser(final WuCurrentUserDto user) {
        this.user = user;
    }
    
    public UserInformationDto tenant(final WuCurrentTenantDto tenant) {
        this.tenant = tenant;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class UserInformationDto {\n");
        sb.append("    departments: ");
        sb.append(this.toIndentedString(this.departments));
        sb.append("\n");
        sb.append("    tenant: ");
        sb.append(this.toIndentedString(this.tenant));
        sb.append("\n");
        sb.append("    ui2020: ");
        sb.append(this.toIndentedString(this.ui2020));
        sb.append("\n");
        sb.append("    user: ");
        sb.append(this.toIndentedString(this.user));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    public UserInformationDto ui2020(final Boolean ui2020) {
        this.ui2020 = ui2020;
        return this;
    }
    
    public UserInformationDto user(final WuCurrentUserDto user) {
        this.user = user;
        return this;
    }
}
