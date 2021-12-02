// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal.reflect;

import java.lang.reflect.AccessibleObject;

final class PreJava9ReflectionAccessor extends ReflectionAccessor
{
    @Override
    public void makeAccessible(final AccessibleObject accessibleObject) {
        accessibleObject.setAccessible(true);
    }
}
