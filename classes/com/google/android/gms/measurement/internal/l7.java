// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.content.res.Resources;
import android.text.TextUtils;
import android.content.Context;
import com.google.android.gms.common.internal.x;
import java.io.ObjectStreamConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;

public final class l7
{
    public static Object a(Object object) {
        Label_0099: {
            if (object == null) {
                break Label_0099;
            }
            ObjectOutputStream objectOutputStream;
            ObjectStreamConstants objectStreamConstants;
            try {
                final ByteArrayOutputStream out = new ByteArrayOutputStream();
                objectOutputStream = new ObjectOutputStream(out);
                try {
                    objectOutputStream.writeObject(object);
                    objectOutputStream.flush();
                    object = new ByteArrayInputStream(out.toByteArray());
                    objectStreamConstants = new ObjectInputStream((InputStream)object);
                    try {
                        object = ((ObjectInputStream)objectStreamConstants).readObject();
                        final ObjectOutputStream objectOutputStream2 = objectOutputStream;
                        objectOutputStream2.close();
                        final ObjectInputStream objectInputStream = (ObjectInputStream)objectStreamConstants;
                        objectInputStream.close();
                        return object;
                    }
                    finally {
                        final Throwable t2;
                        final Throwable t = t2;
                    }
                }
                finally {
                    final Throwable t3;
                    final Throwable t = t3;
                    objectStreamConstants = null;
                }
            }
            finally {
                final Throwable t4;
                final Throwable t = t4;
                objectStreamConstants = (objectOutputStream = null);
            }
            try {
                final ObjectOutputStream objectOutputStream2 = objectOutputStream;
                objectOutputStream2.close();
                final ObjectInputStream objectInputStream = (ObjectInputStream)objectStreamConstants;
                objectInputStream.close();
                return object;
                // iftrue(Label_0089:, objectOutputStream == null)
                // iftrue(Label_0097:, objectStreamConstants == null)
                final Throwable t;
            Block_15_Outer:
                while (true) {
                    ((ObjectInputStream)objectStreamConstants).close();
                    throw t;
                Label_0089:
                    while (true) {
                        objectOutputStream.close();
                        break Label_0089;
                        continue;
                    }
                    continue Block_15_Outer;
                }
                Label_0097: {
                    throw t;
                }
                return null;
            }
            catch (IOException | ClassNotFoundException ex) {
                return null;
            }
        }
    }
    
    public static String b(final String s, final String[] array, final String[] array2) {
        x.k(array);
        x.k(array2);
        final int min = Math.min(array.length, array2.length);
        int i = 0;
        while (i < min) {
            final String anObject = array[i];
            if (s != null || anObject != null) {
                if (s != null) {
                    if (s.equals(anObject)) {
                        return array2[i];
                    }
                }
                ++i;
                continue;
            }
            return array2[i];
        }
        return null;
    }
    
    public static String c(final Context context, final String s, String a) {
        x.k(context);
        final Resources resources = context.getResources();
        if (TextUtils.isEmpty((CharSequence)a)) {
            a = r4.a(context);
        }
        return r4.b("google_app_id", resources, a);
    }
}
