// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.dumpapp;

import java.util.HashMap;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.apache.commons.cli.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import org.apache.commons.cli.o;
import org.apache.commons.cli.c;
import java.io.PrintStream;
import java.io.InputStream;
import org.apache.commons.cli.e;
import org.apache.commons.cli.d;
import java.util.Map;

public class Dumper
{
    private final Map<String, DumperPlugin> mDumperPlugins;
    private final GlobalOptions mGlobalOptions;
    private final d mParser;
    
    public Dumper(final Iterable<DumperPlugin> iterable) {
        this(iterable, (d)new e());
    }
    
    public Dumper(final Iterable<DumperPlugin> iterable, final d mParser) {
        this.mDumperPlugins = generatePluginMap(iterable);
        this.mParser = mParser;
        this.mGlobalOptions = new GlobalOptions();
    }
    
    private int doDump(final InputStream inputStream, final PrintStream printStream, final PrintStream printStream2, final String[] array) throws o, DumpException {
        final c a = this.mParser.a(this.mGlobalOptions.options, array, true);
        if (a.q(this.mGlobalOptions.optionHelp.n())) {
            this.dumpUsage(printStream);
            return 0;
        }
        if (a.q(this.mGlobalOptions.optionListPlugins.n())) {
            this.dumpAvailablePlugins(printStream);
            return 0;
        }
        if (!a.c().isEmpty()) {
            this.dumpPluginOutput(inputStream, printStream, printStream2, a);
            return 0;
        }
        this.dumpUsage(printStream2);
        return 1;
    }
    
    private void dumpAvailablePlugins(final PrintStream printStream) {
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<DumperPlugin> iterator = this.mDumperPlugins.values().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getName());
        }
        Collections.sort(list);
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            printStream.println(iterator2.next());
        }
    }
    
    private void dumpPluginOutput(final InputStream inputStream, final PrintStream printStream, final PrintStream printStream2, final c c) throws DumpException {
        final ArrayList<String> list = (ArrayList<String>)new ArrayList<Object>(c.c());
        if (list.size() < 1) {
            throw new DumpException("Expected plugin argument");
        }
        final String str = list.remove(0);
        final DumperPlugin dumperPlugin = this.mDumperPlugins.get(str);
        if (dumperPlugin != null) {
            dumperPlugin.dump(new DumperContext(inputStream, printStream, printStream2, this.mParser, list));
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No plugin named '");
        sb.append(str);
        sb.append("'");
        throw new DumpException(sb.toString());
    }
    
    private void dumpUsage(PrintStream out) {
        final g g = new g();
        out.println("Usage: dumpapp [options] <plugin> [plugin-options]");
        out = (PrintStream)new PrintWriter(out);
        try {
            g.v((PrintWriter)out, g.m(), this.mGlobalOptions.options, g.g(), g.f());
        }
        finally {
            ((PrintWriter)out).flush();
        }
    }
    
    private static Map<String, DumperPlugin> generatePluginMap(final Iterable<DumperPlugin> iterable) {
        final HashMap<String, DumperPlugin> m = new HashMap<String, DumperPlugin>();
        for (final DumperPlugin dumperPlugin : iterable) {
            m.put(dumperPlugin.getName(), dumperPlugin);
        }
        return (Map<String, DumperPlugin>)Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    public int dump(final InputStream inputStream, final PrintStream printStream, final PrintStream s, final String[] array) {
        try {
            return this.doDump(inputStream, printStream, s, array);
        }
        catch (RuntimeException ex) {
            ex.printStackTrace(s);
            return 1;
        }
        catch (DumpappOutputBrokenException ex2) {
            throw ex2;
        }
        catch (DumpException ex3) {
            s.println(ex3.getMessage());
            return 1;
        }
        catch (o o) {
            s.println(((Throwable)o).getMessage());
            this.dumpUsage(s);
            return 1;
        }
    }
}
