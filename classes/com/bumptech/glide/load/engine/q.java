// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import androidx.annotation.j0;
import java.io.PrintWriter;
import java.io.PrintStream;
import android.util.Log;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Iterator;
import java.util.Collections;
import androidx.annotation.k0;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.g;
import java.util.List;

public final class q extends Exception
{
    private static final long M = 1L;
    private static final StackTraceElement[] N;
    private final List<Throwable> G;
    private g H;
    private com.bumptech.glide.load.a I;
    private Class<?> J;
    private String K;
    @k0
    private Exception L;
    
    static {
        N = new StackTraceElement[0];
    }
    
    public q(final String s) {
        this(s, Collections.emptyList());
    }
    
    public q(final String s, final Throwable o) {
        this(s, Collections.singletonList(o));
    }
    
    public q(final String k, final List<Throwable> g) {
        this.K = k;
        this.setStackTrace(q.N);
        this.G = g;
    }
    
    private void a(final Throwable t, final List<Throwable> list) {
        if (t instanceof q) {
            final Iterator<Throwable> iterator = ((q)t).e().iterator();
            while (iterator.hasNext()) {
                this.a(iterator.next(), list);
            }
        }
        else {
            list.add(t);
        }
    }
    
    private static void b(final List<Throwable> list, final Appendable appendable) {
        try {
            c(list, appendable);
        }
        catch (IOException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    private static void c(final List<Throwable> list, final Appendable appendable) throws IOException {
        int j;
        for (int size = list.size(), i = 0; i < size; i = j) {
            final Appendable append = appendable.append("Cause (");
            j = i + 1;
            append.append(String.valueOf(j)).append(" of ").append(String.valueOf(size)).append("): ");
            final Throwable t = list.get(i);
            if (t instanceof q) {
                ((q)t).i(appendable);
            }
            else {
                d(t, appendable);
            }
        }
    }
    
    private static void d(final Throwable cause, final Appendable appendable) {
        try {
            appendable.append(cause.getClass().toString()).append(": ").append(cause.getMessage()).append('\n');
        }
        catch (IOException ex) {
            throw new RuntimeException(cause);
        }
    }
    
    private void i(final Appendable appendable) {
        d(this, appendable);
        b(this.e(), new a(appendable));
    }
    
    public List<Throwable> e() {
        return this.G;
    }
    
    @k0
    public Exception f() {
        return this.L;
    }
    
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
    
    public List<Throwable> g() {
        final ArrayList<Throwable> list = new ArrayList<Throwable>();
        this.a(this, list);
        return list;
    }
    
    @Override
    public String getMessage() {
        final StringBuilder sb = new StringBuilder(71);
        sb.append(this.K);
        final Class<?> j = this.J;
        final String s = "";
        String string;
        if (j != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(this.J);
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        String string2;
        if (this.I != null) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(", ");
            sb3.append(this.I);
            string2 = sb3.toString();
        }
        else {
            string2 = "";
        }
        sb.append(string2);
        String string3 = s;
        if (this.H != null) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(", ");
            sb4.append(this.H);
            string3 = sb4.toString();
        }
        sb.append(string3);
        final List<Throwable> g = this.g();
        if (g.isEmpty()) {
            return sb.toString();
        }
        String str;
        if (g.size() == 1) {
            str = "\nThere was 1 cause:";
        }
        else {
            sb.append("\nThere were ");
            sb.append(g.size());
            str = " causes:";
        }
        sb.append(str);
        for (final Throwable t : g) {
            sb.append('\n');
            sb.append(t.getClass().getName());
            sb.append('(');
            sb.append(t.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }
    
    public void h(final String s) {
        final List<Throwable> g = this.g();
        int j;
        for (int size = g.size(), i = 0; i < size; i = j) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            j = i + 1;
            sb.append(j);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(s, sb.toString(), (Throwable)g.get(i));
        }
    }
    
    void j(final g g, final com.bumptech.glide.load.a a) {
        this.k(g, a, null);
    }
    
    void k(final g h, final com.bumptech.glide.load.a i, final Class<?> j) {
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void l(@k0 final Exception l) {
        this.L = l;
    }
    
    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }
    
    @Override
    public void printStackTrace(final PrintStream printStream) {
        this.i(printStream);
    }
    
    @Override
    public void printStackTrace(final PrintWriter printWriter) {
        this.i(printWriter);
    }
    
    private static final class a implements Appendable
    {
        private static final String I = "";
        private static final String J = "  ";
        private final Appendable G;
        private boolean H;
        
        a(final Appendable g) {
            this.H = true;
            this.G = g;
        }
        
        @j0
        private CharSequence a(@k0 final CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            if (charSequence == null) {
                charSequence2 = "";
            }
            return charSequence2;
        }
        
        @Override
        public Appendable append(final char c) throws IOException {
            final boolean h = this.H;
            boolean h2 = false;
            if (h) {
                this.H = false;
                this.G.append("  ");
            }
            if (c == '\n') {
                h2 = true;
            }
            this.H = h2;
            this.G.append(c);
            return this;
        }
        
        @Override
        public Appendable append(@k0 CharSequence a) throws IOException {
            a = this.a(a);
            return this.append(a, 0, a.length());
        }
        
        @Override
        public Appendable append(@k0 CharSequence a, final int n, final int n2) throws IOException {
            a = this.a(a);
            final boolean h = this.H;
            final boolean b = false;
            if (h) {
                this.H = false;
                this.G.append("  ");
            }
            boolean h2 = b;
            if (a.length() > 0) {
                h2 = b;
                if (a.charAt(n2 - 1) == '\n') {
                    h2 = true;
                }
            }
            this.H = h2;
            this.G.append(a, n, n2);
            return this;
        }
    }
}
