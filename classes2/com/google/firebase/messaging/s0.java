// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import com.google.android.gms.tasks.c;
import android.util.Log;
import d6.a;
import com.google.android.gms.tasks.m;
import java.util.Map;
import java.util.concurrent.Executor;

class s0
{
    private final Executor a;
    @d6.a("this")
    private final Map<String, m<String>> b;
    
    s0(final Executor a) {
        this.b = (Map<String, m<String>>)new androidx.collection.a();
        this.a = a;
    }
    
    m<String> a(String obj, final a a) {
        synchronized (this) {
            final m<String> m = this.b.get(obj);
            if (m != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    obj = String.valueOf(obj);
                    if (obj.length() != 0) {
                        obj = "Joining ongoing request for: ".concat(obj);
                    }
                    else {
                        obj = new String("Joining ongoing request for: ");
                    }
                    Log.d("FirebaseMessaging", obj);
                }
                return m;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final String value = String.valueOf(obj);
                String concat;
                if (value.length() != 0) {
                    concat = "Making new request for: ".concat(value);
                }
                else {
                    concat = new String("Making new request for: ");
                }
                Log.d("FirebaseMessaging", concat);
            }
            final m p2 = a.start().p(this.a, (c)new r0(this, obj));
            this.b.put(obj, (m<String>)p2);
            return (m<String>)p2;
        }
    }
    
    interface a
    {
        m<String> start();
    }
}
