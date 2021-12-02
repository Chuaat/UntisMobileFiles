// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.tz;

import org.joda.time.i;
import java.util.Collections;
import java.util.Set;

public final class g implements f
{
    private static final Set<String> a;
    
    static {
        a = Collections.singleton("UTC");
    }
    
    @Override
    public i a(final String anotherString) {
        if ("UTC".equalsIgnoreCase(anotherString)) {
            return i.I;
        }
        return null;
    }
    
    @Override
    public Set<String> b() {
        return g.a;
    }
}
