// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import a4.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "", "", "component1", "", "component2", "component3", "id", "displayName", "imageUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "J", "getId", "()J", "setId", "(J)V", "getDisplayName", "setDisplayName", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TeacherRefDto
{
    @e
    private String displayName;
    private long id;
    @f
    private String imageUrl;
    
    public TeacherRefDto(final long id, @e final String displayName, @f final String imageUrl) {
        k0.p(displayName, "displayName");
        this.id = id;
        this.displayName = displayName;
        this.imageUrl = imageUrl;
    }
    
    public final long component1() {
        return this.id;
    }
    
    @e
    public final String component2() {
        return this.displayName;
    }
    
    @f
    public final String component3() {
        return this.imageUrl;
    }
    
    @e
    public final TeacherRefDto copy(final long n, @e final String s, @f final String s2) {
        k0.p(s, "displayName");
        return new TeacherRefDto(n, s, s2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TeacherRefDto)) {
            return false;
        }
        final TeacherRefDto teacherRefDto = (TeacherRefDto)o;
        return this.id == teacherRefDto.id && k0.g(this.displayName, teacherRefDto.displayName) && k0.g(this.imageUrl, teacherRefDto.imageUrl);
    }
    
    @e
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @f
    public final String getImageUrl() {
        return this.imageUrl;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.id);
        final int hashCode = this.displayName.hashCode();
        final String imageUrl = this.imageUrl;
        int hashCode2;
        if (imageUrl == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = imageUrl.hashCode();
        }
        return (a * 31 + hashCode) * 31 + hashCode2;
    }
    
    public final void setDisplayName(@e final String displayName) {
        k0.p(displayName, "<set-?>");
        this.displayName = displayName;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setImageUrl(@f final String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TeacherRefDto(id=");
        sb.append(this.id);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", imageUrl=");
        sb.append((Object)this.imageUrl);
        sb.append(')');
        return sb.toString();
    }
}
