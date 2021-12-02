// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.ads.identifier;

import java.util.Iterator;
import android.net.Uri$Builder;
import java.io.IOException;
import android.util.Log;
import java.net.HttpURLConnection;
import java.net.URL;
import android.net.Uri;
import java.util.Map;

final class b extends Thread
{
    private final /* synthetic */ Map G;
    
    b(final a a, final Map g) {
        this.G = g;
    }
    
    @Override
    public final void run() {
        new d();
        final Map g = this.G;
        final Uri$Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Object iterator = g.keySet().iterator();
        while (((Iterator)iterator).hasNext()) {
            final String s = ((Iterator<String>)iterator).next();
            buildUpon.appendQueryParameter(s, (String)g.get(s));
        }
        final String string = buildUpon.build().toString();
        try {
            iterator = new URL(string);
            iterator = ((URL)iterator).openConnection();
            try {
                final int responseCode = ((HttpURLConnection)iterator).getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(string);
                    Log.w("HttpUrlPinger", sb.toString());
                }
            }
            finally {
                ((HttpURLConnection)iterator).disconnect();
            }
        }
        catch (RuntimeException iterator) {
            goto Label_0211;
        }
        catch (IOException ex) {}
        catch (IndexOutOfBoundsException iterator) {
            final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 32 + String.valueOf(((Throwable)iterator).getMessage()).length());
            goto Label_0247;
        }
    }
}
