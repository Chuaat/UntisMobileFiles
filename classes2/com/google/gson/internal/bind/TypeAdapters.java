// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal.bind;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonNull;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.StringTokenizer;
import java.util.GregorianCalendar;
import java.util.Date;
import java.sql.Timestamp;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import java.net.URISyntaxException;
import com.google.gson.JsonIOException;
import com.google.gson.internal.LazilyParsedNumber;
import java.util.ArrayList;
import java.lang.constant.Constable;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import com.google.gson.stream.JsonReader;
import java.util.UUID;
import java.net.URL;
import java.net.URI;
import java.util.Locale;
import com.google.gson.JsonElement;
import java.net.InetAddress;
import java.util.Currency;
import java.util.Calendar;
import java.util.BitSet;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.gson.TypeAdapterFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.gson.TypeAdapter;

public final class TypeAdapters
{
    public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER;
    public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter<BigDecimal> BIG_DECIMAL;
    public static final TypeAdapter<BigInteger> BIG_INTEGER;
    public static final TypeAdapter<BitSet> BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter<Boolean> BOOLEAN;
    public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING;
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter<Number> BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter<Calendar> CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter<Character> CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter<Class> CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter<Currency> CURRENCY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapter<Number> DOUBLE;
    public static final TypeAdapterFactory ENUM_FACTORY;
    public static final TypeAdapter<Number> FLOAT;
    public static final TypeAdapter<InetAddress> INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter<Number> INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter<JsonElement> JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapter<Locale> LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter<Number> LONG;
    public static final TypeAdapter<Number> NUMBER;
    public static final TypeAdapterFactory NUMBER_FACTORY;
    public static final TypeAdapter<Number> SHORT;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapter<String> STRING;
    public static final TypeAdapter<StringBuffer> STRING_BUFFER;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapter<StringBuilder> STRING_BUILDER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY;
    public static final TypeAdapter<URI> URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter<URL> URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter<UUID> UUID;
    public static final TypeAdapterFactory UUID_FACTORY;
    
