// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.systemNotifications;

import kotlin.h0;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/systemNotifications/e;", "", "", "f", "", "G", "I", "d", "()I", "value", "<init>", "(Ljava/lang/String;II)V", "H", "a", "EXAM", "OFFICE_HOUR_REGISTRATION", "CUSTOM_PERIOD_DETAIL", "HOMEWORK", "UNKNOWN", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum e
{
    @org.jetbrains.annotations.e
    public static final a H;
    
    I(1), 
    J(2), 
    K(3), 
    L(4), 
    M(0);
    
    private final int G;
    
    static {
        N = b();
        H = new a(null);
    }
    
    private e(final int g) {
        this.G = g;
    }
    
    private static final /* synthetic */ e[] b() {
        return new e[] { e.I, e.J, e.K, e.L, e.M };
    }
    
    public final int d() {
        return this.G;
    }
    
    @org.jetbrains.annotations.e
    public final String f() {
        final int n = b.a[this.ordinal()];
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new h0();
                        }
                        s = "n/a";
                    }
                    else {
                        s = "homework";
                    }
                }
                else {
                    s = "period";
                }
            }
            else {
                s = "contact";
            }
        }
        else {
            s = "exam";
        }
        return s;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/systemNotifications/e$a", "", "", "value", "Lcom/untis/mobile/systemNotifications/e;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.e
        public final e a(final int n) {
            while (true) {
                for (final e e : e.values()) {
                    if (e.d() == n) {
                        e m = e;
                        if (e == null) {
                            m = e.M;
                        }
                        return m;
                    }
                }
                e e = null;
                continue;
            }
        }
    }
}
