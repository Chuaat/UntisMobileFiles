// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi.internal;

import java.util.Arrays;
import java.util.Objects;
import java.util.Collection;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import java.util.LinkedHashSet;
import com.squareup.moshi.l;
import java.lang.reflect.AnnotatedElement;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import com.squareup.moshi.a0;
import com.squareup.moshi.i;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.w;
import java.util.Collections;
import java.util.Map;
import c6.h;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import java.util.Set;

public final class c
{
    public static final Set<Annotation> a;
    public static final Type[] b;
    @h
    public static final Class<?> c;
    @h
    private static final Class<? extends Annotation> d;
    private static final Map<Class<?>, Class<?>> e;
    
    static {
        a = Collections.emptySet();
        b = new Type[0];
        Class<?> forName;
        try {
            forName = Class.forName(getKotlinMetadataClassName());
        }
        catch (ClassNotFoundException ex) {
            forName = null;
        }
        d = forName;
        c = w.class;
        final LinkedHashMap<Class<Byte>, Class<Byte>> m = new LinkedHashMap<Class<Byte>, Class<Byte>>(16);
        m.put(Boolean.TYPE, Boolean.class);
        m.put((Class<Boolean>)Byte.TYPE, (Class<Boolean>)Byte.class);
        m.put((Class<Boolean>)Character.TYPE, (Class<Boolean>)Character.class);
        m.put((Class<Boolean>)Double.TYPE, (Class<Boolean>)Double.class);
        m.put((Class<Boolean>)Float.TYPE, (Class<Boolean>)Float.class);
        m.put((Class<Boolean>)Integer.TYPE, (Class<Boolean>)Integer.class);
        m.put((Class<Boolean>)Long.TYPE, (Class<Boolean>)Long.class);
        m.put((Class<Boolean>)Short.TYPE, (Class<Boolean>)Short.class);
        m.put((Class<Boolean>)Void.TYPE, (Class<Boolean>)Void.class);
        e = Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    private c() {
    }
    
    public static <T> Class<T> a(Class<T> clazz) {
        final Class<?> clazz2 = com.squareup.moshi.internal.c.e.get(clazz);
        if (clazz2 != null) {
            clazz = (Class<T>)clazz2;
        }
        return clazz;
    }
    
    public static Type b(final Type type) {
        if (type instanceof Class) {
            Type type2;
            final Class clazz = (Class)(type2 = type);
            if (clazz.isArray()) {
                type2 = new a(b(clazz.getComponentType()));
            }
            return type2;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        else if (type instanceof GenericArrayType) {
            if (type instanceof a) {
                return type;
            }
            return new a(((GenericArrayType)type).getGenericComponentType());
        }
        else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            if (type instanceof c) {
                return type;
            }
            final WildcardType wildcardType = (WildcardType)type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }
    
    static void c(final Type obj) {
        if (obj instanceof Class && ((Class)obj).isPrimitive()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected primitive ");
            sb.append(obj);
            sb.append(". Use the boxed type.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    @h
    static Class<?> d(final TypeVariable<?> typeVariable) {
        final Object genericDeclaration = typeVariable.getGenericDeclaration();
        Class<?> clazz;
        if (genericDeclaration instanceof Class) {
            clazz = (Class<?>)genericDeclaration;
        }
        else {
            clazz = null;
        }
        return clazz;
    }
    
    private static <T> Constructor<T> e(final Class<T> obj) {
        for (final Constructor constructor : obj.getDeclaredConstructors()) {
            final Class[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length != 0 && parameterTypes[parameterTypes.length - 1].equals(com.squareup.moshi.internal.c.c)) {
                return (Constructor<T>)constructor;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No defaults constructor found for ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }
    
    @h
    public static com.squareup.moshi.h<?> f(final x x, final Type obj, final Class<?> clazz) {
        final i i = clazz.getAnnotation(i.class);
        GenericDeclaration genericDeclaration = null;
        if (i != null) {
            if (i.generateAdapter()) {
                final String g = a0.g(clazz.getName());
                try {
                    final Class<?> clazz2 = (Class<?>)(genericDeclaration = Class.forName(g, true, clazz.getClassLoader()));
                    Object[] initargs;
                    GenericDeclaration genericDeclaration2;
                    if (obj instanceof ParameterizedType) {
                        genericDeclaration = clazz2;
                        final Type[] actualTypeArguments = ((ParameterizedType)obj).getActualTypeArguments();
                        try {
                            genericDeclaration = clazz2.getDeclaredConstructor(x.class, Type[].class);
                            initargs = new Object[] { x, actualTypeArguments };
                            genericDeclaration2 = genericDeclaration;
                        }
                        catch (NoSuchMethodException ex3) {
                            genericDeclaration = clazz2;
                            genericDeclaration2 = clazz2.getDeclaredConstructor(Type[].class);
                            genericDeclaration = clazz2;
                            initargs = new Object[] { actualTypeArguments };
                        }
                    }
                    else {
                        try {
                            genericDeclaration = clazz2.getDeclaredConstructor(x.class);
                            initargs = new Object[] { x };
                            genericDeclaration2 = genericDeclaration;
                        }
                        catch (NoSuchMethodException ex4) {
                            genericDeclaration = clazz2;
                            genericDeclaration2 = clazz2.getDeclaredConstructor((Class<?>[])new Class[0]);
                            genericDeclaration = clazz2;
                            initargs = new Object[0];
                        }
                    }
                    genericDeclaration = clazz2;
                    ((Constructor)genericDeclaration2).setAccessible(true);
                    genericDeclaration = clazz2;
                    return ((Constructor<com.squareup.moshi.h<?>>)genericDeclaration2).newInstance(initargs).j();
                }
                catch (InvocationTargetException ex) {
                    throw v(ex);
                }
                catch (InstantiationException cause) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate the generated JsonAdapter for ");
                    sb.append(obj);
                    throw new RuntimeException(sb.toString(), cause);
                }
                catch (IllegalAccessException cause2) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to access the generated JsonAdapter for ");
                    sb2.append(obj);
                    throw new RuntimeException(sb2.toString(), cause2);
                }
                catch (NoSuchMethodException ex2) {
                    if (!(obj instanceof ParameterizedType) && ((Class<com.squareup.moshi.h>)genericDeclaration).getTypeParameters().length != 0) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Failed to find the generated JsonAdapter constructor for '");
                        sb3.append(obj);
                        sb3.append("'. Suspiciously, the type was not parameterized but the target class '");
                        sb3.append(((Class)genericDeclaration).getCanonicalName());
                        sb3.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
                        throw new RuntimeException(sb3.toString(), ex2);
                    }
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to find the generated JsonAdapter constructor for ");
                    sb4.append(obj);
                    throw new RuntimeException(sb4.toString(), ex2);
                }
                catch (ClassNotFoundException cause3) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("Failed to find the generated JsonAdapter class for ");
                    sb5.append(obj);
                    throw new RuntimeException(sb5.toString(), cause3);
                }
            }
        }
        return null;
    }
    
    public static Type g(final Type type, Class<?> clazz, final Class<?> clazz2) {
        if (clazz2 == clazz) {
            return type;
        }
        if (clazz2.isInterface()) {
            final Class<?>[] interfaces = clazz.getInterfaces();
            for (int i = 0; i < interfaces.length; ++i) {
                if (interfaces[i] == clazz2) {
                    return clazz.getGenericInterfaces()[i];
                }
                if (clazz2.isAssignableFrom(interfaces[i])) {
                    return g(clazz.getGenericInterfaces()[i], interfaces[i], clazz2);
                }
            }
        }
        if (!clazz.isInterface()) {
            while (clazz != Object.class) {
                final Class<? super Object> superclass = clazz.getSuperclass();
                if (superclass == clazz2) {
                    return clazz.getGenericSuperclass();
                }
                if (clazz2.isAssignableFrom(superclass)) {
                    return g(clazz.getGenericSuperclass(), superclass, clazz2);
                }
                clazz = (Class<Object>)superclass;
            }
        }
        return clazz2;
    }
    
    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }
    
    public static boolean h(final Annotation[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }
    
    static int i(@h final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    static int j(final Object[] array, final Object o) {
        for (int i = 0; i < array.length; ++i) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }
    
    public static boolean k(final Set<? extends Annotation> set, final Class<? extends Annotation> clazz) {
        if (set.isEmpty()) {
            return false;
        }
        final Iterator<? extends Annotation> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (((Annotation)iterator.next()).annotationType() == clazz) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean l(final Class<?> clazz) {
        final Class<? extends Annotation> d = com.squareup.moshi.internal.c.d;
        return d != null && clazz.isAnnotationPresent(d);
    }
    
    public static boolean m(final Class<?> clazz) {
        final String name = clazz.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }
    
    public static Set<? extends Annotation> n(final AnnotatedElement annotatedElement) {
        return o(annotatedElement.getAnnotations());
    }
    
    public static Set<? extends Annotation> o(final Annotation[] array) {
        final int length = array.length;
        Set<Annotation> s = null;
        Set<Annotation> set;
        for (int i = 0; i < length; ++i, s = set) {
            final Annotation annotation = array[i];
            set = s;
            if (annotation.annotationType().isAnnotationPresent(l.class)) {
                if ((set = s) == null) {
                    set = new LinkedHashSet<Annotation>();
                }
                set.add(annotation);
            }
        }
        Object o;
        if (s != null) {
            o = Collections.unmodifiableSet((Set<?>)s);
        }
        else {
            o = com.squareup.moshi.internal.c.a;
        }
        return (Set<? extends Annotation>)o;
    }
    
    public static <T> Constructor<T> p(final Class<T> clazz) {
        if (com.squareup.moshi.internal.c.c != null) {
            final Constructor<Object> e = e((Class<Object>)clazz);
            e.setAccessible(true);
            return (Constructor<T>)e;
        }
        throw new IllegalStateException("DefaultConstructorMarker not on classpath. Make sure the Kotlin stdlib is on the classpath.");
    }
    
    public static j q(String anObject, final String s, final m m) {
        final String path = m.getPath();
        if (s.equals(anObject)) {
            anObject = String.format("Required value '%s' missing at %s", anObject, path);
        }
        else {
            anObject = String.format("Required value '%s' (JSON name '%s') missing at %s", anObject, s, path);
        }
        return new j(anObject);
    }
    
    public static Type r(final Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        final WildcardType wildcardType = (WildcardType)type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        final Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }
    
    public static Type s(final Type type, final Class<?> clazz, final Type type2) {
        return t(type, clazz, type2, new LinkedHashSet<TypeVariable<?>>());
    }
    
    private static Type t(Type type, final Class<?> clazz, Type ownerType, final Collection<TypeVariable<?>> collection) {
        while (ownerType instanceof TypeVariable) {
            final TypeVariable typeVariable = (TypeVariable)ownerType;
            if (collection.contains(typeVariable)) {
                return ownerType;
            }
            collection.add(typeVariable);
            final Type u = u(type, clazz, typeVariable);
            if ((ownerType = u) == typeVariable) {
                return u;
            }
        }
        if (ownerType instanceof Class) {
            final Class clazz2 = (Class)ownerType;
            if (clazz2.isArray()) {
                final Class componentType = clazz2.getComponentType();
                type = t(type, clazz, componentType, collection);
                Object b;
                if (componentType == type) {
                    b = clazz2;
                }
                else {
                    b = a0.b(type);
                }
                return (Type)b;
            }
        }
        if (ownerType instanceof GenericArrayType) {
            final GenericArrayType genericArrayType = (GenericArrayType)ownerType;
            final Type genericComponentType = genericArrayType.getGenericComponentType();
            type = t(type, clazz, genericComponentType, collection);
            GenericArrayType b2;
            if (genericComponentType == type) {
                b2 = genericArrayType;
            }
            else {
                b2 = a0.b(type);
            }
            return b2;
        }
        final boolean b3 = ownerType instanceof ParameterizedType;
        int i = 0;
        if (b3) {
            final ParameterizedType parameterizedType = (ParameterizedType)ownerType;
            ownerType = parameterizedType.getOwnerType();
            final Type t = t(type, clazz, ownerType, collection);
            int n;
            if (t != ownerType) {
                n = 1;
            }
            else {
                n = 0;
            }
            Type[] actualTypeArguments;
            int n2;
            Type[] array;
            for (actualTypeArguments = parameterizedType.getActualTypeArguments(); i < actualTypeArguments.length; ++i, n = n2, actualTypeArguments = array) {
                final Type t2 = t(type, clazz, actualTypeArguments[i], collection);
                n2 = n;
                array = actualTypeArguments;
                if (t2 != actualTypeArguments[i]) {
                    n2 = n;
                    array = actualTypeArguments;
                    if (n == 0) {
                        array = actualTypeArguments.clone();
                        n2 = 1;
                    }
                    array[i] = t2;
                }
            }
            ParameterizedType parameterizedType2 = parameterizedType;
            if (n != 0) {
                parameterizedType2 = new b(t, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedType2;
        }
        Type type2 = ownerType;
        if (!(ownerType instanceof WildcardType)) {
            return type2;
        }
        final WildcardType wildcardType = (WildcardType)ownerType;
        final Type[] lowerBounds = wildcardType.getLowerBounds();
        final Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length == 1) {
            type = t(type, clazz, lowerBounds[0], collection);
            type2 = wildcardType;
            if (type != lowerBounds[0]) {
                return a0.q(type);
            }
            return type2;
        }
        else {
            type2 = wildcardType;
            if (upperBounds.length != 1) {
                return type2;
            }
        }
        final Type type3 = upperBounds[0];
        try {
            type = t(type, clazz, type3, collection);
            type2 = wildcardType;
            if (type != upperBounds[0]) {
                return a0.p(type);
            }
            return type2;
        }
        finally {}
    }
    
    static Type u(Type g, final Class<?> clazz, final TypeVariable<?> typeVariable) {
        final Class<?> d = d(typeVariable);
        if (d == null) {
            return typeVariable;
        }
        g = g(g, clazz, d);
        if (g instanceof ParameterizedType) {
            return ((ParameterizedType)g).getActualTypeArguments()[j(d.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }
    
    public static RuntimeException v(final InvocationTargetException ex) {
        final Throwable targetException = ex.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw (RuntimeException)targetException;
        }
        if (targetException instanceof Error) {
            throw (Error)targetException;
        }
        throw new RuntimeException(targetException);
    }
    
    public static String w(final Type obj, final Set<? extends Annotation> obj2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(obj);
        String string;
        if (obj2.isEmpty()) {
            string = " (with no annotations)";
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(" annotated ");
            sb2.append(obj2);
            string = sb2.toString();
        }
        sb.append(string);
        return sb.toString();
    }
    
    static String x(final Type type) {
        String s;
        if (type instanceof Class) {
            s = ((Class)type).getName();
        }
        else {
            s = type.toString();
        }
        return s;
    }
    
    public static boolean y(final Type type, final Type type2) {
        return a0.e(type, type2);
    }
    
    public static j z(String anObject, final String s, final m m) {
        final String path = m.getPath();
        if (s.equals(anObject)) {
            anObject = String.format("Non-null value '%s' was null at %s", anObject, path);
        }
        else {
            anObject = String.format("Non-null value '%s' (JSON name '%s') was null at %s", anObject, s, path);
        }
        return new j(anObject);
    }
    
    public static final class a implements GenericArrayType
    {
        private final Type G;
        
        public a(final Type type) {
            this.G = com.squareup.moshi.internal.c.b(type);
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof GenericArrayType && a0.e(this, (Type)o);
        }
        
        @Override
        public Type getGenericComponentType() {
            return this.G;
        }
        
        @Override
        public int hashCode() {
            return this.G.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(com.squareup.moshi.internal.c.x(this.G));
            sb.append("[]");
            return sb.toString();
        }
    }
    
    public static final class b implements ParameterizedType
    {
        @h
        private final Type G;
        private final Type H;
        public final Type[] I;
        
        public b(@h Type b, final Type type, final Type... array) {
            if (type instanceof Class) {
                final Class enclosingClass = ((Class)type).getEnclosingClass();
                if (b != null) {
                    if (enclosingClass == null || a0.j(b) != enclosingClass) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("unexpected owner type for ");
                        sb.append(type);
                        sb.append(": ");
                        sb.append(b);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                else if (enclosingClass != null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("unexpected owner type for ");
                    sb2.append(type);
                    sb2.append(": null");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            if (b == null) {
                b = null;
            }
            else {
                b = com.squareup.moshi.internal.c.b(b);
            }
            this.G = b;
            this.H = com.squareup.moshi.internal.c.b(type);
            this.I = array.clone();
            int n = 0;
            while (true) {
                final Type[] i = this.I;
                if (n >= i.length) {
                    break;
                }
                Objects.requireNonNull(i[n]);
                com.squareup.moshi.internal.c.c(i[n]);
                final Type[] j = this.I;
                j[n] = com.squareup.moshi.internal.c.b(j[n]);
                ++n;
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof ParameterizedType && a0.e(this, (Type)o);
        }
        
        @Override
        public Type[] getActualTypeArguments() {
            return this.I.clone();
        }
        
        @h
        @Override
        public Type getOwnerType() {
            return this.G;
        }
        
        @Override
        public Type getRawType() {
            return this.H;
        }
        
        @Override
        public int hashCode() {
            return Arrays.hashCode(this.I) ^ this.H.hashCode() ^ com.squareup.moshi.internal.c.i(this.G);
        }
        
        @Override
        public String toString() {
            final int length = this.I.length;
            int i = 1;
            final StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(com.squareup.moshi.internal.c.x(this.H));
            if (this.I.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(com.squareup.moshi.internal.c.x(this.I[0]));
            while (i < this.I.length) {
                sb.append(", ");
                sb.append(com.squareup.moshi.internal.c.x(this.I[i]));
                ++i;
            }
            sb.append(">");
            return sb.toString();
        }
    }
    
    public static final class c implements WildcardType
    {
        private final Type G;
        @h
        private final Type H;
        
        public c(final Type[] array, final Type[] array2) {
            if (array2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (array.length == 1) {
                if (array2.length == 1) {
                    Objects.requireNonNull(array2[0]);
                    com.squareup.moshi.internal.c.c(array2[0]);
                    if (array[0] != Object.class) {
                        throw new IllegalArgumentException();
                    }
                    this.H = com.squareup.moshi.internal.c.b(array2[0]);
                    this.G = Object.class;
                }
                else {
                    Objects.requireNonNull(array[0]);
                    com.squareup.moshi.internal.c.c(array[0]);
                    this.H = null;
                    this.G = com.squareup.moshi.internal.c.b(array[0]);
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof WildcardType && a0.e(this, (Type)o);
        }
        
        @Override
        public Type[] getLowerBounds() {
            final Type h = this.H;
            Type[] b;
            if (h != null) {
                b = new Type[] { h };
            }
            else {
                b = com.squareup.moshi.internal.c.b;
            }
            return b;
        }
        
        @Override
        public Type[] getUpperBounds() {
            return new Type[] { this.G };
        }
        
        @Override
        public int hashCode() {
            final Type h = this.H;
            int n;
            if (h != null) {
                n = h.hashCode() + 31;
            }
            else {
                n = 1;
            }
            return n ^ this.G.hashCode() + 31;
        }
        
        @Override
        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.H != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.H;
            }
            else {
                if (this.G == Object.class) {
                    return "?";
                }
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.G;
            }
            sb.append(com.squareup.moshi.internal.c.x(type));
            return sb.toString();
        }
    }
}
