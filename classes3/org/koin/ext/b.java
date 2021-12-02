// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.ext;

import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0005" }, d2 = { "", "", "a", "b", "c", "koin-core" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    public static final boolean a(@e final String s) {
        k0.q((Object)s, "$this$isFloat");
        return s.J0(s) != null;
    }
    
    public static final boolean b(@e final String s) {
        k0.q((Object)s, "$this$isInt");
        return s.X0(s) != null;
    }
    
    @e
    public static final String c(@e final String s) {
        k0.q((Object)s, "$this$quoted");
        return s.k2(s, "\"", "", false, 4, null);
    }
}
