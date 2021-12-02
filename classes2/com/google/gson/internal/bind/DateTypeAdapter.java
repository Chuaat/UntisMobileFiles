// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal.bind;

import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.JavaVersion;
import java.util.Locale;
import java.util.ArrayList;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import java.text.DateFormat;
import java.util.List;
import com.google.gson.TypeAdapterFactory;
import java.util.Date;
import com.google.gson.TypeAdapter;

public final class DateTypeAdapter extends TypeAdapter<Date>
{
    public static final TypeAdapterFactory FACTORY;
    private final List<DateFormat> dateFormats;
    
    static {
        FACTORY = new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                Object o;
                if (typeToken.getRawType() == Date.class) {
                    o = new DateTypeAdapter();
                }
                else {
                    o = null;
                }
                return (TypeAdapter<T>)o;
            }
        };
    }
    
    public DateTypeAdapter() {
        final ArrayList<DateFormat> dateFormats = new ArrayList<DateFormat>();
        this.dateFormats = dateFormats;
        final Locale us = Locale.US;
        dateFormats.add(DateFormat.getDateTimeInstance(2, 2, us));
        if (!Locale.getDefault().equals(us)) {
            dateFormats.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.isJava9OrLater()) {
            dateFormats.add(PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2));
        }
    }
    
    private Date deserializeToDate(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/google/gson/internal/bind/DateTypeAdapter.dateFormats:Ljava/util/List;
        //     6: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    11: astore_2       
        //    12: aload_2        
        //    13: invokeinterface java/util/Iterator.hasNext:()Z
        //    18: ifeq            41
        //    21: aload_2        
        //    22: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    27: checkcast       Ljava/text/DateFormat;
        //    30: astore_3       
        //    31: aload_3        
        //    32: aload_1        
        //    33: invokevirtual   java/text/DateFormat.parse:(Ljava/lang/String;)Ljava/util/Date;
        //    36: astore_3       
        //    37: aload_0        
        //    38: monitorexit    
        //    39: aload_3        
        //    40: areturn        
        //    41: new             Ljava/text/ParsePosition;
        //    44: astore_2       
        //    45: aload_2        
        //    46: iconst_0       
        //    47: invokespecial   java/text/ParsePosition.<init>:(I)V
        //    50: aload_1        
        //    51: aload_2        
        //    52: invokestatic    com/google/gson/internal/bind/util/ISO8601Utils.parse:(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
        //    55: astore_2       
        //    56: aload_0        
        //    57: monitorexit    
        //    58: aload_2        
        //    59: areturn        
        //    60: astore_3       
        //    61: new             Lcom/google/gson/JsonSyntaxException;
        //    64: astore_2       
        //    65: aload_2        
        //    66: aload_1        
        //    67: aload_3        
        //    68: invokespecial   com/google/gson/JsonSyntaxException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    71: aload_2        
        //    72: athrow         
        //    73: astore_1       
        //    74: aload_0        
        //    75: monitorexit    
        //    76: aload_1        
        //    77: athrow         
        //    78: astore_3       
        //    79: goto            12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  2      12     73     78     Any
        //  12     31     73     78     Any
        //  31     37     78     82     Ljava/text/ParseException;
        //  31     37     73     78     Any
        //  41     56     60     73     Ljava/text/ParseException;
        //  41     56     73     78     Any
        //  61     73     73     78     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public Date read(final JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.deserializeToDate(jsonReader.nextString());
    }
    
    @Override
    public void write(final JsonWriter jsonWriter, final Date date) throws IOException {
        // monitorenter(this)
        Label_0014: {
            if (date != null) {
                break Label_0014;
            }
            try {
                jsonWriter.nullValue();
                return;
                jsonWriter.value(this.dateFormats.get(0).format(date));
            }
            finally {
            }
            // monitorexit(this)
        }
    }
}
