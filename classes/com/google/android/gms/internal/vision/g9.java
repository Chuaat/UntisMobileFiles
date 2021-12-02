// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class g9
{
    static String a(final f5 f5) {
        final j9 j9 = new j9(f5);
        final StringBuilder sb = new StringBuilder(j9.zza());
        for (int i = 0; i < j9.zza(); ++i) {
            int d = j9.d(i);
            String str;
            if (d != 34) {
                if (d != 39) {
                    if (d != 92) {
                        switch (d) {
                            default: {
                                if (d < 32 || d > 126) {
                                    sb.append('\\');
                                    sb.append((char)((d >>> 6 & 0x3) + 48));
                                    sb.append((char)((d >>> 3 & 0x7) + 48));
                                    d = (d & 0x7) + 48;
                                }
                                sb.append((char)d);
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
