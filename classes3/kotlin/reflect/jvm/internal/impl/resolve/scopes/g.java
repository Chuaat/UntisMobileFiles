// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.storage.f;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.i;

public final class g extends a
{
    @e
    private final i<h> b;
    
    @m6.h
    public g(@e final n n, @e final n6.a<? extends h> a) {
        k0.p((Object)n, "storageManager");
        k0.p((Object)a, "getScope");
        this.b = n.g((n6.a<? extends h>)new n6.a<h>() {
            @e
            public final h a() {
                h i;
                final h h = i = (h)a.invoke();
                if (h instanceof a) {
                    i = ((a)h).i();
                }
                return i;
            }
        });
    }
    
    @m6.h
    public g(@e final n6.a<? extends h> a) {
        k0.p((Object)a, "getScope");
        this(null, a, 1, null);
    }
    
    @e
    @Override
    protected h j() {
        return (h)((n6.a)this.b).invoke();
    }
}
