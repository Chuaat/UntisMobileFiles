// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.abt.component;

import androidx.annotation.b1;
import java.util.HashMap;
import android.content.Context;
import androidx.annotation.w;
import com.google.firebase.abt.d;
import java.util.Map;

public class a
{
    @w("this")
    private final Map<String, d> a;
    private final Context b;
    private final com.google.firebase.analytics.connector.a c;
    
    @b1(otherwise = 3)
    protected a(final Context b, final com.google.firebase.analytics.connector.a c) {
        this.a = new HashMap<String, d>();
        this.b = b;
        this.c = c;
    }
    
    @b1
    protected d a(final String s) {
        return new d(this.b, this.c, s);
    }
    
    public d b(final String s) {
        synchronized (this) {
            if (!this.a.containsKey(s)) {
                this.a.put(s, this.a(s));
            }
            return this.a.get(s);
        }
    }
}
