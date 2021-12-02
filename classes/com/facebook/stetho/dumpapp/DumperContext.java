// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.Util;
import java.io.InputStream;
import java.io.PrintStream;
import org.apache.commons.cli.d;
import java.util.List;
import d6.b;

@b
public class DumperContext
{
    private final List<String> mArgs;
    private final d mParser;
    private final PrintStream mStderr;
    private final InputStream mStdin;
    private final PrintStream mStdout;
    
    protected DumperContext(final DumperContext dumperContext, final List<String> list) {
        this(dumperContext.getStdin(), dumperContext.getStdout(), dumperContext.getStderr(), dumperContext.getParser(), list);
    }
    
    public DumperContext(final InputStream inputStream, final PrintStream printStream, final PrintStream printStream2, final d d, final List<String> list) {
        this.mStdin = Util.throwIfNull(inputStream);
        this.mStdout = Util.throwIfNull(printStream);
        this.mStderr = Util.throwIfNull(printStream2);
        this.mParser = Util.throwIfNull(d);
        this.mArgs = Util.throwIfNull(list);
    }
    
    public List<String> getArgsAsList() {
        return this.mArgs;
    }
    
    public d getParser() {
        return this.mParser;
    }
    
    public PrintStream getStderr() {
        return this.mStderr;
    }
    
    public InputStream getStdin() {
        return this.mStdin;
    }
    
    public PrintStream getStdout() {
        return this.mStdout;
    }
}
