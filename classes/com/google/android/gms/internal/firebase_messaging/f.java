// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.io.OutputStream;
import androidx.annotation.j0;
import com.google.firebase.encoders.g;
import com.google.firebase.encoders.e;
import java.util.Map;

public final class f
{
    private final Map<Class<?>, e<?>> a;
    private final Map<Class<?>, g<?>> b;
    private final e<Object> c;
    
    f(final Map<Class<?>, e<?>> a, final Map<Class<?>, g<?>> b, final e<Object> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(@j0 final Object o, @j0 final OutputStream outputStream) throws IOException {
        new c(outputStream, this.a, this.b, this.c).t(o);
    }
}
