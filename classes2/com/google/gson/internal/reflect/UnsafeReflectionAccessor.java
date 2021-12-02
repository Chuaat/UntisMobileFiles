// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class UnsafeReflectionAccessor extends ReflectionAccessor
{
    private static Class unsafeClass;
    private final Field overrideField;
    private final Object theUnsafe;
    
    UnsafeReflectionAccessor() {
        this.theUnsafe = getUnsafeInstance();
        this.overrideField = getOverrideField();
    }
    
    private static Field getOverrideField() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        }
        catch (NoSuchFieldException ex) {
            return null;
        }
    }
    
    private static Object getUnsafeInstance() {
        Object value = null;
        try {
            final Field declaredField = (UnsafeReflectionAccessor.unsafeClass = Class.forName("sun.misc.Unsafe")).getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            value = declaredField.get(null);
            return value;
        }
        catch (Exception ex) {
            return value;
        }
    }
    
    @Override
    public void makeAccessible(final AccessibleObject obj) {
        if (!this.makeAccessibleWithUnsafe(obj)) {
            try {
                obj.setAccessible(true);
            }
            catch (SecurityException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Gson couldn't modify fields for ");
                sb.append(obj);
                sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new JsonIOException(sb.toString(), ex);
            }
        }
    }
    
    boolean makeAccessibleWithUnsafe(final AccessibleObject accessibleObject) {
        if (this.theUnsafe == null || this.overrideField == null) {
            return false;
        }
        try {
            UnsafeReflectionAccessor.unsafeClass.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.theUnsafe, accessibleObject, (long)UnsafeReflectionAccessor.unsafeClass.getMethod("objectFieldOffset", Field.class).invoke(this.theUnsafe, this.overrideField), Boolean.TRUE);
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }
}
