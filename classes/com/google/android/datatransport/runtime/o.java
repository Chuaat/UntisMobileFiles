// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import com.google.auto.value.AutoValue$Builder;
import android.util.Base64;
import androidx.annotation.t0;
import androidx.annotation.k0;
import com.google.android.datatransport.e;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class o
{
    public static a a() {
        return new c.b().d(e.G);
    }
    
    public abstract String b();
    
    @k0
    public abstract byte[] c();
    
    @t0({ t0.a.H })
    public abstract e d();
    
    @t0({ t0.a.G })
    public o e(final e e) {
        return a().b(this.b()).d(e).c(this.c()).a();
    }
    
    @Override
    public final String toString() {
        final String b = this.b();
        final e d = this.d();
        String encodeToString;
        if (this.c() == null) {
            encodeToString = "";
        }
        else {
            encodeToString = Base64.encodeToString(this.c(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", b, d, encodeToString);
    }
    
    @AutoValue$Builder
    public abstract static class a
    {
        public abstract o a();
        
        public abstract a b(final String p0);
        
        public abstract a c(@k0 final byte[] p0);
        
        @t0({ t0.a.G })
        public abstract a d(final e p0);
    }
}
