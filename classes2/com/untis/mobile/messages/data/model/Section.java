// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model;

import org.jetbrains.annotations.f;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J#\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\n\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/messages/data/model/Section;", "", "", "Lcom/untis/mobile/messages/data/model/Group;", "component1", "", "component2", "groups", "sectionType", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getGroups", "()Ljava/util/List;", "setGroups", "(Ljava/util/List;)V", "Ljava/lang/String;", "getSectionType", "()Ljava/lang/String;", "setSectionType", "(Ljava/lang/String;)V", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Section
{
    @SerializedName("groups")
    @e
    private List<Group> groups;
    @SerializedName("sectionType")
    @e
    private String sectionType;
    
    public Section(@e final List<Group> groups, @e final String sectionType) {
        k0.p(groups, "groups");
        k0.p(sectionType, "sectionType");
        this.groups = groups;
        this.sectionType = sectionType;
    }
    
    @e
    public final List<Group> component1() {
        return this.groups;
    }
    
    @e
    public final String component2() {
        return this.sectionType;
    }
    
    @e
    public final Section copy(@e final List<Group> list, @e final String s) {
        k0.p(list, "groups");
        k0.p(s, "sectionType");
        return new Section(list, s);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Section)) {
            return false;
        }
        final Section section = (Section)o;
        return k0.g(this.groups, section.groups) && k0.g(this.sectionType, section.sectionType);
    }
    
    @e
    public final List<Group> getGroups() {
        return this.groups;
    }
    
    @e
    public final String getSectionType() {
        return this.sectionType;
    }
    
    @Override
    public int hashCode() {
        return this.groups.hashCode() * 31 + this.sectionType.hashCode();
    }
    
    public final void setGroups(@e final List<Group> groups) {
        k0.p(groups, "<set-?>");
        this.groups = groups;
    }
    
    public final void setSectionType(@e final String sectionType) {
        k0.p(sectionType, "<set-?>");
        this.sectionType = sectionType;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Section(groups=");
        sb.append(this.groups);
        sb.append(", sectionType=");
        sb.append(this.sectionType);
        sb.append(')');
        return sb.toString();
    }
}
