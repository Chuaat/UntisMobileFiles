// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.f;

public class e0
{
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    public void a(final f f) {
        this.b = f.l();
        this.c = f.w();
        this.d = f.q();
        this.e = f.h();
        this.a = (float)(int)f.t();
    }
    
    public int b() {
        return this.e - this.c;
    }
    
    public int c() {
        return this.d - this.b;
    }
}
