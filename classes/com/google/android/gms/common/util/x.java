// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import java.io.IOException;
import android.os.StrictMode$ThreadPolicy;
import java.io.Reader;
import java.io.FileReader;
import android.os.StrictMode;
import java.io.BufferedReader;
import androidx.annotation.RecentlyNullable;
import android.os.Process;
import c6.h;
import f2.a;

@a
public class x
{
    @h
    private static String a;
    private static int b;
    
    private x() {
    }
    
    @RecentlyNullable
    @a
    public static String a() {
        if (x.a == null) {
            if (x.b == 0) {
                x.b = Process.myPid();
            }
            x.a = c(x.b);
        }
        return x.a;
    }
    
    private static BufferedReader b(final String fileName) throws IOException {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(fileName));
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
    
    @h
    private static String c(final int i) {
        if (i <= 0) {
            return null;
        }
        try {
            final StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            final BufferedReader b = b(sb.toString());
            try {
                com.google.android.gms.common.internal.x.k(b.readLine()).trim();
            }
            catch (IOException ex) {}
        }
        catch (IOException ex2) {}
    }
}
