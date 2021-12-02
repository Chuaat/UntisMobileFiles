// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Objects;
import kotlin.collections.m;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.d;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.f;
import org.jetbrains.annotations.e;

final class c
{
    @e
    public static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    private final f a(Class<?> componentType) {
        int n = 0;
        while (componentType.isArray()) {
            ++n;
            componentType = (Class<?>)componentType.getComponentType();
            k0.o((Object)componentType, "currentClass.componentType");
        }
        if (!componentType.isPrimitive()) {
            a b = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b(componentType);
            final kotlin.reflect.jvm.internal.impl.builtins.jvm.c a = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a;
            final kotlin.reflect.jvm.internal.impl.name.b b2 = b.b();
            k0.o((Object)b2, "javaClassId.asSingleFqName()");
            final a n2 = a.n(b2);
            if (n2 != null) {
                b = n2;
            }
            return new f(b, n);
        }
        if (k0.g((Object)componentType, (Object)Void.TYPE)) {
            final a m = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames$FqNames.unit.l());
            k0.o((Object)m, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new f(m, n);
        }
        final PrimitiveType i = d.d(componentType.getName()).i();
        k0.o((Object)i, "get(currentClass.name).primitiveType");
        if (n > 0) {
            final a j = kotlin.reflect.jvm.internal.impl.name.a.m(i.getArrayTypeFqName());
            k0.o((Object)j, "topLevel(primitiveType.arrayTypeFqName)");
            return new f(j, n - 1);
        }
        final a k = kotlin.reflect.jvm.internal.impl.name.a.m(i.getTypeFqName());
        k0.o((Object)k, "topLevel(primitiveType.typeFqName)");
        return new f(k, n);
    }
    
    private final void c(final Class<?> clazz, final o.d d) {
        Constructor<?>[] declaredConstructors = (Constructor<?>[])clazz.getDeclaredConstructors();
        k0.o((Object)declaredConstructors, "klass.declaredConstructors");
        int n2;
        int n8;
        for (int length = declaredConstructors.length, i = 0; i < length; i = n2, length = n8) {
            final Constructor<?> constructor = declaredConstructors[i];
            ++i;
            final kotlin.reflect.jvm.internal.impl.name.e l = kotlin.reflect.jvm.internal.impl.name.e.l("<init>");
            k0.o((Object)l, "special(\"<init>\")");
            final n a = n.a;
            k0.o((Object)constructor, "constructor");
            final o.e b = d.b(l, a.a(constructor));
            int n3;
            if (b == null) {
                final int n = length;
                n2 = i;
                n3 = n;
            }
            else {
                final Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                k0.o((Object)declaredAnnotations, "constructor.declaredAnnotations");
                final int length2 = declaredAnnotations.length;
                int j = 0;
                while (j < length2) {
                    final Annotation annotation = declaredAnnotations[j];
                    ++j;
                    k0.o((Object)annotation, "annotation");
                    this.f(b, annotation);
                }
                final Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                k0.o((Object)parameterAnnotations, "parameterAnnotations");
                final boolean b2 = parameterAnnotations.length == 0;
                Constructor<?>[] array = declaredConstructors;
                int n4 = length;
                int n5 = i;
                if (b2 ^ true) {
                    final int n6 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    final int length3 = parameterAnnotations.length;
                    int n7 = 0;
                    while (true) {
                        array = declaredConstructors;
                        n4 = length;
                        n5 = i;
                        if (n7 >= length3) {
                            break;
                        }
                        final Annotation[] array2 = parameterAnnotations[n7];
                        k0.o((Object)array2, "annotations");
                        final int length4 = array2.length;
                        int k = 0;
                        while (k < length4) {
                            final Annotation annotation2 = array2[k];
                            ++k;
                            final Class c = m6.a.c(m6.a.a(annotation2));
                            final a b3 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b(c);
                            k0.o((Object)annotation2, "annotation");
                            final o.a c2 = b.c(n7 + n6, b3, (w0)new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b(annotation2));
                            if (c2 == null) {
                                continue;
                            }
                            this.h(c2, annotation2, c);
                        }
                        ++n7;
                    }
                }
                declaredConstructors = array;
                n3 = n4;
                n2 = n5;
                ((o.c)b).a();
            }
            n8 = n3;
        }
    }
    
