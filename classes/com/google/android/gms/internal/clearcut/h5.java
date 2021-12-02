// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

public final class h5
{
    public static <T extends f5> String a(final T t) {
        if (t == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer();
        try {
            b(null, t, new StringBuffer(), sb);
            return sb.toString();
        }
        catch (InvocationTargetException ex) {
            final String value = String.valueOf(ex.getMessage());
            if (value.length() != 0) {
                return "Error printing proto: ".concat(value);
            }
            return new String("Error printing proto: ");
        }
        catch (IllegalAccessException ex2) {
            final String value2 = String.valueOf(ex2.getMessage());
            if (value2.length() != 0) {
                return "Error printing proto: ".concat(value2);
            }
            return new String("Error printing proto: ");
        }
    }
    
    private static void b(String o, Object o2, final StringBuffer sb, final StringBuffer sb2) throws IllegalAccessException, InvocationTargetException {
        if (o2 == null) {
            return;
        }
        Label_0462: {
            if (!(o2 instanceof f5)) {
                break Label_0462;
            }
            final int length = sb.length();
            if (o != null) {
                sb2.append(sb);
                sb2.append(c((String)o));
                sb2.append(" <\n");
                sb.append("  ");
            }
            final Class<?> class1 = o2.getClass();
            for (final Field field : class1.getFields()) {
                final int modifiers = field.getModifiers();
                final String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 0x1) == 0x1 && (modifiers & 0x8) != 0x8 && !name.startsWith("_") && !name.endsWith("_")) {
                    final Class<?> type = field.getType();
                    final Object value = field.get(o2);
                    if (type.isArray() && type.getComponentType() != Byte.TYPE) {
                        int length3;
                        if (value == null) {
                            length3 = 0;
                        }
                        else {
                            length3 = Array.getLength(value);
                        }
                        for (int j = 0; j < length3; ++j) {
                            b(name, Array.get(value, j), sb, sb2);
                        }
                    }
                    else {
                        b(name, value, sb, sb2);
                    }
                }
            }
            final Method[] methods = class1.getMethods();
            int n = methods.length;
            int index = 0;
        Label_0432_Outer:
            while (true) {
                Label_0438: {
                    if (index >= n) {
                        break Label_0438;
                    }
                    final String name2 = methods[index].getName();
                    while (true) {
                        if (!name2.startsWith("set")) {
                            break Label_0432;
                        }
                        final String substring = name2.substring(3);
                        try {
                            final String value2 = String.valueOf(substring);
                            String concat;
                            if (value2.length() != 0) {
                                concat = "has".concat(value2);
                            }
                            else {
                                concat = new String("has");
                            }
                            if (class1.getMethod(concat, (Class<?>[])new Class[0]).invoke(o2, new Object[0])) {
                                final String value3 = String.valueOf(substring);
                                String concat2;
                                if (value3.length() != 0) {
                                    concat2 = "get".concat(value3);
                                }
                                else {
                                    concat2 = new String("get");
                                }
                                b(substring, class1.getMethod(concat2, (Class<?>[])new Class[0]).invoke(o2, new Object[0]), sb, sb2);
                            }
                            ++index;
                            continue Label_0432_Outer;
                            o = c((String)o);
                            sb2.append(sb);
                            sb2.append((String)o);
                            sb2.append(": ");
                            // iftrue(Label_0666:, !o2 instanceof String)
                            // iftrue(Label_0785:, index >= o.length)
                            // iftrue(Label_0538:, o2.length() <= 200)
                            // iftrue(Label_0461:, o == null)
                            char char1;
                            Label_0771_Outer:Label_0688_Outer:
                            while (true) {
                                Label_0688:Label_0538_Outer:
                                while (true) {
                                    Block_30: {
                                        while (true) {
                                            Block_24: {
                                                while (true) {
                                                    Label_0801_Outer:Label_0779_Outer:
                                                    while (true) {
                                                    Label_0779:
                                                        while (true) {
                                                            Block_23_Outer:Block_29_Outer:
                                                            while (true) {
                                                                while (true) {
                                                                    Block_31: {
                                                                        Block_21: {
                                                                            while (true) {
                                                                                Block_22: {
                                                                                    break Block_22;
                                                                                    break Label_0771;
                                                                                    sb2.append("\n");
                                                                                    return;
                                                                                    Label_0795: {
                                                                                        sb2.append(o2);
                                                                                    }
                                                                                    continue Label_0688_Outer;
                                                                                    break Block_31;
                                                                                    Label_0610:
                                                                                    ((StringBuilder)o2).append(String.format("\\u%04x", (int)char1));
                                                                                    while (true) {
                                                                                        ++index;
                                                                                        break Label_0801_Outer;
                                                                                        o = o2;
                                                                                        break Block_24;
                                                                                        ((StringBuilder)o2).append(char1);
                                                                                        continue Block_23_Outer;
                                                                                    }
                                                                                    ++index;
                                                                                    continue Label_0688;
                                                                                    break Block_21;
                                                                                }
                                                                                o2 = (o = o2);
                                                                                continue Block_29_Outer;
                                                                            }
                                                                            Label_0666: {
                                                                                break Block_30;
                                                                            }
                                                                        }
                                                                        sb.setLength(length);
                                                                        sb2.append(sb);
                                                                        sb2.append(">\n");
                                                                        return;
                                                                    }
                                                                    n = (o[index] & 0xFF);
                                                                    break Label_0688;
                                                                    sb2.append((char)n);
                                                                    continue Label_0779;
                                                                    Label_0785: {
                                                                        sb2.append('\"');
                                                                    }
                                                                    continue Label_0688_Outer;
                                                                    char1 = ((String)o).charAt(index);
                                                                    continue Label_0779_Outer;
                                                                }
                                                                n = ((String)o).length();
                                                                o2 = new StringBuilder(n);
                                                                index = 0;
                                                                break Label_0801_Outer;
                                                                Label_0461: {
                                                                    return;
                                                                }
                                                                Label_0638:
                                                                o = ((StringBuilder)o2).toString();
                                                                sb2.append("\"");
                                                                sb2.append((String)o);
                                                                sb2.append("\"");
                                                                continue Label_0688_Outer;
                                                            }
                                                            Label_0739: {
                                                                sb2.append(String.format("\\%03o", n));
                                                            }
                                                            continue Label_0779;
                                                        }
                                                        Label_0764: {
                                                            sb2.append('\\');
                                                        }
                                                        continue Label_0801_Outer;
                                                    }
                                                    continue Label_0538_Outer;
                                                }
                                            }
                                            o = String.valueOf(((String)o2).substring(0, 200)).concat("[...]");
                                            continue;
                                        }
                                    }
                                    o = o2;
                                    sb2.append('\"');
                                    index = 0;
                                    continue Label_0688;
                                }
                                continue Label_0771_Outer;
                            }
                        }
                        // iftrue(Label_0538:, o2.startsWith("http"))
                        // iftrue(Label_0795:, !o2 instanceof byte[])
                        // iftrue(Label_0764:, n == 92 || n == 34)
                        // iftrue(Label_0610:, char1 < ' ' || char1 > '~' || char1 == '\"' || char1 == '\'')
                        // iftrue(Label_0638:, index >= n)
                        // iftrue(Label_0739:, n < 32 || n >= 127)
                        catch (NoSuchMethodException ex) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    private static String c(final String s) {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            char lowerCase = '\0';
            Label_0038: {
                if (i != 0) {
                    lowerCase = char1;
                    if (!Character.isUpperCase(char1)) {
                        break Label_0038;
                    }
                    sb.append('_');
                }
                lowerCase = Character.toLowerCase(char1);
            }
            sb.append(lowerCase);
        }
        return sb.toString();
    }
}
