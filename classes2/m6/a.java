// 
// Decompiled by Procyon v0.5.36
// 

package m6;

import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.f;
import java.io.Serializable;
import kotlin.jvm.internal.t;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import kotlin.reflect.d;
import java.lang.annotation.Annotation;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u001b\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00078G@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"/\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\t\"=\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068\u00c7\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\t\"(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00068G@\u0006¢\u0006\f\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0016\u0010\t\")\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0019*\u00028\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d" }, d2 = { "", "T", "", "", "j", "([Ljava/lang/Object;)Z", "Lkotlin/reflect/d;", "Ljava/lang/Class;", "e", "(Lkotlin/reflect/d;)Ljava/lang/Class;", "javaObjectType", "g", "(Ljava/lang/Class;)Lkotlin/reflect/d;", "kotlin", "f", "javaPrimitiveType", "h", "getRuntimeClassOfKClassInstance$annotations", "(Lkotlin/reflect/d;)V", "javaClass", "b", "(Ljava/lang/Object;)Ljava/lang/Class;", "c", "getJavaClass$annotations", "java", "", "a", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/d;", "annotationClass", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "JvmClassMappingKt")
public final class a
{
    @e
    public static final <T extends Annotation> d<? extends T> a(@e final T t) {
        k0.p(t, "$this$annotationClass");
        final Class<? extends Annotation> annotationType = t.annotationType();
        k0.o(annotationType, "(this as java.lang.annot\u2026otation).annotationType()");
        final d<Object> g = g((Class<Object>)annotationType);
        Objects.requireNonNull((d<? extends T>)g, "null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
        return (d<? extends T>)g;
    }
    
    @e
    public static final <T> Class<T> b(@e final T t) {
        k0.p(t, "$this$javaClass");
        return (Class<T>)t.getClass();
    }
    
    @g(name = "getJavaClass")
    @e
    public static final <T> Class<T> c(@e final d<T> d) {
        k0.p(d, "$this$java");
        final Class<?> m = ((t)d).m();
        Objects.requireNonNull(m, "null cannot be cast to non-null type java.lang.Class<T>");
        return (Class<T>)m;
    }
    
    @e
    public static final <T> Class<T> e(@e final d<T> d) {
        k0.p(d, "$this$javaObjectType");
        Class<?> m = ((t)d).m();
        if (!m.isPrimitive()) {
            return (Class<T>)m;
        }
        final String name = m.getName();
        switch (name.hashCode()) {
            case 109413500: {
                if (name.equals("short")) {
                    m = Short.class;
                    break;
                }
                break;
            }
            case 97526364: {
                if (name.equals("float")) {
                    m = Float.class;
                    break;
                }
                break;
            }
            case 64711720: {
                if (name.equals("boolean")) {
                    m = Boolean.class;
                    break;
                }
                break;
            }
            case 3625364: {
                if (name.equals("void")) {
                    m = Void.class;
                    break;
                }
                break;
            }
            case 3327612: {
                if (name.equals("long")) {
                    m = Long.class;
                    break;
                }
                break;
            }
            case 3052374: {
                if (name.equals("char")) {
                    m = Character.class;
                    break;
                }
                break;
            }
            case 3039496: {
                if (name.equals("byte")) {
                    m = Byte.class;
                    break;
                }
                break;
            }
            case 104431: {
                if (name.equals("int")) {
                    m = Integer.class;
                    break;
                }
                break;
            }
            case -1325958191: {
                if (name.equals("double")) {
                    m = Double.class;
                    break;
                }
                break;
            }
        }
        return (Class<T>)m;
    }
    
    @f
    public static final <T> Class<T> f(@e final d<T> d) {
        k0.p(d, "$this$javaPrimitiveType");
        final Class<?> m = ((t)d).m();
        if (m.isPrimitive()) {
            return (Class<T>)m;
        }
        final String name = m.getName();
        switch (name.hashCode()) {
            case 761287205: {
                if (name.equals("java.lang.Double")) {
                    final Serializable s = Double.TYPE;
                    return (Class<T>)s;
                }
                break;
            }
            case 399092968: {
                if (name.equals("java.lang.Void")) {
                    final Serializable s = Void.TYPE;
                    return (Class<T>)s;
                }
                break;
            }
            case 398795216: {
                if (name.equals("java.lang.Long")) {
                    final Serializable s = Long.TYPE;
                    return (Class<T>)s;
                }
                break;
            }
            case 398507100: {
                if (name.equals("java.lang.Byte")) {
                    final Serializable s = Byte.TYPE;
                    return (Class<T>)s;
                }
                break;
            }
            case 344809556: {
                if (name.equals("java.lang.Boolean")) {
                    final Serializable s = Boolean.TYPE;
                    return (Class<T>)s;
                }
                break;
            }
            case 155276373: {
                if (name.equals("java.lang.Character")) {
                    final Serializable s = Character.TYPE;
                    return (Class<T>)s;
                }
                break;
            }
            case -515992664: {
                if (name.equals("java.lang.Short")) {
                    final Serializable s = Short.TYPE;
                    return (Class<T>)s;
                }
                break;
            }
            case -527879800: {
                if (name.equals("java.lang.Float")) {
                    final Serializable s = Float.TYPE;
                    return (Class<T>)s;
                }
                break;
            }
            case -2056817302: {
                if (name.equals("java.lang.Integer")) {
                    final Serializable s = Integer.TYPE;
                    return (Class<T>)s;
                }
                break;
            }
        }
        final Serializable s = null;
        return (Class<T>)s;
    }
    
    @g(name = "getKotlinClass")
    @e
    public static final <T> d<T> g(@e final Class<T> clazz) {
        k0.p(clazz, "$this$kotlin");
        return (d<T>)k1.d(clazz);
    }
    
    @g(name = "getRuntimeClassOfKClassInstance")
    @e
    public static final <T> Class<d<T>> h(@e final d<T> d) {
        k0.p(d, "$this$javaClass");
        return (Class<d<T>>)d.getClass();
    }
}
