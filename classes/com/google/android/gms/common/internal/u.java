// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import java.io.InputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.Closeable;
import com.google.android.gms.common.util.q;
import java.util.Properties;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.d0;
import java.util.concurrent.ConcurrentHashMap;
import f2.a;

@a
public class u
{
    private static final n b;
    private static u c;
    private ConcurrentHashMap<String, String> a;
    
    static {
        b = new n("LibraryVersion", "");
        u.c = new u();
    }
    
    @d0
    protected u() {
        this.a = new ConcurrentHashMap<String, String>();
    }
    
    @RecentlyNonNull
    @a
    public static u a() {
        return u.c;
    }
    
    @RecentlyNonNull
    @a
    public String b(@RecentlyNonNull final String key) {
        x.h(key, "Please provide a valid libraryName");
        if (this.a.containsKey(key)) {
            return this.a.get(key);
        }
        final Properties properties = new Properties();
        final Closeable closeable = null;
        Object property = null;
        Object str = null;
        Serializable s = null;
        Label_0414: {
            InputStream resourceAsStream;
            try {
                try {
                    resourceAsStream = u.class.getResourceAsStream(String.format("/%s.properties", key));
                    Label_0209: {
                        if (resourceAsStream == null) {
                            break Label_0209;
                        }
                        property = closeable;
                        try {
                            properties.load(resourceAsStream);
                            property = closeable;
                            str = (property = properties.getProperty("version", null));
                            final n b = u.b;
                            property = str;
                            final int length = String.valueOf(key).length();
                            property = str;
                            final int length2 = String.valueOf(str).length();
                            property = str;
                            property = str;
                            s = new StringBuilder(length + 12 + length2);
                            property = str;
                            ((StringBuilder)s).append(key);
                            property = str;
                            ((StringBuilder)s).append(" version is ");
                            property = str;
                            ((StringBuilder)s).append((String)str);
                            property = str;
                            b.l("LibraryVersion", ((StringBuilder)s).toString());
                            // iftrue(Label_0251:, str.length() == 0)
                            while (true) {
                                while (true) {
                                    property = str;
                                    if (resourceAsStream == null) {
                                        break Label_0414;
                                    }
                                    q.b(resourceAsStream);
                                    property = closeable;
                                    str = "Failed to get app version for libraryName: ".concat((String)str);
                                    property = closeable;
                                    final n b2;
                                    b2.n("LibraryVersion", (String)str);
                                    str = s;
                                    continue;
                                }
                                property = closeable;
                                final n b2 = u.b;
                                property = closeable;
                                str = String.valueOf(key);
                                property = closeable;
                                continue;
                            }
                            Label_0251: {
                                property = closeable;
                            }
                            str = new String("Failed to get app version for libraryName: ");
                        }
                        catch (IOException s) {
                            str = resourceAsStream;
                        }
                        finally {
                            property = resourceAsStream;
                        }
                    }
                }
                finally {}
            }
            catch (IOException s) {
                resourceAsStream = null;
            }
            final n b3 = u.b;
            final String value = String.valueOf(key);
            String concat;
            if (value.length() != 0) {
                concat = "Failed to get app version for libraryName: ".concat(value);
            }
            else {
                concat = new String("Failed to get app version for libraryName: ");
            }
            b3.f("LibraryVersion", concat, (Throwable)s);
            if (str != null) {
                q.b((Closeable)str);
            }
            property = resourceAsStream;
        }
        String value2;
        if ((value2 = (String)property) == null) {
            u.b.c("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            value2 = "UNKNOWN";
        }
        this.a.put(key, value2);
        return value2;
        if (property != null) {
            q.b((Closeable)property);
        }
    }
}
