// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class h0 extends Writer
{
    private final String G;
    private StringBuilder H;
    
    h0(final String g) {
        this.H = new StringBuilder(128);
        this.G = g;
    }
    
    private void a() {
        if (this.H.length() > 0) {
            Log.d(this.G, this.H.toString());
            final StringBuilder h = this.H;
            h.delete(0, h.length());
        }
    }
    
    @Override
    public void close() {
        this.a();
    }
    
    @Override
    public void flush() {
        this.a();
    }
    
    @Override
    public void write(final char[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final char c = array[n + i];
            if (c == '\n') {
                this.a();
            }
            else {
                this.H.append(c);
            }
        }
    }
}
