// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.common;

import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n" }, d2 = { "Lcom/untis/mobile/substitutionplanning/common/b;", "", "Landroid/content/Context;", "context", "", "a", "", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @e
    public static final b a;
    
    static {
        a = new b();
    }
    
    private b() {
    }
    
    public final int a(@e final Context context) {
        k0.p(context, "context");
        return context.getResources().getInteger(2131361826);
    }
    
    public final boolean b(@e final Context context) {
        k0.p(context, "context");
        return this.a(context) == 2;
    }
}
