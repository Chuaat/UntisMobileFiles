// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal.bind;

import java.util.Date;
import com.google.gson.stream.JsonWriter;
import java.text.ParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import com.google.gson.stream.JsonReader;
import java.text.SimpleDateFormat;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import java.text.DateFormat;
import com.google.gson.TypeAdapterFactory;
import java.sql.Time;
import com.google.gson.TypeAdapter;

public final class TimeTypeAdapter extends TypeAdapter<Time>
{
    public static final TypeAdapterFactory FACTORY;
    private final DateFormat format;
    
    static {
        FACTORY = new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                Object o;
                if (typeToken.getRawType() == Time.class) {
                    o = new TimeTypeAdapter();
                }
                else {
                    o = null;
                }
                return (TypeAdapter<T>)o;
            }
        };
    }
    
    public TimeTypeAdapter() {
        this.format = new SimpleDateFormat("hh:mm:ss a");
    }
    
    @Override
    public Time read(final JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new Time(this.format.parse(jsonReader.nextString()).getTime());
            }
            catch (ParseException ex) {
                throw new JsonSyntaxException(ex);
            }
        }
    }
    
    @Override
    public void write(final JsonWriter jsonWriter, final Time date) throws IOException {
        // monitorenter(this)
        Label_0020: {
            if (date == null) {
                final String format = null;
                break Label_0020;
            }
            try {
                final String format = this.format.format(date);
                jsonWriter.value(format);
            }
            finally {
            }
            // monitorexit(this)
        }
    }
}
