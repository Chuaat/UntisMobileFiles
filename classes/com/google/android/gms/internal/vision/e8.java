// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.util.Iterator;
import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.List;
import java.util.TreeSet;
import java.lang.reflect.Method;
import java.util.HashMap;

final class e8
{
    static String a(final z7 z7, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(z7, sb, 0);
        return sb.toString();
    }
    
    private static final String b(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (Character.isUpperCase(char1)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(char1));
        }
        return sb.toString();
    }
    
    private static void c(final z7 z7, final StringBuilder sb, final int n) {
        final HashMap<Object, Method> hashMap = new HashMap<Object, Method>();
        final HashMap<String, Method> hashMap2 = new HashMap<String, Method>();
        final TreeSet<String> set = new TreeSet<String>();
        for (final Method method : z7.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    set.add(method.getName());
                }
            }
        }
        for (final String s : set) {
            String substring;
            if (s.startsWith("get")) {
                substring = s.substring(3);
            }
            else {
                substring = s;
            }
            final boolean endsWith = substring.endsWith("List");
            final int n2 = 1;
            if (endsWith && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                final String value = String.valueOf(substring.substring(0, 1).toLowerCase());
                final String value2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat;
                if (value2.length() != 0) {
                    concat = value.concat(value2);
                }
                else {
                    concat = new String(value);
                }
                final Method method2 = hashMap.get(s);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    d(sb, n, b(concat), p6.x(method2, z7, new Object[0]));
                    continue;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                final String value3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                final String value4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2;
                if (value4.length() != 0) {
                    concat2 = value3.concat(value4);
                }
                else {
                    concat2 = new String(value3);
                }
                final Method method3 = hashMap.get(s);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    d(sb, n, b(concat2), p6.x(method3, z7, new Object[0]));
                    continue;
                }
            }
            String concat3;
            if (substring.length() != 0) {
                concat3 = "set".concat(substring);
            }
            else {
                concat3 = new String("set");
            }
            if (hashMap2.get(concat3) != null) {
                if (substring.endsWith("Bytes")) {
                    final String value5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    String concat4;
                    if (value5.length() != 0) {
                        concat4 = "get".concat(value5);
                    }
                    else {
                        concat4 = new String("get");
                    }
                    if (hashMap.containsKey(concat4)) {
                        continue;
                    }
                }
                final String value6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                final String value7 = String.valueOf(substring.substring(1));
                String concat5;
                if (value7.length() != 0) {
                    concat5 = value6.concat(value7);
                }
                else {
                    concat5 = new String(value6);
                }
                String concat6;
                if (substring.length() != 0) {
                    concat6 = "get".concat(substring);
                }
                else {
                    concat6 = new String("get");
                }
                final Method method4 = hashMap.get(concat6);
                String concat7;
                if (substring.length() != 0) {
                    concat7 = "has".concat(substring);
                }
                else {
                    concat7 = new String("has");
                }
                final Method method5 = hashMap.get(concat7);
                if (method4 == null) {
                    continue;
                }
                final Object x = p6.x(method4, z7, new Object[0]);
                int booleanValue;
                if (method5 == null) {
                    boolean equals = false;
                    Label_0969: {
                        Label_0805: {
                            Label_0799: {
                                if (x instanceof Boolean) {
                                    if (x) {
                                        break Label_0805;
                                    }
                                }
                                else if (x instanceof Integer) {
                                    if ((int)x != 0) {
                                        break Label_0805;
                                    }
                                }
                                else if (x instanceof Float) {
                                    if ((float)x != 0.0f) {
                                        break Label_0805;
                                    }
                                }
                                else {
                                    if (!(x instanceof Double)) {
                                        Serializable h;
                                        if (x instanceof String) {
                                            h = "";
                                        }
                                        else if (x instanceof f5) {
                                            h = f5.H;
                                        }
                                        else {
                                            if ((x instanceof z7) ? (x == ((z7)x).l()) : (x instanceof Enum && ((Enum)x).ordinal() == 0)) {
                                                break Label_0799;
                                            }
                                            break Label_0805;
                                        }
                                        equals = x.equals(h);
                                        break Label_0969;
                                    }
                                    if ((double)x != 0.0) {
                                        break Label_0805;
                                    }
                                }
                            }
                            equals = true;
                            break Label_0969;
                        }
                        equals = false;
                    }
                    if (!equals) {
                        booleanValue = n2;
                    }
                    else {
                        booleanValue = 0;
                    }
                }
                else {
                    booleanValue = (((boolean)p6.x(method5, z7, new Object[0])) ? 1 : 0);
                }
                if (booleanValue == 0) {
                    continue;
                }
                d(sb, n, b(concat5), x);
            }
        }
        if (z7 instanceof p6.c) {
            final Iterator<Map.Entry<p6.f, Object>> p3 = ((p6.c)z7).zzc.p();
            while (p3.hasNext()) {
                final Map.Entry<p6.f, Object> entry = p3.next();
                final int h2 = entry.getKey().H;
                final StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(h2);
                sb2.append("]");
                d(sb, n, sb2.toString(), entry.getValue());
            }
        }
        final n9 zzb = ((p6)z7).zzb;
        if (zzb != null) {
            zzb.f(sb, n);
        }
    }
    
    static final void d(final StringBuilder sb, final int n, final String str, final Object o) {
        if (o instanceof List) {
            final Iterator<Object> iterator = (Iterator<Object>)((List)o).iterator();
            while (iterator.hasNext()) {
                d(sb, n, str, iterator.next());
            }
            return;
        }
        if (o instanceof Map) {
            final Iterator<Map.Entry<?, ?>> iterator2 = ((Map)o).entrySet().iterator();
            while (iterator2.hasNext()) {
                d(sb, n, str, iterator2.next());
            }
            return;
        }
        sb.append('\n');
        final int n2 = 0;
        final int n3 = 0;
        for (int i = 0; i < n; ++i) {
            sb.append(' ');
        }
        sb.append(str);
        if (o instanceof String) {
            sb.append(": \"");
            sb.append(g9.a(f5.l((String)o)));
            sb.append('\"');
            return;
        }
        if (o instanceof f5) {
            sb.append(": \"");
            sb.append(g9.a((f5)o));
            sb.append('\"');
            return;
        }
        if (o instanceof p6) {
            sb.append(" {");
            c((z7)o, sb, n + 2);
            sb.append("\n");
            for (int j = n3; j < n; ++j) {
                sb.append(' ');
            }
            sb.append("}");
            return;
        }
        if (o instanceof Map.Entry) {
            sb.append(" {");
            final Map.Entry entry = (Map.Entry)o;
            final int n4 = n + 2;
            d(sb, n4, "key", entry.getKey());
            d(sb, n4, "value", entry.getValue());
            sb.append("\n");
            for (int k = n2; k < n; ++k) {
                sb.append(' ');
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(o.toString());
    }
}
