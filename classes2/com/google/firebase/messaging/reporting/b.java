// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging.reporting;

import java.io.IOException;
import java.io.OutputStream;
import com.google.android.gms.internal.firebase_messaging.k;
import com.google.android.gms.internal.firebase_messaging.f0;
import androidx.annotation.j0;

public final class b
{
    private static final b b;
    private final com.google.firebase.messaging.reporting.a a;
    
    static {
        b = new a().a();
    }
    
    b(final com.google.firebase.messaging.reporting.a a) {
        this.a = a;
    }
    
    @j0
    public static b a() {
        return com.google.firebase.messaging.reporting.b.b;
    }
    
    @j0
    public static a d() {
        return new a();
    }
    
    @h3.a.b
    @j0
    public com.google.firebase.messaging.reporting.a b() {
        com.google.firebase.messaging.reporting.a a;
        if ((a = this.a) == null) {
            a = com.google.firebase.messaging.reporting.a.f();
        }
        return a;
    }
    
    @h3.a.a(name = "messagingClientEvent")
    @j0
    @f0(zza = 1)
    public com.google.firebase.messaging.reporting.a c() {
        return this.a;
    }
    
    @j0
    public byte[] e() {
        return k.a((Object)this);
    }
    
    public void f(@j0 final OutputStream outputStream) throws IOException {
        k.b((Object)this, outputStream);
    }
    
    public static final class a
    {
        private com.google.firebase.messaging.reporting.a a;
        
        a() {
            this.a = null;
        }
        
        @j0
        public b a() {
            return new b(this.a);
        }
        
        @j0
        public a b(@j0 final com.google.firebase.messaging.reporting.a a) {
            this.a = a;
            return this;
        }
    }
}
