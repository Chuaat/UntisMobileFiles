// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.e;

public class a
{
    private static final boolean a;
    
    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        }
        catch (SecurityException ex) {
            property = null;
        }
        a = "true".equals(property);
    }
    
    private a() {
    }
    
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 1 && n != 3 && n != 6 && n != 8 && n != 10 && n != 12 && n != 14) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 1 && n != 3 && n != 6 && n != 8 && n != 10 && n != 12 && n != 14) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        if (n != 1 && n != 3 && n != 6 && n != 8 && n != 10 && n != 12 && n != 14) {
            args[0] = "data";
        }
        else {
            args[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        }
        if (n != 1) {
            if (n != 3) {
                if (n != 6) {
                    if (n != 8) {
                        if (n != 10) {
                            if (n != 12) {
                                if (n != 14) {
                                    args[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
                                }
                                else {
                                    args[1] = "decode7to8";
                                }
                            }
                            else {
                                args[1] = "combineStringArrayIntoBytes";
                            }
                        }
                        else {
                            args[1] = "dropMarker";
                        }
                    }
                    else {
                        args[1] = "decodeBytes";
                    }
                }
                else {
                    args[1] = "splitBytesToStringArray";
                }
            }
            else {
                args[1] = "encode8to7";
            }
        }
        else {
            args[1] = "encodeBytes";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "encodeBytes";
                }
                case 1:
                case 3:
                case 6:
                case 8:
                case 10:
                case 12:
                case 14: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 1 && n != 3 && n != 6 && n != 8 && n != 10 && n != 12 && n != 14) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 13: {
                    args[2] = "decode7to8";
                    continue;
                }
                case 11: {
                    args[2] = "combineStringArrayIntoBytes";
                    continue;
                }
                case 9: {
                    args[2] = "dropMarker";
                    continue;
                }
                case 7: {
                    args[2] = "decodeBytes";
                    continue;
                }
                case 5: {
                    args[2] = "splitBytesToStringArray";
                    continue;
                }
                case 4: {
                    args[2] = "addModuloByte";
                    continue;
                }
                case 2: {
                    args[2] = "encode8to7";
                    continue;
                }
            }
            break;
        }
    }
    
    private static void b(@e final byte[] array, final int n) {
        if (array == null) {
            a(4);
        }
        for (int i = 0; i < array.length; ++i) {
            array[i] = (byte)(array[i] + n & 0x7F);
        }
    }
    
    @e
    private static byte[] c(@e final String[] array) {
        if (array == null) {
            a(11);
        }
        final int length = array.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            n += array[i].length();
            ++i;
        }
        final byte[] array2 = new byte[n];
        final int length2 = array.length;
        int j = 0;
        int n2 = 0;
        while (j < length2) {
            final String s = array[j];
            for (int length3 = s.length(), k = 0; k < length3; ++k, ++n2) {
                array2[n2] = (byte)s.charAt(k);
            }
            ++j;
        }
        return array2;
    }
    
    @e
    private static byte[] d(@e final byte[] array) {
        if (array == null) {
            a(13);
        }
        final int n = array.length * 7 / 8;
        final byte[] array2 = new byte[n];
        int i = 0;
        int n2 = 0;
        int n3 = 0;
        while (i < n) {
            final byte b = array[n2];
            ++n2;
            final byte b2 = array[n2];
            final int n4 = n3 + 1;
            array2[i] = (byte)(((b & 0xFF) >>> n3) + ((b2 & (1 << n4) - 1) << 7 - n3));
            if (n3 == 6) {
                ++n2;
                n3 = 0;
            }
            else {
                n3 = n4;
            }
            ++i;
        }
        return array2;
    }
    
    @e
    public static byte[] e(@e final String[] array) {
        if (array == null) {
            a(7);
        }
        String[] f = array;
        if (array.length > 0) {
            f = array;
            if (!array[0].isEmpty()) {
                final char char1 = array[0].charAt(0);
                if (char1 == '\0') {
                    final byte[] a = i.a(f(array));
                    if (a == null) {
                        a(8);
                    }
                    return a;
                }
                f = array;
                if (char1 == '\uffff') {
                    f = f(array);
                }
            }
        }
        final byte[] c = c(f);
        b(c, 127);
        return d(c);
    }
    
    @e
    private static String[] f(@e String[] array) {
        if (array == null) {
            a(9);
        }
        array = array.clone();
        array[0] = array[0].substring(1);
        return array;
    }
}
