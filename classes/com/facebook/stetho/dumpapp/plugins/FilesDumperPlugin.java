// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.dumpapp.plugins;

import com.facebook.stetho.dumpapp.DumpException;
import com.facebook.stetho.dumpapp.DumperContext;
import android.os.Environment;
import com.facebook.stetho.dumpapp.DumpUsageException;
import java.io.Closeable;
import com.facebook.stetho.common.Util;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import com.facebook.stetho.dumpapp.ArgsHelper;
import java.util.Iterator;
import java.io.PrintStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.io.File;
import java.util.zip.ZipOutputStream;
import android.content.Context;
import com.facebook.stetho.dumpapp.DumperPlugin;

public class FilesDumperPlugin implements DumperPlugin
{
    private static final String NAME = "files";
    private final Context mContext;
    
    public FilesDumperPlugin(final Context mContext) {
        this.mContext = mContext;
    }
    
    private void addFiles(final ZipOutputStream zipOutputStream, final byte[] array, final File[] array2) throws IOException {
        final int length = array2.length;
        int i = 0;
        while (i < length) {
            Object file = array2[i];
            Label_0091: {
                if (((File)file).isDirectory()) {
                    this.addFiles(zipOutputStream, array, ((File)file).listFiles());
                    break Label_0091;
                }
                zipOutputStream.putNextEntry(new ZipEntry(relativizePath(getBaseDir(this.mContext).getParentFile(), (File)file)));
                file = new FileInputStream((File)file);
                try {
                    copy((InputStream)file, zipOutputStream, array);
                    ((FileInputStream)file).close();
                    ++i;
                    continue;
                }
                finally {
                    ((FileInputStream)file).close();
                }
            }
            break;
        }
    }
    
    private static void copy(final InputStream inputStream, final OutputStream outputStream, final byte[] array) throws IOException {
        while (true) {
            final int read = inputStream.read(array);
            if (read < 0) {
                break;
            }
            outputStream.write(array, 0, read);
        }
    }
    
    private void doDownload(PrintStream out, Iterator<String> zipOutputStream) throws DumpUsageException {
        final String nextArg = ArgsHelper.nextArg((Iterator<String>)zipOutputStream, "Must specify output file or '-'");
        final ArrayList<File> list = new ArrayList<File>();
        while (((Iterator)zipOutputStream).hasNext()) {
            list.add(resolvePossibleAppStoragePath(this.mContext, ((Iterator<String>)zipOutputStream).next()));
        }
        try {
            if (!"-".equals(nextArg)) {
                out = (PrintStream)new FileOutputStream(resolvePossibleSdcardPath(nextArg));
            }
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(out));
            try {
                final byte[] array = new byte[2048];
                if (list.size() > 0) {
                    this.addFiles(zipOutputStream, array, list.toArray(new File[list.size()]));
                }
                else {
                    this.addFiles(zipOutputStream, array, getBaseDir(this.mContext).listFiles());
                }
                try {
                    zipOutputStream.close();
                }
                catch (IOException zipOutputStream) {
                    Util.close(out, false);
                    throw zipOutputStream;
                }
            }
            finally {
                try {
                    zipOutputStream.close();
                }
                catch (IOException ex) {
                    Util.close(out, true);
                }
            }
        }
        catch (IOException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    private void doLs(final PrintStream printStream) throws DumpUsageException {
        final File baseDir = getBaseDir(this.mContext);
        if (baseDir.isDirectory()) {
            printDirectoryText(baseDir, "", printStream);
        }
    }
    
    private void doTree(final PrintStream printStream) throws DumpUsageException {
        printDirectoryVisual(getBaseDir(this.mContext), 0, printStream);
    }
    
    private void doUsage(final PrintStream printStream) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Usage: dumpapp files ");
        sb.append("<command> [command-options]");
        printStream.println(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("       dumpapp files ");
        sb2.append("ls");
        printStream.println(sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("       dumpapp files ");
        sb3.append("tree");
        printStream.println(sb3.toString());
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("       dumpapp files ");
        sb4.append("download <output.zip> [<path>...]");
        printStream.println(sb4.toString());
        printStream.println();
        printStream.println("dumpapp files ls: List files similar to the ls command");
        printStream.println();
        printStream.println("dumpapp files tree: List files similar to the tree command");
        printStream.println();
        printStream.println("dumpapp files download: Fetch internal application storage");
        printStream.println("    <output.zip>: Output location or '-' for stdout");
        printStream.println("    <path>: Fetch only those paths named (directories fetch recursively)");
    }
    
    private static File getBaseDir(final Context context) {
        return context.getFilesDir().getParentFile();
    }
    
    private static void printDirectoryText(final File file, final String s, final PrintStream printStream) {
        final File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; ++i) {
            final File file2 = listFiles[i];
            if (file2.isDirectory()) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(file2.getName());
                sb.append("/");
                printDirectoryText(file2, sb.toString(), printStream);
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                sb2.append(file2.getName());
                printStream.println(sb2.toString());
            }
        }
    }
    
    private static void printDirectoryVisual(final File file, final int n, final PrintStream printStream) {
        final File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; ++i) {
            printHeaderVisual(n, printStream);
            final File file2 = listFiles[i];
            printStream.print("+---");
            printStream.print(file2.getName());
            printStream.println();
            if (file2.isDirectory()) {
                printDirectoryVisual(file2, n + 1, printStream);
            }
        }
    }
    
    private static void printHeaderVisual(final int n, final PrintStream printStream) {
        for (int i = 0; i < n; ++i) {
            printStream.print("|   ");
        }
    }
    
    private static String relativizePath(final File file, final File file2) {
        final String absolutePath = file.getAbsolutePath();
        final String absolutePath2 = file2.getAbsolutePath();
        if (absolutePath2.startsWith(absolutePath)) {
            return absolutePath2.substring(absolutePath.length() + 1);
        }
        return absolutePath2;
    }
    
    private static File resolvePossibleAppStoragePath(final Context context, final String s) {
        if (s.startsWith("/")) {
            return new File(s);
        }
        return new File(getBaseDir(context), s);
    }
    
    private static File resolvePossibleSdcardPath(final String s) {
        if (s.startsWith("/")) {
            return new File(s);
        }
        return new File(Environment.getExternalStorageDirectory(), s);
    }
    
    @Override
    public void dump(final DumperContext dumperContext) throws DumpException {
        final Iterator<String> iterator = dumperContext.getArgsAsList().iterator();
        final String nextOptionalArg = ArgsHelper.nextOptionalArg(iterator, "");
        if ("ls".equals(nextOptionalArg)) {
            this.doLs(dumperContext.getStdout());
        }
        else if ("tree".equals(nextOptionalArg)) {
            this.doTree(dumperContext.getStdout());
        }
        else {
            final boolean equals = "download".equals(nextOptionalArg);
            final PrintStream stdout = dumperContext.getStdout();
            if (equals) {
                this.doDownload(stdout, iterator);
            }
            else {
                this.doUsage(stdout);
                if (!"".equals(nextOptionalArg)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown command: ");
                    sb.append(nextOptionalArg);
                    throw new DumpUsageException(sb.toString());
                }
            }
        }
    }
    
    @Override
    public String getName() {
        return "files";
    }
}
