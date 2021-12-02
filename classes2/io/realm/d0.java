// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Locale;
import c6.h;
import org.json.JSONException;
import org.json.JSONArray;
import io.realm.internal.OsList;
import java.math.BigDecimal;
import org.json.JSONObject;
import android.annotation.TargetApi;
import java.io.IOException;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import java.util.Date;
import io.realm.internal.android.c;
import android.util.JsonToken;
import android.util.JsonReader;

class d0
{
    @TargetApi(11)
    static <E> l0<E> a(final Class<E> clazz, final JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == null) {
            jsonReader.skipValue();
            return null;
        }
        jsonReader.beginArray();
        final l0<ObjectId> l0 = (l0<ObjectId>)new l0<E>();
        if (clazz == Boolean.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)jsonReader.nextBoolean());
                }
            }
        }
        else if (clazz == Float.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)(float)jsonReader.nextDouble());
                }
            }
        }
        else if (clazz == Double.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)jsonReader.nextDouble());
                }
            }
        }
        else if (clazz == String.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)jsonReader.nextString());
                }
            }
        }
        else if (clazz == byte[].class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)(Object)c.a(jsonReader.nextString()));
                }
            }
        }
        else if (clazz == Date.class) {
            while (jsonReader.hasNext()) {
                final JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    Object b;
                    if (peek == JsonToken.NUMBER) {
                        b = new Date(jsonReader.nextLong());
                    }
                    else {
                        b = c.b(jsonReader.nextString());
                    }
                    l0.add((E)b);
                }
            }
        }
        else if (clazz == Long.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)jsonReader.nextLong());
                }
            }
        }
        else if (clazz == Integer.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)(int)jsonReader.nextLong());
                }
            }
        }
        else if (clazz == Short.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)(short)jsonReader.nextLong());
                }
            }
        }
        else if (clazz == Byte.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)(byte)jsonReader.nextLong());
                }
            }
        }
        else if (clazz == ObjectId.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)new ObjectId(jsonReader.nextString()));
                }
            }
        }
        else if (clazz == Decimal128.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    l0.add((E)null);
                }
                else {
                    l0.add((E)Decimal128.y(jsonReader.nextString()));
                }
            }
        }
        else {
            c(clazz);
        }
        jsonReader.endArray();
        return (l0<E>)l0;
    }
    
    static <E> void b(final l0<E> l0, final JSONObject jsonObject, final String s) throws JSONException {
        if (!jsonObject.has(s)) {
            return;
        }
        final OsList z = l0.z();
        if (jsonObject.isNull(s)) {
            z.M();
            return;
        }
        final JSONArray jsonArray = jsonObject.getJSONArray(s);
        z.M();
        final int length = jsonArray.length();
        final Class<E> g = (Class<E>)l0.G;
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        final int n4 = 0;
        final int n5 = 0;
        final int n6 = 0;
        final int n7 = 0;
        final int n8 = 0;
        int i = 0;
        if (g == Boolean.class) {
            while (i < length) {
                if (jsonArray.isNull(i)) {
                    z.j();
                }
                else {
                    z.b(jsonArray.getBoolean(i));
                }
                ++i;
            }
        }
        else if (g == Float.class) {
            for (int j = n; j < length; ++j) {
                if (jsonArray.isNull(j)) {
                    z.j();
                }
                else {
                    z.f((float)jsonArray.getDouble(j));
                }
            }
        }
        else if (g == Double.class) {
            for (int k = n2; k < length; ++k) {
                if (jsonArray.isNull(k)) {
                    z.j();
                }
                else {
                    z.e(jsonArray.getDouble(k));
                }
            }
        }
        else if (g == String.class) {
            for (int n9 = n3; n9 < length; ++n9) {
                if (jsonArray.isNull(n9)) {
                    z.j();
                }
                else {
                    z.m(jsonArray.getString(n9));
                }
            }
        }
        else if (g == byte[].class) {
            for (int n10 = n4; n10 < length; ++n10) {
                if (jsonArray.isNull(n10)) {
                    z.j();
                }
                else {
                    z.a(c.a(jsonArray.getString(n10)));
                }
            }
        }
        else if (g == Date.class) {
            for (int n11 = n5; n11 < length; ++n11) {
                if (jsonArray.isNull(n11)) {
                    z.j();
                }
                else {
                    final Object value = jsonArray.get(n11);
                    Date b;
                    if (value instanceof String) {
                        b = c.b((String)value);
                    }
                    else {
                        b = new Date(jsonArray.getLong(n11));
                    }
                    z.c(b);
                }
            }
        }
        else if (g == ObjectId.class) {
            for (int n12 = n6; n12 < length; ++n12) {
                if (jsonArray.isNull(n12)) {
                    z.j();
                }
                else {
                    final Object value2 = jsonArray.get(n12);
                    if (value2 instanceof String) {
                        z.k(new ObjectId((String)value2));
                    }
                    else {
                        z.k((ObjectId)value2);
                    }
                }
            }
        }
        else if (g == Decimal128.class) {
            for (int n13 = n7; n13 < length; ++n13) {
                if (jsonArray.isNull(n13)) {
                    z.j();
                }
                else {
                    final Object value3 = jsonArray.get(n13);
                    Decimal128 y = null;
                    Label_0534: {
                        Label_0529: {
                            if (!(value3 instanceof Decimal128)) {
                                if (value3 instanceof String) {
                                    y = Decimal128.y((String)value3);
                                    break Label_0534;
                                }
                                Decimal128 decimal128;
                                if (value3 instanceof Integer) {
                                    decimal128 = new Decimal128((long)(int)value3);
                                }
                                else if (value3 instanceof Long) {
                                    decimal128 = new Decimal128((long)value3);
                                }
                                else {
                                    if (!(value3 instanceof Double)) {
                                        break Label_0529;
                                    }
                                    decimal128 = new Decimal128(new BigDecimal((double)value3));
                                }
                                z.d(decimal128);
                                continue;
                            }
                        }
                        y = (Decimal128)value3;
                    }
                    z.d(y);
                }
            }
        }
        else {
            int n14 = n8;
            if (g != Long.class) {
                n14 = n8;
                if (g != Integer.class) {
                    n14 = n8;
                    if (g != Short.class) {
                        if (g != Byte.class) {
                            c(g);
                            return;
                        }
                        n14 = n8;
                    }
                }
            }
            while (n14 < length) {
                if (jsonArray.isNull(n14)) {
                    z.j();
                }
                else {
                    z.i(jsonArray.getLong(n14));
                }
                ++n14;
            }
        }
    }
    
    private static void c(@h final Class clazz) {
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Element type '%s' is not handled.", clazz));
    }
}
