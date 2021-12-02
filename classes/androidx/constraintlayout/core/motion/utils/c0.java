// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;
import java.io.PrintStream;

public class c0
{
    private static int a(int n) {
        n = (n & ~(n >> 31)) - 255;
        return (n & n >> 31) + 255;
    }
    
    public static void c(final String str) {
        final StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        final StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(stackTraceElement.getMethodName());
        final String string = sb.toString();
        final PrintStream out = System.out;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(" ");
        sb2.append(str);
        out.println(sb2.toString());
    }
    
    public static void d(final String str, final String str2) {
        final PrintStream out = System.out;
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        out.println(sb.toString());
    }
    
    public static void e(final String str, int i) {
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        final int length = stackTrace.length;
        final int n = 1;
        final int min = Math.min(i, length - 1);
        String string = " ";
        StackTraceElement stackTraceElement;
        StringBuilder sb;
        String string2;
        StringBuilder sb2;
        PrintStream out;
        StringBuilder sb3;
        for (i = n; i <= min; ++i) {
            stackTraceElement = stackTrace[i];
            sb = new StringBuilder();
            sb.append(".(");
            sb.append(stackTrace[i].getFileName());
            sb.append(":");
            sb.append(stackTrace[i].getLineNumber());
            sb.append(") ");
            sb.append(stackTrace[i].getMethodName());
            string2 = sb.toString();
            sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" ");
            string = sb2.toString();
            out = System.out;
            sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(string);
            sb3.append(string2);
            sb3.append(string);
            out.println(sb3.toString());
        }
    }
    
    public static void f(final String str, final String str2) {
        final PrintStream err = System.err;
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        err.println(sb.toString());
    }
    
    public static int g(final float n, final float n2, final float n3, final float n4) {
        return a((int)(n * 255.0f)) << 16 | a((int)(n4 * 255.0f)) << 24 | a((int)(n2 * 255.0f)) << 8 | a((int)(n3 * 255.0f));
    }
    
    public static void h(final String s) {
        try {
            final OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(s.getBytes());
            outputStream.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public int b(final float[] array) {
        return a((int)(array[3] * 255.0f)) << 24 | a((int)((float)Math.pow(array[0], 0.45454545454545453) * 255.0f)) << 16 | a((int)((float)Math.pow(array[1], 0.45454545454545453) * 255.0f)) << 8 | a((int)((float)Math.pow(array[2], 0.45454545454545453) * 255.0f));
    }
}
