// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collection;
import java.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.util.List;

final class h<FieldDescriptorType extends b<FieldDescriptorType>>
{
    private static final h d;
    private final v<FieldDescriptorType, Object> a;
    private boolean b;
    private boolean c;
    
    static {
        d = new h(true);
    }
    
    private h() {
        this.c = false;
        this.a = v.p(16);
    }
    
    private h(final boolean b) {
        this.c = false;
        this.a = v.p(0);
        this.q();
    }
    
    private Object c(final Object o) {
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            final byte[] array2 = new byte[array.length];
            System.arraycopy(array, 0, array2, 0, array.length);
            return array2;
        }
        return o;
    }
    
    private static int d(final z.b b, int d, final Object o) {
        final int n = d = f.D(d);
        if (b == z.b.R) {
            d = n * 2;
        }
        return d + e(b, o);
    }
    
    private static int e(final z.b b, final Object o) {
        switch (h$a.b[b.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                if (o instanceof j.a) {
                    return f.i(((j.a)o).q());
                }
                return f.i((int)o);
            }
            case 17: {
                if (o instanceof l) {
                    return f.r((m)o);
                }
                return f.t((q)o);
            }
            case 16: {
                return f.n((q)o);
            }
            case 15: {
                return f.B((long)o);
            }
            case 14: {
                return f.z((int)o);
            }
            case 13: {
                return f.y((long)o);
            }
            case 12: {
                return f.x((int)o);
            }
            case 11: {
                return f.E((int)o);
            }
            case 10: {
                if (o instanceof d) {
                    return f.e((d)o);
                }
                return f.c((byte[])o);
            }
            case 9: {
                return f.C((String)o);
            }
            case 8: {
                return f.b((boolean)o);
            }
            case 7: {
                return f.j((int)o);
            }
            case 6: {
                return f.k((long)o);
            }
            case 5: {
                return f.p((int)o);
            }
            case 4: {
                return f.F((long)o);
            }
            case 3: {
                return f.q((long)o);
            }
            case 2: {
                return f.m((float)o);
            }
            case 1: {
                return f.g((double)o);
            }
        }
    }
    
    public static int f(final b<?> b, final Object o) {
        final z.b d1 = b.d1();
        final int q = b.q();
        if (!b.D0()) {
            return d(d1, q, o);
        }
        final boolean t5 = b.t5();
        final int n = 0;
        int n2 = 0;
        final List list = (List)o;
        if (t5) {
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                n2 += e(d1, iterator.next());
            }
            return f.D(q) + n2 + f.v(n2);
        }
        final Iterator<Object> iterator2 = list.iterator();
        int n3 = n;
        while (iterator2.hasNext()) {
            n3 += d(d1, q, iterator2.next());
        }
        return n3;
    }
    
    public static <T extends b<T>> h<T> g() {
        return (h<T>)h.d;
    }
    
    static int l(final z.b b, final boolean b2) {
        if (b2) {
            return 2;
        }
        return b.d();
    }
    
    private boolean o(final Map.Entry<FieldDescriptorType, Object> entry) {
        final b<FieldDescriptorType> b = entry.getKey();
        if (b.s5() == z.c.P) {
            final boolean d0 = b.D0();
            final List<q> value = entry.getValue();
            if (d0) {
                final Iterator<q> iterator = value.iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().a()) {
                        return false;
                    }
                }
            }
            else if (value instanceof q) {
                if (!((q)value).a()) {
                    return false;
                }
            }
            else {
                if (value instanceof l) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }
    
    private void s(final Map.Entry<FieldDescriptorType, Object> entry) {
        final b<FieldDescriptorType> b = entry.getKey();
        Object o;
        final l l = (l)(o = entry.getValue());
        if (l instanceof l) {
            o = l.e();
        }
        if (b.D0()) {
            Object h;
            if ((h = this.h((FieldDescriptorType)b)) == null) {
                h = new ArrayList<Object>();
            }
            final Iterator<Object> iterator = ((List<Object>)o).iterator();
            while (iterator.hasNext()) {
                ((List<Object>)h).add(this.c(iterator.next()));
            }
            this.a.q((FieldDescriptorType)b, h);
        }
        else {
            Object o2 = null;
            v<FieldDescriptorType, Object> v = null;
            Label_0195: {
                if (b.s5() == z.c.P) {
                    final Object h2 = this.h((FieldDescriptorType)b);
                    if (h2 != null) {
                        o2 = b.p0(((q)h2).c(), (q)o).h();
                        v = this.a;
                        break Label_0195;
                    }
                }
                v = this.a;
                o2 = this.c(o);
            }
            v.q((FieldDescriptorType)b, o2);
        }
    }
    
    public static <T extends b<T>> h<T> t() {
        return new h<T>();
    }
    
    public static Object u(final e e, final z.b b, final boolean b2) throws IOException {
        switch (h$a.b[b.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            }
            case 17: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            }
            case 16: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            }
            case 15: {
                return e.H();
            }
            case 14: {
                return e.G();
            }
            case 13: {
                return e.F();
            }
            case 12: {
                return e.E();
            }
            case 11: {
                return e.L();
            }
            case 10: {
                return e.l();
            }
            case 9: {
                if (b2) {
                    return e.J();
                }
                return e.I();
            }
            case 8: {
                return e.k();
            }
            case 7: {
                return e.o();
            }
            case 6: {
                return e.p();
            }
            case 5: {
                return e.s();
            }
            case 4: {
                return e.M();
            }
            case 3: {
                return e.t();
            }
            case 2: {
                return e.q();
            }
            case 1: {
                return e.m();
            }
        }
    }
    
    private static void w(final z.b b, final Object obj) {
        Objects.requireNonNull(obj);
        final int n = h$a.a[b.b().ordinal()];
        final boolean b2 = true;
        int n2 = 0;
        Label_0147: {
            switch (n) {
                default: {
                    break Label_0147;
                }
                case 9: {
                    n2 = (b2 ? 1 : 0);
                    if (obj instanceof q) {
                        break Label_0147;
                    }
                    if (obj instanceof l) {
                        n2 = (b2 ? 1 : 0);
                        break Label_0147;
                    }
                    break;
                }
                case 8: {
                    n2 = (b2 ? 1 : 0);
                    if (obj instanceof Integer) {
                        break Label_0147;
                    }
                    if (obj instanceof j.a) {
                        n2 = (b2 ? 1 : 0);
                        break Label_0147;
                    }
                    break;
                }
                case 7: {
                    n2 = (b2 ? 1 : 0);
                    if (obj instanceof d) {
                        break Label_0147;
                    }
                    if (obj instanceof byte[]) {
                        n2 = (b2 ? 1 : 0);
                        break Label_0147;
                    }
                    break;
                }
                case 6: {
                    n2 = ((obj instanceof String) ? 1 : 0);
                    break Label_0147;
                }
                case 5: {
                    n2 = ((obj instanceof Boolean) ? 1 : 0);
                    break Label_0147;
                }
                case 4: {
                    n2 = ((obj instanceof Double) ? 1 : 0);
                    break Label_0147;
                }
                case 3: {
                    n2 = ((obj instanceof Float) ? 1 : 0);
                    break Label_0147;
                }
                case 2: {
                    n2 = ((obj instanceof Long) ? 1 : 0);
                    break Label_0147;
                }
                case 1: {
                    n2 = ((obj instanceof Integer) ? 1 : 0);
                    break Label_0147;
                }
            }
            n2 = 0;
        }
        if (n2 != 0) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
    
    private static void x(final f f, final z.b b, final int n, final Object o) throws IOException {
        if (b == z.b.R) {
            f.Y(n, (q)o);
        }
        else {
            f.w0(n, l(b, false));
            y(f, b, o);
        }
    }
    
    private static void y(final f f, final z.b b, final Object o) throws IOException {
        switch (h$a.b[b.ordinal()]) {
            case 18: {
                int n;
                if (o instanceof j.a) {
                    n = ((j.a)o).q();
                }
                else {
                    n = (int)o;
                }
                f.T(n);
                break;
            }
            case 17: {
                f.e0((q)o);
                break;
            }
            case 16: {
                f.Z((q)o);
                break;
            }
            case 15: {
                f.u0((long)o);
                break;
            }
            case 14: {
                f.s0((int)o);
                break;
            }
            case 13: {
                f.r0((long)o);
                break;
            }
            case 12: {
                f.q0((int)o);
                break;
            }
            case 11: {
                f.y0((int)o);
                break;
            }
            case 10: {
                if (o instanceof d) {
                    f.P((d)o);
                    break;
                }
                f.N((byte[])o);
                break;
            }
            case 9: {
                f.v0((String)o);
                break;
            }
            case 8: {
                f.M((boolean)o);
                break;
            }
            case 7: {
                f.U((int)o);
                break;
            }
            case 6: {
                f.V((long)o);
                break;
            }
            case 5: {
                f.b0((int)o);
                break;
            }
            case 4: {
                f.z0((long)o);
                break;
            }
            case 3: {
                f.c0((long)o);
                break;
            }
            case 2: {
                f.X((float)o);
                break;
            }
            case 1: {
                f.R((double)o);
                break;
            }
        }
    }
    
    public static void z(final b<?> b, final Object o, final f f) throws IOException {
        final z.b d1 = b.d1();
        final int q = b.q();
        if (b.D0()) {
            final List list = (List)o;
            if (b.t5()) {
                f.w0(q, 2);
                int n = 0;
                final Iterator<Object> iterator = list.iterator();
                while (iterator.hasNext()) {
                    n += e(d1, iterator.next());
                }
                f.o0(n);
                final Iterator<Object> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    y(f, d1, iterator2.next());
                }
            }
            else {
                final Iterator<Object> iterator3 = list.iterator();
                while (iterator3.hasNext()) {
                    x(f, d1, q, iterator3.next());
                }
            }
        }
        else if (o instanceof l) {
            x(f, d1, q, ((l)o).e());
        }
        else {
            x(f, d1, q, o);
        }
    }
    
    public void a(final FieldDescriptorType fieldDescriptorType, final Object o) {
        if (fieldDescriptorType.D0()) {
            w(fieldDescriptorType.d1(), o);
            final Object h = this.h(fieldDescriptorType);
            List<Object> list2;
            if (h == null) {
                final ArrayList<Object> list = new ArrayList<Object>();
                this.a.q(fieldDescriptorType, list);
                list2 = list;
            }
            else {
                list2 = (List<Object>)h;
            }
            list2.add(o);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }
    
    public h<FieldDescriptorType> b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: iconst_0       
        //     5: istore_2       
        //     6: iload_2        
        //     7: aload_0        
        //     8: getfield        kotlin/reflect/jvm/internal/impl/protobuf/h.a:Lkotlin/reflect/jvm/internal/impl/protobuf/v;
        //    11: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/v.i:()I
        //    14: if_icmpge       51
        //    17: aload_0        
        //    18: getfield        kotlin/reflect/jvm/internal/impl/protobuf/h.a:Lkotlin/reflect/jvm/internal/impl/protobuf/v;
        //    21: iload_2        
        //    22: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/v.h:(I)Ljava/util/Map$Entry;
        //    25: astore_3       
        //    26: aload_1        
        //    27: aload_3        
        //    28: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    33: checkcast       Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
        //    36: aload_3        
        //    37: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    42: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/h.v:(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;Ljava/lang/Object;)V
        //    45: iinc            2, 1
        //    48: goto            6
        //    51: aload_0        
        //    52: getfield        kotlin/reflect/jvm/internal/impl/protobuf/h.a:Lkotlin/reflect/jvm/internal/impl/protobuf/v;
        //    55: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/v.j:()Ljava/lang/Iterable;
        //    58: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    63: astore          4
        //    65: aload           4
        //    67: invokeinterface java/util/Iterator.hasNext:()Z
        //    72: ifeq            108
        //    75: aload           4
        //    77: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    82: checkcast       Ljava/util/Map$Entry;
        //    85: astore_3       
        //    86: aload_1        
        //    87: aload_3        
        //    88: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    93: checkcast       Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
        //    96: aload_3        
        //    97: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   102: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/h.v:(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;Ljava/lang/Object;)V
        //   105: goto            65
        //   108: aload_1        
        //   109: aload_0        
        //   110: getfield        kotlin/reflect/jvm/internal/impl/protobuf/h.c:Z
        //   113: putfield        kotlin/reflect/jvm/internal/impl/protobuf/h.c:Z
        //   116: aload_1        
        //   117: areturn        
        //    Signature:
        //  ()Lkotlin/reflect/jvm/internal/impl/protobuf/h<TFieldDescriptorType;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:173)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1100)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2676)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:759)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1011)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:759)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1011)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypesForVariables(TypeAnalysis.java:586)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:397)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
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
    
    public Object h(final FieldDescriptorType fieldDescriptorType) {
        Object o2;
        final Object o = o2 = this.a.get(fieldDescriptorType);
        if (o instanceof l) {
            o2 = ((l)o).e();
        }
        return o2;
    }
    
    public Object i(final FieldDescriptorType fieldDescriptorType, final int n) {
        if (!fieldDescriptorType.D0()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        final Object h = this.h(fieldDescriptorType);
        if (h != null) {
            return ((List<Object>)h).get(n);
        }
        throw new IndexOutOfBoundsException();
    }
    
    public int j(final FieldDescriptorType fieldDescriptorType) {
        if (!fieldDescriptorType.D0()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        final Object h = this.h(fieldDescriptorType);
        if (h == null) {
            return 0;
        }
        return ((List)h).size();
    }
    
    public int k() {
        int i = 0;
        int n = 0;
        while (i < this.a.i()) {
            final Map.Entry<FieldDescriptorType, Object> h = this.a.h(i);
            n += f(h.getKey(), h.getValue());
            ++i;
        }
        for (final Map.Entry<b<?>, V> entry : this.a.j()) {
            n += f(entry.getKey(), entry.getValue());
        }
        return n;
    }
    
    public boolean m(final FieldDescriptorType fieldDescriptorType) {
        if (!fieldDescriptorType.D0()) {
            return this.a.get(fieldDescriptorType) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }
    
    public boolean n() {
        for (int i = 0; i < this.a.i(); ++i) {
            if (!this.o(this.a.h(i))) {
                return false;
            }
        }
        final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator = this.a.j().iterator();
        while (iterator.hasNext()) {
            if (!this.o((Map.Entry)iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        if (this.c) {
            return new l.c<FieldDescriptorType>(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }
    
    public void q() {
        if (this.b) {
            return;
        }
        this.a.o();
        this.b = true;
    }
    
    public void r(final h<FieldDescriptorType> h) {
        for (int i = 0; i < h.a.i(); ++i) {
            this.s(h.a.h(i));
        }
        final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator = h.a.j().iterator();
        while (iterator.hasNext()) {
            this.s((Map.Entry)iterator.next());
        }
    }
    
    public void v(final FieldDescriptorType fieldDescriptorType, Object o) {
        if (fieldDescriptorType.D0()) {
            if (!(o instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            final ArrayList<Object> list = new ArrayList<Object>();
            list.addAll((Collection<?>)o);
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                w(fieldDescriptorType.d1(), iterator.next());
            }
            o = list;
        }
        else {
            w(fieldDescriptorType.d1(), o);
        }
        if (o instanceof l) {
            this.c = true;
        }
        this.a.q(fieldDescriptorType, o);
    }
    
    public interface b<T extends b<T>> extends Comparable<T>
    {
        boolean D0();
        
        z.b d1();
        
        q.a p0(final q.a p0, final q p1);
        
        int q();
        
        z.c s5();
        
        boolean t5();
    }
}
