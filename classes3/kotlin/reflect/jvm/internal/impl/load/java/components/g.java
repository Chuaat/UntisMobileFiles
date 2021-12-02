// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.l;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;

public interface g
{
    public static final g a = new g() {
        private static /* synthetic */ void f(final int n) {
            final Object[] args = new Object[3];
            switch (n) {
                default: {
                    args[0] = "fqName";
                    break;
                }
                case 7: {
                    args[0] = "javaClass";
                    break;
                }
                case 5: {
                    args[0] = "field";
                    break;
                }
                case 3: {
                    args[0] = "element";
                    break;
                }
                case 2:
                case 4:
                case 6:
                case 8: {
                    args[0] = "descriptor";
                    break;
                }
                case 1: {
                    args[0] = "member";
                    break;
                }
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (n) {
                default: {
                    args[2] = "getClassResolvedFromSource";
                    break;
                }
                case 7:
                case 8: {
                    args[2] = "recordClass";
                    break;
                }
                case 5:
                case 6: {
                    args[2] = "recordField";
                    break;
                }
                case 3:
                case 4: {
                    args[2] = "recordConstructor";
                    break;
                }
                case 1:
                case 2: {
                    args[2] = "recordMethod";
                    break;
                }
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
        
        @f
        @Override
        public kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final b b) {
            if (b == null) {
                f(0);
            }
            return null;
        }
        
        @Override
        public void b(@e final l l, @e final kotlin.reflect.jvm.internal.impl.descriptors.l i) {
            if (l == null) {
                f(3);
            }
            if (i == null) {
                f(4);
            }
        }
        
        @Override
        public void c(@e final kotlin.reflect.jvm.internal.impl.load.java.structure.g g, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
            if (g == null) {
                f(7);
            }
            if (e == null) {
                f(8);
            }
        }
        
        @Override
        public void d(@e final n n, @e final q0 q0) {
            if (n == null) {
                f(5);
            }
            if (q0 == null) {
                f(6);
            }
        }
        
        @Override
        public void e(@e final q q, @e final v0 v0) {
            if (q == null) {
                f(1);
            }
            if (v0 == null) {
                f(2);
            }
        }
    };
    
    @f
    kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final b p0);
    
    void b(@e final l p0, @e final kotlin.reflect.jvm.internal.impl.descriptors.l p1);
    
    void c(@e final kotlin.reflect.jvm.internal.impl.load.java.structure.g p0, @e final kotlin.reflect.jvm.internal.impl.descriptors.e p1);
    
    void d(@e final n p0, @e final q0 p1);
    
    void e(@e final q p0, @e final v0 p1);
}
