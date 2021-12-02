// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal;

import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Properties;
import java.util.Collection;
import java.util.Arrays;
import java.lang.reflect.TypeVariable;
import java.io.Serializable;
import java.lang.reflect.WildcardType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class $Gson$Types
{
    static final Type[] EMPTY_TYPE_ARRAY;
    
    static {
        EMPTY_TYPE_ARRAY = new Type[0];
    }
    
    private $Gson$Types() {
        throw new UnsupportedOperationException();
    }
    
    public static GenericArrayType arrayOf(final Type type) {
        return new GenericArrayTypeImpl(type);
    }
    
    public static Type canonicalize(final Type type) {
        if (type instanceof Class) {
            Serializable s;
            final Class clazz = (Class)(s = (Class)type);
            if (clazz.isArray()) {
                s = new GenericArrayTypeImpl(canonicalize(clazz.getComponentType()));
            }
            return (Type)s;
        }
        if (type instanceof ParameterizedType) {
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            final WildcardType wildcardType = (WildcardType)type;
            return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }
    
    static void checkNotPrimitive(final Type type) {
        $Gson$Preconditions.checkArgument(!(type instanceof Class) || !((Class)type).isPrimitive());
    }
    
    private static Class<?> declaringClassOf(final TypeVariable<?> typeVariable) {
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
    
    static boolean equal(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    public static boolean equals(final Type type, final Type obj) {
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        if (type == obj) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(obj);
        }
        if (type instanceof ParameterizedType) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            final ParameterizedType parameterizedType2 = (ParameterizedType)obj;
            if (!equal(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                b3 = false;
            }
            return b3;
        }
        else {
            if (type instanceof GenericArrayType) {
                return obj instanceof GenericArrayType && equals(((GenericArrayType)type).getGenericComponentType(), ((GenericArrayType)obj).getGenericComponentType());
            }
            if (type instanceof WildcardType) {
                if (!(obj instanceof WildcardType)) {
                    return false;
                }
                final WildcardType wildcardType = (WildcardType)type;
                final WildcardType wildcardType2 = (WildcardType)obj;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds()) && b;
            }
            else {
                if (!(type instanceof TypeVariable)) {
                    return false;
                }
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                final TypeVariable typeVariable = (TypeVariable)type;
                final TypeVariable typeVariable2 = (TypeVariable)obj;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName()) && b2;
            }
        }
    }
    
    public static Type getArrayComponentType(Type type) {
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType)type).getGenericComponentType();
        }
        else {
            type = ((Class)type).getComponentType();
        }
        return type;
    }
    
    public static Type getCollectionElementType(Type supertype, final Class<?> clazz) {
        final Type type = supertype = getSupertype(supertype, clazz, Collection.class);
        if (type instanceof WildcardType) {
            supertype = ((WildcardType)type).getUpperBounds()[0];
        }
        if (supertype instanceof ParameterizedType) {
            return ((ParameterizedType)supertype).getActualTypeArguments()[0];
        }
        return Object.class;
    }
    
    static Type getGenericSupertype(final Type type, Class<?> clazz, final Class<?> clazz2) {
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
                    return getGenericSupertype(clazz.getGenericInterfaces()[i], interfaces[i], clazz2);
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
                    return getGenericSupertype(clazz.getGenericSuperclass(), superclass, clazz2);
                }
                clazz = (Class<Object>)superclass;
            }
        }
        return clazz2;
    }
    
    public static Type[] getMapKeyAndValueTypes(Type supertype, final Class<?> clazz) {
        if (supertype == Properties.class) {
            return new Type[] { String.class, String.class };
        }
        supertype = getSupertype(supertype, clazz, Map.class);
        if (supertype instanceof ParameterizedType) {
            return ((ParameterizedType)supertype).getActualTypeArguments();
        }
        return new Type[] { Object.class, Object.class };
    }
    
    public static Class<?> getRawType(Type rawType) {
        if (rawType instanceof Class) {
            return (Class<?>)rawType;
        }
        if (rawType instanceof ParameterizedType) {
            rawType = ((ParameterizedType)rawType).getRawType();
            $Gson$Preconditions.checkArgument(rawType instanceof Class);
            return (Class<?>)rawType;
        }
        if (rawType instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType)rawType).getGenericComponentType()), 0).getClass();
        }
        if (rawType instanceof TypeVariable) {
            return Object.class;
        }
        if (rawType instanceof WildcardType) {
            return getRawType(((WildcardType)rawType).getUpperBounds()[0]);
        }
        String name;
        if (rawType == null) {
            name = "null";
        }
        else {
            name = rawType.getClass().getName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(rawType);
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }
    
    static Type getSupertype(final Type type, final Class<?> clazz, final Class<?> clazz2) {
        Type type2 = type;
        if (type instanceof WildcardType) {
            type2 = ((WildcardType)type).getUpperBounds()[0];
        }
        $Gson$Preconditions.checkArgument(clazz2.isAssignableFrom(clazz));
        return resolve(type2, clazz, getGenericSupertype(type2, clazz, clazz2));
    }
    
    static int hashCodeOrZero(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    private static int indexOf(final Object[] array, final Object o) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }
    
    public static ParameterizedType newParameterizedTypeWithOwner(final Type type, final Type type2, final Type... array) {
        return new ParameterizedTypeImpl(type, type2, array);
    }
    
    public static Type resolve(final Type type, final Class<?> clazz, final Type type2) {
        return resolve(type, clazz, type2, new HashSet<TypeVariable>());
    }
    
    private static Type resolve(Type type, final Class<?> clazz, Type ownerType, final Collection<TypeVariable> collection) {
        while (ownerType instanceof TypeVariable) {
            final TypeVariable typeVariable = (TypeVariable)ownerType;
            if (collection.contains(typeVariable)) {
                return ownerType;
            }
            collection.add(typeVariable);
            final Type resolveTypeVariable = resolveTypeVariable(type, clazz, typeVariable);
            if ((ownerType = resolveTypeVariable) == typeVariable) {
                return resolveTypeVariable;
            }
        }
        if (ownerType instanceof Class) {
            final Class clazz2 = (Class)ownerType;
            if (clazz2.isArray()) {
                final Class componentType = clazz2.getComponentType();
                type = resolve(type, clazz, componentType, collection);
                Object array;
                if (componentType == type) {
                    array = clazz2;
                }
                else {
                    array = arrayOf(type);
                }
                return (Type)array;
            }
        }
        if (ownerType instanceof GenericArrayType) {
            final GenericArrayType genericArrayType = (GenericArrayType)ownerType;
            final Type genericComponentType = genericArrayType.getGenericComponentType();
            type = resolve(type, clazz, genericComponentType, collection);
            GenericArrayType array2;
            if (genericComponentType == type) {
                array2 = genericArrayType;
            }
            else {
                array2 = arrayOf(type);
            }
            return array2;
        }
        final boolean b = ownerType instanceof ParameterizedType;
        int i = 0;
        if (b) {
            final ParameterizedType parameterizedType = (ParameterizedType)ownerType;
            ownerType = parameterizedType.getOwnerType();
            final Type resolve = resolve(type, clazz, ownerType, collection);
            int n;
            if (resolve != ownerType) {
                n = 1;
            }
            else {
                n = 0;
            }
            Type[] actualTypeArguments;
            int n2;
            Type[] array3;
            for (actualTypeArguments = parameterizedType.getActualTypeArguments(); i < actualTypeArguments.length; ++i, n = n2, actualTypeArguments = array3) {
                final Type resolve2 = resolve(type, clazz, actualTypeArguments[i], collection);
                n2 = n;
                array3 = actualTypeArguments;
                if (resolve2 != actualTypeArguments[i]) {
                    n2 = n;
                    array3 = actualTypeArguments;
                    if (n == 0) {
                        array3 = actualTypeArguments.clone();
                        n2 = 1;
                    }
                    array3[i] = resolve2;
                }
            }
            ParameterizedType parameterizedTypeWithOwner = parameterizedType;
            if (n != 0) {
                parameterizedTypeWithOwner = newParameterizedTypeWithOwner(resolve, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedTypeWithOwner;
        }
        Type type2 = ownerType;
        if (!(ownerType instanceof WildcardType)) {
            return type2;
        }
        final WildcardType wildcardType = (WildcardType)ownerType;
        final Type[] lowerBounds = wildcardType.getLowerBounds();
        final Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length == 1) {
            type = resolve(type, clazz, lowerBounds[0], collection);
            type2 = wildcardType;
            if (type != lowerBounds[0]) {
                return supertypeOf(type);
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
            type = resolve(type, clazz, type3, collection);
            type2 = wildcardType;
            if (type != upperBounds[0]) {
                return subtypeOf(type);
            }
            return type2;
        }
        finally {}
    }
    
    static Type resolveTypeVariable(Type genericSupertype, final Class<?> clazz, final TypeVariable<?> typeVariable) {
        final Class<?> declaringClass = declaringClassOf(typeVariable);
        if (declaringClass == null) {
            return typeVariable;
        }
        genericSupertype = getGenericSupertype(genericSupertype, clazz, declaringClass);
        if (genericSupertype instanceof ParameterizedType) {
            return ((ParameterizedType)genericSupertype).getActualTypeArguments()[indexOf(declaringClass.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }
    
    public static WildcardType subtypeOf(final Type type) {
        Type[] upperBounds;
        if (type instanceof WildcardType) {
            upperBounds = ((WildcardType)type).getUpperBounds();
        }
        else {
            upperBounds = new Type[] { type };
        }
        return new WildcardTypeImpl(upperBounds, $Gson$Types.EMPTY_TYPE_ARRAY);
    }
    
    public static WildcardType supertypeOf(final Type type) {
        Type[] lowerBounds;
        if (type instanceof WildcardType) {
            lowerBounds = ((WildcardType)type).getLowerBounds();
        }
        else {
            lowerBounds = new Type[] { type };
        }
        return new WildcardTypeImpl(new Type[] { Object.class }, lowerBounds);
    }
    
    public static String typeToString(final Type type) {
        String s;
        if (type instanceof Class) {
            s = ((Class)type).getName();
        }
        else {
            s = type.toString();
        }
        return s;
    }
    
    private static final class GenericArrayTypeImpl implements GenericArrayType, Serializable
    {
        private static final long serialVersionUID = 0L;
        private final Type componentType;
        
        public GenericArrayTypeImpl(final Type type) {
            this.componentType = $Gson$Types.canonicalize(type);
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof GenericArrayType && $Gson$Types.equals(this, (Type)o);
        }
        
        @Override
        public Type getGenericComponentType() {
            return this.componentType;
        }
        
        @Override
        public int hashCode() {
            return this.componentType.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append($Gson$Types.typeToString(this.componentType));
            sb.append("[]");
            return sb.toString();
        }
    }
    
    private static final class ParameterizedTypeImpl implements ParameterizedType, Serializable
    {
        private static final long serialVersionUID = 0L;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;
        
        public ParameterizedTypeImpl(Type canonicalize, final Type type, final Type... array) {
            final boolean b = type instanceof Class;
            final int n = 0;
            if (b) {
                final Class clazz = (Class)type;
                final boolean static1 = Modifier.isStatic(clazz.getModifiers());
                final boolean b2 = true;
                final boolean b3 = static1 || clazz.getEnclosingClass() == null;
                boolean b4 = b2;
                if (canonicalize == null) {
                    b4 = (b3 && b2);
                }
                $Gson$Preconditions.checkArgument(b4);
            }
            if (canonicalize == null) {
                canonicalize = null;
            }
            else {
                canonicalize = $Gson$Types.canonicalize(canonicalize);
            }
            this.ownerType = canonicalize;
            this.rawType = $Gson$Types.canonicalize(type);
            final Type[] typeArguments = array.clone();
            this.typeArguments = typeArguments;
            for (int length = typeArguments.length, i = n; i < length; ++i) {
                $Gson$Preconditions.checkNotNull(this.typeArguments[i]);
                $Gson$Types.checkNotPrimitive(this.typeArguments[i]);
                final Type[] typeArguments2 = this.typeArguments;
                typeArguments2[i] = $Gson$Types.canonicalize(typeArguments2[i]);
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof ParameterizedType && $Gson$Types.equals(this, (Type)o);
        }
        
        @Override
        public Type[] getActualTypeArguments() {
            return this.typeArguments.clone();
        }
        
        @Override
        public Type getOwnerType() {
            return this.ownerType;
        }
        
        @Override
        public Type getRawType() {
            return this.rawType;
        }
        
        @Override
        public int hashCode() {
            return Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode() ^ $Gson$Types.hashCodeOrZero(this.ownerType);
        }
        
        @Override
        public String toString() {
            final int length = this.typeArguments.length;
            if (length == 0) {
                return $Gson$Types.typeToString(this.rawType);
            }
            final StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append($Gson$Types.typeToString(this.rawType));
            sb.append("<");
            sb.append($Gson$Types.typeToString(this.typeArguments[0]));
            for (int i = 1; i < length; ++i) {
                sb.append(", ");
                sb.append($Gson$Types.typeToString(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }
    
    private static final class WildcardTypeImpl implements WildcardType, Serializable
    {
        private static final long serialVersionUID = 0L;
        private final Type lowerBound;
        private final Type upperBound;
        
        public WildcardTypeImpl(final Type[] array, final Type[] array2) {
            final int length = array2.length;
            final boolean b = true;
            $Gson$Preconditions.checkArgument(length <= 1);
            $Gson$Preconditions.checkArgument(array.length == 1);
            if (array2.length == 1) {
                $Gson$Preconditions.checkNotNull(array2[0]);
                $Gson$Types.checkNotPrimitive(array2[0]);
                $Gson$Preconditions.checkArgument(array[0] == Object.class && b);
                this.lowerBound = $Gson$Types.canonicalize(array2[0]);
                this.upperBound = Object.class;
            }
            else {
                $Gson$Preconditions.checkNotNull(array[0]);
                $Gson$Types.checkNotPrimitive(array[0]);
                this.lowerBound = null;
                this.upperBound = $Gson$Types.canonicalize(array[0]);
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof WildcardType && $Gson$Types.equals(this, (Type)o);
        }
        
        @Override
        public Type[] getLowerBounds() {
            final Type lowerBound = this.lowerBound;
            Type[] empty_TYPE_ARRAY;
            if (lowerBound != null) {
                empty_TYPE_ARRAY = new Type[] { lowerBound };
            }
            else {
                empty_TYPE_ARRAY = $Gson$Types.EMPTY_TYPE_ARRAY;
            }
            return empty_TYPE_ARRAY;
        }
        
        @Override
        public Type[] getUpperBounds() {
            return new Type[] { this.upperBound };
        }
        
        @Override
        public int hashCode() {
            final Type lowerBound = this.lowerBound;
            int n;
            if (lowerBound != null) {
                n = lowerBound.hashCode() + 31;
            }
            else {
                n = 1;
            }
            return n ^ this.upperBound.hashCode() + 31;
        }
        
        @Override
        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.lowerBound != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.lowerBound;
            }
            else {
                if (this.upperBound == Object.class) {
                    return "?";
                }
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.upperBound;
            }
            sb.append($Gson$Types.typeToString(type));
            return sb.toString();
        }
    }
}
