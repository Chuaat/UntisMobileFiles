// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.gif;

import androidx.annotation.j0;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.resource.drawable.b;

public class e extends b<c> implements r
{
    public e(final c c) {
        super(c);
    }
    
    @Override
    public void a() {
        ((c)super.G).stop();
        ((c)super.G).p();
    }
    
    @Override
    public void b() {
        ((c)super.G).h().prepareToDraw();
    }
    
    @Override
    public int l0() {
        return ((c)super.G).m();
    }
    
    @j0
    @Override
    public Class<c> m0() {
        return c.class;
    }
}
