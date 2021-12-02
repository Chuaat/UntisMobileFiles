// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util;

import org.jetbrains.annotations.f;
import kotlin.coroutines.intrinsics.b;
import n6.p;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlinx.coroutines.i1;
import kotlin.coroutines.d;
import kotlin.j2;
import n6.q;
import java.io.OutputStream;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ax\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002K\u0010\u000e\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011" }, d2 = { "", "url", "Ljava/io/OutputStream;", "attachmentFileOutputStream", "accessToken", "Lkotlin/Function3;", "", "Lkotlin/t0;", "name", "bytesRead", "contentLength", "", "isDone", "Lkotlin/j2;", "downloadProgressFun", "downloadFile", "(Ljava/lang/String;Ljava/io/OutputStream;Ljava/lang/String;Ln6/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class DownloadUtilKt
{
    @f
    public static final Object downloadFile(@e final String s, @e final OutputStream outputStream, @e final String s2, @e final q<? super Long, ? super Long, ? super Boolean, j2> q, @e final d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (p)new DownloadUtilKt$downloadFile.DownloadUtilKt$downloadFile$2(s, s2, (q)q, outputStream, (d)null), (d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
}
