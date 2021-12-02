// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.j;
import kotlin.z0;
import kotlin.i;
import m6.g;
import kotlin.r0;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.sequences.m;
import java.util.ArrayList;
import kotlin.s0;
import java.util.List;
import n6.p;
import kotlin.j2;
import java.util.Iterator;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.internal.f;
import kotlin.e1;
import java.util.Comparator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0080\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a]\u0010\b\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0010\u0007\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a_\u0010\n\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0010\u0007\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a6\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u001a\\\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042$\u0010\u0007\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e0\u0005H\u0086\b\u00f8\u0001\u0000\u001ac\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042$\u0010\u0007\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aw\u0010\u0016\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003\"\u0010\b\u0003\u0010\u0014*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0013*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0015\u001a\u00028\u00032$\u0010\u0007\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e0\u0005H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aw\u0010\u0018\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003\"\u0010\b\u0003\u0010\u0014*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0013*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0015\u001a\u00028\u00032$\u0010\u0007\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001aV\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0086\b\u00f8\u0001\u0000\u001a\\\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0010\u0007\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0005H\u0086\b\u00f8\u0001\u0000\u001aw\u0010\u001b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002\"\u0010\b\u0003\u0010\u0014*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0013*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0015\u001a\u00028\u00032 \u0010\u0007\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0005H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001aq\u0010\u001c\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003\"\u0010\b\u0003\u0010\u0014*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0013*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0015\u001a\u00028\u00032\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0017\u001aJ\u0010\u001f\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020\u001d0\u0005H\u0086\b\u00f8\u0001\u0000\u001a$\u0010 \u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u001aJ\u0010!\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020\u001d0\u0005H\u0086\b\u00f8\u0001\u0000\u001a'\u0010#\u001a\u00020\"\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\b\u001aJ\u0010$\u001a\u00020\"\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020\u001d0\u0005H\u0086\b\u00f8\u0001\u0000\u001aJ\u0010'\u001a\u00020%\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020%0\u0005H\u0087\b\u00f8\u0001\u0000\u001ah\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020(*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000\u001ah\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020(*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000\u001aJ\u0010-\u001a\u00020,\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020,0\u0005H\u0087\b\u00f8\u0001\u0000\u001aJ\u0010/\u001a\u00020.\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020.0\u0005H\u0087\b\u00f8\u0001\u0000\u001aa\u00100\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020(*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b0\u00101\u001aS\u00102\u001a\u0004\u0018\u00010,\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020,0\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b2\u00103\u001aS\u00104\u001a\u0004\u0018\u00010.\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020.0\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b4\u00105\u001ac\u00106\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020(*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b6\u00101\u001as\u0010:\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u00109\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000207j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`82\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b:\u0010;\u001au\u0010<\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u00109\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000207j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`82\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b<\u0010;\u001ai\u0010=\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u00109\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000607j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`8H\u0087\b\u001ai\u0010>\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u00109\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000607j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`8H\u0087\b\u001ah\u0010?\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020(*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000\u001ah\u0010@\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020(*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000\u001aJ\u0010A\u001a\u00020,\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020,0\u0005H\u0087\b\u00f8\u0001\u0000\u001aJ\u0010B\u001a\u00020.\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020.0\u0005H\u0087\b\u00f8\u0001\u0000\u001aa\u0010C\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020(*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bC\u00101\u001aS\u0010D\u001a\u0004\u0018\u00010,\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020,0\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bD\u00103\u001aS\u0010E\u001a\u0004\u0018\u00010.\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020.0\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bE\u00105\u001ac\u0010F\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020(*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bF\u00101\u001as\u0010G\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u00109\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000207j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`82\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bG\u0010;\u001au\u0010H\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u00109\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000207j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`82\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bH\u0010;\u001ah\u0010I\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u00109\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000607j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`8H\u0007\u001ai\u0010J\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u00109\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000607j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`8H\u0087\b\u001a$\u0010K\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u001aJ\u0010L\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020\u001d0\u0005H\u0086\b\u00f8\u0001\u0000\u001a[\u0010N\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010M*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u00028\u00022\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020%0\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bN\u0010O\u001ap\u0010T\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010M*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u00028\u000223\u0010&\u001a/\u0012\u0013\u0012\u00110\"¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(S\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020%0PH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a9\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\b\u001a6\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006X" }, d2 = { "K", "V", "", "R", "", "Lkotlin/Function1;", "", "transform", "S0", "(Ljava/util/Map;Ln6/l;)Ljava/lang/Object;", "T0", "", "Lkotlin/s0;", "F1", "", "U0", "Lkotlin/sequences/m;", "V0", "(Ljava/util/Map;Ln6/l;)Ljava/util/List;", "", "C", "destination", "X0", "(Ljava/util/Map;Ljava/util/Collection;Ln6/l;)Ljava/util/Collection;", "W0", "Z0", "a1", "b1", "c1", "", "predicate", "L0", "M0", "N0", "", "Q0", "R0", "Lkotlin/j2;", "action", "Y0", "", "selector", "d1", "e1", "", "f1", "", "g1", "h1", "(Ljava/util/Map;Ln6/l;)Ljava/lang/Comparable;", "j1", "(Ljava/util/Map;Ln6/l;)Ljava/lang/Double;", "k1", "(Ljava/util/Map;Ln6/l;)Ljava/lang/Float;", "i1", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "l1", "(Ljava/util/Map;Ljava/util/Comparator;Ln6/l;)Ljava/lang/Object;", "m1", "n1", "o1", "p1", "q1", "r1", "s1", "t1", "v1", "w1", "u1", "x1", "y1", "z1", "A1", "B1", "C1", "M", "D1", "(Ljava/util/Map;Ln6/l;)Ljava/util/Map;", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "index", "E1", "(Ljava/util/Map;Ln6/p;)Ljava/util/Map;", "O0", "P0", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/MapsKt")
class c1 extends b1
{
    public c1() {
    }
    
    @e1(version = "1.4")
    @f
    private static final <K, V> Map.Entry<K, V> A1(final Map<? extends K, ? extends V> map, final Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        return (Map.Entry<K, V>)f0.b4((Iterable<? extends Map.Entry>)map.entrySet(), (Comparator<? super Map.Entry>)comparator);
    }
    
    public static final <K, V> boolean B1(@e final Map<? extends K, ? extends V> map) {
        k0.p(map, "$this$none");
        return map.isEmpty();
    }
    
    public static final <K, V> boolean C1(@e final Map<? extends K, ? extends V> map, @e final l<? super Map.Entry<? extends K, ? extends V>, Boolean> l) {
        k0.p(map, "$this$none");
        k0.p(l, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (l.invoke((Object)iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    @e1(version = "1.1")
    @e
    public static final <K, V, M extends Map<? extends K, ? extends V>> M D1(@e final M m, @e final l<? super Map.Entry<? extends K, ? extends V>, j2> l) {
        k0.p(m, "$this$onEach");
        k0.p(l, "action");
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = m.entrySet().iterator();
        while (iterator.hasNext()) {
            l.invoke((Object)iterator.next());
        }
        return m;
    }
    
    @e1(version = "1.4")
    @e
    public static final <K, V, M extends Map<? extends K, ? extends V>> M E1(@e final M m, @e final p<? super Integer, ? super Map.Entry<? extends K, ? extends V>, j2> p2) {
        k0.p(m, "$this$onEachIndexed");
        k0.p(p2, "action");
        final Iterator<Object> iterator = m.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (i < 0) {
                v.W();
            }
            p2.invoke(Integer.valueOf(i), (Object)next);
            ++i;
        }
        return m;
    }
    
    @e
    public static <K, V> List<s0<K, V>> F1(@e final Map<? extends K, ? extends V> map) {
        k0.p(map, "$this$toList");
        if (map.size() == 0) {
            return v.E();
        }
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        if (!iterator.hasNext()) {
            return v.E();
        }
        final Map.Entry<? extends K, ? extends V> entry = iterator.next();
        if (!iterator.hasNext()) {
            return v.k(new s0<K, V>(entry.getKey(), entry.getValue()));
        }
        final ArrayList<s0<Object, V>> list = (ArrayList<s0<Object, V>>)new ArrayList<s0<K, V>>(map.size());
        list.add((s0<Object, V>)new s0<Object, V>(entry.getKey(), (V)entry.getValue()));
        do {
            final Map.Entry<? extends K, ? extends V> entry2 = iterator.next();
            list.add((s0<Object, V>)new s0<Object, V>(entry2.getKey(), entry2.getValue()));
        } while (iterator.hasNext());
        return (List<s0<K, V>>)list;
    }
    
    public static final <K, V> boolean L0(@e final Map<? extends K, ? extends V> map, @e final l<? super Map.Entry<? extends K, ? extends V>, Boolean> l) {
        k0.p(map, "$this$all");
        k0.p(l, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (!l.invoke((Object)iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public static final <K, V> boolean M0(@e final Map<? extends K, ? extends V> map) {
        k0.p(map, "$this$any");
        return map.isEmpty() ^ true;
    }
    
    public static final <K, V> boolean N0(@e final Map<? extends K, ? extends V> map, @e final l<? super Map.Entry<? extends K, ? extends V>, Boolean> l) {
        k0.p(map, "$this$any");
        k0.p(l, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (l.invoke((Object)iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    @f
    private static final <K, V> Iterable<Map.Entry<K, V>> O0(final Map<? extends K, ? extends V> map) {
        return (Iterable<Map.Entry<K, V>>)map.entrySet();
    }
    
    @e
    public static final <K, V> m<Map.Entry<K, V>> P0(@e final Map<? extends K, ? extends V> map) {
        k0.p(map, "$this$asSequence");
        return v.n1((Iterable<? extends Map.Entry<K, V>>)map.entrySet());
    }
    
    @f
    private static final <K, V> int Q0(final Map<? extends K, ? extends V> map) {
        return map.size();
    }
    
    public static final <K, V> int R0(@e final Map<? extends K, ? extends V> map, @e final l<? super Map.Entry<? extends K, ? extends V>, Boolean> l) {
        k0.p(map, "$this$count");
        k0.p(l, "predicate");
        final boolean empty = map.isEmpty();
        int n = 0;
        if (empty) {
            return 0;
        }
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (l.invoke((Object)iterator.next())) {
                ++n;
            }
        }
        return n;
    }
    
    @e1(version = "1.5")
    @f
    private static final <K, V, R> R S0(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (true) {
            while (iterator.hasNext()) {
                final R invoke = (R)l.invoke((Object)iterator.next());
                if (invoke != null) {
                    if (invoke != null) {
                        return invoke;
                    }
                    throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
                }
            }
            final R invoke = null;
            continue;
        }
    }
    
    @e1(version = "1.5")
    @f
    private static final <K, V, R> R T0(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final R invoke = (R)l.invoke((Object)iterator.next());
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }
    
    @e
    public static final <K, V, R> List<R> U0(@e final Map<? extends K, ? extends V> map, @e final l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> l) {
        k0.p(map, "$this$flatMap");
        k0.p(l, "transform");
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            v.q0((Collection<? super Object>)list, (Iterable<?>)l.invoke((Object)iterator.next()));
        }
        return (List<R>)list;
    }
    
    @e1(version = "1.4")
    @r0
    @g(name = "flatMapSequence")
    @e
    public static final <K, V, R> List<R> V0(@e final Map<? extends K, ? extends V> map, @e final l<? super Map.Entry<? extends K, ? extends V>, ? extends m<? extends R>> l) {
        k0.p(map, "$this$flatMap");
        k0.p(l, "transform");
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            v.r0((Collection<? super Object>)list, (kotlin.sequences.m<?>)l.invoke((Object)iterator.next()));
        }
        return (List<R>)list;
    }
    
    @e1(version = "1.4")
    @r0
    @g(name = "flatMapSequenceTo")
    @e
    public static final <K, V, R, C extends Collection<? super R>> C W0(@e final Map<? extends K, ? extends V> map, @e final C c, @e final l<? super Map.Entry<? extends K, ? extends V>, ? extends m<? extends R>> l) {
        k0.p(map, "$this$flatMapTo");
        k0.p(c, "destination");
        k0.p(l, "transform");
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            v.r0((Collection<? super Object>)c, (kotlin.sequences.m<?>)l.invoke((Object)iterator.next()));
        }
        return c;
    }
    
    @e
    public static final <K, V, R, C extends Collection<? super R>> C X0(@e final Map<? extends K, ? extends V> map, @e final C c, @e final l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> l) {
        k0.p(map, "$this$flatMapTo");
        k0.p(c, "destination");
        k0.p(l, "transform");
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            v.q0((Collection<? super Object>)c, (Iterable<?>)l.invoke((Object)iterator.next()));
        }
        return c;
    }
    
    @kotlin.internal.e
    public static final <K, V> void Y0(@e final Map<? extends K, ? extends V> map, @e final l<? super Map.Entry<? extends K, ? extends V>, j2> l) {
        k0.p(map, "$this$forEach");
        k0.p(l, "action");
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            l.invoke((Object)iterator.next());
        }
    }
    
    @e
    public static final <K, V, R> List<R> Z0(@e final Map<? extends K, ? extends V> map, @e final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        k0.p(map, "$this$map");
        k0.p(l, "transform");
        final ArrayList<R> list = new ArrayList<R>(map.size());
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            list.add((R)l.invoke((Object)iterator.next()));
        }
        return list;
    }
    
    @e
    public static final <K, V, R> List<R> a1(@e final Map<? extends K, ? extends V> map, @e final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        k0.p(map, "$this$mapNotNull");
        k0.p(l, "transform");
        final ArrayList<R> list = new ArrayList<R>();
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final R invoke = (R)l.invoke((Object)iterator.next());
            if (invoke != null) {
                list.add(invoke);
            }
        }
        return list;
    }
    
    @e
    public static final <K, V, R, C extends Collection<? super R>> C b1(@e final Map<? extends K, ? extends V> map, @e final C c, @e final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        k0.p(map, "$this$mapNotNullTo");
        k0.p(c, "destination");
        k0.p(l, "transform");
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final R invoke = (R)l.invoke((Object)iterator.next());
            if (invoke != null) {
                c.add((Object)invoke);
            }
        }
        return c;
    }
    
    @e
    public static final <K, V, R, C extends Collection<? super R>> C c1(@e final Map<? extends K, ? extends V> map, @e final C c, @e final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        k0.p(map, "$this$mapTo");
        k0.p(c, "destination");
        k0.p(l, "transform");
        final Iterator<Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            c.add((Object)l.invoke((Object)iterator.next()));
        }
        return c;
    }
    
    @i(message = "Use maxByOrNull instead.", replaceWith = @kotlin.z0(expression = "this.maxByOrNull(selector)", imports = {}))
    @j(errorSince = "1.5", warningSince = "1.4")
    @f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> d1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<Object> iterator = map.entrySet().iterator();
        Object next;
        if (!iterator.hasNext()) {
            next = null;
        }
        else {
            next = iterator.next();
            if (iterator.hasNext()) {
                Comparable<Comparable<Comparable>> comparable = (Comparable<Comparable<Comparable>>)l.invoke((Object)next);
                Object o = next;
                do {
                    final Object next2 = iterator.next();
                    final Comparable comparable2 = (Comparable)l.invoke((Object)next2);
                    next = o;
                    Object o2 = comparable;
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        o2 = comparable2;
                    }
                    o = next;
                    comparable = (Comparable<Comparable<Comparable>>)o2;
                } while (iterator.hasNext());
            }
        }
        return (Map.Entry<K, V>)next;
    }
    
    @e1(version = "1.4")
    @f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> e1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<Object> iterator = map.entrySet().iterator();
        Object next;
        if (!iterator.hasNext()) {
            next = null;
        }
        else {
            next = iterator.next();
            if (iterator.hasNext()) {
                Comparable<Comparable<Comparable>> comparable = (Comparable<Comparable<Comparable>>)l.invoke((Object)next);
                Object o = next;
                do {
                    final Object next2 = iterator.next();
                    final Comparable comparable2 = (Comparable)l.invoke((Object)next2);
                    next = o;
                    Object o2 = comparable;
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        o2 = comparable2;
                    }
                    o = next;
                    comparable = (Comparable<Comparable<Comparable>>)o2;
                } while (iterator.hasNext());
            }
        }
        return (Map.Entry<K, V>)next;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V> double f1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, Double> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            double a = l.invoke(iterator.next()).doubleValue();
            while (iterator.hasNext()) {
                a = Math.max(a, l.invoke(iterator.next()).doubleValue());
            }
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V> float g1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, Float> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            float a = l.invoke(iterator.next()).floatValue();
            while (iterator.hasNext()) {
                a = Math.max(a, l.invoke(iterator.next()).floatValue());
            }
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V, R extends Comparable<? super R>> R h1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            Comparable<Comparable> comparable = (Comparable<Comparable>)l.invoke(iterator.next());
            while (iterator.hasNext()) {
                final Comparable comparable2 = (Comparable)l.invoke(iterator.next());
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = (Comparable<Comparable>)comparable2;
                }
            }
            return (R)comparable;
        }
        throw new NoSuchElementException();
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V, R extends Comparable<? super R>> R i1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        Object o;
        if (!iterator.hasNext()) {
            o = null;
        }
        else {
            o = (Comparable)l.invoke(iterator.next());
            while (iterator.hasNext()) {
                final Comparable comparable = (Comparable)l.invoke(iterator.next());
                if (((Comparable<Comparable<Comparable>>)o).compareTo(comparable) < 0) {
                    o = comparable;
                }
            }
        }
        return (R)o;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V> Double j1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, Double> l) {
        final Iterator<Object> iterator = map.entrySet().iterator();
        Double value;
        if (!iterator.hasNext()) {
            value = null;
        }
        else {
            double n = l.invoke((Object)iterator.next()).doubleValue();
            while (iterator.hasNext()) {
                n = Math.max(n, l.invoke((Object)iterator.next()).doubleValue());
            }
            value = n;
        }
        return value;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V> Float k1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, Float> l) {
        final Iterator<Object> iterator = map.entrySet().iterator();
        Float value;
        if (!iterator.hasNext()) {
            value = null;
        }
        else {
            float n = l.invoke((Object)iterator.next()).floatValue();
            while (iterator.hasNext()) {
                n = Math.max(n, l.invoke((Object)iterator.next()).floatValue());
            }
            value = n;
        }
        return value;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V, R> R l1(final Map<? extends K, ? extends V> map, final Comparator<? super R> comparator, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            R invoke = (R)l.invoke(iterator.next());
            while (iterator.hasNext()) {
                final R invoke2 = (R)l.invoke(iterator.next());
                if (comparator.compare(invoke, invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V, R> R m1(final Map<? extends K, ? extends V> map, final Comparator<? super R> comparator, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        R invoke;
        if (!iterator.hasNext()) {
            invoke = null;
        }
        else {
            invoke = (R)l.invoke(iterator.next());
            while (iterator.hasNext()) {
                final R invoke2 = (R)l.invoke(iterator.next());
                if (comparator.compare(invoke, invoke2) < 0) {
                    invoke = invoke2;
                }
            }
        }
        return invoke;
    }
    
    @i(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.z0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @j(errorSince = "1.5", warningSince = "1.4")
    @f
    private static final <K, V> Map.Entry<K, V> n1(final Map<? extends K, ? extends V> map, final Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        return (Map.Entry<K, V>)f0.J3((Iterable<? extends Map.Entry>)map.entrySet(), (Comparator<? super Map.Entry>)comparator);
    }
    
    @e1(version = "1.4")
    @f
    private static final <K, V> Map.Entry<K, V> o1(final Map<? extends K, ? extends V> map, final Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        return (Map.Entry<K, V>)f0.J3((Iterable<? extends Map.Entry>)map.entrySet(), (Comparator<? super Map.Entry>)comparator);
    }
    
    @i(message = "Use minByOrNull instead.", replaceWith = @kotlin.z0(expression = "this.minByOrNull(selector)", imports = {}))
    @j(errorSince = "1.5", warningSince = "1.4")
    @org.jetbrains.annotations.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> p1(@e final Map<? extends K, ? extends V> map, @e final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        k0.p(map, "$this$minBy");
        k0.p(l, "selector");
        final Iterator<Object> iterator = map.entrySet().iterator();
        Object next;
        if (!iterator.hasNext()) {
            next = null;
        }
        else {
            next = iterator.next();
            if (iterator.hasNext()) {
                Comparable<Comparable<Comparable>> comparable = (Comparable<Comparable<Comparable>>)l.invoke((Object)next);
                Object o = next;
                do {
                    final Object next2 = iterator.next();
                    final Comparable comparable2 = (Comparable)l.invoke((Object)next2);
                    next = o;
                    Object o2 = comparable;
                    if (comparable.compareTo(comparable2) > 0) {
                        next = next2;
                        o2 = comparable2;
                    }
                    o = next;
                    comparable = (Comparable<Comparable<Comparable>>)o2;
                } while (iterator.hasNext());
            }
        }
        return (Map.Entry<K, V>)next;
    }
    
    @e1(version = "1.4")
    @f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> q1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<Object> iterator = map.entrySet().iterator();
        Object next;
        if (!iterator.hasNext()) {
            next = null;
        }
        else {
            next = iterator.next();
            if (iterator.hasNext()) {
                Comparable<Comparable<Comparable>> comparable = (Comparable<Comparable<Comparable>>)l.invoke((Object)next);
                Object o = next;
                do {
                    final Object next2 = iterator.next();
                    final Comparable comparable2 = (Comparable)l.invoke((Object)next2);
                    next = o;
                    Object o2 = comparable;
                    if (comparable.compareTo(comparable2) > 0) {
                        next = next2;
                        o2 = comparable2;
                    }
                    o = next;
                    comparable = (Comparable<Comparable<Comparable>>)o2;
                } while (iterator.hasNext());
            }
        }
        return (Map.Entry<K, V>)next;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V> double r1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, Double> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            double a = l.invoke(iterator.next()).doubleValue();
            while (iterator.hasNext()) {
                a = Math.min(a, l.invoke(iterator.next()).doubleValue());
            }
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V> float s1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, Float> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            float a = l.invoke(iterator.next()).floatValue();
            while (iterator.hasNext()) {
                a = Math.min(a, l.invoke(iterator.next()).floatValue());
            }
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V, R extends Comparable<? super R>> R t1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            Comparable<Comparable> comparable = (Comparable<Comparable>)l.invoke(iterator.next());
            while (iterator.hasNext()) {
                final Comparable comparable2 = (Comparable)l.invoke(iterator.next());
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = (Comparable<Comparable>)comparable2;
                }
            }
            return (R)comparable;
        }
        throw new NoSuchElementException();
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V, R extends Comparable<? super R>> R u1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        Object o;
        if (!iterator.hasNext()) {
            o = null;
        }
        else {
            o = (Comparable)l.invoke(iterator.next());
            while (iterator.hasNext()) {
                final Comparable comparable = (Comparable)l.invoke(iterator.next());
                if (((Comparable<Comparable<Comparable>>)o).compareTo(comparable) > 0) {
                    o = comparable;
                }
            }
        }
        return (R)o;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V> Double v1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, Double> l) {
        final Iterator<Object> iterator = map.entrySet().iterator();
        Double value;
        if (!iterator.hasNext()) {
            value = null;
        }
        else {
            double n = l.invoke((Object)iterator.next()).doubleValue();
            while (iterator.hasNext()) {
                n = Math.min(n, l.invoke((Object)iterator.next()).doubleValue());
            }
            value = n;
        }
        return value;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V> Float w1(final Map<? extends K, ? extends V> map, final l<? super Map.Entry<? extends K, ? extends V>, Float> l) {
        final Iterator<Object> iterator = map.entrySet().iterator();
        Float value;
        if (!iterator.hasNext()) {
            value = null;
        }
        else {
            float n = l.invoke((Object)iterator.next()).floatValue();
            while (iterator.hasNext()) {
                n = Math.min(n, l.invoke((Object)iterator.next()).floatValue());
            }
            value = n;
        }
        return value;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V, R> R x1(final Map<? extends K, ? extends V> map, final Comparator<? super R> comparator, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            R invoke = (R)l.invoke(iterator.next());
            while (iterator.hasNext()) {
                final R invoke2 = (R)l.invoke(iterator.next());
                if (comparator.compare(invoke, invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }
    
    @e1(version = "1.4")
    @f
    @r0
    private static final <K, V, R> R y1(final Map<? extends K, ? extends V> map, final Comparator<? super R> comparator, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        final Iterator<? super Map.Entry<? extends K, ? extends V>> iterator = map.entrySet().iterator();
        R invoke;
        if (!iterator.hasNext()) {
            invoke = null;
        }
        else {
            invoke = (R)l.invoke(iterator.next());
            while (iterator.hasNext()) {
                final R invoke2 = (R)l.invoke(iterator.next());
                if (comparator.compare(invoke, invoke2) > 0) {
                    invoke = invoke2;
                }
            }
        }
        return invoke;
    }
    
    @i(message = "Use minWithOrNull instead.", replaceWith = @kotlin.z0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @j(errorSince = "1.5", warningSince = "1.4")
    @org.jetbrains.annotations.f
    public static final <K, V> Map.Entry<K, V> z1(@e final Map<? extends K, ? extends V> map, @e final Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        k0.p(map, "$this$minWith");
        k0.p(comparator, "comparator");
        return (Map.Entry<K, V>)f0.b4((Iterable<? extends Map.Entry>)map.entrySet(), (Comparator<? super Map.Entry>)comparator);
    }
}
