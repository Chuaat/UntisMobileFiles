// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.b;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.r;

public interface j
{
    public static final j a = new j() {
        private static /* synthetic */ void c(final int n) {
            final Object[] args = new Object[3];
            switch (n) {
                default: {
                    args[0] = "method";
                    break;
                }
                case 6: {
                    args[0] = "signatureErrors";
                    break;
                }
                case 5: {
                    args[0] = "descriptor";
                    break;
                }
                case 4: {
                    args[0] = "typeParameters";
                    break;
                }
                case 3: {
                    args[0] = "valueParameters";
                    break;
                }
                case 2: {
                    args[0] = "returnType";
                    break;
                }
                case 1: {
                    args[0] = "owner";
                    break;
                }
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (n != 5 && n != 6) {
                args[2] = "resolvePropagatedSignature";
            }
            else {
                args[2] = "reportSignatureErrors";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
        
        @e
        @Override
        public b a(@e final r r, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final c0 c0, @f final c0 c2, @e final List<e1> list, @e final List<b1> list2) {
            if (r == null) {
                c(0);
            }
            if (e == null) {
                c(1);
            }
            if (c0 == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(c0, c2, list, list2, Collections.emptyList(), false);
        }
        
        @Override
        public void b(@e final kotlin.reflect.jvm.internal.impl.descriptors.b b, @e final List<String> list) {
            if (b == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    };
    
    @e
    b a(@e final r p0, @e final kotlin.reflect.jvm.internal.impl.descriptors.e p1, @e final c0 p2, @f final c0 p3, @e final List<e1> p4, @e final List<b1> p5);
    
    void b(@e final kotlin.reflect.jvm.internal.impl.descriptors.b p0, @e final List<String> p1);
    
    public static class b
    {
        private final c0 a;
        private final c0 b;
        private final List<e1> c;
        private final List<b1> d;
        private final List<String> e;
        private final boolean f;
        
        public b(@e final c0 a, @f final c0 b, @e final List<e1> c, @e final List<b1> d, @e final List<String> e, final boolean f) {
            if (a == null) {
                a(0);
            }
            if (c == null) {
                a(1);
            }
            if (d == null) {
                a(2);
            }
            if (e == null) {
                a(3);
            }
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        private static /* synthetic */ void a(final int n) {
            String format;
            if (n != 4 && n != 5 && n != 6 && n != 7) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 4 && n != 5 && n != 6 && n != 7) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            switch (n) {
                default: {
                    args[0] = "returnType";
                    break;
                }
                case 4:
                case 5:
                case 6:
                case 7: {
                    args[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                }
                case 3: {
                    args[0] = "signatureErrors";
                    break;
                }
                case 2: {
                    args[0] = "typeParameters";
                    break;
                }
                case 1: {
                    args[0] = "valueParameters";
                    break;
                }
            }
            if (n != 4) {
                if (n != 5) {
                    if (n != 6) {
                        if (n != 7) {
                            args[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                        }
                        else {
                            args[1] = "getErrors";
                        }
                    }
                    else {
                        args[1] = "getTypeParameters";
                    }
                }
                else {
                    args[1] = "getValueParameters";
                }
            }
            else {
                args[1] = "getReturnType";
            }
            if (n != 4 && n != 5 && n != 6 && n != 7) {
                args[2] = "<init>";
            }
            final String format2 = String.format(format, args);
            RuntimeException ex;
            if (n != 4 && n != 5 && n != 6 && n != 7) {
                ex = new IllegalArgumentException(format2);
            }
            else {
                ex = new IllegalStateException(format2);
            }
            throw ex;
        }
        
        @e
        public List<String> b() {
            final List<String> e = this.e;
            if (e == null) {
                a(7);
            }
            return e;
        }
        
        @f
        public c0 c() {
            return this.b;
        }
        
        @e
        public c0 d() {
            final c0 a = this.a;
            if (a == null) {
                a(4);
            }
            return a;
        }
        
        @e
        public List<b1> e() {
            final List<b1> d = this.d;
            if (d == null) {
                a(6);
            }
            return d;
        }
        
        @e
        public List<e1> f() {
            final List<e1> c = this.c;
            if (c == null) {
                a(5);
            }
            return c;
        }
        
        public boolean g() {
            return this.f;
        }
    }
}
