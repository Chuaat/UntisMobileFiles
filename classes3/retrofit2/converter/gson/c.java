// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.converter.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import okhttp3.h0;
import retrofit2.f;

final class c<T> implements f<h0, T>
{
    private final Gson a;
    private final TypeAdapter<T> b;
    
    c(final Gson a, final TypeAdapter<T> b) {
        this.a = a;
        this.b = b;
    }
    
    public T b(final h0 h0) throws IOException {
        final JsonReader jsonReader = this.a.newJsonReader(h0.charStream());
        try {
            final Object read = this.b.read(jsonReader);
            if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                return (T)read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        }
        finally {
            h0.close();
        }
    }
}
