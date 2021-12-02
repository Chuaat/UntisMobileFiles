// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util;

import okio.d0;
import org.jetbrains.annotations.f;
import okhttp3.y;
import okio.r0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.q;
import okio.o;
import kotlin.Metadata;
import okhttp3.h0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\\\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012K\u0010\u001a\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0003\u001a\u00020\bH\u0016R\u0019\u0010\t\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R^\u0010\u001a\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 " }, d2 = { "Lcom/untis/mobile/messages/util/ProgressResponseBody;", "Lokhttp3/h0;", "Lokio/r0;", "source", "", "contentLength", "Lokhttp3/y;", "contentType", "Lokio/o;", "responseBody", "Lokhttp3/h0;", "getResponseBody", "()Lokhttp3/h0;", "bufferedSource", "Lokio/o;", "getBufferedSource", "()Lokio/o;", "setBufferedSource", "(Lokio/o;)V", "Lkotlin/Function3;", "Lkotlin/t0;", "name", "bytesRead", "", "isDone", "Lkotlin/j2;", "downloadProgressFun", "Ln6/q;", "getDownloadProgressFun", "()Ln6/q;", "<init>", "(Lokhttp3/h0;Ln6/q;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ProgressResponseBody extends h0
{
    public o bufferedSource;
    @e
    private final q<Long, Long, Boolean, j2> downloadProgressFun;
    @e
    private final h0 responseBody;
    
    public ProgressResponseBody(@e final h0 responseBody, @e final q<? super Long, ? super Long, ? super Boolean, j2> downloadProgressFun) {
        k0.p(responseBody, "responseBody");
        k0.p(downloadProgressFun, "downloadProgressFun");
        this.responseBody = responseBody;
        this.downloadProgressFun = (q<Long, Long, Boolean, j2>)downloadProgressFun;
    }
    
    private final r0 source(final r0 r0) {
        return (r0)new ProgressResponseBody$source.ProgressResponseBody$source$2(this, r0);
    }
    
    public long contentLength() {
        return this.responseBody.contentLength();
    }
    
    @f
    public y contentType() {
        return this.responseBody.contentType();
    }
    
    @e
    public final o getBufferedSource() {
        final o bufferedSource = this.bufferedSource;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        k0.S("bufferedSource");
        throw null;
    }
    
    @e
    public final q<Long, Long, Boolean, j2> getDownloadProgressFun() {
        return this.downloadProgressFun;
    }
    
    @e
    public final h0 getResponseBody() {
        return this.responseBody;
    }
    
    public final void setBufferedSource(@e final o bufferedSource) {
        k0.p(bufferedSource, "<set-?>");
        this.bufferedSource = bufferedSource;
    }
    
    @e
    public o source() {
        if (this.bufferedSource == null) {
            this.setBufferedSource(d0.d(this.source((r0)this.responseBody.source())));
        }
        return this.getBufferedSource();
    }
}
