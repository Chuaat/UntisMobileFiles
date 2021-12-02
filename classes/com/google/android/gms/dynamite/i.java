// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

final class i extends PathClassLoader
{
    i(final String s, final ClassLoader classLoader) {
        super(s, classLoader);
    }
    
    protected final Class<?> loadClass(final String s, final boolean b) throws ClassNotFoundException {
        Label_0026: {
            if (s.startsWith("java.") || s.startsWith("android.")) {
                break Label_0026;
            }
            try {
                return (Class<?>)this.findClass(s);
                return (Class<?>)super.loadClass(s, b);
            }
            catch (ClassNotFoundException ex) {
                return (Class<?>)super.loadClass(s, b);
            }
        }
    }
}
