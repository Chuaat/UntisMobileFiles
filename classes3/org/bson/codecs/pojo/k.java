// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public final class k
{
    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final List<e> f;
    public static final List<e> g;
    
    static {
        final e e2 = a = new g();
        final e e3 = b = new f();
        c = new i();
        d = new j();
        f = Collections.unmodifiableList((List<?>)Arrays.asList(e2, e3, e = new h()));
        g = Collections.emptyList();
    }
    
    private k() {
    }
}
