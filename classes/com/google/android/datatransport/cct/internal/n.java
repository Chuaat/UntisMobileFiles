// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import androidx.annotation.j0;
import java.io.Reader;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class n
{
    private static final String a = "LogResponseInternal";
    
    static n a(final long n) {
        return new h(n);
    }
    
    @j0
    public static n b(@j0 Reader reader) throws IOException {
        reader = (Reader)new JsonReader(reader);
        try {
            ((JsonReader)reader).beginObject();
            while (((JsonReader)reader).hasNext()) {
                if (((JsonReader)reader).nextName().equals("nextRequestWaitMillis")) {
                    if (((JsonReader)reader).peek() == JsonToken.STRING) {
                        return a(Long.parseLong(((JsonReader)reader).nextString()));
                    }
                    return a(((JsonReader)reader).nextLong());
                }
                else {
                    ((JsonReader)reader).skipValue();
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        }
        finally {
            ((JsonReader)reader).close();
        }
    }
    
    public abstract long c();
}
