// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.io.FilenameFilter;
import java.io.File;
import java.io.IOException;
import android.util.Log;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public class f
{
    private static final String g = "lib";
    protected final Set<String> a;
    protected final e.b b;
    protected final e.a c;
    protected boolean d;
    protected boolean e;
    protected e.d f;
    
    protected f() {
        this(new g(), new a());
    }
    
    protected f(final e.b b, final e.a c) {
        this.a = new HashSet<String>();
        if (b == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (c != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null library installer");
    }
    
    private void j(final Context context, final String s, final String s2) {
        if (this.a.contains(s) && !this.d) {
            this.m("%s already loaded previously!", s);
            return;
        }
        try {
            this.b.b(s);
            this.a.add(s);
            this.m("%s (%s) was loaded normally!", s, s2);
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            this.m("Loading the library normally failed: %s", Log.getStackTraceString((Throwable)unsatisfiedLinkError));
            this.m("%s (%s) was not loaded normally, re-linking...", s, s2);
            final File e = this.e(context, s, s2);
            if (!e.exists() || this.d) {
                if (this.d) {
                    this.m("Forcing a re-link of %s (%s)...", s, s2);
                }
                this.b(context, s, s2);
                this.c.a(context, this.b.d(), this.b.a(s), e, this);
            }
            try {
                if (this.e) {
                    Object o = null;
                    try {
                        Object o2 = new com.getkeepsafe.relinker.elf.f(e);
                        try {
                            o = ((com.getkeepsafe.relinker.elf.f)o2).c();
                            ((com.getkeepsafe.relinker.elf.f)o2).close();
                            o = ((List<String>)o).iterator();
                            while (((Iterator)o).hasNext()) {
                                o2 = ((Iterator<String>)o).next();
                                this.f(context, this.b.c((String)o2));
                            }
                        }
                        finally {
                            o = o2;
                        }
                    }
                    finally {}
                    ((com.getkeepsafe.relinker.elf.f)o).close();
                }
                this.b.e(e.getAbsolutePath());
                this.a.add(s);
                this.m("%s (%s) was re-linked!", s, s2);
            }
            catch (IOException ex) {}
        }
    }
    
    protected void b(final Context context, final String s, final String s2) {
        final File d = this.d(context);
        final File e = this.e(context, s, s2);
        final File[] listFiles = d.listFiles(new FilenameFilter() {
            final /* synthetic */ String a = com.getkeepsafe.relinker.f.this.b.a(s);
            
            @Override
            public boolean accept(final File file, final String s) {
                return s.startsWith(this.a);
            }
        });
        if (listFiles == null) {
            return;
        }
        for (final File file : listFiles) {
            if (this.d || !file.getAbsolutePath().equals(e.getAbsolutePath())) {
                file.delete();
            }
        }
    }
    
    public f c() {
        this.d = true;
        return this;
    }
    
    protected File d(final Context context) {
        return context.getDir("lib", 0);
    }
    
    protected File e(final Context context, String a, final String str) {
        a = this.b.a(a);
        if (h.a(str)) {
            return new File(this.d(context), a);
        }
        final File d = this.d(context);
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".");
        sb.append(str);
        return new File(d, sb.toString());
    }
    
    public void f(final Context context, final String s) {
        this.i(context, s, null, null);
    }
    
    public void g(final Context context, final String s, final e.c c) {
        this.i(context, s, null, c);
    }
    
    public void h(final Context context, final String s, final String s2) {
        this.i(context, s, s2, null);
    }
    
    public void i(final Context context, final String s, final String s2, final e.c c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (!h.a(s)) {
            this.m("Beginning load of %s...", s);
            if (c == null) {
                this.j(context, s, s2);
            }
            else {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            com.getkeepsafe.relinker.f.this.j(context, s, s2);
                            c.a();
                            return;
                        }
                        catch (c c) {}
                        catch (UnsatisfiedLinkError unsatisfiedLinkError) {}
                        final c c;
                        c.b(c);
                    }
                }).start();
            }
            return;
        }
        throw new IllegalArgumentException("Given library is either null or empty");
    }
    
    public f k(final e.d f) {
        this.f = f;
        return this;
    }
    
    public void l(final String s) {
        final e.d f = this.f;
        if (f != null) {
            f.a(s);
        }
    }
    
    public void m(final String format, final Object... args) {
        this.l(String.format(Locale.US, format, args));
    }
    
    public f n() {
        this.e = true;
        return this;
    }
}
