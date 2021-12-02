// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.net;

import androidx.annotation.j0;
import android.net.Uri;

public final class f
{
    private f() {
    }
    
    @j0
    public static String a(@j0 final Uri uri) {
        final String scheme = uri.getScheme();
        String str;
        final String s = str = uri.getSchemeSpecificPart();
        Label_0330: {
            if (scheme != null) {
                if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                    final StringBuilder sb = new StringBuilder(64);
                    sb.append(scheme);
                    sb.append(':');
                    if (s != null) {
                        for (int i = 0; i < s.length(); ++i) {
                            char char1;
                            final char c = char1 = s.charAt(i);
                            if (c != '-' && (char1 = c) != '@') {
                                if (c == '.') {
                                    char1 = c;
                                }
                                else {
                                    char1 = 'x';
                                }
                            }
                            sb.append(char1);
                        }
                    }
                    return sb.toString();
                }
                if (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https") && !scheme.equalsIgnoreCase("ftp")) {
                    str = s;
                    if (!scheme.equalsIgnoreCase("rtsp")) {
                        break Label_0330;
                    }
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("//");
                final String host = uri.getHost();
                final String s2 = "";
                String host2;
                if (host != null) {
                    host2 = uri.getHost();
                }
                else {
                    host2 = "";
                }
                sb2.append(host2);
                String string = s2;
                if (uri.getPort() != -1) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(":");
                    sb3.append(uri.getPort());
                    string = sb3.toString();
                }
                sb2.append(string);
                sb2.append("/...");
                str = sb2.toString();
            }
        }
        final StringBuilder sb4 = new StringBuilder(64);
        if (scheme != null) {
            sb4.append(scheme);
            sb4.append(':');
        }
        if (str != null) {
            sb4.append(str);
        }
        return sb4.toString();
    }
}