    private final void d(final Class<?> clazz, final o.d d) {
        final Field[] declaredFields = clazz.getDeclaredFields();
        k0.o((Object)declaredFields, "klass.declaredFields");
        int n;
        for (int length = declaredFields.length, i = 0; i < length; i = n) {
            final Field field = declaredFields[i];
            n = i + 1;
            final kotlin.reflect.jvm.internal.impl.name.e j = kotlin.reflect.jvm.internal.impl.name.e.i(field.getName());
            k0.o((Object)j, "identifier(field.name)");
            final n a = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.n.a;
            k0.o((Object)field, "field");
            final o.c a2 = d.a(j, a.b(field), null);
            if (a2 != null) {
                final Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                k0.o((Object)declaredAnnotations, "field.declaredAnnotations");
                final int length2 = declaredAnnotations.length;
                int k = 0;
                while (k < length2) {
                    final Annotation annotation = declaredAnnotations[k];
                    ++k;
                    k0.o((Object)annotation, "annotation");
                    this.f(a2, annotation);
                }
                a2.a();
            }
        }
    }
    
    private final void e(final Class<?> clazz, final o.d d) {
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        k0.o((Object)declaredMethods, "klass.declaredMethods");
        int n;
        for (int length = declaredMethods.length, i = 0; i < length; i = n) {
            final Method method = declaredMethods[i];
            n = i + 1;
            final kotlin.reflect.jvm.internal.impl.name.e j = kotlin.reflect.jvm.internal.impl.name.e.i(method.getName());
            k0.o((Object)j, "identifier(method.name)");
            final n a = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.n.a;
            k0.o((Object)method, "method");
            final o.e b = d.b(j, a.c(method));
            if (b != null) {
                final Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                k0.o((Object)declaredAnnotations, "method.declaredAnnotations");
                final int length2 = declaredAnnotations.length;
                int k = 0;
                while (k < length2) {
                    final Annotation annotation = declaredAnnotations[k];
                    ++k;
                    k0.o((Object)annotation, "annotation");
                    this.f(b, annotation);
                }
                final Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                k0.o((Object)parameterAnnotations, "method.parameterAnnotations");
                for (int length3 = parameterAnnotations.length, l = 0; l < length3; ++l) {
                    final Annotation[] array = parameterAnnotations[l];
                    k0.o((Object)array, "annotations");
                    final int length4 = array.length;
                    int n2 = 0;
                    while (n2 < length4) {
                        final Annotation annotation2 = array[n2];
                        ++n2;
                        final Class c = m6.a.c(m6.a.a(annotation2));
                        final a b2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b(c);
                        k0.o((Object)annotation2, "annotation");
                        final o.a c2 = b.c(l, b2, (w0)new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b(annotation2));
                        if (c2 == null) {
                            continue;
                        }
                        this.h(c2, annotation2, c);
                    }
                }
                ((o.c)b).a();
            }
        }
    }
    
    private final void f(final o.c c, final Annotation annotation) {
        final Class c2 = m6.a.c(m6.a.a(annotation));
        final o.a b = c.b(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b(c2), (w0)new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b(annotation));
        if (b != null) {
            this.h(b, annotation, c2);
        }
    }
    
