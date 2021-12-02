// 
// Decompiled by Procyon v0.5.36
// 

package androidx.tracing;

import android.os.Trace;
import androidx.annotation.j0;
import androidx.annotation.p0;

@p0(29)
final class d
{
    private d() {
    }
    
    public static void a(@j0 final String s, final int n) {
        Trace.beginAsyncSection(s, n);
    }
    
    public static void b(@j0 final String s, final int n) {
        Trace.endAsyncSection(s, n);
    }
    
    public static void c(@j0 final String s, final int n) {
        Trace.setCounter(s, (long)n);
    }
}
