// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.heartbeatinfo;

import java.util.List;
import com.google.android.gms.tasks.m;
import androidx.annotation.j0;

public interface k
{
    @j0
    m<Void> a(@j0 final String p0);
    
    @j0
    a b(@j0 final String p0);
    
    @j0
    m<List<com.google.firebase.heartbeatinfo.m>> c();
    
    public enum a
    {
        H(0), 
        I(1), 
        J(2), 
        K(3);
        
        private final int G;
        
        private a(final int g) {
            this.G = g;
        }
        
        public int b() {
            return this.G;
        }
    }
}
