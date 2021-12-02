// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import java.lang.reflect.InvocationTargetException;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.util.Arrays;
import java.util.List;

public class MethodInvoker
{
    private static final List<TypedMethodInvoker<?>> invokers;
    
    static {
        invokers = Arrays.asList((TypedMethodInvoker)new StringMethodInvoker(), (TypedMethodInvoker)new CharSequenceMethodInvoker(), (TypedMethodInvoker)new IntegerMethodInvoker(), (TypedMethodInvoker)new FloatMethodInvoker(), (TypedMethodInvoker)new BooleanMethodInvoker());
    }
    
    public void invoke(final Object o, final String str, final String s) {
        Util.throwIfNull(o, str, s);
        for (int size = MethodInvoker.invokers.size(), i = 0; i < size; ++i) {
            if (MethodInvoker.invokers.get(i).invoke(o, str, s)) {
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Method with name ");
        sb.append(str);
        sb.append(" not found for any of the MethodInvoker supported argument types.");
        LogUtil.w(sb.toString());
    }
    
    private static class BooleanMethodInvoker extends TypedMethodInvoker<Boolean>
    {
        BooleanMethodInvoker() {
            super(Boolean.TYPE);
        }
        
        Boolean convertArgument(final String s) {
            return Boolean.parseBoolean(s);
        }
    }
    
    private static class CharSequenceMethodInvoker extends TypedMethodInvoker<CharSequence>
    {
        CharSequenceMethodInvoker() {
            super(CharSequence.class);
        }
        
        CharSequence convertArgument(final String s) {
            return s;
        }
    }
    
    private static class FloatMethodInvoker extends TypedMethodInvoker<Float>
    {
        FloatMethodInvoker() {
            super(Float.TYPE);
        }
        
        Float convertArgument(final String s) {
            return Float.parseFloat(s);
        }
    }
    
    private static class IntegerMethodInvoker extends TypedMethodInvoker<Integer>
    {
        IntegerMethodInvoker() {
            super(Integer.TYPE);
        }
        
        Integer convertArgument(final String s) {
            return Integer.parseInt(s);
        }
    }
    
    private static class StringMethodInvoker extends TypedMethodInvoker<String>
    {
        StringMethodInvoker() {
            super(String.class);
        }
        
        String convertArgument(final String s) {
            return s;
        }
    }
    
    private abstract static class TypedMethodInvoker<T>
    {
        private final Class<T> mArgType;
        
        TypedMethodInvoker(final Class<T> mArgType) {
            this.mArgType = mArgType;
        }
        
        abstract T convertArgument(final String p0);
        
        boolean invoke(final Object obj, final String name, final String s) {
            try {
                obj.getClass().getMethod(name, this.mArgType).invoke(obj, this.convertArgument(s));
                return true;
            }
            catch (IllegalArgumentException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("IllegalArgumentException: ");
                ex.getMessage();
                goto Label_0107;
            }
            catch (IllegalAccessException ex2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("IllegalAccessException: ");
                ex2.getMessage();
                goto Label_0107;
            }
            catch (InvocationTargetException ex3) {
                final StringBuilder sb = new StringBuilder();
                sb.append("InvocationTargetException: ");
                ex3.getMessage();
            }
            catch (NoSuchMethodException ex4) {
                goto Label_0120;
            }
        }
    }
}
