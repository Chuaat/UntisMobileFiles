// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;

abstract class c<T>
{
    public static <T> c<T> a(final Class<?> clazz) {
        try {
            final Constructor<?> declaredConstructor = clazz.getDeclaredConstructor((Class<?>[])new Class[0]);
            declaredConstructor.setAccessible(true);
            return new c<T>() {
                public T b() throws IllegalAccessException, InvocationTargetException, InstantiationException {
                    return declaredConstructor.newInstance((Object[])null);
                }
                
                @Override
                public String toString() {
                    return clazz.getName();
                }
            };
        }
        catch (NoSuchMethodException ex2) {
            try {
                final Class<?> forName = Class.forName("sun.misc.Unsafe");
                final Field declaredField = forName.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new c<T>() {
                    final /* synthetic */ Method a = forName.getMethod("allocateInstance", Class.class);
                    final /* synthetic */ Object b = declaredField.get(null);
                    
                    public T b() throws InvocationTargetException, IllegalAccessException {
                        return (T)this.a.invoke(this.b, clazz);
                    }
                    
                    @Override
                    public String toString() {
                        return clazz.getName();
                    }
                };
            }
            catch (ClassNotFoundException | NoSuchMethodException | NoSuchFieldException ex3) {
                try {
                    final Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    final int intValue = (int)declaredMethod.invoke(null, Object.class);
                    final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new c<T>() {
                        public T b() throws InvocationTargetException, IllegalAccessException {
                            return (T)declaredMethod2.invoke(null, clazz, intValue);
                        }
                        
                        @Override
                        public String toString() {
                            return clazz.getName();
                        }
                    };
                }
                catch (NoSuchMethodException ex4) {
                    try {
                        final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                        declaredMethod3.setAccessible(true);
                        return new c<T>() {
                            public T b() throws InvocationTargetException, IllegalAccessException {
                                return (T)declaredMethod3.invoke(null, clazz, Object.class);
                            }
                            
                            @Override
                            public String toString() {
                                return clazz.getName();
                            }
                        };
                    }
                    catch (Exception ex5) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("cannot construct instances of ");
                        sb.append(clazz.getName());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                catch (InvocationTargetException ex) {
                    throw com.squareup.moshi.internal.c.v(ex);
                }
                catch (IllegalAccessException ex6) {
                    throw new AssertionError();
                }
            }
            catch (IllegalAccessException ex7) {
                throw new AssertionError();
            }
        }
    }
    
    abstract T b() throws InvocationTargetException, IllegalAccessException, InstantiationException;
}
