// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.network;

import java.net.HttpURLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import c6.h;
import java.net.MalformedURLException;
import java.net.URL;
import com.facebook.stetho.common.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public abstract class DownloadingAsyncPrettyPrinterFactory implements AsyncPrettyPrinterFactory
{
    private static void doErrorPrint(final PrintWriter printWriter, final InputStream inputStream, final String str) throws IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        sb.append(Util.readAsUTF8(inputStream));
        printWriter.print(sb.toString());
    }
    
    private static AsyncPrettyPrinter getErrorAsyncPrettyPrinter(final String s, final String s2) {
        return new AsyncPrettyPrinter() {
            @Override
            public PrettyPrinterDisplayType getPrettifiedType() {
                return PrettyPrinterDisplayType.TEXT;
            }
            
            @Override
            public void printTo(final PrintWriter printWriter, final InputStream inputStream) throws IOException {
                final StringBuilder sb = new StringBuilder();
                sb.append("[Failed to parse header: ");
                sb.append(s);
                sb.append(" : ");
                sb.append(s2);
                sb.append(" ]");
                doErrorPrint(printWriter, inputStream, sb.toString());
            }
        };
    }
    
    @h
    private static URL parseURL(final String spec) {
        try {
            return new URL(spec);
        }
        catch (MalformedURLException ex) {
            return null;
        }
    }
    
    protected abstract void doPrint(final PrintWriter p0, final InputStream p1, final String p2) throws IOException;
    
    @Override
    public AsyncPrettyPrinter getInstance(final String s, final String s2) {
        final MatchResult matchAndParseHeader = this.matchAndParseHeader(s, s2);
        if (matchAndParseHeader == null) {
            return null;
        }
        final URL url = parseURL(matchAndParseHeader.getSchemaUri());
        if (url == null) {
            return getErrorAsyncPrettyPrinter(s, s2);
        }
        final ExecutorService executorService = AsyncPrettyPrinterExecutorHolder.getExecutorService();
        if (executorService == null) {
            return null;
        }
        return new AsyncPrettyPrinter() {
            final /* synthetic */ Future val$response = executorService.submit((Callable<Object>)new Request(url));
            
            @Override
            public PrettyPrinterDisplayType getPrettifiedType() {
                return matchAndParseHeader.getDisplayType();
            }
            
            @Override
            public void printTo(final PrintWriter p0, final InputStream p1) throws IOException {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory$1.val$response:Ljava/util/concurrent/Future;
                //     4: invokeinterface java/util/concurrent/Future.get:()Ljava/lang/Object;
                //     9: checkcast       Ljava/lang/String;
                //    12: astore_3       
                //    13: aload_0        
                //    14: getfield        com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory$1.this$0:Lcom/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory;
                //    17: aload_1        
                //    18: aload_2        
                //    19: aload_3        
                //    20: invokevirtual   com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory.doPrint:(Ljava/io/PrintWriter;Ljava/io/InputStream;Ljava/lang/String;)V
                //    23: goto            130
                //    26: astore_3       
                //    27: goto            93
                //    30: astore_3       
                //    31: ldc             Ljava/io/IOException;.class
                //    33: aload_3        
                //    34: invokevirtual   java/util/concurrent/ExecutionException.getCause:()Ljava/lang/Throwable;
                //    37: invokevirtual   java/lang/Class.isInstance:(Ljava/lang/Object;)Z
                //    40: ifeq            82
                //    43: new             Ljava/lang/StringBuilder;
                //    46: astore          4
                //    48: aload           4
                //    50: invokespecial   java/lang/StringBuilder.<init>:()V
                //    53: aload           4
                //    55: ldc             "Cannot successfully download schema: "
                //    57: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //    60: pop            
                //    61: aload           4
                //    63: aload_3        
                //    64: invokevirtual   java/util/concurrent/ExecutionException.getMessage:()Ljava/lang/String;
                //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //    70: pop            
                //    71: aload_1        
                //    72: aload_2        
                //    73: aload           4
                //    75: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //    78: invokestatic    com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory.access$000:(Ljava/io/PrintWriter;Ljava/io/InputStream;Ljava/lang/String;)V
                //    81: return         
                //    82: aload_3        
                //    83: athrow         
                //    84: astore_1       
                //    85: aload_1        
                //    86: invokevirtual   java/util/concurrent/ExecutionException.getCause:()Ljava/lang/Throwable;
                //    89: invokestatic    com/facebook/stetho/common/ExceptionUtil.propagate:(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
                //    92: athrow         
                //    93: new             Ljava/lang/StringBuilder;
                //    96: dup            
                //    97: invokespecial   java/lang/StringBuilder.<init>:()V
                //   100: astore          4
                //   102: aload           4
                //   104: ldc             "Encountered spurious interrupt while downloading schema for pretty printing: "
                //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   109: pop            
                //   110: aload           4
                //   112: aload_3        
                //   113: invokevirtual   java/lang/InterruptedException.getMessage:()Ljava/lang/String;
                //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   119: pop            
                //   120: aload_1        
                //   121: aload_2        
                //   122: aload           4
                //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   127: invokestatic    com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory.access$000:(Ljava/io/PrintWriter;Ljava/io/InputStream;Ljava/lang/String;)V
                //   130: return         
                //    Exceptions:
                //  throws java.io.IOException
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                     
                //  -----  -----  -----  -----  -----------------------------------------
                //  0      13     30     84     Ljava/util/concurrent/ExecutionException;
                //  0      13     26     30     Ljava/lang/InterruptedException;
                //  13     23     26     30     Ljava/lang/InterruptedException;
                //  13     23     84     93     Ljava/util/concurrent/ExecutionException;
                //  31     81     26     30     Ljava/lang/InterruptedException;
                //  31     81     84     93     Ljava/util/concurrent/ExecutionException;
                //  82     84     26     30     Ljava/lang/InterruptedException;
                //  82     84     84     93     Ljava/util/concurrent/ExecutionException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0082:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        };
    }
    
    @h
    protected abstract MatchResult matchAndParseHeader(final String p0, final String p1);
    
    protected class MatchResult
    {
        private final PrettyPrinterDisplayType mDisplayType;
        private final String mSchemaUri;
        
        public MatchResult(final String mSchemaUri, final PrettyPrinterDisplayType mDisplayType) {
            this.mSchemaUri = mSchemaUri;
            this.mDisplayType = mDisplayType;
        }
        
        public PrettyPrinterDisplayType getDisplayType() {
            return this.mDisplayType;
        }
        
        public String getSchemaUri() {
            return this.mSchemaUri;
        }
    }
    
    private static class Request implements Callable<String>
    {
        private URL url;
        
        public Request(final URL url) {
            this.url = url;
        }
        
        @Override
        public String call() throws IOException {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)this.url.openConnection();
            final int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                final InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    return Util.readAsUTF8(inputStream);
                }
                finally {
                    inputStream.close();
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Got status code: ");
            sb.append(responseCode);
            sb.append(" while downloading schema with url: ");
            sb.append(this.url.toString());
            throw new IOException(sb.toString());
        }
    }
}
