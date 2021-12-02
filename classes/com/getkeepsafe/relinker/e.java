// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker;

import java.io.File;
import android.content.Context;

public class e
{
    private e() {
    }
    
    public static f a() {
        return new f().c();
    }
    
    public static void b(final Context context, final String s) {
        e(context, s, null, null);
    }
    
    public static void c(final Context context, final String s, final c c) {
        e(context, s, null, c);
    }
    
    public static void d(final Context context, final String s, final String s2) {
        e(context, s, s2, null);
    }
    
    public static void e(final Context context, final String s, final String s2, final c c) {
        new f().i(context, s, s2, c);
    }
    
    public static f f(final d d) {
        return new f().k(d);
    }
    
    public static f g() {
        return new f().n();
    }
    
    public interface a
    {
        void a(final Context p0, final String[] p1, final String p2, final File p3, final f p4);
    }
    
    public interface b
    {
        String a(final String p0);
        
        void b(final String p0);
        
        String c(final String p0);
        
        String[] d();
        
        void e(final String p0);
    }
    
    public interface c
    {
        void a();
        
        void b(final Throwable p0);
    }
    
    public interface d
    {
        void a(final String p0);
    }
}
