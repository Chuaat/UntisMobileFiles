// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import java.io.FileOutputStream;
import c6.h;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.json.JSONException;
import org.json.JSONObject;
import androidx.annotation.b1;
import java.util.HashMap;
import android.content.Context;
import androidx.annotation.w;
import java.util.Map;
import androidx.annotation.d;

@d
public class p
{
    @w("ConfigStorageClient.class")
    private static final Map<String, p> c;
    private static final String d = "UTF-8";
    private final Context a;
    private final String b;
    
    static {
        c = new HashMap<String, p>();
    }
    
    private p(final Context a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @b1
    public static void b() {
        synchronized (p.class) {
            p.c.clear();
        }
    }
    
    public static p d(final Context context, final String s) {
        synchronized (p.class) {
            final Map<String, p> c = p.c;
            if (!c.containsKey(s)) {
                c.put(s, new p(context, s));
            }
            return c.get(s);
        }
    }
    
    public Void a() {
        synchronized (this) {
            this.a.deleteFile(this.b);
            return null;
        }
    }
    
    String c() {
        return this.b;
    }
    
    @h
    public g e() throws IOException {
        // monitorenter(this)
        FileInputStream openFileInput = null;
        g b = null;
        try {
            openFileInput = this.a.openFileInput(this.b);
            try {
                final int available = openFileInput.available();
                final byte[] array = new byte[available];
                openFileInput.read(array, 0, available);
                b = g.b(new JSONObject(new String(array, "UTF-8")));
                final FileInputStream fileInputStream = openFileInput;
                fileInputStream.close();
                return b;
            }
            catch (JSONException ex) {}
            catch (FileNotFoundException ex2) {}
            finally {
                final Throwable t2;
                final Throwable t = t2;
            }
        }
        catch (JSONException ex3) {}
        catch (FileNotFoundException ex4) {}
        try {
            final FileInputStream fileInputStream = openFileInput;
            fileInputStream.close();
            return b;
            // iftrue(Label_0086:, openFileInput == null)
            // iftrue(Label_0108:, openFileInput == null)
            final Throwable t;
            Block_14: {
                break Block_14;
                while (true) {
                    openFileInput.close();
                    goto Label_0108;
                    continue;
                }
                Label_0086: {
                    throw t;
                }
            }
            openFileInput.close();
            throw t;
        }
        finally {}
    }
    
    public Void f(final g g) throws IOException {
        synchronized (this) {
            final FileOutputStream openFileOutput = this.a.openFileOutput(this.b, 0);
            try {
                openFileOutput.write(g.toString().getBytes("UTF-8"));
                return null;
            }
            finally {
                openFileOutput.close();
            }
        }
    }
}
