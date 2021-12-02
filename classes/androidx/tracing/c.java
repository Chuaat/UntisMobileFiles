// 
// Decompiled by Procyon v0.5.36
// 

package androidx.tracing;

import android.os.Trace;
import androidx.annotation.j0;
import androidx.annotation.p0;

@p0(18)
final class c
{
    private c() {
    }
    
    public static void a(@j0 final String s) {
        Trace.beginSection(s);
    }
    
    public static void b() {
        Trace.endSection();
    }
}
