// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations.local;

import java.io.FileOutputStream;
import org.json.JSONException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;
import androidx.annotation.j0;
import com.google.firebase.e;
import java.io.File;

public class c
{
    private static final String c = "PersistedInstallation";
    private static final String d = "Fid";
    private static final String e = "AuthToken";
    private static final String f = "RefreshToken";
    private static final String g = "TokenCreationEpochInSecs";
    private static final String h = "ExpiresInSecs";
    private static final String i = "Status";
    private static final String j = "FisError";
    private final File a;
    @j0
    private final e b;
    
    public c(@j0 final e b) {
        final File filesDir = b.m().getFilesDir();
        final StringBuilder sb = new StringBuilder();
        sb.append("PersistedInstallation.");
        sb.append(b.s());
        sb.append(".json");
        this.a = new File(filesDir, sb.toString());
        this.b = b;
    }
    
    private JSONObject c() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[16384];
        try {
            final FileInputStream fileInputStream = new FileInputStream(this.a);
            try {
                while (true) {
                    final int read = fileInputStream.read(array, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(array, 0, read);
                }
                final JSONObject jsonObject = new JSONObject(byteArrayOutputStream.toString());
                fileInputStream.close();
                return jsonObject;
            }
            finally {
                try {
                    fileInputStream.close();
                }
                finally {
                    final Throwable t;
                    final Throwable exception;
                    t.addSuppressed(exception);
                }
            }
        }
        catch (IOException | JSONException ex) {
            return new JSONObject();
        }
    }
    
    public void a() {
        this.a.delete();
    }
    
    @j0
    public d b(@j0 final d d) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("Fid", (Object)d.d());
            jsonObject.put("Status", d.g().ordinal());
            jsonObject.put("AuthToken", (Object)d.b());
            jsonObject.put("RefreshToken", (Object)d.f());
            jsonObject.put("TokenCreationEpochInSecs", d.h());
            jsonObject.put("ExpiresInSecs", d.c());
            jsonObject.put("FisError", (Object)d.e());
            final File tempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.m().getFilesDir());
            final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            fileOutputStream.write(jsonObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (tempFile.renameTo(this.a)) {
                return d;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        catch (JSONException | IOException ex) {
            return d;
        }
    }
    
    @j0
    public d d() {
        final JSONObject c = this.c();
        return com.google.firebase.installations.local.d.a().d(c.optString("Fid", (String)null)).g(com.google.firebase.installations.local.c.a.values()[c.optInt("Status", com.google.firebase.installations.local.c.a.G.ordinal())]).b(c.optString("AuthToken", (String)null)).f(c.optString("RefreshToken", (String)null)).h(c.optLong("TokenCreationEpochInSecs", 0L)).c(c.optLong("ExpiresInSecs", 0L)).e(c.optString("FisError", (String)null)).a();
    }
    
    public enum a
    {
        G, 
        H, 
        I, 
        J, 
        K;
    }
}
