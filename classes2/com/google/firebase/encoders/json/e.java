// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.encoders.json;

import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.DateFormat;
import java.io.Writer;
import java.io.StringWriter;
import com.google.firebase.encoders.a;
import androidx.annotation.j0;
import java.io.IOException;
import com.google.firebase.encoders.h;
import com.google.firebase.encoders.f;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.google.firebase.encoders.g;
import i3.b;

public final class e implements i3.b<e>
{
    private static final com.google.firebase.encoders.e<Object> e;
    private static final g<String> f;
    private static final g<Boolean> g;
    private static final b h;
    private final Map<Class<?>, com.google.firebase.encoders.e<?>> a;
    private final Map<Class<?>, g<?>> b;
    private com.google.firebase.encoders.e<Object> c;
    private boolean d;
    
    static {
        e = com.google.firebase.encoders.json.b.a;
        f = d.a;
        g = c.a;
        h = new b();
    }
    
    public e() {
        this.a = new HashMap<Class<?>, com.google.firebase.encoders.e<?>>();
        this.b = new HashMap<Class<?>, g<?>>();
        this.c = com.google.firebase.encoders.json.e.e;
        this.d = false;
        this.q(String.class, com.google.firebase.encoders.json.e.f);
        this.q(Boolean.class, com.google.firebase.encoders.json.e.g);
        this.q(Date.class, com.google.firebase.encoders.json.e.h);
    }
    
    @j0
    public a j() {
        return new a() {
            @Override
            public String a(@j0 final Object o) {
                final StringWriter stringWriter = new StringWriter();
                try {
                    this.b(o, stringWriter);
                    return stringWriter.toString();
                }
                catch (IOException ex) {
                    return stringWriter.toString();
                }
            }
            
            @Override
            public void b(@j0 final Object o, @j0 final Writer writer) throws IOException {
                final com.google.firebase.encoders.json.f f = new com.google.firebase.encoders.json.f(writer, com.google.firebase.encoders.json.e.this.a, com.google.firebase.encoders.json.e.this.b, com.google.firebase.encoders.json.e.this.c, com.google.firebase.encoders.json.e.this.d);
                f.s(o, false);
                f.C();
            }
        };
    }
    
    @j0
    public e k(@j0 final i3.a a) {
        a.a(this);
        return this;
    }
    
    @j0
    public e l(final boolean d) {
        this.d = d;
        return this;
    }
    
    @j0
    public <T> e p(@j0 final Class<T> clazz, @j0 final com.google.firebase.encoders.e<? super T> e) {
        this.a.put(clazz, e);
        this.b.remove(clazz);
        return this;
    }
    
    @j0
    public <T> e q(@j0 final Class<T> clazz, @j0 final g<? super T> g) {
        this.b.put(clazz, g);
        this.a.remove(clazz);
        return this;
    }
    
    @j0
    public e r(@j0 final com.google.firebase.encoders.e<Object> c) {
        this.c = c;
        return this;
    }
    
    private static final class b implements g<Date>
    {
        private static final DateFormat a;
        
        static {
            (a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US)).setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        
        public void b(@j0 final Date date, @j0 final h h) throws IOException {
            h.h0(b.a.format(date));
        }
    }
}
