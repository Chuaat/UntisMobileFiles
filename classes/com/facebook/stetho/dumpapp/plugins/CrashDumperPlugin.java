// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.dumpapp.plugins;

import com.facebook.stetho.dumpapp.DumpUsageException;
import c6.h;
import java.lang.reflect.Constructor;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import com.facebook.stetho.common.ExceptionUtil;
import java.io.IOException;
import com.facebook.stetho.dumpapp.DumpException;
import java.io.OutputStream;
import com.facebook.stetho.common.Util;
import android.os.Process;
import com.facebook.stetho.dumpapp.ArgsHelper;
import java.util.Iterator;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;

public class CrashDumperPlugin implements DumperPlugin
{
    private static final String NAME = "crash";
    private static final String OPTION_EXIT_DEFAULT = "0";
    private static final String OPTION_KILL_DEFAULT = "9";
    private static final String OPTION_THROW_DEFAULT = "java.lang.Error";
    
    private void doKill(final DumperContext dumperContext, Iterator<String> start) throws DumpException {
        final String nextOptionalArg = ArgsHelper.nextOptionalArg((Iterator<String>)start, "9");
        try {
            final ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
            final StringBuilder sb = new StringBuilder();
            sb.append("-");
            sb.append(nextOptionalArg);
            start = processBuilder.command("/system/bin/kill", sb.toString(), String.valueOf(Process.myPid())).redirectErrorStream(true).start();
            try {
                Util.copy(start.getInputStream(), dumperContext.getStdout(), new byte[1024]);
            }
            finally {
                start.destroy();
            }
        }
        catch (IOException obj) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to invoke kill: ");
            sb2.append(obj);
            throw new DumpException(sb2.toString());
        }
    }
    
    private void doSystemExit(final Iterator<String> iterator) {
        System.exit(Integer.parseInt(ArgsHelper.nextOptionalArg(iterator, "0")));
    }
    
    private void doUncaughtException(Iterator<String> o) throws DumpException {
        o = ArgsHelper.nextOptionalArg((Iterator<String>)o, "java.lang.Error");
        try {
            final Class<?> forName = Class.forName((String)o);
            o = tryGetDeclaredConstructor(forName, String.class);
            if (o != null) {
                o = ((Constructor<String>)o).newInstance("Uncaught exception triggered by Stetho");
            }
            else {
                o = forName.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            }
            o = o;
            final Thread thread = new Thread(new ThrowRunnable((Throwable)o));
            thread.start();
            Util.joinUninterruptibly(thread);
            return;
        }
        catch (InvocationTargetException ex) {
            throw ExceptionUtil.propagate(ex.getCause());
        }
        catch (InstantiationException o) {}
        catch (IllegalAccessException o) {}
        catch (NoSuchMethodException o) {}
        catch (ClassCastException o) {}
        catch (ClassNotFoundException ex2) {}
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid supplied Throwable class: ");
        sb.append(o);
        throw new DumpException(sb.toString());
    }
    
    private void doUsage(final PrintStream printStream) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Usage: dumpapp crash ");
        sb.append("<command> [command-options]");
        printStream.println(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Usage: dumpapp crash ");
        sb2.append("throw");
        printStream.println(sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("       dumpapp crash ");
        sb3.append("kill");
        printStream.println(sb3.toString());
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("       dumpapp crash ");
        sb4.append("exit");
        printStream.println(sb4.toString());
        printStream.println();
        printStream.println("dumpapp crash throw: Throw an uncaught exception (simulates a program crash)");
        printStream.println("    <Throwable>: Throwable class to use (default: java.lang.Error)");
        printStream.println();
        printStream.println("dumpapp crash kill: Send a signal to this process (simulates the low memory killer)");
        printStream.println("    <SIGNAL>: Either signal name or number to send (default: 9)");
        printStream.println("              See `adb shell kill -l` for more information");
        printStream.println();
        printStream.println("dumpapp crash exit: Invoke System.exit (simulates an abnormal Android exit strategy)");
        printStream.println("    <code>: Exit code (default: 0)");
    }
    
    @h
    private static <T> Constructor<? extends T> tryGetDeclaredConstructor(final Class<T> clazz, final Class<?>... parameterTypes) {
        try {
            return (Constructor<? extends T>)clazz.getDeclaredConstructor(parameterTypes);
        }
        catch (NoSuchMethodException ex) {
            return null;
        }
    }
    
    @Override
    public void dump(final DumperContext dumperContext) throws DumpException {
        final Iterator<String> iterator = dumperContext.getArgsAsList().iterator();
        final String nextOptionalArg = ArgsHelper.nextOptionalArg(iterator, null);
        if ("throw".equals(nextOptionalArg)) {
            this.doUncaughtException(iterator);
        }
        else if ("kill".equals(nextOptionalArg)) {
            this.doKill(dumperContext, iterator);
        }
        else if ("exit".equals(nextOptionalArg)) {
            this.doSystemExit(iterator);
        }
        else {
            this.doUsage(dumperContext.getStdout());
            if (nextOptionalArg != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported command: ");
                sb.append(nextOptionalArg);
                throw new DumpUsageException(sb.toString());
            }
        }
    }
    
    @Override
    public String getName() {
        return "crash";
    }
    
    private static class ThrowRunnable implements Runnable
    {
        private final Throwable mThrowable;
        
        public ThrowRunnable(final Throwable mThrowable) {
            this.mThrowable = mThrowable;
        }
        
        @Override
        public void run() {
            ExceptionUtil.sneakyThrow(this.mThrowable);
        }
    }
}
