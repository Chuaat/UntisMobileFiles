// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.converter.gson;

import com.google.gson.stream.JsonWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import okio.m;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import java.nio.charset.Charset;
import okhttp3.y;
import okhttp3.f0;
import retrofit2.f;

final class b<T> implements f<T, f0>
{
    private static final y c;
    private static final Charset d;
    private final Gson a;
    private final TypeAdapter<T> b;
    
    static {
        c = y.h("application/json; charset=UTF-8");
        d = Charset.forName("UTF-8");
    }
    
    b(final Gson a, final TypeAdapter<T> b) {
        this.a = a;
        this.b = b;
    }
    
    public f0 b(final T t) throws IOException {
        final m m = new m();
        final JsonWriter jsonWriter = this.a.newJsonWriter((Writer)new OutputStreamWriter(m.G5(), retrofit2.converter.gson.b.d));
        this.b.write(jsonWriter, (Object)t);
        jsonWriter.close();
        return f0.g(retrofit2.converter.gson.b.c, m.D3());
    }
}