    static {
        CLASS_FACTORY = newFactory(Class.class, CLASS = new TypeAdapter<Class>() {
            @Override
            public Class read(final JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Class clazz) throws IOException {
                final StringBuilder sb = new StringBuilder();
                sb.append("Attempted to serialize java.lang.Class: ");
                sb.append(clazz.getName());
                sb.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(sb.toString());
            }
        }.nullSafe());
        BIT_SET_FACTORY = newFactory(BitSet.class, BIT_SET = new TypeAdapter<BitSet>() {
            @Override
            public BitSet read(final JsonReader jsonReader) throws IOException {
                final BitSet set = new BitSet();
                jsonReader.beginArray();
                Constable obj = jsonReader.peek();
                int bitIndex = 0;
                while (obj != JsonToken.END_ARRAY) {
                    final int n = TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken[((Enum)obj).ordinal()];
                    boolean nextBoolean = true;
                    Label_0117: {
                        Label_0166: {
                            Label_0077: {
                                if (n != 1) {
                                    if (n == 2) {
                                        nextBoolean = jsonReader.nextBoolean();
                                        break Label_0166;
                                    }
                                    if (n != 3) {
                                        break Label_0117;
                                    }
                                }
                                else {
                                    if (jsonReader.nextInt() != 0) {
                                        break Label_0166;
                                    }
                                    break Label_0077;
                                }
                                obj = jsonReader.nextString();
                                try {
                                    if (Integer.parseInt((String)obj) != 0) {
                                        break Label_0166;
                                    }
                                    nextBoolean = false;
                                    break Label_0166;
                                }
                                catch (NumberFormatException ex) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Error: Expecting: bitset number value (1, 0), Found: ");
                                    sb.append((String)obj);
                                    throw new JsonSyntaxException(sb.toString());
                                }
                            }
                            break Label_0117;
                        }
                        if (nextBoolean) {
                            set.set(bitIndex);
                        }
                        ++bitIndex;
                        obj = jsonReader.peek();
                        continue;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid bitset value type: ");
                    sb2.append(obj);
                    throw new JsonSyntaxException(sb2.toString());
                }
                jsonReader.endArray();
                return set;
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final BitSet set) throws IOException {
                jsonWriter.beginArray();
                for (int length = set.length(), i = 0; i < length; ++i) {
                    jsonWriter.value(set.get(i) ? 1 : 0);
                }
                jsonWriter.endArray();
            }
        }.nullSafe());
        final TypeAdapter<Boolean> typeAdapter = (TypeAdapter<Boolean>)(BOOLEAN = new TypeAdapter<Boolean>() {
            @Override
            public Boolean read(final JsonReader jsonReader) throws IOException {
                final JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (peek == JsonToken.STRING) {
                    return Boolean.parseBoolean(jsonReader.nextString());
                }
                return jsonReader.nextBoolean();
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Boolean b) throws IOException {
                jsonWriter.value(b);
            }
        });
        BOOLEAN_AS_STRING = new TypeAdapter<Boolean>() {
            @Override
            public Boolean read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Boolean.valueOf(jsonReader.nextString());
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Boolean b) throws IOException {
                String string;
                if (b == null) {
                    string = "null";
                }
                else {
                    string = b.toString();
                }
                jsonWriter.value(string);
            }
        };
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, typeAdapter);
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, BYTE = new TypeAdapter<Number>() {
            @Override
            public Number read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return (byte)jsonReader.nextInt();
                }
                catch (NumberFormatException ex) {
                    throw new JsonSyntaxException(ex);
                }
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Number n) throws IOException {
                jsonWriter.value(n);
            }
        });
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, SHORT = new TypeAdapter<Number>() {
            @Override
            public Number read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return (short)jsonReader.nextInt();
                }
                catch (NumberFormatException ex) {
                    throw new JsonSyntaxException(ex);
                }
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Number n) throws IOException {
                jsonWriter.value(n);
            }
        });
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, INTEGER = new TypeAdapter<Number>() {
            @Override
            public Number read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return jsonReader.nextInt();
                }
                catch (NumberFormatException ex) {
                    throw new JsonSyntaxException(ex);
                }
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Number n) throws IOException {
                jsonWriter.value(n);
            }
        });
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, ATOMIC_INTEGER = new TypeAdapter<AtomicInteger>() {
            @Override
            public AtomicInteger read(final JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                }
                catch (NumberFormatException ex) {
                    throw new JsonSyntaxException(ex);
                }
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe());
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, ATOMIC_BOOLEAN = new TypeAdapter<AtomicBoolean>() {
            @Override
            public AtomicBoolean read(final JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe());
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, ATOMIC_INTEGER_ARRAY = new TypeAdapter<AtomicIntegerArray>() {
            @Override
            public AtomicIntegerArray read(final JsonReader jsonReader) throws IOException {
                final ArrayList<Integer> list = new ArrayList<Integer>();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        list.add(jsonReader.nextInt());
                        continue;
                    }
                    catch (NumberFormatException ex) {
                        throw new JsonSyntaxException(ex);
                    }
                    break;
                }
                jsonReader.endArray();
                final int size = list.size();
                final AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; ++i) {
                    atomicIntegerArray.set(i, (int)list.get(i));
                }
                return atomicIntegerArray;
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                for (int length = atomicIntegerArray.length(), i = 0; i < length; ++i) {
                    jsonWriter.value(atomicIntegerArray.get(i));
                }
                jsonWriter.endArray();
            }
        }.nullSafe());
        LONG = new TypeAdapter<Number>() {
            @Override
            public Number read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return jsonReader.nextLong();
                }
                catch (NumberFormatException ex) {
                    throw new JsonSyntaxException(ex);
                }
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Number n) throws IOException {
                jsonWriter.value(n);
            }
        };
        FLOAT = new TypeAdapter<Number>() {
            @Override
            public Number read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return (float)jsonReader.nextDouble();
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Number n) throws IOException {
                jsonWriter.value(n);
            }
        };
        DOUBLE = new TypeAdapter<Number>() {
            @Override
            public Number read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return jsonReader.nextDouble();
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Number n) throws IOException {
                jsonWriter.value(n);
            }
        };
        NUMBER_FACTORY = newFactory(Number.class, NUMBER = new TypeAdapter<Number>() {
            @Override
            public Number read(final JsonReader jsonReader) throws IOException {
                final JsonToken peek = jsonReader.peek();
                final int n = TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
                if (n == 1 || n == 3) {
                    return new LazilyParsedNumber(jsonReader.nextString());
                }
                if (n == 4) {
                    jsonReader.nextNull();
                    return null;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Expecting number, got: ");
                sb.append(peek);
                throw new JsonSyntaxException(sb.toString());
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Number n) throws IOException {
                jsonWriter.value(n);
            }
        });
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, CHARACTER = new TypeAdapter<Character>() {
            @Override
            public Character read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                final String nextString = jsonReader.nextString();
                if (nextString.length() == 1) {
                    return nextString.charAt(0);
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Expecting character, got: ");
                sb.append(nextString);
                throw new JsonSyntaxException(sb.toString());
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Character obj) throws IOException {
                String value;
                if (obj == null) {
                    value = null;
                }
                else {
                    value = String.valueOf(obj);
                }
                jsonWriter.value(value);
            }
        });
        final TypeAdapter<String> typeAdapter2 = (TypeAdapter<String>)(STRING = new TypeAdapter<String>() {
            @Override
            public String read(final JsonReader jsonReader) throws IOException {
                final JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (peek == JsonToken.BOOLEAN) {
                    return Boolean.toString(jsonReader.nextBoolean());
                }
                return jsonReader.nextString();
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final String s) throws IOException {
                jsonWriter.value(s);
            }
        });
        BIG_DECIMAL = new TypeAdapter<BigDecimal>() {
            @Override
            public BigDecimal read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new BigDecimal(jsonReader.nextString());
                }
                catch (NumberFormatException ex) {
                    throw new JsonSyntaxException(ex);
                }
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        BIG_INTEGER = new TypeAdapter<BigInteger>() {
            @Override
            public BigInteger read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new BigInteger(jsonReader.nextString());
                }
                catch (NumberFormatException ex) {
                    throw new JsonSyntaxException(ex);
                }
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        STRING_FACTORY = newFactory(String.class, typeAdapter2);
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, STRING_BUILDER = new TypeAdapter<StringBuilder>() {
            @Override
            public StringBuilder read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuilder(jsonReader.nextString());
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final StringBuilder sb) throws IOException {
                String string;
                if (sb == null) {
                    string = null;
                }
                else {
                    string = sb.toString();
                }
                jsonWriter.value(string);
            }
        });
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, STRING_BUFFER = new TypeAdapter<StringBuffer>() {
            @Override
            public StringBuffer read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuffer(jsonReader.nextString());
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final StringBuffer sb) throws IOException {
                String string;
                if (sb == null) {
                    string = null;
                }
                else {
                    string = sb.toString();
                }
                jsonWriter.value(string);
            }
        });
        URL_FACTORY = newFactory(URL.class, URL = new TypeAdapter<URL>() {
            @Override
            public URL read(final JsonReader jsonReader) throws IOException {
                final JsonToken peek = jsonReader.peek();
                final JsonToken null = JsonToken.NULL;
                final URL url = null;
                if (peek == null) {
                    jsonReader.nextNull();
                    return null;
                }
                final String nextString = jsonReader.nextString();
                URL url2;
                if ("null".equals(nextString)) {
                    url2 = url;
                }
                else {
                    url2 = new URL(nextString);
                }
                return url2;
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final URL url) throws IOException {
                String externalForm;
                if (url == null) {
                    externalForm = null;
                }
                else {
                    externalForm = url.toExternalForm();
                }
                jsonWriter.value(externalForm);
            }
        });
        URI_FACTORY = newFactory(URI.class, URI = new TypeAdapter<URI>() {
            @Override
            public URI read(final JsonReader jsonReader) throws IOException {
                final JsonToken peek = jsonReader.peek();
                final JsonToken null = JsonToken.NULL;
                final URI uri = null;
                if (peek == null) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    final String nextString = jsonReader.nextString();
                    URI uri2;
                    if ("null".equals(nextString)) {
                        uri2 = uri;
                    }
                    else {
                        uri2 = new URI(nextString);
                    }
                    return uri2;
                }
                catch (URISyntaxException ex) {
                    throw new JsonIOException(ex);
                }
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final URI uri) throws IOException {
                String asciiString;
                if (uri == null) {
                    asciiString = null;
                }
                else {
                    asciiString = uri.toASCIIString();
                }
                jsonWriter.value(asciiString);
            }
        });
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, INET_ADDRESS = new TypeAdapter<InetAddress>() {
            @Override
            public InetAddress read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return InetAddress.getByName(jsonReader.nextString());
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final InetAddress inetAddress) throws IOException {
                String hostAddress;
                if (inetAddress == null) {
                    hostAddress = null;
                }
                else {
                    hostAddress = inetAddress.getHostAddress();
                }
                jsonWriter.value(hostAddress);
            }
        });
        UUID_FACTORY = newFactory(UUID.class, UUID = new TypeAdapter<UUID>() {
            @Override
            public UUID read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.util.UUID.fromString(jsonReader.nextString());
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final UUID uuid) throws IOException {
                String string;
                if (uuid == null) {
                    string = null;
                }
                else {
                    string = uuid.toString();
                }
                jsonWriter.value(string);
            }
        });
        CURRENCY_FACTORY = newFactory(Currency.class, CURRENCY = new TypeAdapter<Currency>() {
            @Override
            public Currency read(final JsonReader jsonReader) throws IOException {
                return Currency.getInstance(jsonReader.nextString());
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe());
        TIMESTAMP_FACTORY = new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                return (TypeAdapter<T>)new TypeAdapter<Timestamp>() {
                    final /* synthetic */ TypeAdapter val$dateTypeAdapter = gson.getAdapter(Date.class);
                    
                    @Override
                    public Timestamp read(final JsonReader jsonReader) throws IOException {
                        final Date date = this.val$dateTypeAdapter.read(jsonReader);
                        Timestamp timestamp;
                        if (date != null) {
                            timestamp = new Timestamp(date.getTime());
                        }
                        else {
                            timestamp = null;
                        }
                        return timestamp;
                    }
                    
                    @Override
                    public void write(final JsonWriter jsonWriter, final Timestamp timestamp) throws IOException {
                        this.val$dateTypeAdapter.write(jsonWriter, timestamp);
                    }
                };
            }
        };
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, CALENDAR = new TypeAdapter<Calendar>() {
            private static final String DAY_OF_MONTH = "dayOfMonth";
            private static final String HOUR_OF_DAY = "hourOfDay";
            private static final String MINUTE = "minute";
            private static final String MONTH = "month";
            private static final String SECOND = "second";
            private static final String YEAR = "year";
            
            @Override
            public Calendar read(final JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int year = 0;
                int month = 0;
                int dayOfMonth = 0;
                int hourOfDay = 0;
                int minute = 0;
                int second = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    final String nextName = jsonReader.nextName();
                    final int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        year = nextInt;
                    }
                    else if ("month".equals(nextName)) {
                        month = nextInt;
                    }
                    else if ("dayOfMonth".equals(nextName)) {
                        dayOfMonth = nextInt;
                    }
                    else if ("hourOfDay".equals(nextName)) {
                        hourOfDay = nextInt;
                    }
                    else if ("minute".equals(nextName)) {
                        minute = nextInt;
                    }
                    else {
                        if (!"second".equals(nextName)) {
                            continue;
                        }
                        second = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(calendar.get(1));
                jsonWriter.name("month");
                jsonWriter.value(calendar.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(calendar.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(calendar.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(calendar.get(12));
                jsonWriter.name("second");
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }
        });
        LOCALE_FACTORY = newFactory(Locale.class, LOCALE = new TypeAdapter<Locale>() {
            @Override
            public Locale read(final JsonReader jsonReader) throws IOException {
                final JsonToken peek = jsonReader.peek();
                final JsonToken null = JsonToken.NULL;
                String nextToken = null;
                if (peek == null) {
                    jsonReader.nextNull();
                    return null;
                }
                final StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String nextToken2;
                if (stringTokenizer.hasMoreElements()) {
                    nextToken2 = stringTokenizer.nextToken();
                }
                else {
                    nextToken2 = null;
                }
                String nextToken3;
                if (stringTokenizer.hasMoreElements()) {
                    nextToken3 = stringTokenizer.nextToken();
                }
                else {
                    nextToken3 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    nextToken = stringTokenizer.nextToken();
                }
                if (nextToken3 == null && nextToken == null) {
                    return new Locale(nextToken2);
                }
                if (nextToken == null) {
                    return new Locale(nextToken2, nextToken3);
                }
                return new Locale(nextToken2, nextToken3, nextToken);
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final Locale locale) throws IOException {
                String string;
                if (locale == null) {
                    string = null;
                }
                else {
                    string = locale.toString();
                }
                jsonWriter.value(string);
            }
        });
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, JSON_ELEMENT = new TypeAdapter<JsonElement>() {
            @Override
            public JsonElement read(final JsonReader jsonReader) throws IOException {
                switch (TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()]) {
                    default: {
                        throw new IllegalArgumentException();
                    }
                    case 6: {
                        final JsonObject jsonObject = new JsonObject();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            jsonObject.add(jsonReader.nextName(), this.read(jsonReader));
                        }
                        jsonReader.endObject();
                        return jsonObject;
                    }
                    case 5: {
                        final JsonArray jsonArray = new JsonArray();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonArray.add(this.read(jsonReader));
                        }
                        jsonReader.endArray();
                        return jsonArray;
                    }
                    case 4: {
                        jsonReader.nextNull();
                        return JsonNull.INSTANCE;
                    }
                    case 3: {
                        return new JsonPrimitive(jsonReader.nextString());
                    }
                    case 2: {
                        return new JsonPrimitive(jsonReader.nextBoolean());
                    }
                    case 1: {
                        return new JsonPrimitive(new LazilyParsedNumber(jsonReader.nextString()));
                    }
                }
            }
            
            @Override
            public void write(final JsonWriter jsonWriter, final JsonElement jsonElement) throws IOException {
                if (jsonElement != null && !jsonElement.isJsonNull()) {
                    if (jsonElement.isJsonPrimitive()) {
                        final JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                        if (asJsonPrimitive.isNumber()) {
                            jsonWriter.value(asJsonPrimitive.getAsNumber());
                        }
                        else if (asJsonPrimitive.isBoolean()) {
                            jsonWriter.value(asJsonPrimitive.getAsBoolean());
                        }
                        else {
                            jsonWriter.value(asJsonPrimitive.getAsString());
                        }
                    }
                    else if (jsonElement.isJsonArray()) {
                        jsonWriter.beginArray();
                        final Iterator<JsonElement> iterator = jsonElement.getAsJsonArray().iterator();
                        while (iterator.hasNext()) {
                            this.write(jsonWriter, iterator.next());
                        }
                        jsonWriter.endArray();
                    }
                    else {
                        if (!jsonElement.isJsonObject()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Couldn't write ");
                            sb.append(jsonElement.getClass());
                            throw new IllegalArgumentException(sb.toString());
                        }
                        jsonWriter.beginObject();
                        for (final Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                            jsonWriter.name(entry.getKey());
                            this.write(jsonWriter, entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                }
                else {
                    jsonWriter.nullValue();
                }
            }
        });
        ENUM_FACTORY = new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                final Class<? super T> rawType = typeToken.getRawType();
                if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
                    Class<? super T> superclass = rawType;
                    if (!rawType.isEnum()) {
                        superclass = rawType.getSuperclass();
                    }
                    return new EnumTypeAdapter<T>((Class<T>)superclass);
                }
                return null;
            }
        };
    }
    
    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }
    
    public static <TT> TypeAdapterFactory newFactory(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                TypeAdapter<T> val$typeAdapter;
                if (typeToken.equals(typeToken)) {
                    val$typeAdapter = (TypeAdapter<T>)typeAdapter;
                }
                else {
                    val$typeAdapter = null;
                }
                return val$typeAdapter;
            }
        };
    }
    
    public static <TT> TypeAdapterFactory newFactory(final Class<TT> clazz, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                TypeAdapter<T> val$typeAdapter;
                if (typeToken.getRawType() == clazz) {
                    val$typeAdapter = (TypeAdapter<T>)typeAdapter;
                }
                else {
                    val$typeAdapter = null;
                }
                return val$typeAdapter;
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("Factory[type=");
                sb.append(clazz.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }
    
    public static <TT> TypeAdapterFactory newFactory(final Class<TT> clazz, final Class<TT> clazz2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                final Class<? super T> rawType = typeToken.getRawType();
                TypeAdapter<T> val$typeAdapter;
                if (rawType != clazz && rawType != clazz2) {
                    val$typeAdapter = null;
                }
                else {
                    val$typeAdapter = (TypeAdapter<T>)typeAdapter;
                }
                return val$typeAdapter;
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("Factory[type=");
                sb.append(clazz2.getName());
                sb.append("+");
                sb.append(clazz.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }
    
    public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(final Class<TT> clazz, final Class<? extends TT> clazz2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                final Class<? super T> rawType = typeToken.getRawType();
                TypeAdapter<T> val$typeAdapter;
                if (rawType != clazz && rawType != clazz2) {
                    val$typeAdapter = null;
                }
                else {
                    val$typeAdapter = (TypeAdapter<T>)typeAdapter;
                }
                return val$typeAdapter;
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("Factory[type=");
                sb.append(clazz.getName());
                sb.append("+");
                sb.append(clazz2.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }
    
    public static <T1> TypeAdapterFactory newTypeHierarchyFactory(final Class<T1> clazz, final TypeAdapter<T1> typeAdapter) {
        return new TypeAdapterFactory() {
            @Override
            public <T2> TypeAdapter<T2> create(final Gson gson, final TypeToken<T2> typeToken) {
                final Class<? super T2> rawType = typeToken.getRawType();
                if (!clazz.isAssignableFrom(rawType)) {
                    return null;
                }
                return (TypeAdapter<T2>)new TypeAdapter<T1>() {
                    @Override
                    public T1 read(final JsonReader jsonReader) throws IOException {
                        final T1 read = typeAdapter.read(jsonReader);
                        if (read != null && !rawType.isInstance(read)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Expected a ");
                            sb.append(rawType.getName());
                            sb.append(" but was ");
                            sb.append(read.getClass().getName());
                            throw new JsonSyntaxException(sb.toString());
                        }
                        return read;
                    }
                    
                    @Override
                    public void write(final JsonWriter jsonWriter, final T1 t1) throws IOException {
                        typeAdapter.write(jsonWriter, t1);
                    }
                };
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("Factory[typeHierarchy=");
                sb.append(clazz.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }
    
    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T>
    {
        private final Map<T, String> constantToName;
        private final Map<String, T> nameToConstant;
        
        public EnumTypeAdapter(final Class<T> clazz) {
            this.nameToConstant = new HashMap<String, T>();
            this.constantToName = new HashMap<T, String>();
            try {
                for (final Enum<T> enum1 : clazz.getEnumConstants()) {
                    String name = enum1.name();
                    final SerializedName serializedName = clazz.getField(name).getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        final String value = serializedName.value();
                        final String[] alternate = serializedName.alternate();
                        final int length2 = alternate.length;
                        int n = 0;
                        while (true) {
                            name = value;
                            if (n >= length2) {
                                break;
                            }
                            this.nameToConstant.put(alternate[n], (T)enum1);
                            ++n;
                        }
                    }
                    this.nameToConstant.put(name, (T)enum1);
                    this.constantToName.put((T)enum1, name);
                }
            }
            catch (NoSuchFieldException detailMessage) {
                throw new AssertionError((Object)detailMessage);
            }
        }
        
        @Override
        public T read(final JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return this.nameToConstant.get(jsonReader.nextString());
        }
        
        @Override
        public void write(final JsonWriter jsonWriter, final T t) throws IOException {
            String s;
            if (t == null) {
                s = null;
            }
            else {
                s = this.constantToName.get(t);
            }
            jsonWriter.value(s);
        }
    }
}
