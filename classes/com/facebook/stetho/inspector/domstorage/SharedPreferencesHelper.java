// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.domstorage;

import java.util.Iterator;
import c6.h;
import org.json.JSONException;
import java.util.HashSet;
import org.json.JSONArray;
import java.util.Collections;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import android.content.SharedPreferences;

public class SharedPreferencesHelper
{
    private static final String PREFS_SUFFIX = ".xml";
    
    private SharedPreferencesHelper() {
    }
    
    public static Set<Map.Entry<String, ?>> getSharedPreferenceEntriesSorted(final SharedPreferences sharedPreferences) {
        final TreeSet<Map.Entry<String, ?>> set = new TreeSet<Map.Entry<String, ?>>(new Comparator<Map.Entry<String, ?>>() {
            @Override
            public int compare(final Map.Entry<String, ?> entry, final Map.Entry<String, ?> entry2) {
                return entry.getKey().compareTo((String)entry2.getKey());
            }
        });
        set.addAll(sharedPreferences.getAll().entrySet());
        return set;
    }
    
    public static List<String> getSharedPreferenceTags(final Context context) {
        final ArrayList<Comparable> list = (ArrayList<Comparable>)new ArrayList<String>();
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationInfo().dataDir);
        sb.append("/shared_prefs");
        final File file = new File(sb.toString());
        if (file.exists()) {
            final File[] listFiles = file.listFiles();
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                final String name = listFiles[i].getName();
                if (name.endsWith(".xml")) {
                    list.add(name.substring(0, name.length() - 4));
                }
            }
        }
        Collections.sort(list);
        return (List<String>)list;
    }
    
    private static Boolean parseBoolean(final String str) throws IllegalArgumentException {
        if ("1".equals(str) || "true".equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if (!"0".equals(str) && !"false".equalsIgnoreCase(str)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected boolean, got ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        return Boolean.FALSE;
    }
    
    @h
    public static Object valueFromString(final String s, Object o) throws IllegalArgumentException {
        if (o instanceof Integer) {
            return Integer.parseInt(s);
        }
        if (o instanceof Long) {
            return Long.parseLong(s);
        }
        if (o instanceof Float) {
            return Float.parseFloat(s);
        }
        if (o instanceof Boolean) {
            return parseBoolean(s);
        }
        if (o instanceof String) {
            return s;
        }
        if (o instanceof Set) {
            try {
                o = new JSONArray(s);
                final int length = ((JSONArray)o).length();
                final HashSet set = new HashSet<String>(length);
                for (int i = 0; i < length; ++i) {
                    set.add(((JSONArray)o).getString(i));
                }
                return set;
            }
            catch (JSONException cause) {
                throw new IllegalArgumentException((Throwable)cause);
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported type: ");
        sb.append(o.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static String valueToString(final Object o) {
        if (o == null) {
            return null;
        }
        if (o instanceof Set) {
            final JSONArray jsonArray = new JSONArray();
            final Iterator<String> iterator = ((Set)o).iterator();
            while (iterator.hasNext()) {
                jsonArray.put((Object)iterator.next());
            }
            return jsonArray.toString();
        }
        return o.toString();
    }
}
