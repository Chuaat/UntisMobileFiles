// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

public class WuCurrentUserDto
{
    @JsonProperty("id")
    private BigDecimal id;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("name")
    private String name;
    @JsonProperty("permissions")
    private WuCurrentUserDtoPermissions permissions;
    @JsonProperty("person")
    private WuCurrentUserDtoPerson person;
    @JsonProperty("roles")
    private List<WuCurrentUserDtoRolesEnum> roles;
    
    public WuCurrentUserDto() {
        this.permissions = null;
        this.person = null;
        this.roles = new ArrayList<WuCurrentUserDtoRolesEnum>();
    }
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public WuCurrentUserDto addRolesItem(final WuCurrentUserDtoRolesEnum wuCurrentUserDtoRolesEnum) {
        if (this.roles == null) {
            this.roles = new ArrayList<WuCurrentUserDtoRolesEnum>();
        }
        this.roles.add(wuCurrentUserDtoRolesEnum);
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final WuCurrentUserDto wuCurrentUserDto = (WuCurrentUserDto)o;
            if (!Objects.equals(this.id, wuCurrentUserDto.id) || !Objects.equals(this.locale, wuCurrentUserDto.locale) || !Objects.equals(this.name, wuCurrentUserDto.name) || !Objects.equals(this.permissions, wuCurrentUserDto.permissions) || !Objects.equals(this.person, wuCurrentUserDto.person) || !Objects.equals(this.roles, wuCurrentUserDto.roles)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "8755.0", value = "The Id of the user.")
    public BigDecimal getId() {
        return this.id;
    }
    
    @ApiModelProperty(example = "en-US", value = "The locale of the user as two-letter language-code and an optional country-code.")
    public String getLocale() {
        return this.locale;
    }
    
    @ApiModelProperty(example = "admin", value = "The name of the user.")
    public String getName() {
        return this.name;
    }
    
    @ApiModelProperty("")
    public WuCurrentUserDtoPermissions getPermissions() {
        return this.permissions;
    }
    
    @ApiModelProperty("")
    public WuCurrentUserDtoPerson getPerson() {
        return this.person;
    }
    
    @ApiModelProperty("")
    public List<WuCurrentUserDtoRolesEnum> getRoles() {
        return this.roles;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.locale, this.name, this.permissions, this.person, this.roles);
    }
    
    public WuCurrentUserDto id(final BigDecimal id) {
        this.id = id;
        return this;
    }
    
    public WuCurrentUserDto locale(final String locale) {
        this.locale = locale;
        return this;
    }
    
    public WuCurrentUserDto name(final String name) {
        this.name = name;
        return this;
    }
    
    public WuCurrentUserDto permissions(final WuCurrentUserDtoPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    
    public WuCurrentUserDto person(final WuCurrentUserDtoPerson person) {
        this.person = person;
        return this;
    }
    
    public WuCurrentUserDto roles(final List<WuCurrentUserDtoRolesEnum> roles) {
        this.roles = roles;
        return this;
    }
    
    public void setId(final BigDecimal id) {
        this.id = id;
    }
    
    public void setLocale(final String locale) {
        this.locale = locale;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setPermissions(final WuCurrentUserDtoPermissions permissions) {
        this.permissions = permissions;
    }
    
    public void setPerson(final WuCurrentUserDtoPerson person) {
        this.person = person;
    }
    
    public void setRoles(final List<WuCurrentUserDtoRolesEnum> roles) {
        this.roles = roles;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class WuCurrentUserDto {\n");
        sb.append("    id: ");
        sb.append(this.toIndentedString(this.id));
        sb.append("\n");
        sb.append("    locale: ");
        sb.append(this.toIndentedString(this.locale));
        sb.append("\n");
        sb.append("    name: ");
        sb.append(this.toIndentedString(this.name));
        sb.append("\n");
        sb.append("    permissions: ");
        sb.append(this.toIndentedString(this.permissions));
        sb.append("\n");
        sb.append("    person: ");
        sb.append(this.toIndentedString(this.person));
        sb.append("\n");
        sb.append("    roles: ");
        sb.append(this.toIndentedString(this.roles));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
