// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import x1.g;

public final class n
{
    private n() {
    }
    
    public static <T> g<T> a() {
        return (g<T>)a.G;
    }
    
    private enum a implements g<Object>
    {
        G;
        
        @Override
        public void b(final Object o) {
            p.c(o, "Cannot inject members into a null reference");
        }
    }
}
