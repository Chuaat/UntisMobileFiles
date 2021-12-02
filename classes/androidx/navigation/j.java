// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.y;

public final class j
{
    @y
    private final int a;
    private o0 b;
    private Bundle c;
    
    public j(@y final int n) {
        this(n, null);
    }
    
    public j(@y final int n, @k0 final o0 o0) {
        this(n, o0, null);
    }
    
    public j(@y final int a, @k0 final o0 b, @k0 final Bundle c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @k0
    public Bundle a() {
        return this.c;
    }
    
    public int b() {
        return this.a;
    }
    
    @k0
    public o0 c() {
        return this.b;
    }
    
    public void d(@k0 final Bundle c) {
        this.c = c;
    }
    
    public void e(@k0 final o0 b) {
        this.b = b;
    }
}
