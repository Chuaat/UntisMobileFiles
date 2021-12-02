// 
// Decompiled by Procyon v0.5.36
// 

package rx.observers;

import rx.f;
import java.util.concurrent.TimeUnit;
import java.util.Collection;
import rx.exceptions.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.List;
import rx.h;
import rx.n;

public class j<T> extends n<T>
{
    private static final h<Object> S;
    private final h<T> L;
    private final List<T> M;
    private final List<Throwable> N;
    private int O;
    private final CountDownLatch P;
    private volatile int Q;
    private volatile Thread R;
    
    static {
        S = new h<Object>() {
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
    
    public j() {
        this(-1L);
    }
    
    public j(final long n) {
        this(j.S, n);
    }
    
    public j(final h<T> h) {
        this(h, -1L);
    }
    
    public j(final h<T> h, final long n) {
        this.P = new CountDownLatch(1);
        Objects.requireNonNull(h);
        this.L = h;
        if (n >= 0L) {
            this.v(n);
        }
        this.M = new ArrayList<T>();
        this.N = new ArrayList<Throwable>();
    }
    
    public j(final n<T> n) {
        this(n, -1L);
    }
    
    private void C(final T obj, final int n) {
        final T value = this.M.get(n);
        String s;
        if (obj == null) {
            if (value == null) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Value at index: ");
            sb.append(n);
            sb.append(" expected: [null] but was: [");
            sb.append(value);
            sb.append("]\n");
            s = sb.toString();
        }
        else {
            if (obj.equals(value)) {
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Value at index: ");
            sb2.append(n);
            sb2.append(" expected: [");
            sb2.append(obj);
            sb2.append("] (");
            sb2.append(obj.getClass().getSimpleName());
            sb2.append(") but was: [");
            sb2.append(value);
            sb2.append("] (");
            String simpleName;
            if (value != null) {
                simpleName = value.getClass().getSimpleName();
            }
            else {
                simpleName = "null";
            }
            sb2.append(simpleName);
            sb2.append(")\n");
            s = sb2.toString();
        }
        this.W(s);
    }
    
    public static <T> j<T> e0() {
        return new j<T>();
    }
    
    public static <T> j<T> f0(final long n) {
        return new j<T>(n);
    }
    
    public static <T> j<T> g0(final h<T> h) {
        return new j<T>(h);
    }
    
    public static <T> j<T> h0(final h<T> h, final long n) {
        return new j<T>(h, n);
    }
    
    public static <T> j<T> j0(final n<T> n) {
        return new j<T>(n);
    }
    
    public void A(final Throwable obj) {
        final List<Throwable> n = this.N;
        String string;
        if (n.isEmpty()) {
            string = "No errors";
        }
        else if (n.size() > 1) {
            string = "Multiple errors";
        }
        else {
            if (obj.equals(n.get(0))) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Exceptions differ; expected: ");
            sb.append(obj);
            sb.append(", actual: ");
            sb.append(n.get(0));
            string = sb.toString();
        }
        this.W(string);
    }
    
    public void D() {
        if (!this.l0().isEmpty()) {
            this.W("Unexpected onError events");
        }
    }
    
    public Thread E() {
        return this.R;
    }
    
    public void F() {
        final List<Throwable> n = this.N;
        final int o = this.O;
        if (!n.isEmpty() || o > 0) {
            StringBuilder sb;
            if (n.isEmpty()) {
                sb = new StringBuilder();
            }
            else if (n.size() == 1) {
                sb = new StringBuilder();
            }
            else {
                sb = new StringBuilder();
            }
            sb.append("Found ");
            sb.append(n.size());
            sb.append(" errors and ");
            sb.append(o);
            sb.append(" completion events instead of none");
            this.W(sb.toString());
        }
    }
    
    public void G() {
        final int size = this.M.size();
        if (size != 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No onNext events expected yet some received: ");
            sb.append(size);
            this.W(sb.toString());
        }
    }
    
    public void H() {
        final int o = this.O;
        String string;
        if (o == 1) {
            string = "Completed!";
        }
        else {
            if (o <= 1) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Completed multiple times: ");
            sb.append(o);
            string = sb.toString();
        }
        this.W(string);
    }
    
    public void J(final List<T> obj) {
        if (this.M.size() != obj.size()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Number of items does not match. Provided: ");
            sb.append(obj.size());
            sb.append("  Actual: ");
            sb.append(this.M.size());
            sb.append(".\nProvided values: ");
            sb.append(obj);
            sb.append("\nActual values: ");
            sb.append(this.M);
            sb.append("\n");
            this.W(sb.toString());
        }
        for (int i = 0; i < obj.size(); ++i) {
            this.C(obj.get(i), i);
        }
    }
    
    public void K() {
        if (this.N.size() > 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Too many onError events: ");
            sb.append(this.N.size());
            this.W(sb.toString());
        }
        if (this.O > 1) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Too many onCompleted events: ");
            sb2.append(this.O);
            this.W(sb2.toString());
        }
        if (this.O == 1 && this.N.size() == 1) {
            this.W("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.O == 0 && this.N.isEmpty()) {
            this.W("No terminal events received.");
        }
    }
    
    public void L() {
        if (!this.g()) {
            this.W("Not unsubscribed.");
        }
    }
    
    public void M(final T o) {
        this.J(Collections.singletonList(o));
    }
    
    public void N(final int i) {
        final int size = this.M.size();
        if (size != i) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Number of onNext events differ; expected: ");
            sb.append(i);
            sb.append(", actual: ");
            sb.append(size);
            this.W(sb.toString());
        }
    }
    
    public void R(final T... a) {
        this.J(Arrays.asList(a));
    }
    
    public final void S(T t, final T... array) {
        this.N(array.length + 1);
        this.C(t, 0);
        int i = 0;
        while (i < array.length) {
            t = array[i];
            ++i;
            this.C(t, i);
        }
        this.M.clear();
        this.Q = 0;
    }
    
    public List<T> T() {
        return this.M;
    }
    
    final void W(final String str) {
        final StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        final int o = this.O;
        sb.append(o);
        sb.append(" completion");
        if (o != 1) {
            sb.append('s');
        }
        sb.append(')');
        if (!this.N.isEmpty()) {
            final int size = this.N.size();
            sb.append(" (+");
            sb.append(size);
            sb.append(" error");
            if (size != 1) {
                sb.append('s');
            }
            sb.append(')');
        }
        final AssertionError assertionError = new AssertionError((Object)sb.toString());
        if (!this.N.isEmpty()) {
            Throwable cause;
            if (this.N.size() == 1) {
                cause = this.N.get(0);
            }
            else {
                cause = new b(this.N);
            }
            assertionError.initCause(cause);
        }
        throw assertionError;
    }
    
    public void X() {
        try {
            this.P.await();
        }
        catch (InterruptedException cause) {
            throw new IllegalStateException("Interrupted", cause);
        }
    }
    
    public void Y(final long timeout, final TimeUnit unit) {
        try {
            this.P.await(timeout, unit);
        }
        catch (InterruptedException cause) {
            throw new IllegalStateException("Interrupted", cause);
        }
    }
    
    public void Z(final long timeout, final TimeUnit unit) {
        try {
            if (!this.P.await(timeout, unit)) {
                this.i();
            }
        }
        catch (InterruptedException ex) {
            this.i();
        }
    }
    
    @Override
    public void b(final Throwable t) {
        try {
            this.R = Thread.currentThread();
            this.N.add(t);
            this.L.b(t);
        }
        finally {
            this.P.countDown();
        }
    }
    
    @Override
    public void c() {
        try {
            ++this.O;
            this.R = Thread.currentThread();
            this.L.c();
        }
        finally {
            this.P.countDown();
        }
    }
    
    public final boolean d0(final int n, long n2, final TimeUnit timeUnit) {
        while (n2 != 0L && this.Q < n) {
            try {
                timeUnit.sleep(1L);
                --n2;
                continue;
            }
            catch (InterruptedException cause) {
                throw new IllegalStateException("Interrupted", cause);
            }
            break;
        }
        return this.Q >= n;
    }
    
    public List<Throwable> l0() {
        return this.N;
    }
    
    @Override
    public void m(final T t) {
        this.R = Thread.currentThread();
        this.M.add(t);
        this.Q = this.M.size();
        this.L.m(t);
    }
    
    @Deprecated
    public List<f<T>> m0() {
        final int o = this.O;
        int initialCapacity;
        if (o != 0) {
            initialCapacity = o;
        }
        else {
            initialCapacity = 1;
        }
        final ArrayList list = new ArrayList<f<Object>>(initialCapacity);
        for (int i = 0; i < o; ++i) {
            list.add(f.b());
        }
        return (List<f<T>>)list;
    }
    
    public void p0(final long n) {
        this.v(n);
    }
    
    public final int r0() {
        return this.O;
    }
    
    public final int v0() {
        return this.Q;
    }
    
    public void w() {
        final int o = this.O;
        String string;
        if (o == 0) {
            string = "Not completed!";
        }
        else {
            if (o <= 1) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Completed multiple times: ");
            sb.append(o);
            string = sb.toString();
        }
        this.W(string);
    }
    
    public void x(final Class<? extends Throwable> obj) {
        final List<Throwable> n = this.N;
        if (n.isEmpty()) {
            this.W("No errors");
        }
        else {
            if (n.size() > 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Multiple errors: ");
                sb.append(n.size());
                final AssertionError assertionError = new AssertionError((Object)sb.toString());
                assertionError.initCause(new b(n));
                throw assertionError;
            }
            if (!obj.isInstance(n.get(0))) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Exceptions differ; expected: ");
                sb2.append(obj);
                sb2.append(", actual: ");
                sb2.append(n.get(0));
                final AssertionError assertionError2 = new AssertionError((Object)sb2.toString());
                assertionError2.initCause(n.get(0));
                throw assertionError2;
            }
        }
    }
}
