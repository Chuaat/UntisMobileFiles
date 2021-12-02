// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal;

import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class UnsafeAllocator
{
    static void assertInstantiable(final Class<?> clazz) {
        final int modifiers = clazz.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Interface can't be instantiated! Interface name: ");
            sb.append(clazz.getName());
            throw new UnsupportedOperationException(sb.toString());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Abstract class can't be instantiated! Class name: ");
        sb2.append(clazz.getName());
        throw new UnsupportedOperationException(sb2.toString());
    }
    
    public static UnsafeAllocator create() {
        try {
            final Class<?> forName = Class.forName("sun.misc.Unsafe");
            final Field declaredField = forName.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new UnsafeAllocator() {
                final /* synthetic */ Method val$allocateInstance = forName.getMethod("allocateInstance", Class.class);
                final /* synthetic */ Object val$unsafe = declaredField.get(null);
                
                @Override
                public <T> T newInstance(final Class<T> clazz) throws Exception {
                    UnsafeAllocator.assertInstantiable(clazz);
                    return (T)this.val$allocateInstance.invoke(this.val$unsafe, clazz);
                }
            };
        }
        catch (Exception ex) {
            try {
                final Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = (int)declaredMethod.invoke(null, Object.class);
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new UnsafeAllocator() {
                    @Override
                    public <T> T newInstance(final Class<T> clazz) throws Exception {
                        UnsafeAllocator.assertInstantiable(clazz);
                        return (T)declaredMethod2.invoke(null, clazz, intValue);
                    }
                };
            }
            catch (Exception ex2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new UnsafeAllocator() {
                        @Override
                        public <T> T newInstance(final Class<T> clazz) throws Exception {
                            UnsafeAllocator.assertInstantiable(clazz);
                            return (T)declaredMethod3.invoke(null, clazz, Object.class);
                        }
                    };
                }
                catch (Exception ex3) {
                    return new UnsafeAllocator() {
                        @Override
                        public <T> T newInstance(final Class<T> obj) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Cannot allocate ");
                            sb.append(obj);
                            throw new UnsupportedOperationException(sb.toString());
                        }
                    };
                }
            }
        }
    }
    
    public abstract <T> T newInstance(final Class<T> p0) throws Exception;
}
