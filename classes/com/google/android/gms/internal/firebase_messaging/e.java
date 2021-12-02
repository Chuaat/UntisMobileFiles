// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import androidx.annotation.j0;
import java.util.HashMap;
import com.google.firebase.encoders.g;
import java.util.Map;
import i3.b;

public final class e implements b<e>
{
    private static final com.google.firebase.encoders.e<Object> d;
    private final Map<Class<?>, com.google.firebase.encoders.e<?>> a;
    private final Map<Class<?>, g<?>> b;
    private final com.google.firebase.encoders.e<Object> c;
    
    static {
        d = com.google.android.gms.internal.firebase_messaging.d.a;
    }
    
    public e() {
        this.a = new HashMap<Class<?>, com.google.firebase.encoders.e<?>>();
        this.b = new HashMap<Class<?>, g<?>>();
        this.c = com.google.android.gms.internal.firebase_messaging.e.d;
    }
    
    public final f c() {
        return new f(new HashMap<Class<?>, com.google.firebase.encoders.e<?>>(this.a), new HashMap<Class<?>, g<?>>(this.b), this.c);
    }
}
