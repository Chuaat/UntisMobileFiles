// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.reflect.jvm.internal.impl.utils.c;
import n6.a;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.j2;
import n6.l;
import kotlin.text.s;

public class f implements kotlin.reflect.jvm.internal.impl.storage.n
{
    private static final String d;
    public static final kotlin.reflect.jvm.internal.impl.storage.n e;
    protected final kotlin.reflect.jvm.internal.impl.storage.k a;
    private final f b;
    private final String c;
    
    static {
        d = s.w5(f.class.getCanonicalName(), ".", "");
        e = new f("NO_LOCKS", kotlin.reflect.jvm.internal.impl.storage.f.f.a, kotlin.reflect.jvm.internal.impl.storage.e.b) {
            private static /* synthetic */ void j(final int n) {
                String format;
                if (n != 1) {
                    format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                }
                else {
                    format = "@NotNull method %s.%s must not return null";
                }
                int n2;
                if (n != 1) {
                    n2 = 3;
                }
                else {
                    n2 = 2;
                }
                final Object[] args = new Object[n2];
                if (n != 1) {
                    args[0] = "source";
                }
                else {
                    args[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
                }
                if (n != 1) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
                }
                else {
                    args[1] = "recursionDetectedDefault";
                }
                if (n != 1) {
                    args[2] = "recursionDetectedDefault";
                }
                final String format2 = String.format(format, args);
                RuntimeException ex;
                if (n != 1) {
                    ex = new IllegalArgumentException(format2);
                }
                else {
                    ex = new IllegalStateException(format2);
                }
                throw ex;
            }
            
            @org.jetbrains.annotations.e
            @Override
            protected <K, V> o<V> p(@org.jetbrains.annotations.e final String s, final K k) {
                if (s == null) {
                    j(0);
                }
                final o<V> a = o.a();
                if (a == null) {
                    j(1);
                }
                return a;
            }
        };
    }
    
    public f(final String s) {
        this(s, null, (n6.l<InterruptedException, j2>)null);
    }
    
    public f(final String s, @f final Runnable runnable, @f final n6.l<InterruptedException, j2> l) {
        this(s, kotlin.reflect.jvm.internal.impl.storage.f.f.a, kotlin.reflect.jvm.internal.impl.storage.k.a.a(runnable, l));
    }
    
