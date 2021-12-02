// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.inbox.details.viewmodel;

import a4.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import android.net.Uri;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J?\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b\r\u0010$\"\u0004\b%\u0010&R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006." }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/details/viewmodel/DownloadAttachmentState;", "", "", "component1", "component2", "", "component3", "", "component4", "Landroid/net/Uri;", "component5", "bytesRead", "contentLength", "isDone", "error", "fileUri", "copy", "", "toString", "", "hashCode", "other", "equals", "J", "getBytesRead", "()J", "setBytesRead", "(J)V", "getContentLength", "setContentLength", "Landroid/net/Uri;", "getFileUri", "()Landroid/net/Uri;", "setFileUri", "(Landroid/net/Uri;)V", "Z", "()Z", "setDone", "(Z)V", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "<init>", "(JJZLjava/lang/Throwable;Landroid/net/Uri;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DownloadAttachmentState
{
    private long bytesRead;
    private long contentLength;
    @f
    private Throwable error;
    @f
    private Uri fileUri;
    private boolean isDone;
    
    public DownloadAttachmentState() {
        this(0L, 0L, false, null, null, 31, null);
    }
    
    public DownloadAttachmentState(final long bytesRead, final long contentLength, final boolean isDone, @f final Throwable error, @f final Uri fileUri) {
        this.bytesRead = bytesRead;
        this.contentLength = contentLength;
        this.isDone = isDone;
        this.error = error;
        this.fileUri = fileUri;
    }
    
    public final long component1() {
        return this.bytesRead;
    }
    
    public final long component2() {
        return this.contentLength;
    }
    
    public final boolean component3() {
        return this.isDone;
    }
    
    @f
    public final Throwable component4() {
        return this.error;
    }
    
    @f
    public final Uri component5() {
        return this.fileUri;
    }
    
    @e
    public final DownloadAttachmentState copy(final long n, final long n2, final boolean b, @f final Throwable t, @f final Uri uri) {
        return new DownloadAttachmentState(n, n2, b, t, uri);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadAttachmentState)) {
            return false;
        }
        final DownloadAttachmentState downloadAttachmentState = (DownloadAttachmentState)o;
        return this.bytesRead == downloadAttachmentState.bytesRead && this.contentLength == downloadAttachmentState.contentLength && this.isDone == downloadAttachmentState.isDone && k0.g(this.error, downloadAttachmentState.error) && k0.g(this.fileUri, downloadAttachmentState.fileUri);
    }
    
    public final long getBytesRead() {
        return this.bytesRead;
    }
    
    public final long getContentLength() {
        return this.contentLength;
    }
    
    @f
    public final Throwable getError() {
        return this.error;
    }
    
    @f
    public final Uri getFileUri() {
        return this.fileUri;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.bytesRead);
        final int a2 = a4.a.a(this.contentLength);
        int isDone;
        if ((isDone = (this.isDone ? 1 : 0)) != 0) {
            isDone = 1;
        }
        final Throwable error = this.error;
        int hashCode = 0;
        int hashCode2;
        if (error == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = error.hashCode();
        }
        final Uri fileUri = this.fileUri;
        if (fileUri != null) {
            hashCode = fileUri.hashCode();
        }
        return (((a * 31 + a2) * 31 + isDone) * 31 + hashCode2) * 31 + hashCode;
    }
    
    public final boolean isDone() {
        return this.isDone;
    }
    
    public final void setBytesRead(final long bytesRead) {
        this.bytesRead = bytesRead;
    }
    
    public final void setContentLength(final long contentLength) {
        this.contentLength = contentLength;
    }
    
    public final void setDone(final boolean isDone) {
        this.isDone = isDone;
    }
    
    public final void setError(@f final Throwable error) {
        this.error = error;
    }
    
    public final void setFileUri(@f final Uri fileUri) {
        this.fileUri = fileUri;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DownloadAttachmentState(bytesRead=");
        sb.append(this.bytesRead);
        sb.append(", contentLength=");
        sb.append(this.contentLength);
        sb.append(", isDone=");
        sb.append(this.isDone);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", fileUri=");
        sb.append(this.fileUri);
        sb.append(')');
        return sb.toString();
    }
}
