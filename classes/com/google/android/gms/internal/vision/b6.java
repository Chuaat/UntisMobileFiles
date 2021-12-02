// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class b6
{
    private static volatile boolean b = false;
    private static boolean c = true;
    private static volatile b6 d;
    private static volatile b6 e;
    private static final b6 f;
    private final Map<a, p6.e<?, ?>> a;
    
    static {
        f = new b6(true);
    }
    
    b6() {
        this.a = new HashMap<a, p6.e<?, ?>>();
    }
    
    private b6(final boolean b) {
        this.a = Collections.emptyMap();
    }
    
    public static b6 a() {
        return new b6();
    }
    
    public static b6 d() {
        final b6 d;
        if ((d = b6.d) == null) {
            synchronized (b6.class) {
                if (b6.d == null) {
                    b6.d = b6.f;
                }
            }
        }
        return d;
    }
    
    public static b6 e() {
        final b6 e = b6.e;
        if (e != null) {
            return e;
        }
        synchronized (b6.class) {
            final b6 e2 = b6.e;
            if (e2 != null) {
                return e2;
            }
            return b6.e = m6.b(b6.class);
        }
    }
    
    public final <ContainingType extends z7> p6.e<ContainingType, ?> b(final ContainingType containingType, final int n) {
        return (p6.e<ContainingType, ?>)(p6.e)this.a.get(new a(containingType, n));
    }
    
    public final void c(final p6.e<?, ?> e) {
        this.a.put(new a(e.a, e.d.H), e);
    }
    
    private static final class a
    {
        private final Object a;
        private final int b;
        
        a(final Object a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            return System.identityHashCode(this.a) * 65535 + this.b;
        }
    }
}
