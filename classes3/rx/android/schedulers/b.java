// 
// Decompiled by Procyon v0.5.36
// 

package rx.android.schedulers;

import rx.j;
import java.util.Objects;
import android.os.Handler;

@Deprecated
public final class b extends c
{
    private b(final Handler handler) {
        super(handler);
    }
    
    @Deprecated
    public static b d(final Handler obj) {
        Objects.requireNonNull(obj, "handler == null");
        return new b(obj);
    }
}
