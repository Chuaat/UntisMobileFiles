// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.c;
import com.bumptech.glide.load.a;

public abstract class j
{
    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    
    static {
        a = new j() {
            @Override
            public boolean a() {
                return true;
            }
            
            @Override
            public boolean b() {
                return true;
            }
            
            @Override
            public boolean c(final a a) {
                return a == a.H;
            }
            
            @Override
            public boolean d(final boolean b, final a a, final c c) {
                return a != a.J && a != a.K;
            }
        };
        b = new j() {
            @Override
            public boolean a() {
                return false;
            }
            
            @Override
            public boolean b() {
                return false;
            }
            
            @Override
            public boolean c(final a a) {
                return false;
            }
            
            @Override
            public boolean d(final boolean b, final a a, final c c) {
                return false;
            }
        };
        c = new j() {
            @Override
            public boolean a() {
                return true;
            }
            
            @Override
            public boolean b() {
                return false;
            }
            
            @Override
            public boolean c(final a a) {
                return a != a.I && a != a.K;
            }
            
            @Override
            public boolean d(final boolean b, final a a, final c c) {
                return false;
            }
        };
        d = new j() {
            @Override
            public boolean a() {
                return false;
            }
            
            @Override
            public boolean b() {
                return true;
            }
            
            @Override
            public boolean c(final a a) {
                return false;
            }
            
            @Override
            public boolean d(final boolean b, final a a, final c c) {
                return a != a.J && a != a.K;
            }
        };
        e = new j() {
            @Override
            public boolean a() {
                return true;
            }
            
            @Override
            public boolean b() {
                return true;
            }
            
            @Override
            public boolean c(final a a) {
                return a == a.H;
            }
            
            @Override
            public boolean d(final boolean b, final a a, final c c) {
                return ((b && a == a.I) || a == a.G) && c == c.H;
            }
        };
    }
    
    public abstract boolean a();
    
    public abstract boolean b();
    
    public abstract boolean c(final a p0);
    
    public abstract boolean d(final boolean p0, final a p1, final c p2);
}
