// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.exceptions;

import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import io.reactivex.annotations.f;
import java.util.List;

public final class a extends RuntimeException
{
    private static final long J = 3026362227162912146L;
    private final List<Throwable> G;
    private final String H;
    private Throwable I;
    
    public a(@f final Iterable<? extends Throwable> iterable) {
        final LinkedHashSet<NullPointerException> set = new LinkedHashSet<NullPointerException>();
        final ArrayList<Throwable> list = new ArrayList<Throwable>();
        if (iterable != null) {
            for (Throwable t : iterable) {
                if (t instanceof a) {
                    set.addAll((Collection<?>)((a)t).b());
                }
                else {
                    if (t == null) {
                        t = new NullPointerException("Throwable was null!");
                    }
                    set.add((NullPointerException)t);
                }
            }
        }
        else {
            set.add(new NullPointerException("errors was null"));
        }
        if (!set.isEmpty()) {
            list.addAll((Collection<?>)set);
            final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list);
            this.G = (List<Throwable>)unmodifiableList;
            final StringBuilder sb = new StringBuilder();
            sb.append(unmodifiableList.size());
            sb.append(" exceptions occurred. ");
            this.H = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
    
    public a(@f final Throwable... a) {
        Object o;
        if (a == null) {
            o = Collections.singletonList(new NullPointerException("exceptions was null"));
        }
        else {
            o = Arrays.asList(a);
        }
        this((Iterable<? extends Throwable>)o);
    }
    
    private void a(final StringBuilder sb, final Throwable obj, final String str) {
        sb.append(str);
        sb.append(obj);
        sb.append('\n');
        for (final StackTraceElement obj2 : obj.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(obj2);
            sb.append('\n');
        }
        if (obj.getCause() != null) {
            sb.append("\tCaused by: ");
            this.a(sb, obj.getCause(), "");
        }
    }
    
    private List<Throwable> c(Throwable cause) {
        final ArrayList<Throwable> list = new ArrayList<Throwable>();
        final Throwable cause2 = cause.getCause();
        if (cause2 != null) {
            Throwable t;
            if ((t = cause2) != cause) {
                while (true) {
                    list.add(t);
                    cause = t.getCause();
                    if (cause == null) {
                        break;
                    }
                    if (cause == t) {
                        break;
                    }
                    t = cause;
                }
            }
        }
        return list;
    }
    
    private void e(final b b) {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (final StackTraceElement obj : this.getStackTrace()) {
            sb.append("\tat ");
            sb.append(obj);
            sb.append('\n');
        }
        final Iterator<Throwable> iterator = this.G.iterator();
        int j = 1;
        while (iterator.hasNext()) {
            final Throwable t = iterator.next();
            sb.append("  ComposedException ");
            sb.append(j);
            sb.append(" :\n");
            this.a(sb, t, "\t");
            ++j;
        }
        b.a(sb.toString());
    }
    
    @f
    public List<Throwable> b() {
        return this.G;
    }
    
    Throwable d(Throwable cause) {
        final Throwable cause2 = cause.getCause();
        Throwable t;
        if (cause2 != null && cause != (t = cause2)) {
            while (true) {
                cause = t.getCause();
                if (cause == null || cause == t) {
                    break;
                }
                t = cause;
            }
            return t;
        }
        return cause;
    }
    
    public int f() {
        return this.G.size();
    }
    
    @f
    @Override
    public Throwable getCause() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        io/reactivex/exceptions/a.I:Ljava/lang/Throwable;
        //     6: ifnonnull       177
        //     9: new             Lio/reactivex/exceptions/a$a;
        //    12: astore_1       
        //    13: aload_1        
        //    14: invokespecial   io/reactivex/exceptions/a$a.<init>:()V
        //    17: new             Ljava/util/HashSet;
        //    20: astore_2       
        //    21: aload_2        
        //    22: invokespecial   java/util/HashSet.<init>:()V
        //    25: aload_0        
        //    26: getfield        io/reactivex/exceptions/a.G:Ljava/util/List;
        //    29: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    34: astore_3       
        //    35: aload_1        
        //    36: astore          4
        //    38: aload_3        
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            172
        //    47: aload_3        
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: checkcast       Ljava/lang/Throwable;
        //    56: astore          5
        //    58: aload_2        
        //    59: aload           5
        //    61: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    66: ifeq            72
        //    69: goto            38
        //    72: aload_2        
        //    73: aload           5
        //    75: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    80: pop            
        //    81: aload_0        
        //    82: aload           5
        //    84: invokespecial   io/reactivex/exceptions/a.c:(Ljava/lang/Throwable;)Ljava/util/List;
        //    87: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    92: astore          6
        //    94: aload           6
        //    96: invokeinterface java/util/Iterator.hasNext:()Z
        //   101: ifeq            153
        //   104: aload           6
        //   106: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   111: checkcast       Ljava/lang/Throwable;
        //   114: astore          7
        //   116: aload_2        
        //   117: aload           7
        //   119: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   124: ifeq            141
        //   127: new             Ljava/lang/RuntimeException;
        //   130: dup            
        //   131: ldc             "Duplicate found in causal chain so cropping to prevent loop ..."
        //   133: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   136: astore          5
        //   138: goto            94
        //   141: aload_2        
        //   142: aload           7
        //   144: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   149: pop            
        //   150: goto            94
        //   153: aload           4
        //   155: aload           5
        //   157: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   160: pop            
        //   161: aload_0        
        //   162: aload           4
        //   164: invokevirtual   io/reactivex/exceptions/a.d:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   167: astore          4
        //   169: goto            38
        //   172: aload_0        
        //   173: aload_1        
        //   174: putfield        io/reactivex/exceptions/a.I:Ljava/lang/Throwable;
        //   177: aload_0        
        //   178: getfield        io/reactivex/exceptions/a.I:Ljava/lang/Throwable;
        //   181: astore          4
        //   183: aload_0        
        //   184: monitorexit    
        //   185: aload           4
        //   187: areturn        
        //   188: astore          4
        //   190: aload_0        
        //   191: monitorexit    
        //   192: aload           4
        //   194: athrow         
        //   195: astore          5
        //   197: goto            161
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      35     188    195    Any
        //  38     69     188    195    Any
        //  72     94     188    195    Any
        //  94     138    188    195    Any
        //  141    150    188    195    Any
        //  153    161    195    200    Any
        //  161    169    188    195    Any
        //  172    177    188    195    Any
        //  177    183    188    195    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0153:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @f
    @Override
    public String getMessage() {
        return this.H;
    }
    
    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }
    
    @Override
    public void printStackTrace(final PrintStream printStream) {
        this.e((b)new c(printStream));
    }
    
    @Override
    public void printStackTrace(final PrintWriter printWriter) {
        this.e((b)new d(printWriter));
    }
    
    static final class a extends RuntimeException
    {
        private static final long G = 3875212506787802066L;
        static final String H = "Chain of Causes for CompositeException In Order Received =>";
        
        @Override
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }
    
    abstract static class b
    {
        abstract void a(final Object p0);
    }
    
    static final class c extends b
    {
        private final PrintStream a;
        
        c(final PrintStream a) {
            this.a = a;
        }
        
        @Override
        void a(final Object x) {
            this.a.println(x);
        }
    }
    
    static final class d extends b
    {
        private final PrintWriter a;
        
        d(final PrintWriter a) {
            this.a = a;
        }
        
        @Override
        void a(final Object x) {
            this.a.println(x);
        }
    }
}
