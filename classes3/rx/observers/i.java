// 
// Decompiled by Procyon v0.5.36
// 

package rx.observers;

import java.util.Collection;
import rx.exceptions.b;
import java.util.Collections;
import java.util.ArrayList;
import rx.f;
import java.util.List;
import rx.h;

@Deprecated
public class i<T> implements h<T>
{
    private static final h<Object> K;
    private final h<T> G;
    private final List<T> H;
    private final List<Throwable> I;
    private final List<f<T>> J;
    
    static {
        K = new h<Object>() {
            @Override
            public void b(final Throwable t) {
            }
            
            @Override
            public void c() {
            }
            
            @Override
            public void m(final Object o) {
            }
        };
    }
    
    public i() {
        this.H = new ArrayList<T>();
        this.I = new ArrayList<Throwable>();
        this.J = new ArrayList<f<T>>();
        this.G = (h<T>)i.K;
    }
    
    public i(final h<T> g) {
        this.H = new ArrayList<T>();
        this.I = new ArrayList<Throwable>();
        this.J = new ArrayList<f<T>>();
        this.G = g;
    }
    
    public List<T> T() {
        return Collections.unmodifiableList((List<? extends T>)this.H);
    }
    
    @Override
    public void b(final Throwable t) {
        this.I.add(t);
        this.G.b(t);
    }
    
    @Override
    public void c() {
        this.J.add(f.b());
        this.G.c();
    }
    
    public void h(final List<T> obj) {
        if (this.H.size() != obj.size()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Number of items does not match. Provided: ");
            sb.append(obj.size());
            sb.append("  Actual: ");
            sb.append(this.H.size());
            sb.append(".\nProvided values: ");
            sb.append(obj);
            sb.append("\nActual values: ");
            sb.append(this.H);
            sb.append("\n");
            this.k(sb.toString());
        }
        for (int i = 0; i < obj.size(); ++i) {
            final T value = obj.get(i);
            final T value2 = this.H.get(i);
            String s;
            if (value == null) {
                if (value2 == null) {
                    continue;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Value at index: ");
                sb2.append(i);
                sb2.append(" expected to be [null] but was: [");
                sb2.append(value2);
                sb2.append("]\n");
                s = sb2.toString();
            }
            else {
                if (value.equals(value2)) {
                    continue;
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Value at index: ");
                sb3.append(i);
                sb3.append(" expected to be [");
                sb3.append(value);
                sb3.append("] (");
                sb3.append(value.getClass().getSimpleName());
                sb3.append(") but was: [");
                sb3.append(value2);
                sb3.append("] (");
                String simpleName;
                if (value2 != null) {
                    simpleName = value2.getClass().getSimpleName();
                }
                else {
                    simpleName = "null";
                }
                sb3.append(simpleName);
                sb3.append(")\n");
                s = sb3.toString();
            }
            this.k(s);
        }
    }
    
    public void j() {
        if (this.I.size() > 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Too many onError events: ");
            sb.append(this.I.size());
            this.k(sb.toString());
        }
        if (this.J.size() > 1) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Too many onCompleted events: ");
            sb2.append(this.J.size());
            this.k(sb2.toString());
        }
        if (this.J.size() == 1 && this.I.size() == 1) {
            this.k("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.J.isEmpty() && this.I.isEmpty()) {
            this.k("No terminal events received.");
        }
    }
    
    final void k(final String str) {
        final StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        final int size = this.J.size();
        sb.append(size);
        sb.append(" completion");
        if (size != 1) {
            sb.append('s');
        }
        sb.append(')');
        if (!this.I.isEmpty()) {
            final int size2 = this.I.size();
            sb.append(" (+");
            sb.append(size2);
            sb.append(" error");
            if (size2 != 1) {
                sb.append('s');
            }
            sb.append(')');
        }
        final AssertionError assertionError = new AssertionError((Object)sb.toString());
        if (!this.I.isEmpty()) {
            Throwable cause;
            if (this.I.size() == 1) {
                cause = this.I.get(0);
            }
            else {
                cause = new b(this.I);
            }
            assertionError.initCause(cause);
        }
        throw assertionError;
    }
    
    public List<Object> l() {
        final ArrayList<List<T>> list = new ArrayList<List<T>>();
        list.add(this.H);
        list.add((List<T>)this.I);
        list.add((List<T>)this.J);
        return Collections.unmodifiableList((List<?>)list);
    }
    
    public List<Throwable> l0() {
        return Collections.unmodifiableList((List<? extends Throwable>)this.I);
    }
    
    @Override
    public void m(final T t) {
        this.H.add(t);
        this.G.m(t);
    }
    
    public List<f<T>> n() {
        return Collections.unmodifiableList((List<? extends f<T>>)this.J);
    }
}
