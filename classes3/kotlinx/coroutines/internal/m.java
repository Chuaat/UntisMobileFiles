// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import java.util.zip.ZipFile;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import java.util.Collections;
import java.util.ArrayList;
import kotlin.jvm.internal.h0;
import n6.l;
import java.util.Objects;
import java.util.LinkedHashSet;
import java.io.Closeable;
import kotlin.io.c;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.jar.JarFile;
import kotlin.text.s;
import java.net.URL;
import kotlin.collections.v;
import java.util.ServiceLoader;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082\bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J3\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J.\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0014*\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006%" }, d2 = { "Lkotlinx/coroutines/internal/m;", "", "Ljava/lang/Class;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "", "serviceClass", "a", "S", "service", "Ljava/lang/ClassLoader;", "loader", "", "c", "name", "b", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "f", "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", "h", "(Ljava/util/jar/JarFile;Ln6/l;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", "g", "d", "()Ljava/util/List;", "e", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/lang/String;", "PREFIX", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class m
{
    private static final String a = "META-INF/services/";
    @e
    public static final m b;
    
    static {
        b = new m();
    }
    
    private m() {
    }
    
    private final MainDispatcherFactory a(final Class<MainDispatcherFactory> clazz, final String name) {
        MainDispatcherFactory mainDispatcherFactory;
        try {
            mainDispatcherFactory = clazz.cast(Class.forName(name, true, clazz.getClassLoader()).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
        }
        catch (ClassNotFoundException ex) {
            mainDispatcherFactory = null;
        }
        return mainDispatcherFactory;
    }
    
    private final <S> S b(final String name, final ClassLoader loader, final Class<S> obj) {
        final Class<?> forName = Class.forName(name, false, loader);
        if (obj.isAssignableFrom(forName)) {
            return obj.cast(forName.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected service of class ");
        sb.append(obj);
        sb.append(", but found ");
        sb.append(forName);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    private final <S> List<S> c(Class<S> e, final ClassLoader loader) {
        List i5;
        try {
            e = this.e((Class<S>)e, loader);
        }
        finally {
            i5 = v.I5((Iterable)ServiceLoader.load((Class<S>)e, loader));
        }
        return (List<S>)i5;
    }
    
    private final List<String> f(URL url) {
        final String string = url.toString();
        if (s.u2(string, "jar", false, 2, null)) {
            final String t5 = s.t5(s.m5(string, "jar:file:", null, 2, null), '!', null, 2, null);
            final String m5 = s.m5(string, "!/", null, 2, null);
            url = (URL)new JarFile(t5, false);
            try {
                final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((JarFile)url).getInputStream(new ZipEntry(m5)), "UTF-8"));
                try {
                    final List<String> g = m.b.g(bufferedReader);
                    c.a((Closeable)bufferedReader, (Throwable)null);
                    try {
                        ((ZipFile)url).close();
                        return g;
                    }
                    finally {}
                }
                finally {
                    try {}
                    finally {
                        final Throwable t6;
                        c.a((Closeable)bufferedReader, t6);
                    }
                }
            }
            finally {
                try {}
                finally {
                    try {
                        ((ZipFile)url).close();
                    }
                    finally {
                        final Throwable t7;
                        final Throwable t8;
                        kotlin.m.a(t7, t8);
                    }
                }
            }
        }
        url = (URL)new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            final List<String> g2 = m.b.g((BufferedReader)url);
            c.a((Closeable)url, (Throwable)null);
            return g2;
        }
        finally {
            try {}
            finally {
                final Throwable t9;
                c.a((Closeable)url, t9);
            }
        }
    }
    
    private final List<String> g(final BufferedReader bufferedReader) {
        final LinkedHashSet<String> set = new LinkedHashSet<String>();
    Label_0008:
        while (true) {
            final String line = bufferedReader.readLine();
            if (line != null) {
                final String u5 = s.u5(line, "#", null, 2, null);
                Objects.requireNonNull(u5, "null cannot be cast to non-null type kotlin.CharSequence");
                final String string = s.B5(u5).toString();
                final int n = 0;
                int i = 0;
                while (true) {
                    while (i < string.length()) {
                        final char char1 = string.charAt(i);
                        if (char1 != '.' && !Character.isJavaIdentifierPart(char1)) {
                            final boolean b = false;
                            if (!b) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Illegal service provider class name: ");
                                sb.append(string);
                                throw new IllegalArgumentException(sb.toString().toString());
                            }
                            int n2 = n;
                            if (string.length() > 0) {
                                n2 = 1;
                            }
                            if (n2 != 0) {
                                set.add(string);
                                continue Label_0008;
                            }
                            continue Label_0008;
                        }
                        else {
                            ++i;
                        }
                    }
                    final boolean b = true;
                    continue;
                }
            }
            return (List<String>)v.I5((Iterable)set);
        }
    }
    
    private final <R> R h(final JarFile jarFile, final l<? super JarFile, ? extends R> l) {
        try {
            final Object invoke = l.invoke((Object)jarFile);
            h0.d(1);
            try {
                jarFile.close();
                h0.c(1);
                return (R)invoke;
            }
            finally {}
        }
        finally {
            try {}
            finally {
                h0.d(1);
                try {
                    jarFile.close();
                    h0.c(1);
                }
                finally {
                    final Throwable t;
                    kotlin.m.a((Throwable)l, t);
                }
            }
        }
    }
    
    @e
    public final List<MainDispatcherFactory> d() {
        if (!n.a()) {
            return this.c(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        List<MainDispatcherFactory> c = null;
        try {
            final ArrayList<MainDispatcherFactory> list = new ArrayList<MainDispatcherFactory>(2);
            MainDispatcherFactory e = null;
            MainDispatcherFactory e2;
            try {
                e2 = MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
            }
            catch (ClassNotFoundException ex) {
                e2 = null;
            }
            if (e2 != null) {
                list.add(e2);
            }
            try {
                e = MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
            }
            catch (ClassNotFoundException ex2) {}
            if (e != null) {
                list.add(e);
            }
        }
        finally {
            c = this.c(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        return c;
    }
    
    @e
    public final <S> List<S> e(@e final Class<S> clazz, @e final ClassLoader classLoader) {
        final StringBuilder sb = new StringBuilder();
        sb.append("META-INF/services/");
        sb.append(clazz.getName());
        final ArrayList<URL> list = Collections.list(classLoader.getResources(sb.toString()));
        k0.o((Object)list, "java.util.Collections.list(this)");
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            v.q0((Collection)list2, (Iterable)m.b.f(iterator.next()));
        }
        final Set n5 = v.N5((Iterable)list2);
        if (n5.isEmpty() ^ true) {
            final ArrayList list3 = new ArrayList<S>(v.Y((Iterable)n5, 10));
            final Iterator<String> iterator2 = (Iterator<String>)n5.iterator();
            while (iterator2.hasNext()) {
                list3.add(m.b.b(iterator2.next(), classLoader, clazz));
            }
            return (List<S>)list3;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
