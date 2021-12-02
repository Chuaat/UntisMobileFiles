// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.time.b;
import com.google.android.datatransport.runtime.time.h;
import com.google.android.datatransport.runtime.time.a;
import android.content.Context;

class j
{
    private final Context a;
    private final a b;
    private final a c;
    
    @e6.a
    j(final Context a, @h final a b, @b final a c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    i a(final String s) {
        return i.b(this.a, this.b, this.c, s);
    }
}
