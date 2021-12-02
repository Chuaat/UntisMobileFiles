// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class y3
{
    static String a(final d0 d0) {
        final z3 z3 = new z3(d0);
        final StringBuilder sb = new StringBuilder(z3.size());
        for (int i = 0; i < z3.size(); ++i) {
            int a = z3.a(i);
            String str;
            if (a != 34) {
                if (a != 39) {
                    if (a != 92) {
                        switch (a) {
                            default: {
                                if (a < 32 || a > 126) {
                                    sb.append('\\');
                                    sb.append((char)((a >>> 6 & 0x3) + 48));
                                    sb.append((char)((a >>> 3 & 0x7) + 48));
                                    a = (a & 0x7) + 48;
                                }
                                sb.append((char)a);
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
