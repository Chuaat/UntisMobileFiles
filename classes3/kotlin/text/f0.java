// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lkotlin/text/f0;", "", "", "a", "Ljava/lang/String;", "LINE_SEPARATOR", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class f0
{
    @d
    @e
    public static final String a;
    @e
    public static final f0 b;
    
    static {
        b = new f0();
        final String property = System.getProperty("line.separator");
        k0.m((Object)property);
        a = property;
    }
    
    private f0() {
    }
}
