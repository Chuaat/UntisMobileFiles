// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics;

import java.util.HashMap;
import androidx.annotation.j0;
import java.util.Map;

public class h
{
    final Map<String, String> a;
    
    h(@j0 final a a) {
        this.a = a.a;
    }
    
    public static class a
    {
        private Map<String, String> a;
        
        public a() {
            this.a = new HashMap<String, String>();
        }
        
        @j0
        public h b() {
            return new h(this);
        }
        
        @j0
        public a c(@j0 final String s, final boolean b) {
            this.a.put(s, Boolean.toString(b));
            return this;
        }
        
        @j0
        public a d(@j0 final String s, final double d) {
            this.a.put(s, Double.toString(d));
            return this;
        }
        
        @j0
        public a e(@j0 final String s, final float f) {
            this.a.put(s, Float.toString(f));
            return this;
        }
        
        @j0
        public a f(@j0 final String s, final int i) {
            this.a.put(s, Integer.toString(i));
            return this;
        }
        
        @j0
        public a g(@j0 final String s, final long i) {
            this.a.put(s, Long.toString(i));
            return this;
        }
        
        @j0
        public a h(@j0 final String s, @j0 final String s2) {
            this.a.put(s, s2);
            return this;
        }
    }
}
