// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;
import java.util.TreeSet;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

final class ua
{
    static String a(final sa sa, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(sa, sb, 0);
        return sb.toString();
    }
    
    static final void b(final StringBuilder sb, final int n, final String str, final Object o) {
        if (o instanceof List) {
            final Iterator<Object> iterator = (Iterator<Object>)((List)o).iterator();
            while (iterator.hasNext()) {
                b(sb, n, str, iterator.next());
            }
            return;
        }
        if (o instanceof Map) {
            final Iterator<Map.Entry<?, ?>> iterator2 = ((Map)o).entrySet().iterator();
            while (iterator2.hasNext()) {
                b(sb, n, str, iterator2.next());
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
            sb.append(tb.a(h8.r((String)o)));
            sb.append('\"');
            return;
        }
        if (o instanceof h8) {
            sb.append(": \"");
            sb.append(tb.a((h8)o));
            sb.append('\"');
            return;
        }
        if (o instanceof j9) {
            sb.append(" {");
            d((sa)o, sb, n + 2);
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
            b(sb, n4, "key", entry.getKey());
            b(sb, n4, "value", entry.getValue());
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
    
    private static final String c(final String s) {
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
    
    private static void d(final sa sa, final StringBuilder sb, final int n) {
        final HashMap<Object, Method> hashMap = new HashMap<Object, Method>();
        final HashMap<String, Method> hashMap2 = new HashMap<String, Method>();
        final TreeSet<String> set = new TreeSet<String>();
        for (final Method method : sa.getClass().getDeclaredMethods()) {
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
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
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
                    b(sb, n, c(concat), j9.l(method2, sa, new Object[0]));
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
                    b(sb, n, c(concat2), j9.l(method3, sa, new Object[0]));
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
                final Object l = j9.l(method4, sa, new Object[0]);
                Label_0980: {
                    if (method5 == null) {
                        if (l instanceof Boolean) {
                            if (!(boolean)l) {
                                continue;
                            }
                        }
                        else if (l instanceof Integer) {
                            if ((int)l == 0) {
                                continue;
                            }
                        }
                        else if (l instanceof Float) {
                            if ((float)l == 0.0f) {
                                continue;
                            }
                        }
                        else if (l instanceof Double) {
                            if ((double)l == 0.0) {
                                continue;
                            }
                        }
                        else {
                            Serializable h;
                            if (l instanceof String) {
                                h = "";
                            }
                            else if (l instanceof h8) {
                                h = h8.H;
                            }
                            else if (l instanceof sa) {
                                if (l != ((sa)l).d()) {
                                    break Label_0980;
                                }
                                continue;
                            }
                            else {
                                if (!(l instanceof Enum)) {
                                    break Label_0980;
                                }
                                if (((Enum)l).ordinal() != 0) {
                                    break Label_0980;
                                }
                                continue;
                            }
                            if (l.equals(h)) {
                                continue;
                            }
                        }
                    }
                    else if (!(boolean)j9.l(method5, sa, new Object[0])) {
                        continue;
                    }
                }
                b(sb, n, c(concat5), l);
            }
        }
        if (!(sa instanceof g9)) {
            final wb zzc = ((j9)sa).zzc;
            if (zzc != null) {
                zzc.g(sb, n);
            }
            return;
        }
        final g9 g9 = (g9)sa;
        throw null;
    }
}