    private f(@org.jetbrains.annotations.e final String c, @org.jetbrains.annotations.e final f b, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.k a) {
        if (c == null) {
            j(4);
        }
        if (b == null) {
            j(5);
        }
        if (a == null) {
            j(6);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private static /* synthetic */ void j(final int n) {
        String format;
        if (n != 10 && n != 13 && n != 20 && n != 37) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 10 && n != 13 && n != 20 && n != 37) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        Label_0309: {
            if (n != 1 && n != 3 && n != 5) {
                if (n == 6) {
                    args[0] = "lock";
                    break Label_0309;
                }
                switch (n) {
                    default: {
                        args[0] = "debugText";
                        break Label_0309;
                    }
                    case 36: {
                        args[0] = "throwable";
                        break Label_0309;
                    }
                    case 35: {
                        args[0] = "source";
                        break Label_0309;
                    }
                    case 29:
                    case 33: {
                        args[0] = "postCompute";
                        break Label_0309;
                    }
                    case 23:
                    case 24:
                    case 26:
                    case 28:
                    case 30:
                    case 31:
                    case 32:
                    case 34: {
                        args[0] = "computable";
                        break Label_0309;
                    }
                    case 15:
                    case 18:
                    case 22: {
                        args[0] = "map";
                        break Label_0309;
                    }
                    case 12:
                    case 17:
                    case 25:
                    case 27: {
                        args[0] = "onRecursiveCall";
                        break Label_0309;
                    }
                    case 10:
                    case 13:
                    case 20:
                    case 37: {
                        args[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                        break Label_0309;
                    }
                    case 9:
                    case 11:
                    case 14:
                    case 16:
                    case 19:
                    case 21: {
                        args[0] = "compute";
                        break Label_0309;
                    }
                    case 8: {
                        break;
                    }
                }
            }
            args[0] = "exceptionHandlingStrategy";
        }
        if (n != 10 && n != 13) {
            if (n != 20) {
                if (n != 37) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                }
                else {
                    args[1] = "sanitizeStackTrace";
                }
            }
            else {
                args[1] = "createMemoizedFunctionWithNullableValues";
            }
        }
        else {
            args[1] = "createMemoizedFunction";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "createWithExceptionHandling";
                }
                case 10:
                case 13:
                case 20:
                case 37: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 10 && n != 13 && n != 20 && n != 37) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 36: {
                    args[2] = "sanitizeStackTrace";
                    continue;
                }
                case 35: {
                    args[2] = "recursionDetectedDefault";
                    continue;
                }
                case 34: {
                    args[2] = "compute";
                    continue;
                }
                case 32:
                case 33: {
                    args[2] = "createNullableLazyValueWithPostCompute";
                    continue;
                }
                case 31: {
                    args[2] = "createRecursionTolerantNullableLazyValue";
                    continue;
                }
                case 30: {
                    args[2] = "createNullableLazyValue";
                    continue;
                }
                case 28:
                case 29: {
                    args[2] = "createLazyValueWithPostCompute";
                    continue;
                }
                case 26:
                case 27: {
                    args[2] = "createRecursionTolerantLazyValue";
                    continue;
                }
                case 23:
                case 24:
                case 25: {
                    args[2] = "createLazyValue";
                    continue;
                }
                case 19:
                case 21:
                case 22: {
                    args[2] = "createMemoizedFunctionWithNullableValues";
                    continue;
                }
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18: {
                    args[2] = "createMemoizedFunction";
                    continue;
                }
                case 7:
                case 8: {
                    args[2] = "replaceExceptionHandling";
                    continue;
                }
                case 4:
                case 5:
                case 6: {
                    args[2] = "<init>";
                    continue;
                }
            }
            break;
        }
    }
    
    @org.jetbrains.annotations.e
    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap<K, Object>(3, 1.0f, 2);
    }
    
    @org.jetbrains.annotations.e
    private static <T extends Throwable> T q(@org.jetbrains.annotations.e final T t) {
        if (t == null) {
            j(36);
        }
        final StackTraceElement[] stackTrace = t.getStackTrace();
        final int length = stackTrace.length;
        final int n = -1;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= length) {
                break;
            }
            if (!stackTrace[n2].getClassName().startsWith(kotlin.reflect.jvm.internal.impl.storage.f.d)) {
                n3 = n2;
                break;
            }
            ++n2;
        }
        final List<StackTraceElement> subList = Arrays.asList(stackTrace).subList(n3, length);
        t.setStackTrace(subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> a(@org.jetbrains.annotations.e final a<? extends T> a, @org.jetbrains.annotations.e final T t) {
        if (a == null) {
            j(26);
        }
        if (t == null) {
            j(27);
        }
        return new j<T>(this, a) {
            private static /* synthetic */ void a(final int n) {
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
            }
            
            @org.jetbrains.annotations.e
            @Override
            protected o<T> c(final boolean b) {
                final o<T> d = o.d(t);
                if (d == null) {
                    a(0);
                }
                return d;
            }
        };
    }
    
    @org.jetbrains.annotations.e
    @Override
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.g<K, V> b(@org.jetbrains.annotations.e final n6.l<? super K, ? extends V> l) {
        if (l == null) {
            j(9);
        }
        final kotlin.reflect.jvm.internal.impl.storage.g<K, V> n = this.n(l, m());
        if (n == null) {
            j(10);
        }
        return n;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public <K, V> b<K, V> c() {
        return new e<K, V>(this, (ConcurrentMap)m());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.a<K, V> d() {
        return new d<K, V>(this, (ConcurrentMap)m());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public <T> kotlin.reflect.jvm.internal.impl.storage.j<T> e(@org.jetbrains.annotations.e final a<? extends T> a) {
        if (a == null) {
            j(30);
        }
        return new h<T>(this, a);
    }
    
    @Override
    public <T> T f(@org.jetbrains.annotations.e final a<? extends T> a) {
        if (a == null) {
            j(34);
        }
        this.a.lock();
        try {
            final Object invoke = a.invoke();
            this.a.unlock();
            return (T)invoke;
        }
        finally {
            try {
                final Throwable t;
                throw this.b.a(t);
            }
            finally {
                this.a.unlock();
            }
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> g(@org.jetbrains.annotations.e final a<? extends T> a) {
        if (a == null) {
            j(23);
        }
        return new j<T>(this, a);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> h(@org.jetbrains.annotations.e final a<? extends T> a, final n6.l<? super Boolean, ? extends T> l, @org.jetbrains.annotations.e final n6.l<? super T, j2> i) {
        if (a == null) {
            j(28);
        }
        if (i == null) {
            j(29);
        }
        return new k<T>(this, a) {
            private static /* synthetic */ void a(final int n) {
                String format;
                if (n != 2) {
                    format = "@NotNull method %s.%s must not return null";
                }
                else {
                    format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                }
                int n2;
                if (n != 2) {
                    n2 = 2;
                }
                else {
                    n2 = 3;
                }
                final Object[] args = new Object[n2];
                if (n != 2) {
                    args[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                }
                else {
                    args[0] = "value";
                }
                if (n != 2) {
                    args[1] = "recursionDetected";
                }
                else {
                    args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                }
                if (n == 2) {
                    args[2] = "doPostCompute";
                }
                final String format2 = String.format(format, args);
                RuntimeException ex;
                if (n != 2) {
                    ex = new IllegalStateException(format2);
                }
                else {
                    ex = new IllegalArgumentException(format2);
                }
                throw ex;
            }
            
            @org.jetbrains.annotations.e
            @Override
            protected o<T> c(final boolean b) {
                final n6.l l = l;
                if (l == null) {
                    final o<T> c = super.c(b);
                    if (c == null) {
                        a(0);
                    }
                    return c;
                }
                final o<T> d = o.d(l.invoke((Object)b));
                if (d == null) {
                    a(1);
                }
                return d;
            }
            
            @Override
            protected void g(@org.jetbrains.annotations.e final T t) {
                if (t == null) {
                    a(2);
                }
                i.invoke((Object)t);
            }
        };
    }
    
    @org.jetbrains.annotations.e
    @Override
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.h<K, V> i(@org.jetbrains.annotations.e final n6.l<? super K, ? extends V> l) {
        if (l == null) {
            j(19);
        }
        final kotlin.reflect.jvm.internal.impl.storage.h<K, V> o = this.o(l, m());
        if (o == null) {
            j(20);
        }
        return o;
    }
    
    @org.jetbrains.annotations.e
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.g<K, V> n(@org.jetbrains.annotations.e final n6.l<? super K, ? extends V> l, @org.jetbrains.annotations.e final ConcurrentMap<K, Object> concurrentMap) {
        if (l == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m<K, V>(this, concurrentMap, l);
    }
    
    @org.jetbrains.annotations.e
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.h<K, V> o(@org.jetbrains.annotations.e final n6.l<? super K, ? extends V> l, @org.jetbrains.annotations.e final ConcurrentMap<K, Object> concurrentMap) {
        if (l == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l<K, V>(this, concurrentMap, l);
    }
    
    @org.jetbrains.annotations.e
    protected <K, V> o<V> p(@org.jetbrains.annotations.e String string, final K obj) {
        if (string == null) {
            j(35);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(string);
        if (obj == null) {
            string = "";
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("on input: ");
            sb2.append(obj);
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(" under ");
        sb.append(this);
        throw q(new AssertionError((Object)sb.toString()));
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(this.hashCode()));
        sb.append(" (");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
    
    private static class d<K, V> extends e<K, V> implements a<K, V>
    {
        private d(@org.jetbrains.annotations.e final f f, @org.jetbrains.annotations.e final ConcurrentMap<g<K, V>, Object> concurrentMap) {
            if (f == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            super(f, (ConcurrentMap)concurrentMap);
        }
        
        private static /* synthetic */ void b(final int n) {
            String format;
            if (n != 3) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 3) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        args[0] = "storageManager";
                    }
                    else {
                        args[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
                    }
                }
                else {
                    args[0] = "computation";
                }
            }
            else {
                args[0] = "map";
            }
            if (n != 3) {
                args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            else {
                args[1] = "computeIfAbsent";
            }
            if (n != 2) {
                if (n != 3) {
                    args[2] = "<init>";
                }
            }
            else {
                args[2] = "computeIfAbsent";
            }
            final String format2 = String.format(format, args);
            RuntimeException ex;
            if (n != 3) {
                ex = new IllegalArgumentException(format2);
            }
            else {
                ex = new IllegalStateException(format2);
            }
            throw ex;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public V a(final K k, @org.jetbrains.annotations.e final n6.a<? extends V> a) {
            if (a == null) {
                b(2);
            }
            final V a2 = super.a(k, a);
            if (a2 == null) {
                b(3);
            }
            return a2;
        }
    }
    
    private static class e<K, V> extends l<g<K, V>, V> implements b<K, V>
    {
        private e(@org.jetbrains.annotations.e final f f, @org.jetbrains.annotations.e final ConcurrentMap<g<K, V>, Object> concurrentMap) {
            if (f == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            super(f, concurrentMap, (n6.l<? super g<K, V>, ?>)new n6.l<g<K, V>, V>() {
                public V a(final g<K, V> g) {
                    return (V)((g<Object, Object>)g).b.invoke();
                }
            });
        }
        
        private static /* synthetic */ void b(final int n) {
            final Object[] args = new Object[3];
            if (n != 1) {
                if (n != 2) {
                    args[0] = "storageManager";
                }
                else {
                    args[0] = "computation";
                }
            }
            else {
                args[0] = "map";
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (n != 2) {
                args[2] = "<init>";
            }
            else {
                args[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
        
        @f
        public V a(final K k, @org.jetbrains.annotations.e final a<? extends V> a) {
            if (a == null) {
                b(2);
            }
            return this.invoke((g<K, V>)new g(k, a));
        }
    }
    
    public interface f
    {
        public static final f a = new f() {
            private static /* synthetic */ void b(final int n) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }
            
            @org.jetbrains.annotations.e
            @Override
            public RuntimeException a(@org.jetbrains.annotations.e final Throwable t) {
                if (t == null) {
                    b(0);
                }
                throw kotlin.reflect.jvm.internal.impl.utils.c.b(t);
            }
        };
        
        @org.jetbrains.annotations.e
        RuntimeException a(@org.jetbrains.annotations.e final Throwable p0);
    }
    
    private static class g<K, V>
    {
        private final K a;
        private final a<? extends V> b;
        
        public g(final K a, final a<? extends V> b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((g)o).a));
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }
    
    private static class h<T> implements j<T>
    {
        private final f G;
        private final a<? extends T> H;
        @f
        private volatile Object I;
        
        public h(@org.jetbrains.annotations.e final f g, @org.jetbrains.annotations.e final a<? extends T> h) {
            if (g == null) {
                a(0);
            }
            if (h == null) {
                a(1);
            }
            this.I = n.G;
            this.G = g;
            this.H = h;
        }
        
        private static /* synthetic */ void a(final int n) {
            String format;
            if (n != 2 && n != 3) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 2 && n != 3) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            if (n != 1) {
                if (n != 2 && n != 3) {
                    args[0] = "storageManager";
                }
                else {
                    args[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                }
            }
            else {
                args[0] = "computable";
            }
            if (n != 2) {
                if (n != 3) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                }
                else {
                    args[1] = "renderDebugInformation";
                }
            }
            else {
                args[1] = "recursionDetected";
            }
            if (n != 2 && n != 3) {
                args[2] = "<init>";
            }
            final String format2 = String.format(format, args);
            RuntimeException ex;
            if (n != 2 && n != 3) {
                ex = new IllegalArgumentException(format2);
            }
            else {
                ex = new IllegalStateException(format2);
            }
            throw ex;
        }
        
        protected void b(final T t) {
        }
        
        @org.jetbrains.annotations.e
        protected o<T> c(final boolean b) {
            final o<T> p = this.G.p("in a lazy value", (Object)null);
            if (p == null) {
                a(2);
            }
            return p;
        }
        
        public T invoke() {
            final Object i = this.I;
            if (!(i instanceof n)) {
                return (T)kotlin.reflect.jvm.internal.impl.utils.k.f(i);
            }
            this.G.a.lock();
            try {
                final Object j = this.I;
                Object o = null;
                if (!(j instanceof n)) {
                    o = kotlin.reflect.jvm.internal.impl.utils.k.f(j);
                }
                else {
                    final n h = n.H;
                    if (j == h) {
                        this.I = n.I;
                        final o<T> c = this.c(true);
                        if (!c.c()) {
                            o = c.b();
                            return (T)o;
                        }
                    }
                    if (j == n.I) {
                        final o<T> c2 = this.c(false);
                        if (!c2.c()) {
                            o = c2.b();
                            return (T)o;
                        }
                    }
                    this.I = h;
                    try {
                        final Object invoke = this.H.invoke();
                        this.b((T)invoke);
                        this.I = invoke;
                    }
                    finally {
                        if (!kotlin.reflect.jvm.internal.impl.utils.c.a((Throwable)o)) {
                            if (this.I == n.H) {
                                this.I = kotlin.reflect.jvm.internal.impl.utils.k.c((Throwable)o);
                            }
                            throw this.G.b.a((Throwable)o);
                        }
                        this.I = n.G;
                        throw (RuntimeException)o;
                    }
                }
                return (T)o;
            }
            finally {
                this.G.a.unlock();
            }
        }
        
        public boolean v() {
            return this.I != n.G && this.I != n.H;
        }
    }
    
    private abstract static class i<T> extends h<T>
    {
        @f
        private volatile kotlin.reflect.jvm.internal.impl.storage.l<T> J;
        
        public i(@org.jetbrains.annotations.e final f f, @org.jetbrains.annotations.e final a<? extends T> a) {
            if (f == null) {
                a(0);
            }
            if (a == null) {
                a(1);
            }
            super(f, a);
            this.J = null;
        }
        
        private static /* synthetic */ void a(final int n) {
            final Object[] args = new Object[3];
            if (n != 1) {
                args[0] = "storageManager";
            }
            else {
                args[0] = "computable";
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            args[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
        
        @Override
        protected final void b(final T t) {
            this.J = new kotlin.reflect.jvm.internal.impl.storage.l<T>(t);
            try {
                this.g(t);
            }
            finally {
                this.J = null;
            }
        }
        
        protected abstract void g(final T p0);
        
        @Override
        public T invoke() {
            final kotlin.reflect.jvm.internal.impl.storage.l<T> j = this.J;
            if (j != null && j.b()) {
                return j.a();
            }
            return super.invoke();
        }
    }
    
    private static class j<T> extends h<T> implements i<T>
    {
        public j(@org.jetbrains.annotations.e final f f, @org.jetbrains.annotations.e final a<? extends T> a) {
            if (f == null) {
                a(0);
            }
            if (a == null) {
                a(1);
            }
            super(f, a);
        }
        
        private static /* synthetic */ void a(final int n) {
            String format;
            if (n != 2) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 2) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            if (n != 1) {
                if (n != 2) {
                    args[0] = "storageManager";
                }
                else {
                    args[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
                }
            }
            else {
                args[0] = "computable";
            }
            if (n != 2) {
                args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            else {
                args[1] = "invoke";
            }
            if (n != 2) {
                args[2] = "<init>";
            }
            final String format2 = String.format(format, args);
            RuntimeException ex;
            if (n != 2) {
                ex = new IllegalArgumentException(format2);
            }
            else {
                ex = new IllegalStateException(format2);
            }
            throw ex;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public T invoke() {
            final T invoke = super.invoke();
            if (invoke == null) {
                a(2);
            }
            return invoke;
        }
    }
    
    private abstract static class k<T> extends i<T> implements i<T>
    {
        public k(@org.jetbrains.annotations.e final f f, @org.jetbrains.annotations.e final a<? extends T> a) {
            if (f == null) {
                a(0);
            }
            if (a == null) {
                a(1);
            }
            super(f, a);
        }
        
        private static /* synthetic */ void a(final int n) {
            String format;
            if (n != 2) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 2) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            if (n != 1) {
                if (n != 2) {
                    args[0] = "storageManager";
                }
                else {
                    args[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
                }
            }
            else {
                args[0] = "computable";
            }
            if (n != 2) {
                args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            else {
                args[1] = "invoke";
            }
            if (n != 2) {
                args[2] = "<init>";
            }
            final String format2 = String.format(format, args);
            RuntimeException ex;
            if (n != 2) {
                ex = new IllegalArgumentException(format2);
            }
            else {
                ex = new IllegalStateException(format2);
            }
            throw ex;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public T invoke() {
            final T invoke = super.invoke();
            if (invoke == null) {
                a(2);
            }
            return invoke;
        }
    }
    
    private static class l<K, V> implements h<K, V>
    {
        private final f G;
        private final ConcurrentMap<K, Object> H;
        private final n6.l<? super K, ? extends V> I;
        
        public l(@org.jetbrains.annotations.e final f g, @org.jetbrains.annotations.e final ConcurrentMap<K, Object> h, @org.jetbrains.annotations.e final n6.l<? super K, ? extends V> i) {
            if (g == null) {
                b(0);
            }
            if (h == null) {
                b(1);
            }
            if (i == null) {
                b(2);
            }
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        private static /* synthetic */ void b(final int n) {
            String format;
            if (n != 3 && n != 4) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 3 && n != 4) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3 && n != 4) {
                        args[0] = "storageManager";
                    }
                    else {
                        args[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                    }
                }
                else {
                    args[0] = "compute";
                }
            }
            else {
                args[0] = "map";
            }
            if (n != 3) {
                if (n != 4) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                }
                else {
                    args[1] = "raceCondition";
                }
            }
            else {
                args[1] = "recursionDetected";
            }
            if (n != 3 && n != 4) {
                args[2] = "<init>";
            }
            final String format2 = String.format(format, args);
            RuntimeException ex;
            if (n != 3 && n != 4) {
                ex = new IllegalArgumentException(format2);
            }
            else {
                ex = new IllegalStateException(format2);
            }
            throw ex;
        }
        
        @org.jetbrains.annotations.e
        private AssertionError g(final K obj, final Object obj2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Race condition detected on input ");
            sb.append(obj);
            sb.append(". Old value is ");
            sb.append(obj2);
            sb.append(" under ");
            sb.append(this.G);
            final AssertionError assertionError = (AssertionError)q(new AssertionError((Object)sb.toString()));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }
        
        protected f c() {
            return this.G;
        }
        
        @org.jetbrains.annotations.e
        protected o<V> i(final K k, final boolean b) {
            final o<V> p2 = this.G.p("", k);
            if (p2 == null) {
                b(3);
            }
            return p2;
        }
        
        @f
        public V invoke(final K k) {
            final n value = this.H.get(k);
            if (value != null && value != n.H) {
                return (V)kotlin.reflect.jvm.internal.impl.utils.k.d(value);
            }
            this.G.a.lock();
            try {
                final n value2 = this.H.get(k);
                final n h = n.H;
                n i = value2;
                Label_0102: {
                    if (value2 != h) {
                        break Label_0102;
                    }
                    i = n.I;
                    final o<V> j = this.i(k, true);
                    if (j.c()) {
                        break Label_0102;
                    }
                    final o<V> o = j;
                    final Object o2 = o.b();
                    return (V)o2;
                }
                if (i == n.I) {
                    final o<V> l = this.i(k, false);
                    if (!l.c()) {
                        final o<V> o = l;
                        return o.b();
                    }
                }
                if (i != null) {
                    final Object o2 = kotlin.reflect.jvm.internal.impl.utils.k.d(i);
                    return (V)o2;
                }
                Throwable g;
                final Throwable t = g = null;
                try {
                    this.H.put(k, h);
                    g = t;
                    final Object invoke = this.I.invoke((Object)k);
                    g = t;
                    final n put = this.H.put(k, kotlin.reflect.jvm.internal.impl.utils.k.b(invoke));
                    if (put == h) {
                        return (V)invoke;
                    }
                    g = t;
                    throw g = this.g(k, put);
                }
                finally {
                    final Throwable t2;
                    if (kotlin.reflect.jvm.internal.impl.utils.c.a(t2)) {
                        this.H.remove(k);
                        throw (RuntimeException)t2;
                    }
                    if (t2 == g) {
                        throw this.G.b.a(t2);
                    }
                    final n put2 = this.H.put(k, kotlin.reflect.jvm.internal.impl.utils.k.c(t2));
                    if (put2 != n.H) {
                        throw this.g(k, put2);
                    }
                    throw this.G.b.a(t2);
                }
            }
            finally {
                this.G.a.unlock();
            }
        }
    }
    
    private static class m<K, V> extends l<K, V> implements g<K, V>
    {
        public m(@org.jetbrains.annotations.e final f f, @org.jetbrains.annotations.e final ConcurrentMap<K, Object> concurrentMap, @org.jetbrains.annotations.e final n6.l<? super K, ? extends V> l) {
            if (f == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (l == null) {
                b(2);
            }
            super(f, concurrentMap, l);
        }
        
        private static /* synthetic */ void b(final int n) {
            String format;
            if (n != 3) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 3) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        args[0] = "storageManager";
                    }
                    else {
                        args[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
                    }
                }
                else {
                    args[0] = "compute";
                }
            }
            else {
                args[0] = "map";
            }
            if (n != 3) {
                args[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            else {
                args[1] = "invoke";
            }
            if (n != 3) {
                args[2] = "<init>";
            }
            final String format2 = String.format(format, args);
            RuntimeException ex;
            if (n != 3) {
                ex = new IllegalArgumentException(format2);
            }
            else {
                ex = new IllegalStateException(format2);
            }
            throw ex;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public V invoke(final K k) {
            final V invoke = super.invoke(k);
            if (invoke == null) {
                b(3);
            }
            return invoke;
        }
    }
    
    private enum n
    {
        G, 
        H, 
        I;
    }
    
    private static class o<T>
    {
        private final T a;
        private final boolean b;
        
        private o(final T a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @org.jetbrains.annotations.e
        public static <T> o<T> a() {
            return new o<T>(null, true);
        }
        
        @org.jetbrains.annotations.e
        public static <T> o<T> d(final T t) {
            return new o<T>(t, false);
        }
        
        public T b() {
            return this.a;
        }
        
        public boolean c() {
            return this.b;
        }
        
        @Override
        public String toString() {
            String value;
            if (this.c()) {
                value = "FALL_THROUGH";
            }
            else {
                value = String.valueOf(this.a);
            }
            return value;
        }
    }
}
