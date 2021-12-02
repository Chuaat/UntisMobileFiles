// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.profile;

import java.util.List;
import android.app.Application;
import com.auth0.android.jwt.c;
import android.util.Log;
import org.joda.time.n0;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.m;
import com.untis.mobile.services.timetable.placeholder.k;
import java.net.URLEncoder;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.UntisMobileApplication;
import java.util.Objects;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.utils.r0;
import com.untis.mobile.api.common.UMAuthenticationToken;
import kotlin.text.s;
import java.util.HashSet;
import n6.a;
import kotlin.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import t5.d;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.t;
import org.jetbrains.annotations.f;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.Displayable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bx\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010j\u001a\u00020\u0004\u0012\b\b\u0002\u0010k\u001a\u00020\u0004\u0012\b\b\u0002\u0010l\u001a\u00020\u0004\u0012\b\b\u0002\u0010m\u001a\u00020\n\u0012\b\b\u0002\u0010n\u001a\u00020\b\u0012\b\b\u0002\u0010o\u001a\u00020\n\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00160?\u0012\u000e\b\u0002\u0010s\u001a\b\u0012\u0004\u0012\u00020B0A\u0012\u000e\b\u0002\u0010t\u001a\b\u0012\u0004\u0012\u00020\n0A\u0012\b\b\u0002\u0010u\u001a\u00020\u0006\u0012\b\b\u0002\u0010v\u001a\u00020\u0006\u0012\b\b\u0002\u0010w\u001a\u00020\n\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010H\u0012\b\b\u0002\u0010y\u001a\u00020\u0004\u0012\b\b\u0002\u0010z\u001a\u00020\u0004\u0012\b\b\u0002\u0010{\u001a\u00020\n\u0012\b\b\u0002\u0010|\u001a\u00020\u0004\u0012\b\b\u0002\u0010}\u001a\u00020\u0006\u0012\b\b\u0002\u0010~\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u007f\u001a\u00020\n\u0012\t\b\u0002\u0010\u0080\u0001\u001a\u00020'\u0012\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u0004\u0012\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0004\u0012\t\b\u0002\u0010\u0083\u0001\u001a\u00020\u0006\u0012\t\b\u0002\u0010\u0084\u0001\u001a\u00020\u0006\u0012\t\b\u0002\u0010\u0085\u0001\u001a\u00020\n\u0012\t\b\u0002\u0010\u0086\u0001\u001a\u00020\n\u0012\t\b\u0002\u0010\u0087\u0001\u001a\u00020\n\u0012\t\b\u0002\u0010\u0088\u0001\u001a\u00020\n\u0012\t\b\u0002\u0010\u0089\u0001\u001a\u00020\n\u0012\t\b\u0002\u0010\u008a\u0001\u001a\u00020\n\u0012\t\b\u0002\u0010\u008b\u0001\u001a\u00020\b\u0012\t\b\u0002\u0010\u008c\u0001\u001a\u00020\n\u0012\u000f\b\u0002\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0?\u0012\t\b\u0002\u0010\u008e\u0001\u001a\u00020\n\u0012\t\b\u0002\u0010\u008f\u0001\u001a\u00020\u0006\u0012\u000f\b\u0002\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020'0?\u0012\t\b\u0002\u0010\u0091\u0001\u001a\u00020\u0004\u0012\t\b\u0002\u0010\u0092\u0001\u001a\u00020\u0004\u0012\t\b\u0002\u0010\u0093\u0001\u001a\u00020\u0004\u0012\t\b\u0002\u0010\u0094\u0001\u001a\u00020\u0004\u0012\b\b\u0002\u0010.\u001a\u00020\u0004\u0012\t\b\u0002\u0010\u0095\u0001\u001a\u00020\n\u0012\t\b\u0002\u0010\u0096\u0001\u001a\u00020\u0006\u0012\t\b\u0002\u0010\u0097\u0001\u001a\u00020\n¢\u0006\u0006\b§\u0002\u0010¨\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J!\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000e\"\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u000e\"\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0010\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\"J\u0006\u0010$\u001a\u00020\u0006J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020'H\u0016J\u0013\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010-\u001a\u00020'H\u0016J\u000e\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0004J\u0006\u00100\u001a\u00020\u0004J\u0006\u00102\u001a\u000201J\u0006\u00103\u001a\u00020\u0006J\u0006\u00104\u001a\u00020\u0006J\t\u00105\u001a\u00020\nH\u00c6\u0003J\t\u00106\u001a\u00020\u0004H\u00c6\u0003J\t\u00107\u001a\u00020\u0004H\u00c6\u0003J\t\u00108\u001a\u00020\u0004H\u00c6\u0003J\t\u00109\u001a\u00020\nH\u00c6\u0003J\t\u0010:\u001a\u00020\bH\u00c6\u0003J\t\u0010;\u001a\u00020\nH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010=\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00160?H\u00c6\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0AH\u00c6\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0AH\u00c6\u0003J\t\u0010E\u001a\u00020\u0006H\u00c6\u0003J\t\u0010F\u001a\u00020\u0006H\u00c6\u0003J\t\u0010G\u001a\u00020\nH\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010HH\u00c6\u0003J\t\u0010J\u001a\u00020\u0004H\u00c6\u0003J\t\u0010K\u001a\u00020\u0004H\u00c6\u0003J\t\u0010L\u001a\u00020\nH\u00c6\u0003J\t\u0010M\u001a\u00020\u0004H\u00c6\u0003J\t\u0010N\u001a\u00020\u0006H\u00c6\u0003J\t\u0010O\u001a\u00020\u0004H\u00c6\u0003J\t\u0010P\u001a\u00020\nH\u00c6\u0003J\t\u0010Q\u001a\u00020'H\u00c6\u0003J\t\u0010R\u001a\u00020\u0004H\u00c6\u0003J\t\u0010S\u001a\u00020\u0004H\u00c6\u0003J\t\u0010T\u001a\u00020\u0006H\u00c6\u0003J\t\u0010U\u001a\u00020\u0006H\u00c6\u0003J\t\u0010V\u001a\u00020\nH\u00c6\u0003J\t\u0010W\u001a\u00020\nH\u00c6\u0003J\t\u0010X\u001a\u00020\nH\u00c6\u0003J\t\u0010Y\u001a\u00020\nH\u00c6\u0003J\t\u0010Z\u001a\u00020\nH\u00c6\u0003J\t\u0010[\u001a\u00020\nH\u00c6\u0003J\t\u0010\\\u001a\u00020\bH\u00c6\u0003J\t\u0010]\u001a\u00020\nH\u00c6\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000f0?H\u00c6\u0003J\t\u0010_\u001a\u00020\nH\u00c6\u0003J\t\u0010`\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020'0?H\u00c6\u0003J\t\u0010b\u001a\u00020\u0004H\u00c6\u0003J\t\u0010c\u001a\u00020\u0004H\u00c6\u0003J\t\u0010d\u001a\u00020\u0004H\u00c6\u0003J\t\u0010e\u001a\u00020\u0004H\u00c6\u0003J\t\u0010f\u001a\u00020\u0004H\u00c6\u0003J\t\u0010g\u001a\u00020\nH\u00c6\u0003J\t\u0010h\u001a\u00020\u0006H\u00c6\u0003J\t\u0010i\u001a\u00020\nH\u00c6\u0003J¯\u0004\u0010\u0098\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010j\u001a\u00020\u00042\b\b\u0002\u0010k\u001a\u00020\u00042\b\b\u0002\u0010l\u001a\u00020\u00042\b\b\u0002\u0010m\u001a\u00020\n2\b\b\u0002\u0010n\u001a\u00020\b2\b\b\u0002\u0010o\u001a\u00020\n2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00160?2\u000e\b\u0002\u0010s\u001a\b\u0012\u0004\u0012\u00020B0A2\u000e\b\u0002\u0010t\u001a\b\u0012\u0004\u0012\u00020\n0A2\b\b\u0002\u0010u\u001a\u00020\u00062\b\b\u0002\u0010v\u001a\u00020\u00062\b\b\u0002\u0010w\u001a\u00020\n2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010H2\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\n2\b\b\u0002\u0010|\u001a\u00020\u00042\b\b\u0002\u0010}\u001a\u00020\u00062\b\b\u0002\u0010~\u001a\u00020\u00042\b\b\u0002\u0010\u007f\u001a\u00020\n2\t\b\u0002\u0010\u0080\u0001\u001a\u00020'2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0083\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u0084\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u0085\u0001\u001a\u00020\n2\t\b\u0002\u0010\u0086\u0001\u001a\u00020\n2\t\b\u0002\u0010\u0087\u0001\u001a\u00020\n2\t\b\u0002\u0010\u0088\u0001\u001a\u00020\n2\t\b\u0002\u0010\u0089\u0001\u001a\u00020\n2\t\b\u0002\u0010\u008a\u0001\u001a\u00020\n2\t\b\u0002\u0010\u008b\u0001\u001a\u00020\b2\t\b\u0002\u0010\u008c\u0001\u001a\u00020\n2\u000f\b\u0002\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0?2\t\b\u0002\u0010\u008e\u0001\u001a\u00020\n2\t\b\u0002\u0010\u008f\u0001\u001a\u00020\u00062\u000f\b\u0002\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020'0?2\t\b\u0002\u0010\u0091\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0092\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0093\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0094\u0001\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u00042\t\b\u0002\u0010\u0095\u0001\u001a\u00020\n2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u0097\u0001\u001a\u00020\nH\u00c6\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\n\u0010\u009a\u0001\u001a\u00020\u0004H\u00d6\u0001R/\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020'0?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R'\u0010.\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b.\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R)\u0010\u0091\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010 \u0001\u001a\u0006\b¥\u0001\u0010¢\u0001\"\u0006\b¦\u0001\u0010¤\u0001R)\u0010\u008e\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R-\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00160?8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\br\u0010\u009b\u0001\u001a\u0006\b¬\u0001\u0010\u009d\u0001\"\u0006\b\u00ad\u0001\u0010\u009f\u0001R-\u0010s\u001a\b\u0012\u0004\u0012\u00020B0A8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bs\u0010\u009b\u0001\u001a\u0006\b®\u0001\u0010\u009d\u0001\"\u0006\b¯\u0001\u0010\u009f\u0001R'\u0010\u007f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010§\u0001\u001a\u0006\b°\u0001\u0010©\u0001\"\u0006\b±\u0001\u0010«\u0001R'\u0010m\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bm\u0010§\u0001\u001a\u0006\b²\u0001\u0010©\u0001\"\u0006\b³\u0001\u0010«\u0001R'\u0010l\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bl\u0010 \u0001\u001a\u0006\b´\u0001\u0010¢\u0001\"\u0006\bµ\u0001\u0010¤\u0001R)\u0010\u008c\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010§\u0001\u001a\u0006\b¶\u0001\u0010©\u0001\"\u0006\b·\u0001\u0010«\u0001R)\u0010\u0096\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R'\u0010w\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bw\u0010§\u0001\u001a\u0006\b½\u0001\u0010©\u0001\"\u0006\b¾\u0001\u0010«\u0001R)\u0010\u0092\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010 \u0001\u001a\u0006\b¿\u0001\u0010¢\u0001\"\u0006\b\u00c0\u0001\u0010¤\u0001R#\u0010\u00c6\u0001\u001a\u00030\u00c1\u00018F@\u0006X\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u00c2\u0001\u0010\u00c3\u0001\u001a\u0006\b\u00c4\u0001\u0010\u00c5\u0001R)\u0010\u0080\u0001\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u00c7\u0001\u001a\u0006\b\u00c8\u0001\u0010\u00c9\u0001\"\u0006\b\u00ca\u0001\u0010\u00cb\u0001R/\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u009b\u0001\u001a\u0006\b\u00cc\u0001\u0010\u009d\u0001\"\u0006\b\u00cd\u0001\u0010\u009f\u0001R)\u0010\u008f\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010¸\u0001\u001a\u0006\b\u00ce\u0001\u0010º\u0001\"\u0006\b\u00cf\u0001\u0010¼\u0001R'\u0010o\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bo\u0010§\u0001\u001a\u0006\b\u00d0\u0001\u0010©\u0001\"\u0006\b\u00d1\u0001\u0010«\u0001R'\u0010v\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bv\u0010¸\u0001\u001a\u0006\b\u00d2\u0001\u0010º\u0001\"\u0006\b\u00d3\u0001\u0010¼\u0001R)\u0010\u0089\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010§\u0001\u001a\u0006\b\u00d4\u0001\u0010©\u0001\"\u0006\b\u00d5\u0001\u0010«\u0001R)\u0010\u0084\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010¸\u0001\u001a\u0006\b\u00d6\u0001\u0010º\u0001\"\u0006\b\u00d7\u0001\u0010¼\u0001R)\u0010\u008b\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u00d8\u0001\u001a\u0006\b\u00d9\u0001\u0010\u00da\u0001\"\u0006\b\u00db\u0001\u0010\u00dc\u0001R)\u0010\u0085\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010§\u0001\u001a\u0006\b\u00dd\u0001\u0010©\u0001\"\u0006\b\u00de\u0001\u0010«\u0001R(\u0010q\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bq\u0010\u00df\u0001\u001a\u0005\b\u00e0\u0001\u0010>\"\u0006\b\u00e1\u0001\u0010\u00e2\u0001R)\u0010\u0095\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010§\u0001\u001a\u0006\b\u00e3\u0001\u0010©\u0001\"\u0006\b\u00e4\u0001\u0010«\u0001R'\u0010k\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bk\u0010 \u0001\u001a\u0006\b\u00e5\u0001\u0010¢\u0001\"\u0006\b\u00e6\u0001\u0010¤\u0001R'\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u001a\u0010§\u0001\u001a\u0006\b\u00e7\u0001\u0010©\u0001\"\u0006\b\u00e8\u0001\u0010«\u0001R)\u0010\u0088\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010§\u0001\u001a\u0006\b\u00e9\u0001\u0010©\u0001\"\u0006\b\u00ea\u0001\u0010«\u0001R)\u0010p\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bp\u0010\u00d8\u0001\u001a\u0006\b\u00eb\u0001\u0010\u00da\u0001\"\u0006\b\u00ec\u0001\u0010\u00dc\u0001R)\u0010\u0093\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010 \u0001\u001a\u0006\b\u00ed\u0001\u0010¢\u0001\"\u0006\b\u00ee\u0001\u0010¤\u0001R)\u0010\u008a\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010§\u0001\u001a\u0006\b\u00ef\u0001\u0010©\u0001\"\u0006\b\u00f0\u0001\u0010«\u0001R'\u0010n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bn\u0010\u00d8\u0001\u001a\u0006\b\u00f1\u0001\u0010\u00da\u0001\"\u0006\b\u00f2\u0001\u0010\u00dc\u0001R'\u0010z\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bz\u0010 \u0001\u001a\u0006\b\u00f3\u0001\u0010¢\u0001\"\u0006\b\u00f4\u0001\u0010¤\u0001R)\u0010\u0081\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010 \u0001\u001a\u0006\b\u00f5\u0001\u0010¢\u0001\"\u0006\b\u00f6\u0001\u0010¤\u0001R'\u0010}\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b}\u0010¸\u0001\u001a\u0006\b\u00f7\u0001\u0010º\u0001\"\u0006\b\u00f8\u0001\u0010¼\u0001R)\u0010\u0094\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010 \u0001\u001a\u0006\b\u00f9\u0001\u0010¢\u0001\"\u0006\b\u00fa\u0001\u0010¤\u0001R'\u0010~\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b~\u0010 \u0001\u001a\u0006\b\u00fb\u0001\u0010¢\u0001\"\u0006\b\u00fc\u0001\u0010¤\u0001R)\u0010\u0097\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010§\u0001\u001a\u0006\b\u00fd\u0001\u0010©\u0001\"\u0006\b\u00fe\u0001\u0010«\u0001R'\u0010j\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bj\u0010 \u0001\u001a\u0006\b\u00ff\u0001\u0010¢\u0001\"\u0006\b\u0080\u0002\u0010¤\u0001R'\u0010{\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b{\u0010§\u0001\u001a\u0006\b\u0081\u0002\u0010©\u0001\"\u0006\b\u0082\u0002\u0010«\u0001R)\u0010\u0086\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010§\u0001\u001a\u0006\b\u0083\u0002\u0010©\u0001\"\u0006\b\u0084\u0002\u0010«\u0001R)\u0010x\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bx\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002R'\u0010u\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bu\u0010¸\u0001\u001a\u0006\b\u008a\u0002\u0010º\u0001\"\u0006\b\u008b\u0002\u0010¼\u0001R#\u0010\u0090\u0002\u001a\u00030\u008c\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0002\u0010\u00c3\u0001\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R#\u0010\u0095\u0002\u001a\u00030\u0091\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0092\u0002\u0010\u00c3\u0001\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R'\u0010|\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b|\u0010 \u0001\u001a\u0006\b\u0096\u0002\u0010¢\u0001\"\u0006\b\u0097\u0002\u0010¤\u0001R)\u0010\u0082\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010 \u0001\u001a\u0006\b\u0098\u0002\u0010¢\u0001\"\u0006\b\u0099\u0002\u0010¤\u0001R-\u0010t\u001a\b\u0012\u0004\u0012\u00020\n0A8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bt\u0010\u009b\u0001\u001a\u0006\b\u009a\u0002\u0010\u009d\u0001\"\u0006\b\u009b\u0002\u0010\u009f\u0001R)\u0010\u0087\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010§\u0001\u001a\u0006\b\u009c\u0002\u0010©\u0001\"\u0006\b\u009d\u0002\u0010«\u0001R'\u0010y\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\by\u0010 \u0001\u001a\u0006\b\u009e\u0002\u0010¢\u0001\"\u0006\b\u009f\u0002\u0010¤\u0001R)\u0010\u0083\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010¸\u0001\u001a\u0006\b \u0002\u0010º\u0001\"\u0006\b¡\u0002\u0010¼\u0001R#\u0010¦\u0002\u001a\u00030¢\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b£\u0002\u0010\u00c3\u0001\u001a\u0006\b¤\u0002\u0010¥\u0002¨\u0006©\u0002" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/Profile;", "Lcom/untis/mobile/persistence/models/Displayable;", "Lkotlin/j2;", "updateUrls", "", "getUniqueId", "", "hasEntity", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "", "getEntityId", "isAnonymousUser", "isDemoUser", "", "Lcom/untis/mobile/persistence/models/profile/ProfileState;", "state", "hasAnyState", "([Lcom/untis/mobile/persistence/models/profile/ProfileState;)Z", "types", "hasAnyRole", "([Lcom/untis/mobile/persistence/models/EntityType;)Z", "Lcom/untis/mobile/persistence/models/profile/Right;", "rights", "hasAnyRight", "([Lcom/untis/mobile/persistence/models/profile/Right;)Z", "id", "hasChild", "getWuUrl", "getServerUrl", "suffix", "getWuRestApiUrl", "getSpUrl", "getDisplayName", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "createTimeTableEntity", "isPremium", "getDisplayableTitle", "getDisplayableDescription", "", "getDisplayableTextColor", "getDisplayableBackColor", "", "other", "equals", "hashCode", "authenticationToken", "updateAuthenticationToken", "getWssUrl", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "createAuthenticationToken", "isEndOfPremium", "isAfterEndOfPremium", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Long;", "", "component10", "", "Lcom/untis/mobile/persistence/models/profile/Child;", "component11", "component12", "component13", "component14", "component15", "Lorg/joda/time/t;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "userLogin", "userDisplayName", "userAppSharedSecret", "userDepartmentId", "userOriginalEntityType", "userOriginalEntityId", "userCustomEntityType", "userCustomEntityId", "userRights", "userChildren", "userClasses", "userHasTimeTableAccess", "userPremium", "userId", "userPremiumEnd", "schoolLogin", "schoolDisplayName", "schoolId", "schoolServerUrl", "schoolUseMobileService", "schoolMobileServiceUrl", "schoolServerDelta", "schoolApiVersion", "schoolSemanticWuVersion", "schoolSemanticApiVersion", "usable", "updated", "periodDataTimestamp", "masterDataTimestamp", "officeHourTimestamp", "parentDayTimestamp", "messagesOfDayTimestamp", "widgetTimestamp", "lastViewedEntityType", "lastViewedEntityId", "states", "serverDownTimestamp", "lockScreen", "lockScreenIds", "messengerServerUrl", "messengerOrganizationId", "substitutionPlanningUrl", "registrationUrl", "infoCenterTimestamp", "showCalendarDetails", "registered", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/untis/mobile/persistence/models/EntityType;JLcom/untis/mobile/persistence/models/EntityType;Ljava/lang/Long;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZJLorg/joda/time/t;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;JILjava/lang/String;Ljava/lang/String;ZZJJJJJJLcom/untis/mobile/persistence/models/EntityType;JLjava/util/Set;JZLjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZJ)Lcom/untis/mobile/persistence/models/profile/Profile;", "toString", "Ljava/util/Set;", "getLockScreenIds", "()Ljava/util/Set;", "setLockScreenIds", "(Ljava/util/Set;)V", "Ljava/lang/String;", "getAuthenticationToken", "()Ljava/lang/String;", "setAuthenticationToken", "(Ljava/lang/String;)V", "getMessengerServerUrl", "setMessengerServerUrl", "J", "getServerDownTimestamp", "()J", "setServerDownTimestamp", "(J)V", "getUserRights", "setUserRights", "getUserChildren", "setUserChildren", "getSchoolServerDelta", "setSchoolServerDelta", "getUserDepartmentId", "setUserDepartmentId", "getUserAppSharedSecret", "setUserAppSharedSecret", "getLastViewedEntityId", "setLastViewedEntityId", "Z", "getShowCalendarDetails", "()Z", "setShowCalendarDetails", "(Z)V", "getUserId", "setUserId", "getMessengerOrganizationId", "setMessengerOrganizationId", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService$delegate", "Lkotlin/b0;", "getMasterDataService", "()Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "I", "getSchoolApiVersion", "()I", "setSchoolApiVersion", "(I)V", "getStates", "setStates", "getLockScreen", "setLockScreen", "getUserOriginalEntityId", "setUserOriginalEntityId", "getUserPremium", "setUserPremium", "getMessagesOfDayTimestamp", "setMessagesOfDayTimestamp", "getUpdated", "setUpdated", "Lcom/untis/mobile/persistence/models/EntityType;", "getLastViewedEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setLastViewedEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "getPeriodDataTimestamp", "setPeriodDataTimestamp", "Ljava/lang/Long;", "getUserCustomEntityId", "setUserCustomEntityId", "(Ljava/lang/Long;)V", "getInfoCenterTimestamp", "setInfoCenterTimestamp", "getUserDisplayName", "setUserDisplayName", "getId", "setId", "getParentDayTimestamp", "setParentDayTimestamp", "getUserCustomEntityType", "setUserCustomEntityType", "getSubstitutionPlanningUrl", "setSubstitutionPlanningUrl", "getWidgetTimestamp", "setWidgetTimestamp", "getUserOriginalEntityType", "setUserOriginalEntityType", "getSchoolDisplayName", "setSchoolDisplayName", "getSchoolSemanticWuVersion", "setSchoolSemanticWuVersion", "getSchoolUseMobileService", "setSchoolUseMobileService", "getRegistrationUrl", "setRegistrationUrl", "getSchoolMobileServiceUrl", "setSchoolMobileServiceUrl", "getRegistered", "setRegistered", "getUserLogin", "setUserLogin", "getSchoolId", "setSchoolId", "getMasterDataTimestamp", "setMasterDataTimestamp", "Lorg/joda/time/t;", "getUserPremiumEnd", "()Lorg/joda/time/t;", "setUserPremiumEnd", "(Lorg/joda/time/t;)V", "getUserHasTimeTableAccess", "setUserHasTimeTableAccess", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService$delegate", "getTimeTableService", "()Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/services/classbook/a;", "classBookService$delegate", "getClassBookService", "()Lcom/untis/mobile/services/classbook/a;", "classBookService", "getSchoolServerUrl", "setSchoolServerUrl", "getSchoolSemanticApiVersion", "setSchoolSemanticApiVersion", "getUserClasses", "setUserClasses", "getOfficeHourTimestamp", "setOfficeHourTimestamp", "getSchoolLogin", "setSchoolLogin", "getUsable", "setUsable", "Lcom/untis/mobile/services/booking/a;", "bookingService$delegate", "getBookingService", "()Lcom/untis/mobile/services/booking/a;", "bookingService", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/untis/mobile/persistence/models/EntityType;JLcom/untis/mobile/persistence/models/EntityType;Ljava/lang/Long;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZJLorg/joda/time/t;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;JILjava/lang/String;Ljava/lang/String;ZZJJJJJJLcom/untis/mobile/persistence/models/EntityType;JLjava/util/Set;JZLjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Profile implements Displayable
{
    @e
    private String authenticationToken;
    @e
    private final b0 bookingService$delegate;
    @e
    private final b0 classBookService$delegate;
    private long id;
    private long infoCenterTimestamp;
    private long lastViewedEntityId;
    @e
    private EntityType lastViewedEntityType;
    private boolean lockScreen;
    @e
    private Set<Integer> lockScreenIds;
    @e
    private final b0 masterDataService$delegate;
    private long masterDataTimestamp;
    private long messagesOfDayTimestamp;
    @e
    private String messengerOrganizationId;
    @e
    private String messengerServerUrl;
    private long officeHourTimestamp;
    private long parentDayTimestamp;
    private long periodDataTimestamp;
    private long registered;
    @e
    private String registrationUrl;
    private int schoolApiVersion;
    @e
    private String schoolDisplayName;
    private long schoolId;
    @e
    private String schoolLogin;
    @e
    private String schoolMobileServiceUrl;
    @e
    private String schoolSemanticApiVersion;
    @e
    private String schoolSemanticWuVersion;
    private long schoolServerDelta;
    @e
    private String schoolServerUrl;
    private boolean schoolUseMobileService;
    private long serverDownTimestamp;
    private boolean showCalendarDetails;
    @e
    private Set<ProfileState> states;
    @e
    private String substitutionPlanningUrl;
    @e
    private final b0 timeTableService$delegate;
    private boolean updated;
    private boolean usable;
    @e
    private String userAppSharedSecret;
    @e
    private Set<Child> userChildren;
    @e
    private Set<Long> userClasses;
    @f
    private Long userCustomEntityId;
    @f
    private EntityType userCustomEntityType;
    private long userDepartmentId;
    @e
    private String userDisplayName;
    private boolean userHasTimeTableAccess;
    private long userId;
    @e
    private String userLogin;
    private long userOriginalEntityId;
    @e
    private EntityType userOriginalEntityType;
    private boolean userPremium;
    @JsonAdapter(d.class)
    @f
    private t userPremiumEnd;
    @e
    private Set<Right> userRights;
    private long widgetTimestamp;
    
    public Profile() {
        this(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
    }
    
    public Profile(final long id, @e final String userLogin, @e final String userDisplayName, @e final String userAppSharedSecret, final long userDepartmentId, @e final EntityType userOriginalEntityType, final long userOriginalEntityId, @f final EntityType userCustomEntityType, @f final Long userCustomEntityId, @e final Set<Right> userRights, @e final Set<Child> userChildren, @e final Set<Long> userClasses, final boolean userHasTimeTableAccess, final boolean userPremium, final long userId, @f final t userPremiumEnd, @e final String schoolLogin, @e final String schoolDisplayName, final long schoolId, @e final String schoolServerUrl, final boolean schoolUseMobileService, @e final String schoolMobileServiceUrl, final long schoolServerDelta, final int schoolApiVersion, @e final String schoolSemanticWuVersion, @e final String schoolSemanticApiVersion, final boolean usable, final boolean updated, final long periodDataTimestamp, final long masterDataTimestamp, final long officeHourTimestamp, final long parentDayTimestamp, final long messagesOfDayTimestamp, final long widgetTimestamp, @e final EntityType lastViewedEntityType, final long lastViewedEntityId, @e final Set<ProfileState> states, final long serverDownTimestamp, final boolean lockScreen, @e final Set<Integer> lockScreenIds, @e final String messengerServerUrl, @e final String messengerOrganizationId, @e final String substitutionPlanningUrl, @e final String registrationUrl, @e final String authenticationToken, final long infoCenterTimestamp, final boolean showCalendarDetails, final long registered) {
        k0.p(userLogin, "userLogin");
        k0.p(userDisplayName, "userDisplayName");
        k0.p(userAppSharedSecret, "userAppSharedSecret");
        k0.p(userOriginalEntityType, "userOriginalEntityType");
        k0.p(userRights, "userRights");
        k0.p(userChildren, "userChildren");
        k0.p(userClasses, "userClasses");
        k0.p(schoolLogin, "schoolLogin");
        k0.p(schoolDisplayName, "schoolDisplayName");
        k0.p(schoolServerUrl, "schoolServerUrl");
        k0.p(schoolMobileServiceUrl, "schoolMobileServiceUrl");
        k0.p(schoolSemanticWuVersion, "schoolSemanticWuVersion");
        k0.p(schoolSemanticApiVersion, "schoolSemanticApiVersion");
        k0.p(lastViewedEntityType, "lastViewedEntityType");
        k0.p(states, "states");
        k0.p(lockScreenIds, "lockScreenIds");
        k0.p(messengerServerUrl, "messengerServerUrl");
        k0.p(messengerOrganizationId, "messengerOrganizationId");
        k0.p(substitutionPlanningUrl, "substitutionPlanningUrl");
        k0.p(registrationUrl, "registrationUrl");
        k0.p(authenticationToken, "authenticationToken");
        this.id = id;
        this.userLogin = userLogin;
        this.userDisplayName = userDisplayName;
        this.userAppSharedSecret = userAppSharedSecret;
        this.userDepartmentId = userDepartmentId;
        this.userOriginalEntityType = userOriginalEntityType;
        this.userOriginalEntityId = userOriginalEntityId;
        this.userCustomEntityType = userCustomEntityType;
        this.userCustomEntityId = userCustomEntityId;
        this.userRights = userRights;
        this.userChildren = userChildren;
        this.userClasses = userClasses;
        this.userHasTimeTableAccess = userHasTimeTableAccess;
        this.userPremium = userPremium;
        this.userId = userId;
        this.userPremiumEnd = userPremiumEnd;
        this.schoolLogin = schoolLogin;
        this.schoolDisplayName = schoolDisplayName;
        this.schoolId = schoolId;
        this.schoolServerUrl = schoolServerUrl;
        this.schoolUseMobileService = schoolUseMobileService;
        this.schoolMobileServiceUrl = schoolMobileServiceUrl;
        this.schoolServerDelta = schoolServerDelta;
        this.schoolApiVersion = schoolApiVersion;
        this.schoolSemanticWuVersion = schoolSemanticWuVersion;
        this.schoolSemanticApiVersion = schoolSemanticApiVersion;
        this.usable = usable;
        this.updated = updated;
        this.periodDataTimestamp = periodDataTimestamp;
        this.masterDataTimestamp = masterDataTimestamp;
        this.officeHourTimestamp = officeHourTimestamp;
        this.parentDayTimestamp = parentDayTimestamp;
        this.messagesOfDayTimestamp = messagesOfDayTimestamp;
        this.widgetTimestamp = widgetTimestamp;
        this.lastViewedEntityType = lastViewedEntityType;
        this.lastViewedEntityId = lastViewedEntityId;
        this.states = states;
        this.serverDownTimestamp = serverDownTimestamp;
        this.lockScreen = lockScreen;
        this.lockScreenIds = lockScreenIds;
        this.messengerServerUrl = messengerServerUrl;
        this.messengerOrganizationId = messengerOrganizationId;
        this.substitutionPlanningUrl = substitutionPlanningUrl;
        this.registrationUrl = registrationUrl;
        this.authenticationToken = authenticationToken;
        this.infoCenterTimestamp = infoCenterTimestamp;
        this.showCalendarDetails = showCalendarDetails;
        this.registered = registered;
        this.masterDataService$delegate = d0.c((a<?>)new Profile$masterDataService.Profile$masterDataService$2(this));
        this.timeTableService$delegate = d0.c((a<?>)new Profile$timeTableService.Profile$timeTableService$2(this));
        this.classBookService$delegate = d0.c((a<?>)new Profile$classBookService.Profile$classBookService$2(this));
        this.bookingService$delegate = d0.c((a<?>)new Profile$bookingService.Profile$bookingService$2(this));
        this.updateUrls();
    }
    
    private final void updateUrls() {
        String registrationUrl;
        if (s.S2((CharSequence)this.schoolServerUrl, (CharSequence)"nightly", true)) {
            this.substitutionPlanningUrl = "https://substitution.nightly.webuntis.com";
            registrationUrl = "https://push.nightly.webuntis.com";
        }
        else if (s.S2((CharSequence)this.schoolServerUrl, (CharSequence)"staging", true)) {
            this.substitutionPlanningUrl = "https://substitution.staging.webuntis.com";
            registrationUrl = "https://push.staging.webuntis.com";
        }
        else if (s.S2((CharSequence)this.schoolServerUrl, (CharSequence)"beta.webuntis", true)) {
            this.substitutionPlanningUrl = "https://substitution-beta.webuntis.com";
            registrationUrl = "https://push-beta.webuntis.com";
        }
        else {
            this.substitutionPlanningUrl = "https://substitution.webuntis.com";
            registrationUrl = "https://push.webuntis.com";
        }
        this.registrationUrl = registrationUrl;
    }
    
    public final long component1() {
        return this.id;
    }
    
    @e
    public final Set<Right> component10() {
        return this.userRights;
    }
    
    @e
    public final Set<Child> component11() {
        return this.userChildren;
    }
    
    @e
    public final Set<Long> component12() {
        return this.userClasses;
    }
    
    public final boolean component13() {
        return this.userHasTimeTableAccess;
    }
    
    public final boolean component14() {
        return this.userPremium;
    }
    
    public final long component15() {
        return this.userId;
    }
    
    @f
    public final t component16() {
        return this.userPremiumEnd;
    }
    
    @e
    public final String component17() {
        return this.schoolLogin;
    }
    
    @e
    public final String component18() {
        return this.schoolDisplayName;
    }
    
    public final long component19() {
        return this.schoolId;
    }
    
    @e
    public final String component2() {
        return this.userLogin;
    }
    
    @e
    public final String component20() {
        return this.schoolServerUrl;
    }
    
    public final boolean component21() {
        return this.schoolUseMobileService;
    }
    
    @e
    public final String component22() {
        return this.schoolMobileServiceUrl;
    }
    
    public final long component23() {
        return this.schoolServerDelta;
    }
    
    public final int component24() {
        return this.schoolApiVersion;
    }
    
    @e
    public final String component25() {
        return this.schoolSemanticWuVersion;
    }
    
    @e
    public final String component26() {
        return this.schoolSemanticApiVersion;
    }
    
    public final boolean component27() {
        return this.usable;
    }
    
    public final boolean component28() {
        return this.updated;
    }
    
    public final long component29() {
        return this.periodDataTimestamp;
    }
    
    @e
    public final String component3() {
        return this.userDisplayName;
    }
    
    public final long component30() {
        return this.masterDataTimestamp;
    }
    
    public final long component31() {
        return this.officeHourTimestamp;
    }
    
    public final long component32() {
        return this.parentDayTimestamp;
    }
    
    public final long component33() {
        return this.messagesOfDayTimestamp;
    }
    
    public final long component34() {
        return this.widgetTimestamp;
    }
    
    @e
    public final EntityType component35() {
        return this.lastViewedEntityType;
    }
    
    public final long component36() {
        return this.lastViewedEntityId;
    }
    
    @e
    public final Set<ProfileState> component37() {
        return this.states;
    }
    
    public final long component38() {
        return this.serverDownTimestamp;
    }
    
    public final boolean component39() {
        return this.lockScreen;
    }
    
    @e
    public final String component4() {
        return this.userAppSharedSecret;
    }
    
    @e
    public final Set<Integer> component40() {
        return this.lockScreenIds;
    }
    
    @e
    public final String component41() {
        return this.messengerServerUrl;
    }
    
    @e
    public final String component42() {
        return this.messengerOrganizationId;
    }
    
    @e
    public final String component43() {
        return this.substitutionPlanningUrl;
    }
    
    @e
    public final String component44() {
        return this.registrationUrl;
    }
    
    @e
    public final String component45() {
        return this.authenticationToken;
    }
    
    public final long component46() {
        return this.infoCenterTimestamp;
    }
    
    public final boolean component47() {
        return this.showCalendarDetails;
    }
    
    public final long component48() {
        return this.registered;
    }
    
    public final long component5() {
        return this.userDepartmentId;
    }
    
    @e
    public final EntityType component6() {
        return this.userOriginalEntityType;
    }
    
    public final long component7() {
        return this.userOriginalEntityId;
    }
    
    @f
    public final EntityType component8() {
        return this.userCustomEntityType;
    }
    
    @f
    public final Long component9() {
        return this.userCustomEntityId;
    }
    
    @e
    public final Profile copy(final long n, @e final String s, @e final String s2, @e final String s3, final long n2, @e final EntityType entityType, final long n3, @f final EntityType entityType2, @f final Long n4, @e final Set<Right> set, @e final Set<Child> set2, @e final Set<Long> set3, final boolean b, final boolean b2, final long n5, @f final t t, @e final String s4, @e final String s5, final long n6, @e final String s6, final boolean b3, @e final String s7, final long n7, final int n8, @e final String s8, @e final String s9, final boolean b4, final boolean b5, final long n9, final long n10, final long n11, final long n12, final long n13, final long n14, @e final EntityType entityType3, final long n15, @e final Set<ProfileState> set4, final long n16, final boolean b6, @e final Set<Integer> set5, @e final String s10, @e final String s11, @e final String s12, @e final String s13, @e final String s14, final long n17, final boolean b7, final long n18) {
        k0.p(s, "userLogin");
        k0.p(s2, "userDisplayName");
        k0.p(s3, "userAppSharedSecret");
        k0.p(entityType, "userOriginalEntityType");
        k0.p(set, "userRights");
        k0.p(set2, "userChildren");
        k0.p(set3, "userClasses");
        k0.p(s4, "schoolLogin");
        k0.p(s5, "schoolDisplayName");
        k0.p(s6, "schoolServerUrl");
        k0.p(s7, "schoolMobileServiceUrl");
        k0.p(s8, "schoolSemanticWuVersion");
        k0.p(s9, "schoolSemanticApiVersion");
        k0.p(entityType3, "lastViewedEntityType");
        k0.p(set4, "states");
        k0.p(set5, "lockScreenIds");
        k0.p(s10, "messengerServerUrl");
        k0.p(s11, "messengerOrganizationId");
        k0.p(s12, "substitutionPlanningUrl");
        k0.p(s13, "registrationUrl");
        k0.p(s14, "authenticationToken");
        return new Profile(n, s, s2, s3, n2, entityType, n3, entityType2, n4, set, set2, set3, b, b2, n5, t, s4, s5, n6, s6, b3, s7, n7, n8, s8, s9, b4, b5, n9, n10, n11, n12, n13, n14, entityType3, n15, set4, n16, b6, set5, s10, s11, s12, s13, s14, n17, b7, n18);
    }
    
    @e
    public final UMAuthenticationToken createAuthenticationToken() {
        final UMAuthenticationToken umAuthenticationToken = new UMAuthenticationToken();
        umAuthenticationToken.user = this.userLogin;
        final long clientTime = System.currentTimeMillis() + this.schoolServerDelta;
        umAuthenticationToken.clientTime = clientTime;
        umAuthenticationToken.otp = r0.a(clientTime, this.userAppSharedSecret);
        return umAuthenticationToken;
    }
    
    @e
    public final TimeTableEntity createTimeTableEntity() {
        EntityType entityType = this.lastViewedEntityType;
        final long lastViewedEntityId = this.lastViewedEntityId;
        final EntityType none = EntityType.NONE;
        EntityType userCustomEntityType = entityType;
        long n = lastViewedEntityId;
        if (entityType == none) {
            n = lastViewedEntityId;
            if (this.userHasTimeTableAccess) {
                entityType = this.userOriginalEntityType;
                n = this.userOriginalEntityId;
            }
            if ((userCustomEntityType = entityType) == none) {
                if ((userCustomEntityType = this.userCustomEntityType) == null) {
                    userCustomEntityType = none;
                }
                final Long userCustomEntityId = this.userCustomEntityId;
                if (userCustomEntityId == null) {
                    n = 0L;
                }
                else {
                    n = userCustomEntityId;
                }
            }
        }
        return new TimeTableEntity(userCustomEntityType, n, false, 0, 0L, null, 60, null);
    }
    
    @Override
    public boolean equals(@f final Object obj) {
        if (this == obj) {
            return true;
        }
        Object class1;
        if (obj == null) {
            class1 = null;
        }
        else {
            class1 = obj.getClass();
        }
        if (!k0.g(Profile.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.profile.Profile");
        final Profile profile = (Profile)obj;
        return k0.g(this.userLogin, profile.userLogin) && k0.g(this.schoolLogin, profile.schoolLogin);
    }
    
    @e
    public final String getAuthenticationToken() {
        return this.authenticationToken;
    }
    
    @e
    public final com.untis.mobile.services.booking.a getBookingService() {
        return this.bookingService$delegate.getValue();
    }
    
    @e
    public final com.untis.mobile.services.classbook.a getClassBookService() {
        return this.classBookService$delegate.getValue();
    }
    
    @e
    public final String getDisplayName() {
        final boolean hasAnyRole = this.hasAnyRole(EntityType.CLASS);
        String displayName = null;
        final String s = null;
        String s2 = null;
        Label_0242: {
            if (hasAnyRole) {
                final Klasse n = this.getMasterDataService().N(this.getEntityId());
                String displayName2;
                if (n == null) {
                    displayName2 = s;
                }
                else {
                    displayName2 = n.getDisplayName();
                }
                s2 = displayName2;
                if (displayName2 != null) {
                    break Label_0242;
                }
            }
            else {
                final EntityType teacher = EntityType.TEACHER;
                if (this.hasAnyRole(teacher) && this.userOriginalEntityType != teacher) {
                    final Teacher k = this.getMasterDataService().k(this.getEntityId());
                    if (k != null) {
                        displayName = k.getDisplayName();
                    }
                    s2 = displayName;
                    if (displayName != null) {
                        break Label_0242;
                    }
                }
                else {
                    if (this.hasAnyRole(teacher) && this.userOriginalEntityType == teacher) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(this.userDisplayName);
                        sb.append(" (");
                        sb.append(this.userLogin);
                        sb.append(')');
                        s2 = sb.toString();
                        break Label_0242;
                    }
                    if (this.isAnonymousUser()) {
                        final UntisMobileApplication b = UntisMobileApplication.I.b();
                        if (b != null) {
                            s2 = ((Application)b).getString(2131886345);
                            if (s2 != null) {
                                break Label_0242;
                            }
                        }
                        s2 = "anonym";
                        break Label_0242;
                    }
                }
            }
            s2 = this.userDisplayName;
        }
        final UntisMobileApplication.a i = UntisMobileApplication.I;
        final UntisMobileApplication b2 = i.b();
        String string = null;
        Label_0279: {
            if (b2 != null) {
                string = ((Application)b2).getString(2131886345);
                if (string != null) {
                    break Label_0279;
                }
            }
            string = "anonym";
        }
        final String k2 = kotlin.text.s.k2(s2, "#anonymous#", string, false, 4, (Object)null);
        final UntisMobileApplication b3 = i.b();
        if (b3 != null) {
            final String string2 = ((Application)b3).getString(2131886345);
            if (string2 != null) {
                return kotlin.text.s.k2(k2, "IDC_ANONYMOUSUSER", string2, false, 4, (Object)null);
            }
        }
        final String string2 = "anonym";
        return kotlin.text.s.k2(k2, "IDC_ANONYMOUSUSER", string2, false, 4, (Object)null);
    }
    
    @Override
    public int getDisplayableBackColor() {
        return 0;
    }
    
    @e
    @Override
    public String getDisplayableDescription() {
        final String schoolDisplayName = this.schoolDisplayName;
        Objects.requireNonNull(schoolDisplayName, "null cannot be cast to non-null type kotlin.CharSequence");
        String s;
        if (kotlin.text.s.U1((CharSequence)(s = kotlin.text.s.B5((CharSequence)schoolDisplayName).toString()))) {
            s = this.schoolLogin;
        }
        return s;
    }
    
    @Override
    public int getDisplayableTextColor() {
        return 0;
    }
    
    @e
    @Override
    public String getDisplayableTitle() {
        final String displayName = this.getDisplayName();
        Objects.requireNonNull(displayName, "null cannot be cast to non-null type kotlin.CharSequence");
        return s.B5((CharSequence)displayName).toString();
    }
    
    public final long getEntityId() {
        final Long userCustomEntityId = this.userCustomEntityId;
        long n;
        if (userCustomEntityId == null) {
            n = this.userOriginalEntityId;
        }
        else {
            n = userCustomEntityId;
        }
        return n;
    }
    
    @e
    public final EntityType getEntityType() {
        EntityType entityType;
        if ((entityType = this.userCustomEntityType) == null) {
            entityType = this.userOriginalEntityType;
        }
        return entityType;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getInfoCenterTimestamp() {
        return this.infoCenterTimestamp;
    }
    
    public final long getLastViewedEntityId() {
        return this.lastViewedEntityId;
    }
    
    @e
    public final EntityType getLastViewedEntityType() {
        return this.lastViewedEntityType;
    }
    
    public final boolean getLockScreen() {
        return this.lockScreen;
    }
    
    @e
    public final Set<Integer> getLockScreenIds() {
        return this.lockScreenIds;
    }
    
    @e
    public final com.untis.mobile.services.masterdata.a getMasterDataService() {
        return this.masterDataService$delegate.getValue();
    }
    
    public final long getMasterDataTimestamp() {
        return this.masterDataTimestamp;
    }
    
    public final long getMessagesOfDayTimestamp() {
        return this.messagesOfDayTimestamp;
    }
    
    @e
    public final String getMessengerOrganizationId() {
        return this.messengerOrganizationId;
    }
    
    @e
    public final String getMessengerServerUrl() {
        return this.messengerServerUrl;
    }
    
    public final long getOfficeHourTimestamp() {
        return this.officeHourTimestamp;
    }
    
    public final long getParentDayTimestamp() {
        return this.parentDayTimestamp;
    }
    
    public final long getPeriodDataTimestamp() {
        return this.periodDataTimestamp;
    }
    
    public final long getRegistered() {
        return this.registered;
    }
    
    @e
    public final String getRegistrationUrl() {
        return this.registrationUrl;
    }
    
    public final int getSchoolApiVersion() {
        return this.schoolApiVersion;
    }
    
    @e
    public final String getSchoolDisplayName() {
        return this.schoolDisplayName;
    }
    
    public final long getSchoolId() {
        return this.schoolId;
    }
    
    @e
    public final String getSchoolLogin() {
        return this.schoolLogin;
    }
    
    @e
    public final String getSchoolMobileServiceUrl() {
        return this.schoolMobileServiceUrl;
    }
    
    @e
    public final String getSchoolSemanticApiVersion() {
        return this.schoolSemanticApiVersion;
    }
    
    @e
    public final String getSchoolSemanticWuVersion() {
        return this.schoolSemanticWuVersion;
    }
    
    public final long getSchoolServerDelta() {
        return this.schoolServerDelta;
    }
    
    @e
    public final String getSchoolServerUrl() {
        return this.schoolServerUrl;
    }
    
    public final boolean getSchoolUseMobileService() {
        return this.schoolUseMobileService;
    }
    
    public final long getServerDownTimestamp() {
        return this.serverDownTimestamp;
    }
    
    @e
    public final String getServerUrl() {
        if (s.u2(this.schoolServerUrl, "debug", false, 2, (Object)null)) {
            final String schoolServerUrl = this.schoolServerUrl;
            Objects.requireNonNull(schoolServerUrl, "null cannot be cast to non-null type java.lang.String");
            final String substring = schoolServerUrl.substring(5);
            k0.o(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        if (s.u2(this.schoolServerUrl, "http", false, 2, (Object)null)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.schoolServerUrl);
            sb.append("/WebUntis/jsonrpc_intern.do?school=");
            sb.append((Object)URLEncoder.encode(this.schoolLogin, "UTF-8"));
            sb.append("&v=a5.1.0");
            return sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("https://");
        sb2.append(this.schoolServerUrl);
        sb2.append("/WebUntis/jsonrpc_intern.do?school=");
        sb2.append((Object)URLEncoder.encode(this.schoolLogin, "UTF-8"));
        sb2.append("&v=a5.1.0");
        return sb2.toString();
    }
    
    public final boolean getShowCalendarDetails() {
        return this.showCalendarDetails;
    }
    
    @e
    public final String getSpUrl(@e final String str) {
        k0.p(str, "suffix");
        StringBuilder sb;
        if (s.u2(this.substitutionPlanningUrl, "http", false, 2, (Object)null)) {
            sb = new StringBuilder();
        }
        else {
            sb = new StringBuilder();
            sb.append("https://");
        }
        sb.append(this.substitutionPlanningUrl);
        sb.append("/api/");
        sb.append(str);
        return sb.toString();
    }
    
    @e
    public final Set<ProfileState> getStates() {
        return this.states;
    }
    
    @e
    public final String getSubstitutionPlanningUrl() {
        return this.substitutionPlanningUrl;
    }
    
    @e
    public final k getTimeTableService() {
        return this.timeTableService$delegate.getValue();
    }
    
    @e
    public final String getUniqueId() {
        return k0.C(this.userLogin, this.schoolLogin);
    }
    
    public final boolean getUpdated() {
        return this.updated;
    }
    
    public final boolean getUsable() {
        return this.usable;
    }
    
    @e
    public final String getUserAppSharedSecret() {
        return this.userAppSharedSecret;
    }
    
    @e
    public final Set<Child> getUserChildren() {
        return this.userChildren;
    }
    
    @e
    public final Set<Long> getUserClasses() {
        return this.userClasses;
    }
    
    @f
    public final Long getUserCustomEntityId() {
        return this.userCustomEntityId;
    }
    
    @f
    public final EntityType getUserCustomEntityType() {
        return this.userCustomEntityType;
    }
    
    public final long getUserDepartmentId() {
        return this.userDepartmentId;
    }
    
    @e
    public final String getUserDisplayName() {
        return this.userDisplayName;
    }
    
    public final boolean getUserHasTimeTableAccess() {
        return this.userHasTimeTableAccess;
    }
    
    public final long getUserId() {
        return this.userId;
    }
    
    @e
    public final String getUserLogin() {
        return this.userLogin;
    }
    
    public final long getUserOriginalEntityId() {
        return this.userOriginalEntityId;
    }
    
    @e
    public final EntityType getUserOriginalEntityType() {
        return this.userOriginalEntityType;
    }
    
    public final boolean getUserPremium() {
        return this.userPremium;
    }
    
    @f
    public final t getUserPremiumEnd() {
        return this.userPremiumEnd;
    }
    
    @e
    public final Set<Right> getUserRights() {
        return this.userRights;
    }
    
    public final long getWidgetTimestamp() {
        return this.widgetTimestamp;
    }
    
    @e
    public final String getWssUrl() {
        if (s.S2((CharSequence)this.schoolServerUrl, (CharSequence)"nightly", true)) {
            return "wss://events.nightly.webuntis.com";
        }
        if (s.S2((CharSequence)this.schoolServerUrl, (CharSequence)"staging", true)) {
            return "wss://events.staging.webuntis.com";
        }
        if (s.S2((CharSequence)this.schoolServerUrl, (CharSequence)"beta.webuntis", true)) {
            return "wss://events-beta.webuntis.com";
        }
        return "wss://events.webuntis.com";
    }
    
    @e
    public final String getWuRestApiUrl(@e final String str) {
        k0.p(str, "suffix");
        StringBuilder sb;
        if (s.u2(this.schoolServerUrl, "http", false, 2, (Object)null)) {
            sb = new StringBuilder();
        }
        else {
            sb = new StringBuilder();
            sb.append("https://");
        }
        sb.append(this.schoolServerUrl);
        sb.append("/WebUntis/api/rest/");
        sb.append(str);
        return sb.toString();
    }
    
    @e
    public final String getWuUrl() {
        if (s.u2(this.schoolServerUrl, "debug", false, 2, (Object)null)) {
            final String schoolServerUrl = this.schoolServerUrl;
            Objects.requireNonNull(schoolServerUrl, "null cannot be cast to non-null type java.lang.String");
            final String substring = schoolServerUrl.substring(5);
            k0.o(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        if (s.u2(this.schoolServerUrl, "http", false, 2, (Object)null)) {
            return k0.C(this.schoolServerUrl, "/WebUntis/jsonrpc_intern.do");
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(this.schoolServerUrl);
        sb.append("/WebUntis/jsonrpc_intern.do");
        return sb.toString();
    }
    
    public final boolean hasAnyRight(@e final Right... array) {
        k0.p(array, "rights");
        final int length = array.length;
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= length) {
                break;
            }
            if (this.getUserRights().contains(array[n])) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public final boolean hasAnyRole(@e final EntityType... array) {
        k0.p(array, "types");
        return m.P7(array, this.getEntityType());
    }
    
    public final boolean hasAnyState(@e final ProfileState... array) {
        k0.p(array, "state");
        final Set<ProfileState> states = this.states;
        final boolean b = states instanceof Collection;
        final boolean b2 = false;
        boolean b3;
        if (b && states.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator<T> iterator = states.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (!m.P7(array, iterator.next()));
            b3 = true;
        }
        return b3;
    }
    
    public final boolean hasChild(final long n) {
        final Iterator<Object> iterator = this.userChildren.iterator();
        while (true) {
            Child next;
            do {
                final boolean hasNext = iterator.hasNext();
                boolean b = true;
                if (!hasNext) {
                    next = null;
                    if (next == null) {
                        b = false;
                    }
                    return b;
                }
                next = iterator.next();
            } while (next.getId() != n);
            continue;
        }
    }
    
    public final boolean hasEntity() {
        return true ^ this.hasAnyRole(EntityType.NONE);
    }
    
    @Override
    public int hashCode() {
        return this.userLogin.hashCode() * 31 + this.schoolLogin.hashCode();
    }
    
    public final boolean isAfterEndOfPremium() {
        return ((org.joda.time.base.e)new t()).m((n0)new t(2021, 7, 31));
    }
    
    public final boolean isAnonymousUser() {
        return k0.g("IDC_ANONYMOUSUSER", this.userLogin) || k0.g("#anonymous#", this.userLogin);
    }
    
    public final boolean isDemoUser() {
        return k0.g("herodemomobile", this.getUniqueId());
    }
    
    public final boolean isEndOfPremium() {
        return com.untis.mobile.utils.d0.d(new t(), new t(2021, 7, 31));
    }
    
    public final boolean isPremium() {
        if (!this.userPremium) {
            return false;
        }
        final t userPremiumEnd = this.userPremiumEnd;
        return userPremiumEnd == null || ((org.joda.time.base.e)userPremiumEnd).m((n0)com.untis.mobile.utils.time.a.a().U0((int)this.schoolServerDelta).s0(1).h1());
    }
    
    public final void setAuthenticationToken(@e final String authenticationToken) {
        k0.p(authenticationToken, "<set-?>");
        this.authenticationToken = authenticationToken;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setInfoCenterTimestamp(final long infoCenterTimestamp) {
        this.infoCenterTimestamp = infoCenterTimestamp;
    }
    
    public final void setLastViewedEntityId(final long lastViewedEntityId) {
        this.lastViewedEntityId = lastViewedEntityId;
    }
    
    public final void setLastViewedEntityType(@e final EntityType lastViewedEntityType) {
        k0.p(lastViewedEntityType, "<set-?>");
        this.lastViewedEntityType = lastViewedEntityType;
    }
    
    public final void setLockScreen(final boolean lockScreen) {
        this.lockScreen = lockScreen;
    }
    
    public final void setLockScreenIds(@e final Set<Integer> lockScreenIds) {
        k0.p(lockScreenIds, "<set-?>");
        this.lockScreenIds = lockScreenIds;
    }
    
    public final void setMasterDataTimestamp(final long masterDataTimestamp) {
        this.masterDataTimestamp = masterDataTimestamp;
    }
    
    public final void setMessagesOfDayTimestamp(final long messagesOfDayTimestamp) {
        this.messagesOfDayTimestamp = messagesOfDayTimestamp;
    }
    
    public final void setMessengerOrganizationId(@e final String messengerOrganizationId) {
        k0.p(messengerOrganizationId, "<set-?>");
        this.messengerOrganizationId = messengerOrganizationId;
    }
    
    public final void setMessengerServerUrl(@e final String messengerServerUrl) {
        k0.p(messengerServerUrl, "<set-?>");
        this.messengerServerUrl = messengerServerUrl;
    }
    
    public final void setOfficeHourTimestamp(final long officeHourTimestamp) {
        this.officeHourTimestamp = officeHourTimestamp;
    }
    
    public final void setParentDayTimestamp(final long parentDayTimestamp) {
        this.parentDayTimestamp = parentDayTimestamp;
    }
    
    public final void setPeriodDataTimestamp(final long periodDataTimestamp) {
        this.periodDataTimestamp = periodDataTimestamp;
    }
    
    public final void setRegistered(final long registered) {
        this.registered = registered;
    }
    
    public final void setRegistrationUrl(@e final String registrationUrl) {
        k0.p(registrationUrl, "<set-?>");
        this.registrationUrl = registrationUrl;
    }
    
    public final void setSchoolApiVersion(final int schoolApiVersion) {
        this.schoolApiVersion = schoolApiVersion;
    }
    
    public final void setSchoolDisplayName(@e final String schoolDisplayName) {
        k0.p(schoolDisplayName, "<set-?>");
        this.schoolDisplayName = schoolDisplayName;
    }
    
    public final void setSchoolId(final long schoolId) {
        this.schoolId = schoolId;
    }
    
    public final void setSchoolLogin(@e final String schoolLogin) {
        k0.p(schoolLogin, "<set-?>");
        this.schoolLogin = schoolLogin;
    }
    
    public final void setSchoolMobileServiceUrl(@e final String schoolMobileServiceUrl) {
        k0.p(schoolMobileServiceUrl, "<set-?>");
        this.schoolMobileServiceUrl = schoolMobileServiceUrl;
    }
    
    public final void setSchoolSemanticApiVersion(@e final String schoolSemanticApiVersion) {
        k0.p(schoolSemanticApiVersion, "<set-?>");
        this.schoolSemanticApiVersion = schoolSemanticApiVersion;
    }
    
    public final void setSchoolSemanticWuVersion(@e final String schoolSemanticWuVersion) {
        k0.p(schoolSemanticWuVersion, "<set-?>");
        this.schoolSemanticWuVersion = schoolSemanticWuVersion;
    }
    
    public final void setSchoolServerDelta(final long schoolServerDelta) {
        this.schoolServerDelta = schoolServerDelta;
    }
    
    public final void setSchoolServerUrl(@e final String schoolServerUrl) {
        k0.p(schoolServerUrl, "<set-?>");
        this.schoolServerUrl = schoolServerUrl;
    }
    
    public final void setSchoolUseMobileService(final boolean schoolUseMobileService) {
        this.schoolUseMobileService = schoolUseMobileService;
    }
    
    public final void setServerDownTimestamp(final long serverDownTimestamp) {
        this.serverDownTimestamp = serverDownTimestamp;
    }
    
    public final void setShowCalendarDetails(final boolean showCalendarDetails) {
        this.showCalendarDetails = showCalendarDetails;
    }
    
    public final void setStates(@e final Set<ProfileState> states) {
        k0.p(states, "<set-?>");
        this.states = states;
    }
    
    public final void setSubstitutionPlanningUrl(@e final String substitutionPlanningUrl) {
        k0.p(substitutionPlanningUrl, "<set-?>");
        this.substitutionPlanningUrl = substitutionPlanningUrl;
    }
    
    public final void setUpdated(final boolean updated) {
        this.updated = updated;
    }
    
    public final void setUsable(final boolean usable) {
        this.usable = usable;
    }
    
    public final void setUserAppSharedSecret(@e final String userAppSharedSecret) {
        k0.p(userAppSharedSecret, "<set-?>");
        this.userAppSharedSecret = userAppSharedSecret;
    }
    
    public final void setUserChildren(@e final Set<Child> userChildren) {
        k0.p(userChildren, "<set-?>");
        this.userChildren = userChildren;
    }
    
    public final void setUserClasses(@e final Set<Long> userClasses) {
        k0.p(userClasses, "<set-?>");
        this.userClasses = userClasses;
    }
    
    public final void setUserCustomEntityId(@f final Long userCustomEntityId) {
        this.userCustomEntityId = userCustomEntityId;
    }
    
    public final void setUserCustomEntityType(@f final EntityType userCustomEntityType) {
        this.userCustomEntityType = userCustomEntityType;
    }
    
    public final void setUserDepartmentId(final long userDepartmentId) {
        this.userDepartmentId = userDepartmentId;
    }
    
    public final void setUserDisplayName(@e final String userDisplayName) {
        k0.p(userDisplayName, "<set-?>");
        this.userDisplayName = userDisplayName;
    }
    
    public final void setUserHasTimeTableAccess(final boolean userHasTimeTableAccess) {
        this.userHasTimeTableAccess = userHasTimeTableAccess;
    }
    
    public final void setUserId(final long userId) {
        this.userId = userId;
    }
    
    public final void setUserLogin(@e final String userLogin) {
        k0.p(userLogin, "<set-?>");
        this.userLogin = userLogin;
    }
    
    public final void setUserOriginalEntityId(final long userOriginalEntityId) {
        this.userOriginalEntityId = userOriginalEntityId;
    }
    
    public final void setUserOriginalEntityType(@e final EntityType userOriginalEntityType) {
        k0.p(userOriginalEntityType, "<set-?>");
        this.userOriginalEntityType = userOriginalEntityType;
    }
    
    public final void setUserPremium(final boolean userPremium) {
        this.userPremium = userPremium;
    }
    
    public final void setUserPremiumEnd(@f final t userPremiumEnd) {
        this.userPremiumEnd = userPremiumEnd;
    }
    
    public final void setUserRights(@e final Set<Right> userRights) {
        k0.p(userRights, "<set-?>");
        this.userRights = userRights;
    }
    
    public final void setWidgetTimestamp(final long widgetTimestamp) {
        this.widgetTimestamp = widgetTimestamp;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Profile(id=");
        sb.append(this.id);
        sb.append(", userLogin=");
        sb.append(this.userLogin);
        sb.append(", userDisplayName=");
        sb.append(this.userDisplayName);
        sb.append(", userAppSharedSecret=");
        sb.append(this.userAppSharedSecret);
        sb.append(", userDepartmentId=");
        sb.append(this.userDepartmentId);
        sb.append(", userOriginalEntityType=");
        sb.append(this.userOriginalEntityType);
        sb.append(", userOriginalEntityId=");
        sb.append(this.userOriginalEntityId);
        sb.append(", userCustomEntityType=");
        sb.append(this.userCustomEntityType);
        sb.append(", userCustomEntityId=");
        sb.append(this.userCustomEntityId);
        sb.append(", userRights=");
        sb.append(this.userRights);
        sb.append(", userChildren=");
        sb.append(this.userChildren);
        sb.append(", userClasses=");
        sb.append(this.userClasses);
        sb.append(", userHasTimeTableAccess=");
        sb.append(this.userHasTimeTableAccess);
        sb.append(", userPremium=");
        sb.append(this.userPremium);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", userPremiumEnd=");
        sb.append(this.userPremiumEnd);
        sb.append(", schoolLogin=");
        sb.append(this.schoolLogin);
        sb.append(", schoolDisplayName=");
        sb.append(this.schoolDisplayName);
        sb.append(", schoolId=");
        sb.append(this.schoolId);
        sb.append(", schoolServerUrl=");
        sb.append(this.schoolServerUrl);
        sb.append(", schoolUseMobileService=");
        sb.append(this.schoolUseMobileService);
        sb.append(", schoolMobileServiceUrl=");
        sb.append(this.schoolMobileServiceUrl);
        sb.append(", schoolServerDelta=");
        sb.append(this.schoolServerDelta);
        sb.append(", schoolApiVersion=");
        sb.append(this.schoolApiVersion);
        sb.append(", schoolSemanticWuVersion=");
        sb.append(this.schoolSemanticWuVersion);
        sb.append(", schoolSemanticApiVersion=");
        sb.append(this.schoolSemanticApiVersion);
        sb.append(", usable=");
        sb.append(this.usable);
        sb.append(", updated=");
        sb.append(this.updated);
        sb.append(", periodDataTimestamp=");
        sb.append(this.periodDataTimestamp);
        sb.append(", masterDataTimestamp=");
        sb.append(this.masterDataTimestamp);
        sb.append(", officeHourTimestamp=");
        sb.append(this.officeHourTimestamp);
        sb.append(", parentDayTimestamp=");
        sb.append(this.parentDayTimestamp);
        sb.append(", messagesOfDayTimestamp=");
        sb.append(this.messagesOfDayTimestamp);
        sb.append(", widgetTimestamp=");
        sb.append(this.widgetTimestamp);
        sb.append(", lastViewedEntityType=");
        sb.append(this.lastViewedEntityType);
        sb.append(", lastViewedEntityId=");
        sb.append(this.lastViewedEntityId);
        sb.append(", states=");
        sb.append(this.states);
        sb.append(", serverDownTimestamp=");
        sb.append(this.serverDownTimestamp);
        sb.append(", lockScreen=");
        sb.append(this.lockScreen);
        sb.append(", lockScreenIds=");
        sb.append(this.lockScreenIds);
        sb.append(", messengerServerUrl=");
        sb.append(this.messengerServerUrl);
        sb.append(", messengerOrganizationId=");
        sb.append(this.messengerOrganizationId);
        sb.append(", substitutionPlanningUrl=");
        sb.append(this.substitutionPlanningUrl);
        sb.append(", registrationUrl=");
        sb.append(this.registrationUrl);
        sb.append(", authenticationToken=");
        sb.append(this.authenticationToken);
        sb.append(", infoCenterTimestamp=");
        sb.append(this.infoCenterTimestamp);
        sb.append(", showCalendarDetails=");
        sb.append(this.showCalendarDetails);
        sb.append(", registered=");
        sb.append(this.registered);
        sb.append(')');
        return sb.toString();
    }
    
    public final void updateAuthenticationToken(@e String c) {
        k0.p(c, "authenticationToken");
        Log.d("untis_log", k0.C("updateAuthenticationToken: ", c));
        if (s.U1((CharSequence)c)) {
            return;
        }
        this.authenticationToken = c;
        final com.auth0.android.jwt.f f = new com.auth0.android.jwt.f(c);
        this.userRights.remove(Right.TEACHER_ABSENCE_READ);
        this.userRights.remove(Right.TEACHER_ABSENCE_CREATE);
        this.userRights.remove(Right.SUBSTITUTION_PLANNING);
        this.userRights.remove(Right.SUBSTITUTION_ASK_TEACHER);
        this.userRights.remove(Right.SUBSTITUTION_ASK_TEACHER_READ);
        this.userRights.remove(Right.MESSAGES);
        final Long a = f.d("userId").a();
        long longValue;
        if (a == null) {
            longValue = 0L;
        }
        else {
            longValue = a;
        }
        this.userId = longValue;
        final c d = f.d("scopes");
        k0.o(d, "jwt.getClaim(\"scopes\")");
        c = d.c();
        Collection<String> s4;
        if (c == null) {
            s4 = null;
        }
        else {
            s4 = (Collection<String>)s.S4((CharSequence)c, new String[] { "," }, false, 0, 6, (Object)null);
        }
        if (s4 == null || s4.isEmpty()) {
            return;
        }
        if (((List)s4).size() == 1 && s.U1((CharSequence)((List<String>)s4).get(0))) {
            return;
        }
        final Iterator<String> iterator = (Iterator<String>)s4.iterator();
        while (iterator.hasNext()) {
            c = iterator.next();
            Set<Right> set = null;
            Right right = null;
            switch (c.hashCode()) {
                default: {
                    continue;
                }
                case 109635925: {
                    if (!c.equals("sp_at")) {
                        continue;
                    }
                    set = this.getUserRights();
                    right = Right.SUBSTITUTION_ASK_TEACHER;
                    break;
                }
                case 3550885: {
                    if (!c.equals("ta:r")) {
                        continue;
                    }
                    set = this.getUserRights();
                    right = Right.TEACHER_ABSENCE_READ;
                    break;
                }
                case 3550870: {
                    if (!c.equals("ta:c")) {
                        continue;
                    }
                    set = this.getUserRights();
                    right = Right.TEACHER_ABSENCE_CREATE;
                    break;
                }
                case 3348114: {
                    if (!c.equals("mg:r")) {
                        continue;
                    }
                    set = this.getUserRights();
                    right = Right.MESSAGES;
                    break;
                }
                case 3677: {
                    if (!c.equals("sp")) {
                        continue;
                    }
                    set = this.getUserRights();
                    right = Right.SUBSTITUTION_PLANNING;
                    break;
                }
                case -896253507: {
                    if (!c.equals("sp_atr")) {
                        continue;
                    }
                    set = this.getUserRights();
                    right = Right.SUBSTITUTION_ASK_TEACHER_READ;
                    break;
                }
            }
            set.add(right);
        }
    }
}
