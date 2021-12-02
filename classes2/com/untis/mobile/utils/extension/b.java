// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a#\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011\u001a\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0014" }, d2 = { "Landroid/os/Bundle;", "", "key", "value", "Lkotlin/j2;", "h", "d", "", "f", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;)V", "b", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "", "g", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Long;)V", "c", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "Lcom/untis/mobile/persistence/models/EntityType;", "e", "a", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class b
{
    @f
    public static final EntityType a(@e final Bundle bundle, @e final String s) {
        k0.p(bundle, "<this>");
        k0.p(s, "key");
        return EntityType.Companion.findByOrNull(b(bundle, s));
    }
    
    @f
    public static final Integer b(@e final Bundle bundle, @e final String s) {
        k0.p(bundle, "<this>");
        k0.p(s, "key");
        if (bundle.containsKey(s)) {
            return bundle.getInt(s);
        }
        return null;
    }
    
    @f
    public static final Long c(@e final Bundle bundle, @e final String s) {
        k0.p(bundle, "<this>");
        k0.p(s, "key");
        if (bundle.containsKey(s)) {
            return bundle.getLong(s);
        }
        return null;
    }
    
    @f
    public static final String d(@e final Bundle bundle, @e final String s) {
        k0.p(bundle, "<this>");
        k0.p(s, "key");
        if (bundle.containsKey(s)) {
            return bundle.getString(s);
        }
        return null;
    }
    
    public static final void e(@e final Bundle bundle, @e final String s, @f final EntityType entityType) {
        k0.p(bundle, "<this>");
        k0.p(s, "key");
        if (entityType == null) {
            return;
        }
        bundle.putInt(s, entityType.getWebuntisId());
    }
    
    public static final void f(@e final Bundle bundle, @e final String s, @f final Integer n) {
        k0.p(bundle, "<this>");
        k0.p(s, "key");
        if (n == null) {
            return;
        }
        n;
        bundle.putInt(s, (int)n);
    }
    
    public static final void g(@e final Bundle bundle, @e final String s, @f final Long n) {
        k0.p(bundle, "<this>");
        k0.p(s, "key");
        if (n == null) {
            return;
        }
        n;
        bundle.putLong(s, (long)n);
    }
    
    public static final void h(@e final Bundle bundle, @e final String s, @f final String s2) {
        k0.p(bundle, "<this>");
        k0.p(s, "key");
        if (s2 == null) {
            return;
        }
        bundle.putString(s, s2);
    }
}
