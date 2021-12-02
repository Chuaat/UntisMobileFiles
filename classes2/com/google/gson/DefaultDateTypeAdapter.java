// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson;

import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import com.google.gson.stream.JsonReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.JavaVersion;
import java.util.Locale;
import java.util.ArrayList;
import java.text.DateFormat;
import java.util.List;
import java.util.Date;

final class DefaultDateTypeAdapter extends TypeAdapter<Date>
{
    private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final List<DateFormat> dateFormats;
    private final Class<? extends Date> dateType;
    
    public DefaultDateTypeAdapter(final int n, final int n2) {
        this(Date.class, n, n2);
    }
    
    DefaultDateTypeAdapter(final Class<? extends Date> clazz) {
        final ArrayList<DateFormat> dateFormats = new ArrayList<DateFormat>();
        this.dateFormats = dateFormats;
        this.dateType = verifyDateType(clazz);
        final Locale us = Locale.US;
        dateFormats.add(DateFormat.getDateTimeInstance(2, 2, us));
        if (!Locale.getDefault().equals(us)) {
            dateFormats.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.isJava9OrLater()) {
            dateFormats.add(PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2));
        }
    }
    
    DefaultDateTypeAdapter(final Class<? extends Date> clazz, final int n) {
        final ArrayList<DateFormat> dateFormats = new ArrayList<DateFormat>();
        this.dateFormats = dateFormats;
        this.dateType = verifyDateType(clazz);
        final Locale us = Locale.US;
        dateFormats.add(DateFormat.getDateInstance(n, us));
        if (!Locale.getDefault().equals(us)) {
            dateFormats.add(DateFormat.getDateInstance(n));
        }
        if (JavaVersion.isJava9OrLater()) {
            dateFormats.add(PreJava9DateFormatProvider.getUSDateFormat(n));
        }
    }
    
    public DefaultDateTypeAdapter(final Class<? extends Date> clazz, final int n, final int n2) {
        final ArrayList<DateFormat> dateFormats = new ArrayList<DateFormat>();
        this.dateFormats = dateFormats;
        this.dateType = verifyDateType(clazz);
        final Locale us = Locale.US;
        dateFormats.add(DateFormat.getDateTimeInstance(n, n2, us));
        if (!Locale.getDefault().equals(us)) {
            dateFormats.add(DateFormat.getDateTimeInstance(n, n2));
        }
        if (JavaVersion.isJava9OrLater()) {
            dateFormats.add(PreJava9DateFormatProvider.getUSDateTimeFormat(n, n2));
        }
    }
    
    DefaultDateTypeAdapter(final Class<? extends Date> clazz, final String s) {
        final ArrayList<SimpleDateFormat> dateFormats = new ArrayList<SimpleDateFormat>();
        this.dateFormats = (List<DateFormat>)dateFormats;
        this.dateType = verifyDateType(clazz);
        final Locale us = Locale.US;
        dateFormats.add(new SimpleDateFormat(s, us));
        if (!Locale.getDefault().equals(us)) {
            dateFormats.add(new SimpleDateFormat(s));
        }
    }
    
    private Date deserializeToDate(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/gson/DefaultDateTypeAdapter.dateFormats:Ljava/util/List;
        //     4: astore_2       
        //     5: aload_2        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/gson/DefaultDateTypeAdapter.dateFormats:Ljava/util/List;
        //    11: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    16: astore_3       
        //    17: aload_3        
        //    18: invokeinterface java/util/Iterator.hasNext:()Z
        //    23: ifeq            50
        //    26: aload_3        
        //    27: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    32: checkcast       Ljava/text/DateFormat;
        //    35: astore          4
        //    37: aload           4
        //    39: aload_1        
        //    40: invokevirtual   java/text/DateFormat.parse:(Ljava/lang/String;)Ljava/util/Date;
        //    43: astore          4
        //    45: aload_2        
        //    46: monitorexit    
        //    47: aload           4
        //    49: areturn        
        //    50: new             Ljava/text/ParsePosition;
        //    53: astore_3       
        //    54: aload_3        
        //    55: iconst_0       
        //    56: invokespecial   java/text/ParsePosition.<init>:(I)V
        //    59: aload_1        
        //    60: aload_3        
        //    61: invokestatic    com/google/gson/internal/bind/util/ISO8601Utils.parse:(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
        //    64: astore_3       
        //    65: aload_2        
        //    66: monitorexit    
        //    67: aload_3        
        //    68: areturn        
        //    69: astore_3       
        //    70: new             Lcom/google/gson/JsonSyntaxException;
        //    73: astore          4
        //    75: aload           4
        //    77: aload_1        
        //    78: aload_3        
        //    79: invokespecial   com/google/gson/JsonSyntaxException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    82: aload           4
        //    84: athrow         
        //    85: astore_1       
        //    86: aload_2        
        //    87: monitorexit    
        //    88: aload_1        
        //    89: athrow         
        //    90: astore          4
        //    92: goto            17
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  7      17     85     90     Any
        //  17     37     85     90     Any
        //  37     45     90     95     Ljava/text/ParseException;
        //  37     45     85     90     Any
        //  45     47     85     90     Any
        //  50     65     69     85     Ljava/text/ParseException;
        //  50     65     85     90     Any
        //  65     67     85     90     Any
        //  70     85     85     90     Any
        //  86     88     85     90     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
    
    private static Class<? extends Date> verifyDateType(final Class<? extends Date> obj) {
        if (obj != Date.class && obj != java.sql.Date.class && obj != Timestamp.class) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Date type must be one of ");
            sb.append(Date.class);
            sb.append(", ");
            sb.append(Timestamp.class);
            sb.append(", or ");
            sb.append(java.sql.Date.class);
            sb.append(" but was ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        return obj;
    }
    
    @Override
    public Date read(final JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        final Date deserializeToDate = this.deserializeToDate(jsonReader.nextString());
        final Class<? extends Date> dateType = this.dateType;
        if (dateType == Date.class) {
            return deserializeToDate;
        }
        if (dateType == Timestamp.class) {
            return new Timestamp(deserializeToDate.getTime());
        }
        if (dateType == java.sql.Date.class) {
            return new java.sql.Date(deserializeToDate.getTime());
        }
        throw new AssertionError();
    }
    
    @Override
    public String toString() {
        final DateFormat dateFormat = this.dateFormats.get(0);
        StringBuilder sb;
        String str;
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            str = ((SimpleDateFormat)dateFormat).toPattern();
        }
        else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            str = ((SimpleDateFormat)dateFormat).getClass().getSimpleName();
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    public void write(final JsonWriter jsonWriter, final Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.dateFormats) {
            jsonWriter.value(this.dateFormats.get(0).format(date));
        }
    }
}
