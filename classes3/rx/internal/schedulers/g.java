// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import rx.j;

public final class g extends j
{
    private final ThreadFactory a;
    
    public g(final ThreadFactory a) {
        this.a = a;
    }
    
    @Override
    public a a() {
        return new h(this.a);
    }
}
