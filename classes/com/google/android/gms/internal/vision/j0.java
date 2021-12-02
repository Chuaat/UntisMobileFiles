// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.os.Build;
import android.content.Context;
import java.io.IOException;
import java.util.Map;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;

public final class j0
{
    private static g0 a(final File file) {
        try {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                final HashMap<Object, HashMap<String, String>> hashMap = new HashMap<Object, HashMap<String, String>>();
                while (true) {
                    final String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    final String[] split = line.split(" ", 3);
                    if (split.length != 3) {
                        String concat;
                        if (line.length() != 0) {
                            concat = "Invalid: ".concat(line);
                        }
                        else {
                            concat = new String("Invalid: ");
                        }
                        Log.e("HermeticFileOverrides", concat);
                    }
                    else {
                        final String s = split[0];
                        final String decode = Uri.decode(split[1]);
                        final String decode2 = Uri.decode(split[2]);
                        if (!hashMap.containsKey(s)) {
                            hashMap.put(s, new HashMap<String, String>());
                        }
                        hashMap.get(s).put(decode, decode2);
                    }
                }
                final String value = String.valueOf(file);
                final StringBuilder sb = new StringBuilder(value.length() + 7);
                sb.append("Parsed ");
                sb.append(value);
                Log.i("HermeticFileOverrides", sb.toString());
                final g0 g0 = new g0((Map<String, Map<String, String>>)hashMap);
                bufferedReader.close();
                return g0;
            }
            finally {
                try {
                    bufferedReader.close();
                }
                finally {
                    final Throwable t;
                    m3.c((Throwable)file, t);
                }
            }
        }
        catch (IOException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    public static d1<g0> b(final Context context) {
        final String type = Build.TYPE;
        final String tags = Build.TAGS;
        final boolean equals = type.equals("eng");
        boolean b = false;
        if (equals || type.equals("userdebug")) {
            if (tags.contains("dev-keys") || tags.contains("test-keys")) {
                b = true;
            }
        }
        if (!b) {
            return d1.d();
        }
        Context deviceProtectedStorageContext = context;
        if (t.a()) {
            if (context.isDeviceProtectedStorage()) {
                deviceProtectedStorageContext = context;
            }
            else {
                deviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            }
        }
        final d1<File> c = c(deviceProtectedStorageContext);
        if (c.b()) {
            return d1.a(a(c.c()));
        }
        return d1.d();
    }
    
    private static d1<File> c(final Context context) {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                final File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                d1<File> d1;
                if (file.exists()) {
                    d1 = com.google.android.gms.internal.vision.d1.a(file);
                }
                else {
                    d1 = com.google.android.gms.internal.vision.d1.d();
                }
                return d1;
            }
            catch (RuntimeException ex) {
                Log.e("HermeticFileOverrides", "no data dir", (Throwable)ex);
                return d1.d();
            }
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
