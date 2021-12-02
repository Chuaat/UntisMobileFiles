// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal.reflect;

import java.lang.reflect.AccessibleObject;
import com.google.gson.internal.JavaVersion;

public abstract class ReflectionAccessor
{
    private static final ReflectionAccessor instance;
    
    static {
        ReflectionAccessor instance2;
        if (JavaVersion.getMajorJavaVersion() < 9) {
            instance2 = new PreJava9ReflectionAccessor();
        }
        else {
            instance2 = new UnsafeReflectionAccessor();
        }
        instance = instance2;
    }
    
    public static ReflectionAccessor getInstance() {
        return ReflectionAccessor.instance;
    }
    
    public abstract void makeAccessible(final AccessibleObject p0);
}
