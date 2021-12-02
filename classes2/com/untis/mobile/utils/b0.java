// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import android.util.Patterns;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/utils/b0;", "", "", "email", "", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b0
{
    @e
    public static final b0 a;
    
    static {
        a = new b0();
    }
    
    private b0() {
    }
    
    public final boolean a(@f final String input) {
        return input != null && Patterns.EMAIL_ADDRESS.matcher(input).matches();
    }
}
