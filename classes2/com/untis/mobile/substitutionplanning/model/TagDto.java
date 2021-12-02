// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import com.untis.mobile.utils.extension.h;
import android.content.Context;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J!\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/TagDto;", "", "Landroid/content/Context;", "context", "", "getTranslatedMessageFor", "component1", "component2", "type", "displayName", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "getType", "setType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TagDto
{
    @f
    private String displayName;
    @f
    private String type;
    
    public TagDto() {
        this(null, null, 3, null);
    }
    
    public TagDto(@f final String type, @f final String displayName) {
        this.type = type;
        this.displayName = displayName;
    }
    
    @f
    public final String component1() {
        return this.type;
    }
    
    @f
    public final String component2() {
        return this.displayName;
    }
    
    @e
    public final TagDto copy(@f final String s, @f final String s2) {
        return new TagDto(s, s2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TagDto)) {
            return false;
        }
        final TagDto tagDto = (TagDto)o;
        return k0.g(this.type, tagDto.type) && k0.g(this.displayName, tagDto.displayName);
    }
    
    @f
    public final String getDisplayName() {
        return this.displayName;
    }
    
    @f
    public final String getTranslatedMessageFor(@e final Context context) {
        k0.p(context, "context");
        final String type = this.type;
        if (type != null) {
            String s = null;
            switch (type.hashCode()) {
                default: {
                    return null;
                }
                case 2083576436: {
                    if (!type.equals("NOT_AT_SCHOOL")) {
                        return null;
                    }
                    final int n = 2131886831;
                    return h.V(n, context);
                }
                case 1769910616: {
                    if (!type.equals("HAS_ABSENCE")) {
                        return null;
                    }
                    if ((s = this.displayName) == null) {
                        final int n = 2131886828;
                        return h.V(n, context);
                    }
                    break;
                }
                case 1714352641: {
                    if (!type.equals("ADDITIONAL_ATTENDANCE")) {
                        return null;
                    }
                    return this.displayName;
                }
                case 1359052236: {
                    if (!type.equals("HAS_UNPUBLISHED_SUBSTITUTION")) {
                        return null;
                    }
                    final int n = 2131886833;
                    return h.V(n, context);
                }
                case 1053942113: {
                    if (!type.equals("NON_TEACHING_PERIOD")) {
                        return null;
                    }
                    final int n = 2131886830;
                    return h.V(n, context);
                }
                case -106364277: {
                    if (!type.equals("IMPORTED_FROM_UNTIS")) {
                        return null;
                    }
                    if ((s = this.displayName) == null) {
                        final int n = 2131886818;
                        return h.V(n, context);
                    }
                    break;
                }
                case -392519295: {
                    if (!type.equals("KNOWS_CLASS")) {
                        return null;
                    }
                    final int n = 2131886834;
                    return h.V(n, context);
                }
                case -708304851: {
                    if (!type.equals("ON_STANDBY")) {
                        return null;
                    }
                    final int n = 2131886832;
                    return h.V(n, context);
                }
                case -995422919: {
                    if (!type.equals("HAS_PERIOD_COLLISION")) {
                        return null;
                    }
                    if ((s = this.displayName) == null) {
                        final int n = 2131886829;
                        return h.V(n, context);
                    }
                    break;
                }
                case -1975424267: {
                    if (!type.equals("KNOWS_SUBJECT")) {
                        return null;
                    }
                    final int n = 2131886835;
                    return h.V(n, context);
                }
            }
            return s;
            int n = 0;
            s2 = h.V(n, context);
            return s2;
        }
        return null;
    }
    
    @f
    public final String getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final String displayName = this.displayName;
        if (displayName != null) {
            hashCode = displayName.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public final void setDisplayName(@f final String displayName) {
        this.displayName = displayName;
    }
    
    public final void setType(@f final String type) {
        this.type = type;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TagDto(type=");
        sb.append((Object)this.type);
        sb.append(", displayName=");
        sb.append((Object)this.displayName);
        sb.append(')');
        return sb.toString();
    }
}
