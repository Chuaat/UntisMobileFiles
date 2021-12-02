// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import java.util.TimeZone;
import java.util.Calendar;
import java.lang.reflect.Method;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.lang.reflect.InvocationTargetException;

final class b
{
    private static final a a;
    
    static {
        a a2;
        try {
            a2 = b("org.bson.json.DateTimeFormatter$Java8DateTimeFormatter");
        }
        catch (LinkageError linkageError) {
            a2 = b("org.bson.json.DateTimeFormatter$JaxbDateTimeFormatter");
        }
        a = a2;
    }
    
    private b() {
    }
    
    static String a(final long n) {
        return b.a.a(n);
    }
    
    private static a b(final String className) {
        try {
            return (a)Class.forName(className).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (InvocationTargetException thrown) {
            throw new ExceptionInInitializerError(thrown);
        }
        catch (NoSuchMethodException thrown2) {
            throw new ExceptionInInitializerError(thrown2);
        }
        catch (IllegalAccessException thrown3) {
            throw new ExceptionInInitializerError(thrown3);
        }
        catch (InstantiationException thrown4) {
            throw new ExceptionInInitializerError(thrown4);
        }
        catch (ClassNotFoundException thrown5) {
            throw new ExceptionInInitializerError(thrown5);
        }
    }
    
    static long c(final String s) {
        return b.a.b(s);
    }
    
    private interface a
    {
        String a(final long p0);
        
        long b(final String p0);
    }
    
    static class b implements a
    {
        static {
            try {
                Class.forName("java.time.format.DateTimeFormatter");
            }
            catch (ClassNotFoundException thrown) {
                throw new ExceptionInInitializerError(thrown);
            }
        }
        
        @Override
        public String a(final long epochMilli) {
            return ZonedDateTime.ofInstant(Instant.ofEpochMilli(epochMilli), ZoneId.of("Z")).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }
        
        @Override
        public long b(final String text) {
            try {
                return DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(text, (TemporalQuery<Instant>)new TemporalQuery<Instant>() {
                    public Instant a(final TemporalAccessor temporal) {
                        return Instant.from(temporal);
                    }
                }).toEpochMilli();
            }
            catch (DateTimeParseException ex) {
                throw new IllegalArgumentException(ex.getMessage());
            }
        }
    }
    
    static class c implements a
    {
        private static final Method a;
        private static final Method b;
        
        static {
            try {
                a = Class.forName("javax.xml.bind.DatatypeConverter").getDeclaredMethod("parseDateTime", String.class);
                b = Class.forName("javax.xml.bind.DatatypeConverter").getDeclaredMethod("printDateTime", Calendar.class);
            }
            catch (ClassNotFoundException thrown) {
                throw new ExceptionInInitializerError(thrown);
            }
            catch (NoSuchMethodException thrown2) {
                throw new ExceptionInInitializerError(thrown2);
            }
        }
        
        @Override
        public String a(final long timeInMillis) {
            final Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(timeInMillis);
            instance.setTimeZone(TimeZone.getTimeZone("Z"));
            try {
                return (String)c.b.invoke(null, instance);
            }
            catch (InvocationTargetException ex) {
                throw (RuntimeException)ex.getCause();
            }
            catch (IllegalAccessException ex2) {
                throw new IllegalStateException();
            }
        }
        
        @Override
        public long b(final String s) {
            try {
                return ((Calendar)c.a.invoke(null, s)).getTimeInMillis();
            }
            catch (InvocationTargetException ex) {
                throw (RuntimeException)ex.getCause();
            }
            catch (IllegalAccessException cause) {
                throw new IllegalStateException(cause);
            }
        }
    }
}