    private final void g(o.a e, final kotlin.reflect.jvm.internal.impl.name.e e2, Object o) {
        Class<?> obj = o.getClass();
        if (k0.g((Object)obj, (Object)Class.class)) {
            e.b(e2, this.a((Class<?>)o));
        }
        else if (i.a().contains(obj)) {
            e.c(e2, o);
        }
        else if (b.i(obj)) {
            if (!obj.isEnum()) {
                obj = obj.getEnclosingClass();
            }
            k0.o((Object)obj, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            final a b = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b(obj);
            final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(((Enum)o).name());
            k0.o((Object)i, "identifier((value as Enum<*>).name)");
            e.d(e2, b, i);
        }
        else if (Annotation.class.isAssignableFrom(obj)) {
            final Class<?>[] interfaces = obj.getInterfaces();
            k0.o((Object)interfaces, "clazz.interfaces");
            final Class clazz = (Class)m.Cs((Object[])interfaces);
            k0.o((Object)clazz, "annotationClass");
            e = e.e(e2, b.b(clazz));
            if (e == null) {
                return;
            }
            this.h(e, (Annotation)o, clazz);
        }
        else {
            if (!obj.isArray()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported annotation argument value (");
                sb.append(obj);
                sb.append("): ");
                sb.append(o);
                throw new UnsupportedOperationException(sb.toString());
            }
            final o.b f = e.f(e2);
            if (f == null) {
                return;
            }
            final Class<?> componentType = obj.getComponentType();
            final boolean enum1 = componentType.isEnum();
            final int n = 0;
            final int n2 = 0;
            int j = 0;
            if (enum1) {
                k0.o((Object)componentType, "componentType");
                final a b2 = b.b(componentType);
                final Object[] array = (Object[])o;
                while (j < array.length) {
                    final Object obj2 = array[j];
                    ++j;
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                    final kotlin.reflect.jvm.internal.impl.name.e k = kotlin.reflect.jvm.internal.impl.name.e.i(((Enum)obj2).name());
                    k0.o((Object)k, "identifier((element as Enum<*>).name)");
                    f.c(b2, k);
                }
            }
            else {
                final boolean g = k0.g((Object)componentType, (Object)Class.class);
                final Object[] array2 = (Object[])o;
                if (g) {
                    final int length = array2.length;
                    int l = n;
                    while (l < length) {
                        o = array2[l];
                        ++l;
                        Objects.requireNonNull(o, "null cannot be cast to non-null type java.lang.Class<*>");
                        f.d(this.a((Class<?>)o));
                    }
                }
                else {
                    final int length2 = array2.length;
                    int n3 = n2;
                    while (n3 < length2) {
                        o = array2[n3];
                        ++n3;
                        f.b(o);
                    }
                }
            }
            f.a();
        }
    }
    
    private final void h(final o.a p0, final Annotation p1, final Class<?> p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Class.getDeclaredMethods:()[Ljava/lang/reflect/Method;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ldc_w           "annotationType.declaredMethods"
        //     9: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3        
        //    13: arraylength    
        //    14: istore          4
        //    16: iconst_0       
        //    17: istore          5
        //    19: iload           5
        //    21: iload           4
        //    23: if_icmpge       86
        //    26: aload_3        
        //    27: iload           5
        //    29: aaload         
        //    30: astore          6
        //    32: iinc            5, 1
        //    35: aload           6
        //    37: aload_2        
        //    38: iconst_0       
        //    39: anewarray       Ljava/lang/Object;
        //    42: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    45: astore          7
        //    47: aload           7
        //    49: invokestatic    kotlin/jvm/internal/k0.m:(Ljava/lang/Object;)V
        //    52: aload           6
        //    54: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //    57: invokestatic    kotlin/reflect/jvm/internal/impl/name/e.i:(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/name/e;
        //    60: astore          6
        //    62: aload           6
        //    64: ldc             "identifier(method.name)"
        //    66: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //    69: aload_0        
        //    70: aload_1        
        //    71: aload           6
        //    73: aload           7
        //    75: invokespecial   kotlin/reflect/jvm/internal/impl/descriptors/runtime/components/c.g:(Lkotlin/reflect/jvm/internal/impl/load/kotlin/o$a;Lkotlin/reflect/jvm/internal/impl/name/e;Ljava/lang/Object;)V
        //    78: goto            19
        //    81: astore          7
        //    83: goto            19
        //    86: aload_1        
        //    87: invokeinterface kotlin/reflect/jvm/internal/impl/load/kotlin/o$a.a:()V
        //    92: return         
        //    Signature:
        //  (Lkotlin/reflect/jvm/internal/impl/load/kotlin/o$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class<*>;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  35     52     81     86     Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
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
    
    public final void b(@e final Class<?> clazz, @e final o.c c) {
        k0.p((Object)clazz, "klass");
        k0.p((Object)c, "visitor");
        final Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
        k0.o((Object)declaredAnnotations, "klass.declaredAnnotations");
        final int length = declaredAnnotations.length;
        int i = 0;
        while (i < length) {
            final Annotation annotation = declaredAnnotations[i];
            ++i;
            k0.o((Object)annotation, "annotation");
            this.f(c, annotation);
        }
        c.a();
    }
    
    public final void i(@e final Class<?> clazz, @e final o.d d) {
        k0.p((Object)clazz, "klass");
        k0.p((Object)d, "memberVisitor");
        this.e(clazz, d);
        this.c(clazz, d);
        this.d(clazz, d);
    }
}
