// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.utils;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import n6.l;
import java.util.Iterator;
import org.jetbrains.annotations.e;
import java.util.Collection;

public class b
{
    private static /* synthetic */ void a(final int n) {
        final Object[] args = new Object[3];
        switch (n) {
            default: {
                args[0] = "nodes";
                break;
            }
            case 22: {
                args[0] = "current";
                break;
            }
            case 10:
            case 14: {
                args[0] = "node";
                break;
            }
            case 9: {
                args[0] = "predicate";
                break;
            }
            case 3:
            case 6:
            case 13:
            case 25: {
                args[0] = "handler";
                break;
            }
            case 2:
            case 12:
            case 16:
            case 19:
            case 24: {
                args[0] = "visited";
                break;
            }
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23: {
                args[0] = "neighbors";
                break;
            }
        }
        args[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (n) {
            default: {
                args[2] = "dfs";
                break;
            }
            case 22:
            case 23:
            case 24:
            case 25: {
                args[2] = "doDfs";
                break;
            }
            case 17:
            case 18:
            case 19:
            case 20:
            case 21: {
                args[2] = "topologicalOrder";
                break;
            }
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16: {
                args[2] = "dfsFromNode";
                break;
            }
            case 7:
            case 8:
            case 9: {
                args[2] = "ifAny";
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
    }
    
    public static <N, R> R b(@org.jetbrains.annotations.e final Collection<N> collection, @org.jetbrains.annotations.e final d<N> d, @org.jetbrains.annotations.e final e<N, R> e) {
        if (collection == null) {
            a(4);
        }
        if (d == null) {
            a(5);
        }
        if (e == null) {
            a(6);
        }
        return c(collection, d, (g<N>)new h(), e);
    }
    
    public static <N, R> R c(@org.jetbrains.annotations.e final Collection<N> collection, @org.jetbrains.annotations.e final d<N> d, @org.jetbrains.annotations.e final g<N> g, @org.jetbrains.annotations.e final e<N, R> e) {
        if (collection == null) {
            a(0);
        }
        if (d == null) {
            a(1);
        }
        if (g == null) {
            a(2);
        }
        if (e == null) {
            a(3);
        }
        final Iterator<N> iterator = collection.iterator();
        while (iterator.hasNext()) {
            d(iterator.next(), d, g, e);
        }
        return (R)e.a();
    }
    
    public static <N> void d(@org.jetbrains.annotations.e final N n, @org.jetbrains.annotations.e final d<N> d, @org.jetbrains.annotations.e final g<N> g, @org.jetbrains.annotations.e final e<N, ?> e) {
        if (n == null) {
            a(22);
        }
        if (d == null) {
            a(23);
        }
        if (g == null) {
            a(24);
        }
        if (e == null) {
            a(25);
        }
        if (!g.a(n)) {
            return;
        }
        if (!e.c(n)) {
            return;
        }
        final Iterator<? extends N> iterator = d.a(n).iterator();
        while (iterator.hasNext()) {
            d(iterator.next(), (d<Object>)d, (g<Object>)g, (e<Object, ?>)e);
        }
        e.b(n);
    }
    
    public static <N> Boolean e(@org.jetbrains.annotations.e final Collection<N> collection, @org.jetbrains.annotations.e final d<N> d, @org.jetbrains.annotations.e final l<N, Boolean> l) {
        if (collection == null) {
            a(7);
        }
        if (d == null) {
            a(8);
        }
        if (l == null) {
            a(9);
        }
        return b(collection, d, (e<N, Boolean>)new b<N, Boolean>() {
            final /* synthetic */ boolean[] b = new boolean[1];
            
            @Override
            public boolean c(final N n) {
                if (l.invoke((Object)n)) {
                    this.b[0] = true;
                }
                return this.b[0] ^ true;
            }
            
            public Boolean d() {
                return this.b[0];
            }
        });
    }
    
    public abstract static class b<N, R> implements e<N, R>
    {
        @Override
        public void b(final N n) {
        }
        
        @Override
        public boolean c(final N n) {
            return true;
        }
    }
    
    public abstract static class c<N, R, C extends Iterable<R>> extends b<N, C>
    {
        @org.jetbrains.annotations.e
        protected final C a;
        
        protected c(@org.jetbrains.annotations.e final C a) {
            if (a == null) {
                d(0);
            }
            this.a = a;
        }
        
        private static /* synthetic */ void d(final int n) {
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
                args[0] = "result";
            }
            else {
                args[0] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            }
            if (n != 1) {
                args[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            }
            else {
                args[1] = "result";
            }
            if (n != 1) {
                args[2] = "<init>";
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
        public C e() {
            final Iterable<R> a = this.a;
            if (a == null) {
                d(1);
            }
            return (C)a;
        }
    }
    
    public interface d<N>
    {
        @org.jetbrains.annotations.e
        Iterable<? extends N> a(final N p0);
    }
    
    public interface e<N, R>
    {
        R a();
        
        void b(final N p0);
        
        boolean c(final N p0);
    }
    
    public abstract static class f<N, R> extends c<N, R, LinkedList<R>>
    {
        protected f() {
            super(new LinkedList());
        }
    }
    
    public interface g<N>
    {
        boolean a(final N p0);
    }
    
    public static class h<N> implements g<N>
    {
        private final Set<N> a;
        
        public h() {
            this((Set)new HashSet());
        }
        
        public h(@org.jetbrains.annotations.e final Set<N> a) {
            if (a == null) {
                b(0);
            }
            this.a = a;
        }
        
        private static /* synthetic */ void b(final int n) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }
        
        @Override
        public boolean a(final N n) {
            return this.a.add(n);
        }
    }
}
