// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.Serializable;
import java.util.Iterator;
import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.List;
import java.util.TreeSet;
import java.lang.reflect.Method;
import java.util.HashMap;

final class v2
{
    static String a(final s2 s2, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        b(s2, sb, 0);
        return sb.toString();
    }
    
    private static void b(final s2 s2, final StringBuilder sb, final int n) {
        final HashMap<Object, Method> hashMap = new HashMap<Object, Method>();
        final HashMap<String, Method> hashMap2 = new HashMap<String, Method>();
        final TreeSet<String> set = new TreeSet<String>();
        for (final Method method : s2.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    set.add(method.getName());
                }
            }
        }
        for (final String s3 : set) {
            final String s4 = "";
            final String replaceFirst = s3.replaceFirst("get", "");
            final boolean endsWith = replaceFirst.endsWith("List");
            final int n2 = 1;
            if (endsWith && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                final String value = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                final String value2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                String concat;
                if (value2.length() != 0) {
                    concat = value.concat(value2);
                }
                else {
                    concat = new String(value);
                }
                final Method method2 = hashMap.get(s3);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, n, d(concat), j1.n(method2, s2, new Object[0]));
                    continue;
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                final String value3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                final String value4 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                String concat2;
                if (value4.length() != 0) {
                    concat2 = value3.concat(value4);
                }
                else {
                    concat2 = new String(value3);
                }
                final Method method3 = hashMap.get(s3);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, n, d(concat2), j1.n(method3, s2, new Object[0]));
                    continue;
                }
            }
            String concat3;
            if (replaceFirst.length() != 0) {
                concat3 = "set".concat(replaceFirst);
            }
            else {
                concat3 = new String("set");
            }
            if (hashMap2.get(concat3) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    final String value5 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
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
                final String value6 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                final String value7 = String.valueOf(replaceFirst.substring(1));
                String concat5;
                if (value7.length() != 0) {
                    concat5 = value6.concat(value7);
                }
                else {
                    concat5 = new String(value6);
                }
                String concat6;
                if (replaceFirst.length() != 0) {
                    concat6 = "get".concat(replaceFirst);
                }
                else {
                    concat6 = new String("get");
                }
                final Method method4 = hashMap.get(concat6);
                String concat7;
                if (replaceFirst.length() != 0) {
                    concat7 = "has".concat(replaceFirst);
                }
                else {
                    concat7 = new String("has");
                }
                final Method method5 = hashMap.get(concat7);
                if (method4 == null) {
                    continue;
                }
                final Object n3 = j1.n(method4, s2, new Object[0]);
                int booleanValue;
                if (method5 == null) {
                    boolean equals = false;
                    Label_0959: {
                        Label_0795: {
                            Label_0789: {
                                if (n3 instanceof Boolean) {
                                    if (n3) {
                                        break Label_0795;
                                    }
                                }
                                else if (n3 instanceof Integer) {
                                    if ((int)n3 != 0) {
                                        break Label_0795;
                                    }
                                }
                                else if (n3 instanceof Float) {
                                    if ((float)n3 != 0.0f) {
                                        break Label_0795;
                                    }
                                }
                                else {
                                    if (!(n3 instanceof Double)) {
                                        Serializable h;
                                        if (n3 instanceof String) {
                                            h = s4;
                                        }
                                        else if (n3 instanceof d0) {
                                            h = d0.H;
                                        }
                                        else {
                                            if ((n3 instanceof s2) ? (n3 == ((s2)n3).g()) : (n3 instanceof Enum && ((Enum)n3).ordinal() == 0)) {
                                                break Label_0789;
                                            }
                                            break Label_0795;
                                        }
                                        equals = n3.equals(h);
                                        break Label_0959;
                                    }
                                    if ((double)n3 != 0.0) {
                                        break Label_0795;
                                    }
                                }
                            }
                            equals = true;
                            break Label_0959;
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
                    booleanValue = (((boolean)j1.n(method5, s2, new Object[0])) ? 1 : 0);
                }
                if (booleanValue == 0) {
                    continue;
                }
                c(sb, n, d(concat5), n3);
            }
        }
        if (s2 instanceof j1.d) {
            final Iterator<Map.Entry<j1.e, Object>> e = ((j1.d)s2).zzjv.e();
            while (e.hasNext()) {
                final Map.Entry<j1.e, Object> entry = e.next();
                final int h2 = entry.getKey().H;
                final StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(h2);
                sb2.append("]");
                c(sb, n, sb2.toString(), entry.getValue());
            }
        }
        final d4 zzjp = ((j1)s2).zzjp;
        if (zzjp != null) {
            zzjp.c(sb, n);
        }
    }
    
    static final void c(final StringBuilder sb, final int n, final String str, final Object o) {
        if (o instanceof List) {
            final Iterator<Object> iterator = (Iterator<Object>)((List)o).iterator();
            while (iterator.hasNext()) {
                c(sb, n, str, iterator.next());
            }
            return;
        }
        if (o instanceof Map) {
            final Iterator<Map.Entry<?, ?>> iterator2 = ((Map)o).entrySet().iterator();
            while (iterator2.hasNext()) {
                c(sb, n, str, iterator2.next());
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
            sb.append(y3.a(d0.o((String)o)));
            sb.append('\"');
            return;
        }
        if (o instanceof d0) {
            sb.append(": \"");
            sb.append(y3.a((d0)o));
            sb.append('\"');
            return;
        }
        if (o instanceof j1) {
            sb.append(" {");
            b((s2)o, sb, n + 2);
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
            c(sb, n4, "key", entry.getKey());
            c(sb, n4, "value", entry.getValue());
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
    
    private static final String d(final String s) {
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
}
