// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.realm.c0;
import io.realm.n0;

public interface p extends n0
{
    c0 S6();
    
    void y4();
    
    public static class a<E extends n0>
    {
        @SuppressFBWarnings({ "URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD" })
        public int a;
        public final E b;
        
        public a(final int a, final E b) {
            this.a = a;
            this.b = b;
        }
    }
}
