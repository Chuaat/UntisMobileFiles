// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.utils;

import android.view.View;

public class d
{
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    public void a(final View view) {
        this.b = view.getLeft();
        this.c = view.getTop();
        this.d = view.getRight();
        this.e = view.getBottom();
        this.a = view.getRotation();
    }
    
    public int b() {
        return this.e - this.c;
    }
    
    public int c() {
        return this.d - this.b;
    }
}
