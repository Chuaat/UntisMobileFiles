// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.dumpapp.plugins;

import c6.h;
import com.facebook.stetho.dumpapp.DumperContext;
import android.annotation.TargetApi;
import java.util.Set;
import java.util.HashSet;
import android.text.TextUtils;
import java.io.File;
import java.util.Map;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import c6.g;
import android.content.SharedPreferences;
import android.annotation.SuppressLint;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import com.facebook.stetho.dumpapp.DumpUsageException;
import java.util.List;
import java.io.PrintStream;
import android.content.Context;
import com.facebook.stetho.dumpapp.DumperPlugin;

public class SharedPreferencesDumperPlugin implements DumperPlugin
{
    private static final String NAME = "prefs";
    private static final String XML_SUFFIX = ".xml";
    private final Context mAppContext;
    
    public SharedPreferencesDumperPlugin(final Context context) {
        this.mAppContext = context.getApplicationContext();
    }
    
    private void doPrint(final PrintStream printStream, final List<String> list) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.mAppContext.getApplicationInfo().dataDir);
        sb.append("/shared_prefs");
        final String string = sb.toString();
        String s;
        if (list.isEmpty()) {
            s = "";
        }
        else {
            s = list.get(0);
        }
        String s2;
        if (list.size() > 1) {
            s2 = list.get(1);
        }
        else {
            s2 = "";
        }
        this.printRecursive(printStream, string, "", s, s2);
    }
    
    private void doUsage(final PrintStream printStream) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Usage: dumpapp prefs ");
        sb.append("<command> [command-options]");
        printStream.println(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Usage: dumpapp prefs ");
        sb2.append("print [pathPrefix [keyPrefix]]");
        printStream.println(sb2.toString());
        final StringBuilder sb3 = new StringBuilder("       dumpapp prefs ");
        sb3.append("write <path> <key> <");
        final StringBuilder appendNamesList = Type.appendNamesList(sb3, "|");
        appendNamesList.append("> <value>");
        printStream.println(appendNamesList);
        printStream.println();
        printStream.println("dumpapp prefs print: Print all matching values from the shared preferences");
        printStream.println();
        printStream.println("dumpapp prefs write: Writes a value to the shared preferences");
    }
    
    @SuppressLint({ "CommitPrefEdits" })
    private void doWrite(final List<String> list) throws DumpUsageException {
        final Iterator<String> iterator = list.iterator();
        final String nextArg = nextArg(iterator, "Expected <path>");
        final String nextArg2 = nextArg(iterator, "Expected <key>");
        final Type of = Type.of(nextArg(iterator, "Expected <type>"));
        if (of != null) {
            final SharedPreferences$Editor edit = this.getSharedPreferences(nextArg).edit();
            switch (SharedPreferencesDumperPlugin$1.$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[of.ordinal()]) {
                case 6: {
                    putStringSet(edit, nextArg2, iterator);
                    break;
                }
                case 5: {
                    edit.putString(nextArg2, nextArgValue(iterator));
                    break;
                }
                case 4: {
                    edit.putFloat(nextArg2, (float)Float.valueOf(nextArgValue(iterator)));
                    break;
                }
                case 3: {
                    edit.putLong(nextArg2, (long)Long.valueOf(nextArgValue(iterator)));
                    break;
                }
                case 2: {
                    edit.putInt(nextArg2, (int)Integer.valueOf(nextArgValue(iterator)));
                    break;
                }
                case 1: {
                    edit.putBoolean(nextArg2, (boolean)Boolean.valueOf(nextArgValue(iterator)));
                    break;
                }
            }
            edit.commit();
            return;
        }
        throw new DumpUsageException(Type.appendNamesList(new StringBuilder("Usage: prefs write <path> <key> <type> <value>, where type is one of: "), ", ").toString());
    }
    
    private SharedPreferences getSharedPreferences(final String s) {
        return this.mAppContext.getSharedPreferences(s, 4);
    }
    
    @g
    private static String nextArg(final Iterator<String> iterator, final String s) throws DumpUsageException {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        throw new DumpUsageException(s);
    }
    
    @g
    private static String nextArgValue(final Iterator<String> iterator) throws DumpUsageException {
        return nextArg(iterator, "Expected <value>");
    }
    
    private void printFile(final PrintStream printStream, final String str, final String prefix) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        printStream.println(sb.toString());
        for (final Map.Entry<String, Object> entry : SharedPreferencesHelper.getSharedPreferenceEntriesSorted(this.getSharedPreferences(str))) {
            if (entry.getKey().startsWith(prefix)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("  ");
                sb2.append(entry.getKey());
                sb2.append(" = ");
                sb2.append(entry.getValue());
                printStream.println(sb2.toString());
            }
        }
    }
    
    private void printRecursive(final PrintStream printStream, final String parent, final String s, final String prefix, final String s2) {
        final File file = new File(parent, s);
        final boolean file2 = file.isFile();
        int i = 0;
        if (file2) {
            if (s.endsWith(".xml")) {
                this.printFile(printStream, s.substring(0, s.length() - 4), s2);
            }
        }
        else if (file.isDirectory()) {
            final String[] list = file.list();
            if (list != null) {
                while (i < list.length) {
                    String string;
                    if (TextUtils.isEmpty((CharSequence)s)) {
                        string = list[i];
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(s);
                        sb.append(File.separator);
                        sb.append(list[i]);
                        string = sb.toString();
                    }
                    if (string.startsWith(prefix)) {
                        this.printRecursive(printStream, parent, string, prefix, s2);
                    }
                    ++i;
                }
            }
        }
    }
    
    @TargetApi(11)
    private static void putStringSet(final SharedPreferences$Editor sharedPreferences$Editor, final String s, final Iterator<String> iterator) {
        final HashSet<String> set = new HashSet<String>();
        while (iterator.hasNext()) {
            set.add(iterator.next());
        }
        sharedPreferences$Editor.putStringSet(s, (Set)set);
    }
    
    @Override
    public void dump(final DumperContext dumperContext) throws DumpUsageException {
        final PrintStream stdout = dumperContext.getStdout();
        final List<String> argsAsList = dumperContext.getArgsAsList();
        String s;
        if (argsAsList.isEmpty()) {
            s = "";
        }
        else {
            s = argsAsList.remove(0);
        }
        if (s.equals("print")) {
            this.doPrint(stdout, argsAsList);
        }
        else if (s.equals("write")) {
            this.doWrite(argsAsList);
        }
        else {
            this.doUsage(stdout);
        }
    }
    
    @Override
    public String getName() {
        return "prefs";
    }
    
    private enum Type
    {
        BOOLEAN("boolean"), 
        FLOAT("float"), 
        INT("int"), 
        LONG("long"), 
        SET("set"), 
        STRING("string");
        
        private final String name;
        
        private Type(final String name2) {
            this.name = name2;
        }
        
        public static StringBuilder appendNamesList(final StringBuilder sb, final String str) {
            final Type[] values = values();
            final int length = values.length;
            int n = 1;
            for (final Type type : values) {
                if (n != 0) {
                    n = 0;
                }
                else {
                    sb.append(str);
                }
                sb.append(type.name);
            }
            return sb;
        }
        
        @h
        public static Type of(final String anObject) {
            for (final Type type : values()) {
                if (type.name.equals(anObject)) {
                    return type;
                }
            }
            return null;
        }
    }
}
