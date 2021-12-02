// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public final class lg extends j
{
    private final j8 I;
    final Map<String, j> J;
    
    public lg(final j8 i) {
        super("require");
        this.J = new HashMap<String, j>();
        this.I = i;
    }
    
    @Override
    public final q a(final g5 g5, List<q> k) {
        h6.h("require", 1, (List<q>)k);
        k = g5.b(((List<q>)k).get(0)).k();
        if (this.J.containsKey(k)) {
            return this.J.get(k);
        }
        final j8 i = this.I;
        q f = null;
        Label_0145: {
            if (i.a.containsKey(k)) {
                final Callable<? extends j> callable = i.a.get(k);
                try {
                    f = (q)callable.call();
                    break Label_0145;
                }
                catch (Exception ex) {
                    final String value = String.valueOf(k);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Failed to create API implementation: ".concat(value);
                    }
                    else {
                        concat = new String("Failed to create API implementation: ");
                    }
                    throw new IllegalStateException(concat);
                }
            }
            f = q.f;
        }
        if (f instanceof j) {
            this.J.put(k, (j)f);
        }
        return f;
    }
}
