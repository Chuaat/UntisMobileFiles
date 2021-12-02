// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class tb
{
    static String a(final h8 h8) {
        final StringBuilder sb = new StringBuilder(h8.h());
        for (int i = 0; i < h8.h(); ++i) {
            int b = h8.b(i);
            String str;
            if (b != 34) {
                if (b != 39) {
                    if (b != 92) {
                        switch (b) {
                            default: {
                                if (b < 32 || b > 126) {
                                    sb.append('\\');
                                    sb.append((char)((b >>> 6 & 0x3) + 48));
                                    sb.append((char)((b >>> 3 & 0x7) + 48));
                                    b = (b & 0x7) + 48;
                                }
                                sb.append((char)b);
                                continue;
                            }
                            case 13: {
                                str = "\\r";
                                break;
                            }
                            case 12: {
                                str = "\\f";
                                break;
                            }
                            case 11: {
                                str = "\\v";
                                break;
                            }
                            case 10: {
                                str = "\\n";
                                break;
                            }
                            case 9: {
                                str = "\\t";
                                break;
                            }
                            case 8: {
                                str = "\\b";
                                break;
                            }
                            case 7: {
                                str = "\\a";
                                break;
                            }
                        }
                    }
                    else {
                        str = "\\\\";
                    }
                }
                else {
                    str = "\\'";
                }
            }
            else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
