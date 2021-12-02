// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.log;

import com.google.firebase.crashlytics.internal.f;
import com.google.firebase.crashlytics.internal.common.g;
import androidx.annotation.k0;
import java.util.Set;
import java.io.File;
import android.content.Context;

public class b
{
    private static final String d = "com.crashlytics.CollectCustomLogs";
    private static final String e = ".temp";
    private static final String f = "crashlytics-userlog-";
    private static final c g;
    static final int h = 65536;
    private final Context a;
    private final b b;
    private a c;
    
    static {
        g = new c();
    }
    
    public b(final Context context, final b b) {
        this(context, b, null);
    }
    
    public b(final Context a, final b b, final String s) {
        this.a = a;
        this.b = b;
        this.c = com.google.firebase.crashlytics.internal.log.b.g;
        this.g(s);
    }
    
    private String e(final File file) {
        final String name = file.getName();
        final int lastIndex = name.lastIndexOf(".temp");
        if (lastIndex == -1) {
            return name;
        }
        return name.substring(20, lastIndex);
    }
    
    private File f(String string) {
        final StringBuilder sb = new StringBuilder();
        sb.append("crashlytics-userlog-");
        sb.append(string);
        sb.append(".temp");
        string = sb.toString();
        return new File(this.b.a(), string);
    }
    
    public void a() {
        this.c.d();
    }
    
    public void b(final Set<String> set) {
        final File[] listFiles = this.b.a().listFiles();
        if (listFiles != null) {
            for (final File file : listFiles) {
                if (!set.contains(this.e(file))) {
                    file.delete();
                }
            }
        }
    }
    
    public byte[] c() {
        return this.c.c();
    }
    
    @k0
    public String d() {
        return this.c.b();
    }
    
    public final void g(final String s) {
        this.c.a();
        this.c = com.google.firebase.crashlytics.internal.log.b.g;
        if (s == null) {
            return;
        }
        if (!com.google.firebase.crashlytics.internal.common.g.k(this.a, "com.crashlytics.CollectCustomLogs", true)) {
            com.google.firebase.crashlytics.internal.f.f().b("Preferences requested no custom logs. Aborting log file creation.");
            return;
        }
        this.h(this.f(s), 65536);
    }
    
    void h(final File file, final int n) {
        this.c = new d(file, n);
    }
    
    public void i(final long n, final String s) {
        this.c.e(n, s);
    }
    
    public interface b
    {
        File a();
    }
    
    private static final class c implements a
    {
        @Override
        public void a() {
        }
        
        @Override
        public String b() {
            return null;
        }
        
        @Override
        public byte[] c() {
            return null;
        }
        
        @Override
        public void d() {
        }
        
        @Override
        public void e(final long n, final String s) {
        }
    }
}
