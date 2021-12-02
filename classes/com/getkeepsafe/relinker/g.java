// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker;

import android.os.Build;
import android.os.Build$VERSION;

final class g implements b
{
    @Override
    public String a(final String s) {
        if (s.startsWith("lib") && s.endsWith(".so")) {
            return s;
        }
        return System.mapLibraryName(s);
    }
    
    @Override
    public void b(final String libname) {
        System.loadLibrary(libname);
    }
    
    @Override
    public String c(final String s) {
        return s.substring(3, s.length() - 3);
    }
    
    @Override
    public String[] d() {
        if (Build$VERSION.SDK_INT >= 21) {
            final String[] supported_ABIS = Build.SUPPORTED_ABIS;
            if (supported_ABIS.length > 0) {
                return supported_ABIS;
            }
        }
        final String cpu_ABI2 = Build.CPU_ABI2;
        if (!h.a(cpu_ABI2)) {
            return new String[] { Build.CPU_ABI, cpu_ABI2 };
        }
        return new String[] { Build.CPU_ABI };
    }
    
    @Override
    public void e(final String filename) {
        System.load(filename);
    }
}
