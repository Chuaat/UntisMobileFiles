// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;
import java.util.Date;

public class s
{
    public static Class a(final String s) throws o {
        try {
            return Class.forName(s);
        }
        catch (ClassNotFoundException ex) {
            final StringBuffer sb = new StringBuffer();
            sb.append("Unable to find the class: ");
            sb.append(s);
            throw new o(sb.toString());
        }
    }
    
    public static Date b(final String s) throws o {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public static File c(final String pathname) throws o {
        return new File(pathname);
    }
    
    public static File[] d(final String s) throws o {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public static Number e(final String s) throws o {
        try {
            if (s.indexOf(46) != -1) {
                return Double.valueOf(s);
            }
            return Long.valueOf(s);
        }
        catch (NumberFormatException ex) {
            throw new o(ex.getMessage());
        }
    }
    
    public static Object f(final String str) throws o {
        try {
            final Class<?> forName = Class.forName(str);
            try {
                return forName.newInstance();
            }
            catch (Exception ex) {
                final StringBuffer sb = new StringBuffer();
                sb.append(ex.getClass().getName());
                sb.append("; Unable to create an instance of: ");
                sb.append(str);
                throw new o(sb.toString());
            }
        }
        catch (ClassNotFoundException ex2) {
            final StringBuffer sb2 = new StringBuffer();
            sb2.append("Unable to find the class: ");
            sb2.append(str);
            throw new o(sb2.toString());
        }
    }
    
    public static URL g(final String s) throws o {
        try {
            return new URL(s);
        }
        catch (MalformedURLException ex) {
            final StringBuffer sb = new StringBuffer();
            sb.append("Unable to parse the URL: ");
            sb.append(s);
            throw new o(sb.toString());
        }
    }
    
    public static Object h(final String s, final Class clazz) throws o {
        if (q.a == clazz) {
            return s;
        }
        if (q.b == clazz) {
            return f(s);
        }
        if (q.c == clazz) {
            return e(s);
        }
        if (q.d == clazz) {
            return b(s);
        }
        if (q.e == clazz) {
            return a(s);
        }
        if (q.g == clazz) {
            return c(s);
        }
        if (q.f == clazz) {
            return c(s);
        }
        if (q.h == clazz) {
            return d(s);
        }
        if (q.i == clazz) {
            return g(s);
        }
        return null;
    }
    
    public static Object i(final String s, final Object o) throws o {
        return h(s, (Class)o);
    }
}
