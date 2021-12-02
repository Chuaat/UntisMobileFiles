// 
// Decompiled by Procyon v0.5.36
// 

package d3;

import com.google.firebase.crashlytics.internal.common.g;
import android.content.Context;

public class a implements b
{
    private final Context a;
    private boolean b;
    private String c;
    
    public a(final Context a) {
        this.b = false;
        this.a = a;
    }
    
    @Override
    public String a() {
        if (!this.b) {
            this.c = g.E(this.a);
            this.b = true;
        }
        final String c = this.c;
        if (c != null) {
            return c;
        }
        return null;
    }
}
