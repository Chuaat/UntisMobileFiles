// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.database.CharArrayBuffer;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public final class j
{
    @a
    public static void a(@RecentlyNonNull final String s, @RecentlyNonNull final CharArrayBuffer charArrayBuffer) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            charArrayBuffer.sizeCopied = 0;
        }
        else {
            final char[] data = charArrayBuffer.data;
            if (data != null && data.length >= s.length()) {
                s.getChars(0, s.length(), charArrayBuffer.data, 0);
            }
            else {
                charArrayBuffer.data = s.toCharArray();
            }
        }
        charArrayBuffer.sizeCopied = s.length();
    }
    
    @RecentlyNonNull
    @a
    public static byte[] b(@RecentlyNonNull final Bitmap bitmap) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap$CompressFormat.JPEG, 100, (OutputStream)byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
