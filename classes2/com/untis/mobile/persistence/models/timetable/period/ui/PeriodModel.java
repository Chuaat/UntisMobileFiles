// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timetable.period.ui;

import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import kotlin.collections.v;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\b\u0081\u0001\b\u0086\b\u0018\u0000 ¡\u00012\u00020\u0001:\u0002¡\u0001B\u00c7\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u000e\u0012\b\b\u0002\u00102\u001a\u00020\u000e\u0012\b\b\u0002\u00103\u001a\u00020\u0011\u0012\b\b\u0002\u00104\u001a\u00020\u000e\u0012\b\b\u0002\u00105\u001a\u00020\u0004\u0012\b\b\u0002\u00106\u001a\u00020\u0004\u0012\b\b\u0002\u00107\u001a\u00020\u0016\u0012\b\b\u0002\u00108\u001a\u00020\u0016\u0012\b\b\u0002\u00109\u001a\u00020\u0004\u0012\b\b\u0002\u0010:\u001a\u00020\u0004\u0012\b\b\u0002\u0010;\u001a\u00020\u0004\u0012\b\b\u0002\u0010<\u001a\u00020\u0004\u0012\b\b\u0002\u0010=\u001a\u00020\u0004\u0012\b\b\u0002\u0010>\u001a\u00020\u0004\u0012\b\b\u0002\u0010?\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110 \u0012\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110 \u0012\b\b\u0002\u0010C\u001a\u00020\u0011\u0012\b\b\u0002\u0010D\u001a\u00020\u0011\u0012\b\b\u0002\u0010E\u001a\u00020\u0011\u0012\b\b\u0002\u0010F\u001a\u00020\u0011\u0012\b\b\u0002\u0010G\u001a\u00020\n\u0012\b\b\u0002\u0010H\u001a\u00020\n\u0012\b\b\u0002\u0010I\u001a\u00020\n\u0012\b\b\u0002\u0010J\u001a\u00020\n\u0012\b\b\u0002\u0010K\u001a\u00020\n\u0012\b\b\u0002\u0010L\u001a\u00020\u0016\u0012\b\b\u0002\u0010M\u001a\u00020\u0016\u0012\b\b\u0002\u0010N\u001a\u00020\n¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001B\u0013\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0006\b\u009e\u0001\u0010 \u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0011H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0016H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0016H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110 H\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110 H\u00c6\u0003J\t\u0010%\u001a\u00020\u0011H\u00c6\u0003J\t\u0010&\u001a\u00020\u0011H\u00c6\u0003J\t\u0010'\u001a\u00020\u0011H\u00c6\u0003J\t\u0010(\u001a\u00020\u0011H\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J\t\u0010*\u001a\u00020\nH\u00c6\u0003J\t\u0010+\u001a\u00020\nH\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\t\u0010.\u001a\u00020\u0016H\u00c6\u0003J\t\u0010/\u001a\u00020\u0016H\u00c6\u0003J\t\u00100\u001a\u00020\nH\u00c6\u0003J\u00c7\u0002\u0010O\u001a\u00020\u00002\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u00112\b\b\u0002\u00104\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00162\b\b\u0002\u00108\u001a\u00020\u00162\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020\u00042\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020!0 2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110 2\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110 2\b\b\u0002\u0010C\u001a\u00020\u00112\b\b\u0002\u0010D\u001a\u00020\u00112\b\b\u0002\u0010E\u001a\u00020\u00112\b\b\u0002\u0010F\u001a\u00020\u00112\b\b\u0002\u0010G\u001a\u00020\n2\b\b\u0002\u0010H\u001a\u00020\n2\b\b\u0002\u0010I\u001a\u00020\n2\b\b\u0002\u0010J\u001a\u00020\n2\b\b\u0002\u0010K\u001a\u00020\n2\b\b\u0002\u0010L\u001a\u00020\u00162\b\b\u0002\u0010M\u001a\u00020\u00162\b\b\u0002\u0010N\u001a\u00020\nH\u00c6\u0001J\t\u0010P\u001a\u00020\u0011H\u00d6\u0001R\"\u0010I\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010J\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010Q\u001a\u0004\bV\u0010S\"\u0004\bW\u0010UR\"\u0010<\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010;\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010X\u001a\u0004\b]\u0010Z\"\u0004\b^\u0010\\R\"\u0010F\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010X\u001a\u0004\bd\u0010Z\"\u0004\be\u0010\\R\"\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010X\u001a\u0004\bf\u0010Z\"\u0004\bg\u0010\\R\"\u00101\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010D\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010_\u001a\u0004\bm\u0010a\"\u0004\bn\u0010cR\"\u0010H\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010Q\u001a\u0004\bo\u0010S\"\u0004\bp\u0010UR(\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010M\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u00104\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010h\u001a\u0004\b{\u0010j\"\u0004\b|\u0010lR(\u0010@\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010q\u001a\u0004\b}\u0010s\"\u0004\b~\u0010uR#\u00103\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b3\u0010_\u001a\u0004\b\u007f\u0010a\"\u0005\b\u0080\u0001\u0010cR$\u0010C\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bC\u0010_\u001a\u0005\b\u0081\u0001\u0010a\"\u0005\b\u0082\u0001\u0010cR#\u0010N\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\bN\u0010Q\u001a\u0004\bN\u0010S\"\u0005\b\u0083\u0001\u0010UR$\u0010G\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bG\u0010Q\u001a\u0005\b\u0084\u0001\u0010S\"\u0005\b\u0085\u0001\u0010UR*\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110 8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bB\u0010q\u001a\u0005\b\u0086\u0001\u0010s\"\u0005\b\u0087\u0001\u0010uR$\u0010=\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b=\u0010X\u001a\u0005\b\u0088\u0001\u0010Z\"\u0005\b\u0089\u0001\u0010\\R$\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b:\u0010X\u001a\u0005\b\u008a\u0001\u0010Z\"\u0005\b\u008b\u0001\u0010\\R$\u0010>\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b>\u0010X\u001a\u0005\b\u008c\u0001\u0010Z\"\u0005\b\u008d\u0001\u0010\\R$\u00107\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b7\u0010v\u001a\u0005\b\u008e\u0001\u0010x\"\u0005\b\u008f\u0001\u0010zR$\u0010K\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bK\u0010Q\u001a\u0005\b\u0090\u0001\u0010S\"\u0005\b\u0091\u0001\u0010UR$\u00105\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b5\u0010X\u001a\u0005\b\u0092\u0001\u0010Z\"\u0005\b\u0093\u0001\u0010\\R$\u0010E\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bE\u0010_\u001a\u0005\b\u0094\u0001\u0010a\"\u0005\b\u0095\u0001\u0010cR$\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b6\u0010X\u001a\u0005\b\u0096\u0001\u0010Z\"\u0005\b\u0097\u0001\u0010\\R$\u00108\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b8\u0010v\u001a\u0005\b\u0098\u0001\u0010x\"\u0005\b\u0099\u0001\u0010zR$\u0010L\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bL\u0010v\u001a\u0005\b\u009a\u0001\u0010x\"\u0005\b\u009b\u0001\u0010zR$\u00102\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b2\u0010h\u001a\u0005\b\u009c\u0001\u0010j\"\u0005\b\u009d\u0001\u0010l¨\u0006¢\u0001" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodElementModel;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "id", "lessonId", "profileId", "subjectId", "startMinute", "endMinute", "startX", "widthX", "totalX", "textColor", "backColor", "textColorSubject", "backColorSubject", "textColorCustom", "backColorCustom", "elements", "homeworks", "localhomeWorks", "info", "local", "substitution", "lesson", "hasOfficeHourRegistrations", "cancelled", "exam", "irregular", "hide", "hideStartX", "hideWidthX", "isOnlinePeriod", "copy", "toString", "Z", "getExam", "()Z", "setExam", "(Z)V", "getIrregular", "setIrregular", "I", "getTextColorSubject", "()I", "setTextColorSubject", "(I)V", "getBackColor", "setBackColor", "Ljava/lang/String;", "getLesson", "()Ljava/lang/String;", "setLesson", "(Ljava/lang/String;)V", "getTotalX", "setTotalX", "getBackColorCustom", "setBackColorCustom", "J", "getId", "()J", "setId", "(J)V", "getLocal", "setLocal", "getCancelled", "setCancelled", "Ljava/util/List;", "getHomeworks", "()Ljava/util/List;", "setHomeworks", "(Ljava/util/List;)V", "F", "getHideWidthX", "()F", "setHideWidthX", "(F)V", "getSubjectId", "setSubjectId", "getElements", "setElements", "getProfileId", "setProfileId", "getInfo", "setInfo", "setOnlinePeriod", "getHasOfficeHourRegistrations", "setHasOfficeHourRegistrations", "getLocalhomeWorks", "setLocalhomeWorks", "getBackColorSubject", "setBackColorSubject", "getTextColor", "setTextColor", "getTextColorCustom", "setTextColorCustom", "getStartX", "setStartX", "getHide", "setHide", "getStartMinute", "setStartMinute", "getSubstitution", "setSubstitution", "getEndMinute", "setEndMinute", "getWidthX", "setWidthX", "getHideStartX", "setHideStartX", "getLessonId", "setLessonId", "<init>", "(JJLjava/lang/String;JIIFFIIIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZFFZ)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodModel implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    private int backColor;
    private int backColorCustom;
    private int backColorSubject;
    private boolean cancelled;
    @e
    private List<PeriodElementModel> elements;
    private int endMinute;
    private boolean exam;
    private boolean hasOfficeHourRegistrations;
    private boolean hide;
    private float hideStartX;
    private float hideWidthX;
    @e
    private List<String> homeworks;
    private long id;
    @e
    private String info;
    private boolean irregular;
    private boolean isOnlinePeriod;
    @e
    private String lesson;
    private long lessonId;
    @e
    private String local;
    @e
    private List<String> localhomeWorks;
    @e
    private String profileId;
    private int startMinute;
    private float startX;
    private long subjectId;
    @e
    private String substitution;
    private int textColor;
    private int textColorCustom;
    private int textColorSubject;
    private int totalX;
    private float widthX;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public PeriodModel() {
        this(0L, 0L, null, 0L, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, false, false, false, false, false, 0.0f, 0.0f, false, 1073741823, null);
    }
    
    public PeriodModel(final long id, final long lessonId, @e final String profileId, final long subjectId, final int startMinute, final int endMinute, final float startX, final float widthX, final int totalX, final int textColor, final int backColor, final int textColorSubject, final int backColorSubject, final int textColorCustom, final int backColorCustom, @e final List<PeriodElementModel> elements, @e final List<String> homeworks, @e final List<String> localhomeWorks, @e final String info, @e final String local, @e final String substitution, @e final String lesson, final boolean hasOfficeHourRegistrations, final boolean cancelled, final boolean exam, final boolean irregular, final boolean hide, final float hideStartX, final float hideWidthX, final boolean isOnlinePeriod) {
        k0.p(profileId, "profileId");
        k0.p(elements, "elements");
        k0.p(homeworks, "homeworks");
        k0.p(localhomeWorks, "localhomeWorks");
        k0.p(info, "info");
        k0.p(local, "local");
        k0.p(substitution, "substitution");
        k0.p(lesson, "lesson");
        this.id = id;
        this.lessonId = lessonId;
        this.profileId = profileId;
        this.subjectId = subjectId;
        this.startMinute = startMinute;
        this.endMinute = endMinute;
        this.startX = startX;
        this.widthX = widthX;
        this.totalX = totalX;
        this.textColor = textColor;
        this.backColor = backColor;
        this.textColorSubject = textColorSubject;
        this.backColorSubject = backColorSubject;
        this.textColorCustom = textColorCustom;
        this.backColorCustom = backColorCustom;
        this.elements = elements;
        this.homeworks = homeworks;
        this.localhomeWorks = localhomeWorks;
        this.info = info;
        this.local = local;
        this.substitution = substitution;
        this.lesson = lesson;
        this.hasOfficeHourRegistrations = hasOfficeHourRegistrations;
        this.cancelled = cancelled;
        this.exam = exam;
        this.irregular = irregular;
        this.hide = hide;
        this.hideStartX = hideStartX;
        this.hideWidthX = hideWidthX;
        this.isOnlinePeriod = isOnlinePeriod;
    }
    
    public PeriodModel(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final long long2 = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        final long long3 = parcel.readLong();
        final int int1 = parcel.readInt();
        final int int2 = parcel.readInt();
        final float float1 = parcel.readFloat();
        final float float2 = parcel.readFloat();
        final int int3 = parcel.readInt();
        final int int4 = parcel.readInt();
        final int int5 = parcel.readInt();
        final int int6 = parcel.readInt();
        final int int7 = parcel.readInt();
        final int int8 = parcel.readInt();
        final int int9 = parcel.readInt();
        List<PeriodElementModel> list;
        if ((list = (List<PeriodElementModel>)parcel.createTypedArrayList((Parcelable$Creator)PeriodElementModel.CREATOR)) == null) {
            list = v.E();
        }
        List<String> list2;
        if ((list2 = (List<String>)parcel.createStringArrayList()) == null) {
            list2 = v.E();
        }
        List<String> list3;
        if ((list3 = (List<String>)parcel.createStringArrayList()) == null) {
            list3 = v.E();
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        String string4 = parcel.readString();
        if (string4 == null) {
            string4 = "";
        }
        String string5 = parcel.readString();
        if (string5 == null) {
            string5 = "";
        }
        this(long1, long2, string, long3, int1, int2, float1, float2, int3, int4, int5, int6, int7, int8, int9, list, list2, list3, string2, string3, string4, string5, parcel.readByte() != 0, parcel.readByte() != 0, parcel.readByte() != 0, parcel.readByte() != 0, parcel.readByte() != 0, parcel.readFloat(), parcel.readFloat(), parcel.readByte() != 0);
    }
    
    public final long component1() {
        return this.id;
    }
    
    public final int component10() {
        return this.textColor;
    }
    
    public final int component11() {
        return this.backColor;
    }
    
    public final int component12() {
        return this.textColorSubject;
    }
    
    public final int component13() {
        return this.backColorSubject;
    }
    
    public final int component14() {
        return this.textColorCustom;
    }
    
    public final int component15() {
        return this.backColorCustom;
    }
    
    @e
    public final List<PeriodElementModel> component16() {
        return this.elements;
    }
    
    @e
    public final List<String> component17() {
        return this.homeworks;
    }
    
    @e
    public final List<String> component18() {
        return this.localhomeWorks;
    }
    
    @e
    public final String component19() {
        return this.info;
    }
    
    public final long component2() {
        return this.lessonId;
    }
    
    @e
    public final String component20() {
        return this.local;
    }
    
    @e
    public final String component21() {
        return this.substitution;
    }
    
    @e
    public final String component22() {
        return this.lesson;
    }
    
    public final boolean component23() {
        return this.hasOfficeHourRegistrations;
    }
    
    public final boolean component24() {
        return this.cancelled;
    }
    
    public final boolean component25() {
        return this.exam;
    }
    
    public final boolean component26() {
        return this.irregular;
    }
    
    public final boolean component27() {
        return this.hide;
    }
    
    public final float component28() {
        return this.hideStartX;
    }
    
    public final float component29() {
        return this.hideWidthX;
    }
    
    @e
    public final String component3() {
        return this.profileId;
    }
    
    public final boolean component30() {
        return this.isOnlinePeriod;
    }
    
    public final long component4() {
        return this.subjectId;
    }
    
    public final int component5() {
        return this.startMinute;
    }
    
    public final int component6() {
        return this.endMinute;
    }
    
    public final float component7() {
        return this.startX;
    }
    
    public final float component8() {
        return this.widthX;
    }
    
    public final int component9() {
        return this.totalX;
    }
    
    @e
    public final PeriodModel copy(final long n, final long n2, @e final String s, final long n3, final int n4, final int n5, final float n6, final float n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, @e final List<PeriodElementModel> list, @e final List<String> list2, @e final List<String> list3, @e final String s2, @e final String s3, @e final String s4, @e final String s5, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final float n15, final float n16, final boolean b6) {
        k0.p(s, "profileId");
        k0.p(list, "elements");
        k0.p(list2, "homeworks");
        k0.p(list3, "localhomeWorks");
        k0.p(s2, "info");
        k0.p(s3, "local");
        k0.p(s4, "substitution");
        k0.p(s5, "lesson");
        return new PeriodModel(n, n2, s, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, list, list2, list3, s2, s3, s4, s5, b, b2, b3, b4, b5, n15, n16, b6);
    }
    
    public int describeContents() {
        return 0;
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
        if (!k0.g(PeriodModel.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel");
        return this.id == ((PeriodModel)obj).id;
    }
    
    public final int getBackColor() {
        return this.backColor;
    }
    
    public final int getBackColorCustom() {
        return this.backColorCustom;
    }
    
    public final int getBackColorSubject() {
        return this.backColorSubject;
    }
    
    public final boolean getCancelled() {
        return this.cancelled;
    }
    
    @e
    public final List<PeriodElementModel> getElements() {
        return this.elements;
    }
    
    public final int getEndMinute() {
        return this.endMinute;
    }
    
    public final boolean getExam() {
        return this.exam;
    }
    
    public final boolean getHasOfficeHourRegistrations() {
        return this.hasOfficeHourRegistrations;
    }
    
    public final boolean getHide() {
        return this.hide;
    }
    
    public final float getHideStartX() {
        return this.hideStartX;
    }
    
    public final float getHideWidthX() {
        return this.hideWidthX;
    }
    
    @e
    public final List<String> getHomeworks() {
        return this.homeworks;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getInfo() {
        return this.info;
    }
    
    public final boolean getIrregular() {
        return this.irregular;
    }
    
    @e
    public final String getLesson() {
        return this.lesson;
    }
    
    public final long getLessonId() {
        return this.lessonId;
    }
    
    @e
    public final String getLocal() {
        return this.local;
    }
    
    @e
    public final List<String> getLocalhomeWorks() {
        return this.localhomeWorks;
    }
    
    @e
    public final String getProfileId() {
        return this.profileId;
    }
    
    public final int getStartMinute() {
        return this.startMinute;
    }
    
    public final float getStartX() {
        return this.startX;
    }
    
    public final long getSubjectId() {
        return this.subjectId;
    }
    
    @e
    public final String getSubstitution() {
        return this.substitution;
    }
    
    public final int getTextColor() {
        return this.textColor;
    }
    
    public final int getTextColorCustom() {
        return this.textColorCustom;
    }
    
    public final int getTextColorSubject() {
        return this.textColorSubject;
    }
    
    public final int getTotalX() {
        return this.totalX;
    }
    
    public final float getWidthX() {
        return this.widthX;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final boolean isOnlinePeriod() {
        return this.isOnlinePeriod;
    }
    
    public final void setBackColor(final int backColor) {
        this.backColor = backColor;
    }
    
    public final void setBackColorCustom(final int backColorCustom) {
        this.backColorCustom = backColorCustom;
    }
    
    public final void setBackColorSubject(final int backColorSubject) {
        this.backColorSubject = backColorSubject;
    }
    
    public final void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }
    
    public final void setElements(@e final List<PeriodElementModel> elements) {
        k0.p(elements, "<set-?>");
        this.elements = elements;
    }
    
    public final void setEndMinute(final int endMinute) {
        this.endMinute = endMinute;
    }
    
    public final void setExam(final boolean exam) {
        this.exam = exam;
    }
    
    public final void setHasOfficeHourRegistrations(final boolean hasOfficeHourRegistrations) {
        this.hasOfficeHourRegistrations = hasOfficeHourRegistrations;
    }
    
    public final void setHide(final boolean hide) {
        this.hide = hide;
    }
    
    public final void setHideStartX(final float hideStartX) {
        this.hideStartX = hideStartX;
    }
    
    public final void setHideWidthX(final float hideWidthX) {
        this.hideWidthX = hideWidthX;
    }
    
    public final void setHomeworks(@e final List<String> homeworks) {
        k0.p(homeworks, "<set-?>");
        this.homeworks = homeworks;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setInfo(@e final String info) {
        k0.p(info, "<set-?>");
        this.info = info;
    }
    
    public final void setIrregular(final boolean irregular) {
        this.irregular = irregular;
    }
    
    public final void setLesson(@e final String lesson) {
        k0.p(lesson, "<set-?>");
        this.lesson = lesson;
    }
    
    public final void setLessonId(final long lessonId) {
        this.lessonId = lessonId;
    }
    
    public final void setLocal(@e final String local) {
        k0.p(local, "<set-?>");
        this.local = local;
    }
    
    public final void setLocalhomeWorks(@e final List<String> localhomeWorks) {
        k0.p(localhomeWorks, "<set-?>");
        this.localhomeWorks = localhomeWorks;
    }
    
    public final void setOnlinePeriod(final boolean isOnlinePeriod) {
        this.isOnlinePeriod = isOnlinePeriod;
    }
    
    public final void setProfileId(@e final String profileId) {
        k0.p(profileId, "<set-?>");
        this.profileId = profileId;
    }
    
    public final void setStartMinute(final int startMinute) {
        this.startMinute = startMinute;
    }
    
    public final void setStartX(final float startX) {
        this.startX = startX;
    }
    
    public final void setSubjectId(final long subjectId) {
        this.subjectId = subjectId;
    }
    
    public final void setSubstitution(@e final String substitution) {
        k0.p(substitution, "<set-?>");
        this.substitution = substitution;
    }
    
    public final void setTextColor(final int textColor) {
        this.textColor = textColor;
    }
    
    public final void setTextColorCustom(final int textColorCustom) {
        this.textColorCustom = textColorCustom;
    }
    
    public final void setTextColorSubject(final int textColorSubject) {
        this.textColorSubject = textColorSubject;
    }
    
    public final void setTotalX(final int totalX) {
        this.totalX = totalX;
    }
    
    public final void setWidthX(final float widthX) {
        this.widthX = widthX;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriodModel(id=");
        sb.append(this.id);
        sb.append(", lessonId=");
        sb.append(this.lessonId);
        sb.append(", profileId=");
        sb.append(this.profileId);
        sb.append(", subjectId=");
        sb.append(this.subjectId);
        sb.append(", startMinute=");
        sb.append(this.startMinute);
        sb.append(", endMinute=");
        sb.append(this.endMinute);
        sb.append(", startX=");
        sb.append(this.startX);
        sb.append(", widthX=");
        sb.append(this.widthX);
        sb.append(", totalX=");
        sb.append(this.totalX);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", backColor=");
        sb.append(this.backColor);
        sb.append(", textColorSubject=");
        sb.append(this.textColorSubject);
        sb.append(", backColorSubject=");
        sb.append(this.backColorSubject);
        sb.append(", textColorCustom=");
        sb.append(this.textColorCustom);
        sb.append(", backColorCustom=");
        sb.append(this.backColorCustom);
        sb.append(", elements=");
        sb.append(this.elements);
        sb.append(", homeworks=");
        sb.append(this.homeworks);
        sb.append(", localhomeWorks=");
        sb.append(this.localhomeWorks);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", local=");
        sb.append(this.local);
        sb.append(", substitution=");
        sb.append(this.substitution);
        sb.append(", lesson=");
        sb.append(this.lesson);
        sb.append(", hasOfficeHourRegistrations=");
        sb.append(this.hasOfficeHourRegistrations);
        sb.append(", cancelled=");
        sb.append(this.cancelled);
        sb.append(", exam=");
        sb.append(this.exam);
        sb.append(", irregular=");
        sb.append(this.irregular);
        sb.append(", hide=");
        sb.append(this.hide);
        sb.append(", hideStartX=");
        sb.append(this.hideStartX);
        sb.append(", hideWidthX=");
        sb.append(this.hideWidthX);
        sb.append(", isOnlinePeriod=");
        sb.append(this.isOnlinePeriod);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeLong(this.lessonId);
        parcel.writeString(this.profileId);
        parcel.writeLong(this.subjectId);
        parcel.writeInt(this.startMinute);
        parcel.writeInt(this.endMinute);
        parcel.writeFloat(this.startX);
        parcel.writeFloat(this.widthX);
        parcel.writeInt(this.totalX);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.backColor);
        parcel.writeInt(this.textColorSubject);
        parcel.writeInt(this.backColorSubject);
        parcel.writeInt(this.textColorCustom);
        parcel.writeInt(this.backColorCustom);
        parcel.writeTypedList((List)this.elements);
        parcel.writeStringList((List)this.homeworks);
        parcel.writeStringList((List)this.localhomeWorks);
        parcel.writeString(this.info);
        parcel.writeString(this.local);
        parcel.writeString(this.substitution);
        parcel.writeString(this.lesson);
        parcel.writeByte((byte)(byte)(this.hasOfficeHourRegistrations ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.cancelled ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.exam ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.irregular ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.hide ? 1 : 0));
        parcel.writeFloat(this.hideStartX);
        parcel.writeFloat(this.hideWidthX);
        parcel.writeByte((byte)(byte)(this.hide ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<PeriodModel>
    {
        private CREATOR() {
        }
        
        @e
        public PeriodModel createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new PeriodModel(parcel);
        }
        
        @e
        public PeriodModel[] newArray(final int n) {
            return new PeriodModel[n];
        }
    }
}
