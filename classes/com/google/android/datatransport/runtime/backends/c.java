// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.backends;

import androidx.annotation.j0;
import java.util.Objects;
import com.google.android.datatransport.runtime.time.a;
import android.content.Context;

final class c extends i
{
    private final Context b;
    private final a c;
    private final a d;
    private final String e;
    
    c(final Context context, final a a, final a a2, final String s) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.b = context;
        Objects.requireNonNull(a, "Null wallClock");
        this.c = a;
        Objects.requireNonNull(a2, "Null monotonicClock");
        this.d = a2;
        Objects.requireNonNull(s, "Null backendName");
        this.e = s;
    }
    
    @Override
    public Context c() {
        return this.b;
    }
    
    @j0
    @Override
    public String d() {
        return this.e;
    }
    
    @Override
    public a e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i) {
            final i i = (i)o;
            if (!this.b.equals(i.c()) || !this.c.equals(i.f()) || !this.d.equals(i.e()) || !this.e.equals(i.d())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public a f() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        return (((this.b.hashCode() ^ 0xF4243) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CreationContext{applicationContext=");
        sb.append(this.b);
        sb.append(", wallClock=");
        sb.append(this.c);
        sb.append(", monotonicClock=");
        sb.append(this.d);
        sb.append(", backendName=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
