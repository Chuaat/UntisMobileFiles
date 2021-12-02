// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.collections.m;
import java.util.Comparator;
import kotlin.j2;
import m6.a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.jetbrains.annotations.f;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import java.lang.reflect.Constructor;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002\u001a1\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0082\b\u001a\u0018\u0010\u000f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u001b\u0010\u0011\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\f2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0082\u0010\"\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013\"\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015\"<\u0010\u001a\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019*(\b\u0002\u0010\u001b\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001c" }, d2 = { "", "E", "exception", "f", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/reflect/Constructor;", "constructor", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "a", "block", "e", "Ljava/lang/Class;", "", "defaultValue", "d", "accumulator", "b", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "I", "throwableFields", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "exceptionCtors", "Ctor", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class l
{
    private static final int a;
    private static final ReentrantReadWriteLock b;
    private static final WeakHashMap<Class<? extends Throwable>, n6.l<Throwable, Throwable>> c;
    
    static {
        a = d(Throwable.class, -1);
        b = new ReentrantReadWriteLock();
        c = new WeakHashMap<Class<? extends Throwable>, n6.l<Throwable, Throwable>>();
    }
    
    private static final n6.l<Throwable, Throwable> a(final Constructor<?> constructor) {
        final Class[] parameterTypes = constructor.getParameterTypes();
        final int length = parameterTypes.length;
        final n6.l<Throwable, Throwable> l = null;
        Object o;
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    o = l;
                }
                else {
                    o = l;
                    if (k0.g((Object)parameterTypes[0], (Object)String.class)) {
                        o = l;
                        if (k0.g((Object)parameterTypes[1], (Object)Throwable.class)) {
                            o = new n6.l<Throwable, Throwable>() {
                                @f
                                public final Throwable a(@e final Throwable t) {
                                    Object b = null;
                                    try {
                                        final b1$a h = b1.H;
                                        final Throwable instance = constructor.newInstance(t.getMessage(), t);
                                        if (instance == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                                        }
                                        b1.b((Object)instance);
                                    }
                                    finally {
                                        final b1$a h2 = b1.H;
                                        b = b1.b(c1.a(t));
                                    }
                                    Object o = b;
                                    if (b1.i(b)) {
                                        o = null;
                                    }
                                    return (Throwable)o;
                                }
                            };
                        }
                    }
                }
            }
            else {
                final Class clazz = parameterTypes[0];
                if (k0.g((Object)clazz, (Object)Throwable.class)) {
                    o = new n6.l<Throwable, Throwable>() {
                        @f
                        public final Throwable a(@e final Throwable t) {
                            Object b = null;
                            try {
                                final b1$a h = b1.H;
                                final Throwable instance = constructor.newInstance(t);
                                if (instance == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                                }
                                b1.b((Object)instance);
                            }
                            finally {
                                final b1$a h2 = b1.H;
                                b = b1.b(c1.a(t));
                            }
                            Object o = b;
                            if (b1.i(b)) {
                                o = null;
                            }
                            return (Throwable)o;
                        }
                    };
                }
                else {
                    o = l;
                    if (k0.g((Object)clazz, (Object)String.class)) {
                        o = new n6.l<Throwable, Throwable>() {
                            @f
                            public final Throwable a(@e final Throwable cause) {
                                Object b = null;
                                try {
                                    final b1$a h = b1.H;
                                    final Throwable instance = constructor.newInstance(cause.getMessage());
                                    if (instance == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                                    }
                                    final Throwable t = instance;
                                    t.initCause(cause);
                                    b1.b((Object)t);
                                }
                                finally {
                                    final b1$a h2 = b1.H;
                                    b = b1.b(c1.a(cause));
                                }
                                Object o = b;
                                if (b1.i(b)) {
                                    o = null;
                                }
                                return (Throwable)o;
                            }
                        };
                    }
                }
            }
        }
        else {
            o = new n6.l<Throwable, Throwable>() {
                @f
                public final Throwable a(@e final Throwable cause) {
                    Object b = null;
                    try {
                        final b1$a h = b1.H;
                        final Throwable instance = constructor.newInstance(new Object[0]);
                        if (instance == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                        }
                        final Throwable t = instance;
                        t.initCause(cause);
                        b1.b((Object)t);
                    }
                    finally {
                        final b1$a h2 = b1.H;
                        final Throwable t2;
                        b = b1.b(c1.a(t2));
                    }
                    Object o = b;
                    if (b1.i(b)) {
                        o = null;
                    }
                    return (Throwable)o;
                }
            };
        }
        return (n6.l<Throwable, Throwable>)o;
    }
    
    private static final int b(Class<?> superclass, int n) {
        do {
            final Field[] declaredFields = superclass.getDeclaredFields();
            final int length = declaredFields.length;
            int i = 0;
            int n2 = 0;
            while (i < length) {
                int n3 = n2;
                if (Modifier.isStatic(declaredFields[i].getModifiers()) ^ true) {
                    n3 = n2 + 1;
                }
                ++i;
                n2 = n3;
            }
            n += n2;
            superclass = superclass.getSuperclass();
        } while (superclass != null);
        return n;
    }
    
    static /* synthetic */ int c(final Class clazz, int n, final int n2, final Object o) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        return b(clazz, n);
    }
    
    private static final int d(final Class<?> clazz, final int i) {
        m6.a.g((Class)clazz);
        Object b = null;
        try {
            final b1$a h = b1.H;
            b1.b((Object)c(clazz, 0, 1, null));
        }
        finally {
            final b1$a h2 = b1.H;
            final Throwable t;
            b = b1.b(c1.a(t));
        }
        Object value = b;
        if (b1.i(b)) {
            value = i;
        }
        return ((Number)value).intValue();
    }
    
    private static final n6.l<Throwable, Throwable> e(final n6.l<? super Throwable, ? extends Throwable> l) {
        return (n6.l<Throwable, Throwable>)new n6.l<Throwable, Throwable>() {
            @f
            public final Throwable a(@e final Throwable t) {
                Object b = null;
                try {
                    final b1$a h = b1.H;
                    b1.b((Object)l.invoke((Object)t));
                }
                finally {
                    final b1$a h2 = b1.H;
                    final Throwable t2;
                    b = b1.b(c1.a(t2));
                }
                Object o = b;
                if (b1.i(b)) {
                    o = null;
                }
                return (Throwable)o;
            }
        };
    }
    
    @f
    public static final <E extends Throwable> E f(@e final E e) {
        final boolean b = e instanceof kotlinx.coroutines.k0;
        final n6.l<Throwable, Throwable> l = null;
        final Throwable t = null;
        if (b) {
            Object b2 = null;
            try {
                final b1$a h = b1.H;
                b1.b(((kotlinx.coroutines.k0)e).a());
            }
            finally {
                final b1$a h2 = b1.H;
                final Throwable t2;
                b2 = b1.b(c1.a(t2));
            }
            if (b1.i(b2)) {
                b2 = t;
            }
            return (E)b2;
        }
        final ReentrantReadWriteLock b3 = kotlinx.coroutines.internal.l.b;
        Object o = b3.readLock();
        ((ReentrantReadWriteLock.ReadLock)o).lock();
        try {
            final n6.l<Throwable, Throwable> i = kotlinx.coroutines.internal.l.c.get(e.getClass());
            ((ReentrantReadWriteLock.ReadLock)o).unlock();
            if (i != null) {
                return (E)i.invoke((Object)e);
            }
            final int a = kotlinx.coroutines.internal.l.a;
            o = e.getClass();
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            if (a != d((Class<?>)o, 0)) {
                o = b3.readLock();
                int readHoldCount;
                if (b3.getWriteHoldCount() == 0) {
                    readHoldCount = b3.getReadHoldCount();
                }
                else {
                    readHoldCount = 0;
                }
                for (int j = 0; j < readHoldCount; ++j) {
                    ((ReentrantReadWriteLock.ReadLock)o).unlock();
                }
                final ReentrantReadWriteLock.WriteLock writeLock = b3.writeLock();
                writeLock.lock();
                try {
                    kotlinx.coroutines.internal.l.c.put(e.getClass(), (n6.l<Throwable, Throwable>)l$g.G);
                    final j2 a2 = j2.a;
                    return null;
                }
                finally {
                    for (int k = n; k < readHoldCount; ++k) {
                        ((ReentrantReadWriteLock.ReadLock)o).lock();
                    }
                    writeLock.unlock();
                }
            }
            final Iterator<Constructor<?>> iterator = (Iterator<Constructor<?>>)m.hv((Object[])e.getClass().getConstructors(), (Comparator)new Comparator<T>() {
                @Override
                public final int compare(final T t, final T t2) {
                    return kotlin.comparisons.a.g((Comparable)((Constructor)t2).getParameterTypes().length, (Comparable)((Constructor)t).getParameterTypes().length);
                }
            }).iterator();
            Serializable s = null;
            while (iterator.hasNext()) {
                o = a(iterator.next());
                if ((s = (Serializable)o) != null) {
                    s = (Serializable)o;
                    break;
                }
            }
            o = kotlinx.coroutines.internal.l.b;
            final ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock)o).readLock();
            int readHoldCount2;
            if (((ReentrantReadWriteLock)o).getWriteHoldCount() == 0) {
                readHoldCount2 = ((ReentrantReadWriteLock)o).getReadHoldCount();
            }
            else {
                readHoldCount2 = 0;
            }
            for (int n4 = 0; n4 < readHoldCount2; ++n4) {
                lock.unlock();
            }
            final ReentrantReadWriteLock.WriteLock writeLock2 = ((ReentrantReadWriteLock)o).writeLock();
            writeLock2.lock();
            try {
                final WeakHashMap<Class<? extends Throwable>, n6.l<Throwable, Throwable>> c = kotlinx.coroutines.internal.l.c;
                final Class<? extends Throwable> class1 = e.getClass();
                if (s != null) {
                    o = s;
                }
                else {
                    o = l$h.G;
                }
                c.put(class1, (n6.l<Throwable, Throwable>)o);
                o = j2.a;
                for (int n5 = n2; n5 < readHoldCount2; ++n5) {
                    lock.lock();
                }
                writeLock2.unlock();
                o = l;
                if (s != null) {
                    o = ((n6.l)s).invoke((Object)e);
                }
                return (E)o;
            }
            finally {
                for (int n6 = n3; n6 < readHoldCount2; ++n6) {
                    lock.lock();
                }
                writeLock2.unlock();
            }
        }
        finally {
            ((ReentrantReadWriteLock.ReadLock)o).unlock();
        }
    }
}
