// 
// Decompiled by Procyon v0.5.36
// 

package androidx.exifinterface.media;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.io.FilterOutputStream;
import java.io.EOFException;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.text.ParsePosition;
import java.util.concurrent.TimeUnit;
import android.location.Location;
import androidx.annotation.t0;
import java.util.Date;
import java.util.regex.Matcher;
import java.io.FileOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import androidx.annotation.k0;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.io.BufferedInputStream;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import androidx.annotation.j0;
import java.io.InputStream;
import java.util.TimeZone;
import java.util.Collection;
import java.util.Arrays;
import java.nio.ByteOrder;
import java.util.Set;
import android.content.res.AssetManager$AssetInputStream;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.nio.charset.Charset;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;

public class a
{
    public static final String A = "PlanarConfiguration";
    public static final String A0 = "ShutterSpeedValue";
    public static final String A1 = "GPSDOP";
    public static final int A2 = 3;
    public static final short A3 = 15;
    public static final short A4 = 0;
    private static final short A5 = 20306;
    private static final d A6;
    public static final String B = "YCbCrSubSampling";
    public static final String B0 = "ApertureValue";
    public static final String B1 = "GPSSpeedRef";
    public static final int B2 = 4;
    public static final short B3 = 16;
    public static final short B4 = 0;
    private static final short B5 = 21330;
    private static final d B6;
    public static final String C = "YCbCrPositioning";
    public static final String C0 = "BrightnessValue";
    public static final String C1 = "GPSSpeed";
    public static final int C2 = 5;
    public static final short C3 = 17;
    public static final short C4 = 0;
    private static final byte[] C5;
    private static final HashMap<Integer, d>[] C6;
    public static final String D = "XResolution";
    public static final String D0 = "ExposureBiasValue";
    public static final String D1 = "GPSTrackRef";
    public static final int D2 = 6;
    public static final short D3 = 18;
    public static final short D4 = 0;
    private static final byte[] D5;
    private static final HashMap<String, d>[] D6;
    public static final String E = "YResolution";
    public static final String E0 = "MaxApertureValue";
    public static final String E1 = "GPSTrack";
    public static final int E2 = 7;
    public static final short E3 = 19;
    public static final short E4 = 1;
    private static final int E5 = 8;
    private static final HashSet<String> E6;
    public static final String F = "ResolutionUnit";
    public static final String F0 = "SubjectDistance";
    public static final String F1 = "GPSImgDirectionRef";
    public static final int F2 = 8;
    public static final short F3 = 20;
    public static final short F4 = 2;
    private static final int F5 = 12;
    private static final HashMap<Integer, Integer> F6;
    public static final String G = "StripOffsets";
    public static final String G0 = "MeteringMode";
    public static final String G1 = "GPSImgDirection";
    private static final List<Integer> G2;
    public static final short G3 = 21;
    public static final short G4 = 0;
    private static final short G5 = 85;
    static final Charset G6;
    public static final String H = "RowsPerStrip";
    public static final String H0 = "LightSource";
    public static final String H1 = "GPSMapDatum";
    private static final List<Integer> H2;
    public static final short H3 = 22;
    public static final short H4 = 1;
    private static final String H5 = "PENTAX";
    static final byte[] H6;
    public static final String I = "StripByteCounts";
    public static final String I0 = "Flash";
    public static final String I1 = "GPSDestLatitudeRef";
    public static final short I2 = 1;
    public static final short I3 = 23;
    public static final short I4 = 2;
    private static final int I5 = 6;
    static final byte I6 = -1;
    public static final String J = "JPEGInterchangeFormat";
    public static final String J0 = "SubjectArea";
    public static final String J1 = "GPSDestLatitude";
    public static final short J2 = 2;
    public static final short J3 = 24;
    public static final short J4 = 3;
    private static SimpleDateFormat J5;
    private static final byte J6 = -40;
    public static final String K = "JPEGInterchangeFormatLength";
    public static final String K0 = "FocalLength";
    public static final String K1 = "GPSDestLongitudeRef";
    public static final short K2 = 1;
    public static final short K3 = 255;
    public static final String K4 = "N";
    static final short K5 = 18761;
    private static final byte K6 = -64;
    public static final String L = "TransferFunction";
    public static final String L0 = "FlashEnergy";
    public static final String L1 = "GPSDestLongitude";
    public static final short L2 = 2;
    public static final short L3 = 1;
    public static final String L4 = "S";
    static final short L5 = 19789;
    private static final byte L6 = -63;
    public static final String M = "WhitePoint";
    public static final String M0 = "SpatialFrequencyResponse";
    public static final String M1 = "GPSDestBearingRef";
    public static final short M2 = 2;
    public static final short M3 = 4;
    public static final String M4 = "E";
    static final byte M5 = 42;
    private static final byte M6 = -62;
    public static final String N = "PrimaryChromaticities";
    public static final String N0 = "FocalPlaneXResolution";
    public static final String N1 = "GPSDestBearing";
    public static final short N2 = 3;
    public static final short N3 = 6;
    public static final String N4 = "W";
    private static final int N5 = 8;
    private static final byte N6 = -61;
    public static final String O = "YCbCrCoefficients";
    public static final String O0 = "FocalPlaneYResolution";
    public static final String O1 = "GPSDestDistanceRef";
    public static final int O2 = 1;
    public static final short O3 = 8;
    public static final short O4 = 0;
    private static final int O5 = 1;
    private static final byte O6 = -59;
    public static final String P = "ReferenceBlackWhite";
    public static final String P0 = "FocalPlaneResolutionUnit";
    public static final String P1 = "GPSDestDistance";
    public static final int P2 = 65535;
    public static final short P3 = 16;
    public static final short P4 = 1;
    private static final int P5 = 2;
    private static final byte P6 = -58;
    public static final String Q = "DateTime";
    public static final String Q0 = "SubjectLocation";
    public static final String Q1 = "GPSProcessingMethod";
    public static final short Q2 = 0;
    public static final short Q3 = 24;
    public static final String Q4 = "A";
    private static final int Q5 = 3;
    private static final byte Q6 = -57;
    public static final String R = "ImageDescription";
    public static final String R0 = "ExposureIndex";
    public static final String R1 = "GPSAreaInformation";
    public static final short R2 = 1;
    public static final short R3 = 32;
    public static final String R4 = "V";
    private static final int R5 = 4;
    private static final byte R6 = -55;
    public static final String S = "Make";
    public static final String S0 = "SensingMethod";
    public static final String S1 = "GPSDateStamp";
    public static final short S2 = 2;
    public static final short S3 = 64;
    public static final String S4 = "2";
    private static final int S5 = 5;
    private static final byte S6 = -54;
    public static final String T = "Model";
    public static final String T0 = "FileSource";
    public static final String T1 = "GPSDifferential";
    public static final short T2 = 3;
    public static final short T3 = 1;
    public static final String T4 = "3";
    private static final int T5 = 6;
    private static final byte T6 = -53;
    public static final String U = "Software";
    public static final String U0 = "SceneType";
    public static final String U1 = "GPSHPositioningError";
    public static final short U2 = 4;
    public static final short U3 = 2;
    public static final String U4 = "K";
    private static final int U5 = 7;
    private static final byte U6 = -51;
    public static final String V = "Artist";
    public static final String V0 = "CFAPattern";
    public static final String V1 = "InteroperabilityIndex";
    public static final short V2 = 5;
    public static final short V3 = 3;
    public static final String V4 = "M";
    private static final int V5 = 8;
    private static final byte V6 = -50;
    public static final String W = "Copyright";
    public static final String W0 = "CustomRendered";
    public static final String W1 = "ThumbnailImageLength";
    public static final short W2 = 6;
    public static final short W3 = 4;
    public static final String W4 = "N";
    private static final int W5 = 9;
    private static final byte W6 = -49;
    public static final String X = "ExifVersion";
    public static final String X0 = "ExposureMode";
    public static final String X1 = "ThumbnailImageWidth";
    public static final short X2 = 7;
    public static final short X3 = 5;
    public static final String X4 = "T";
    private static final int X5 = 10;
    private static final byte X6 = -38;
    public static final String Y = "FlashpixVersion";
    public static final String Y0 = "WhiteBalance";
    public static final String Y1 = "DNGVersion";
    public static final short Y2 = 8;
    public static final short Y3 = 7;
    public static final String Y4 = "M";
    private static final int Y5 = 11;
    static final byte Y6 = -31;
    public static final String Z = "ColorSpace";
    public static final String Z0 = "DigitalZoomRatio";
    public static final String Z1 = "DefaultCropSize";
    public static final short Z2 = 0;
    public static final short Z3 = 8;
    public static final String Z4 = "K";
    private static final int Z5 = 12;
    private static final byte Z6 = -2;
    public static final String a0 = "Gamma";
    public static final String a1 = "FocalLengthIn35mmFilm";
    public static final String a2 = "ThumbnailImage";
    public static final short a3 = 1;
    public static final short a4 = 0;
    public static final String a5 = "M";
    private static final int a6 = 13;
    static final byte a7 = -39;
    public static final String b0 = "PixelXDimension";
    public static final String b1 = "SceneCaptureType";
    public static final String b2 = "PreviewImageStart";
    public static final short b3 = 2;
    public static final short b4 = 1;
    public static final String b5 = "N";
    static final String[] b6;
    private static final int b7 = 0;
    public static final String c0 = "PixelYDimension";
    public static final String c1 = "GainControl";
    public static final String c2 = "PreviewImageLength";
    public static final short c3 = 3;
    public static final short c4 = 2;
    public static final short c5 = 0;
    static final int[] c6;
    private static final int c7 = 1;
    public static final String d0 = "ComponentsConfiguration";
    public static final String d1 = "Contrast";
    public static final String d2 = "AspectFrame";
    public static final short d3 = 4;
    public static final short d4 = 3;
    public static final short d5 = 1;
    static final byte[] d6;
    private static final int d7 = 2;
    public static final String e0 = "CompressedBitsPerPixel";
    public static final String e1 = "Saturation";
    public static final String e2 = "SensorBottomBorder";
    public static final short e3 = 5;
    public static final short e4 = 1;
    public static final int e5 = 1;
    private static final d[] e6;
    private static final int e7 = 3;
    public static final String f0 = "MakerNote";
    public static final String f1 = "Sharpness";
    public static final String f2 = "SensorLeftBorder";
    public static final short f3 = 6;
    public static final short f4 = 0;
    public static final int f5 = 2;
    private static final d[] f6;
    private static final int f7 = 4;
    public static final String g0 = "UserComment";
    public static final String g1 = "DeviceSettingDescription";
    public static final String g2 = "SensorRightBorder";
    public static final short g3 = 7;
    public static final short g4 = 1;
    public static final int g5 = 6;
    private static final d[] g6;
    private static final int g7 = 5;
    public static final String h0 = "RelatedSoundFile";
    public static final String h1 = "SubjectDistanceRange";
    public static final String h2 = "SensorTopBorder";
    public static final short h3 = 0;
    public static final short h4 = 0;
    public static final int h5 = 7;
    private static final d[] h6;
    private static final int h7 = 6;
    public static final String i0 = "DateTimeOriginal";
    public static final String i1 = "ImageUniqueID";
    public static final String i2 = "ISO";
    public static final short i3 = 1;
    public static final short i4 = 1;
    public static final int i5 = 8;
    private static final d[] i6;
    private static final int i7 = 7;
    public static final String j0 = "DateTimeDigitized";
    public static final String j1 = "CameraOwnerName";
    public static final String j2 = "JpgFromRaw";
    public static final short j3 = 2;
    public static final short j4 = 2;
    public static final int j5 = 32773;
    private static final d j6;
    private static final int j7 = 8;
    public static final String k0 = "SubSecTime";
    public static final String k1 = "BodySerialNumber";
    public static final String k2 = "NewSubfileType";
    public static final short k3 = 3;
    @Deprecated
    public static final int k4 = 0;
    public static final int k5 = 34892;
    private static final d[] k6;
    private static final int k7 = 9;
    public static final String l0 = "SubSecTimeOriginal";
    public static final String l1 = "LensSpecification";
    public static final String l2 = "SubfileType";
    public static final short l3 = 4;
    @Deprecated
    public static final int l4 = 1;
    public static final int[] l5;
    private static final d[] l6;
    private static final int l7 = 10;
    public static final String m0 = "SubSecTimeDigitized";
    public static final String m1 = "LensMake";
    private static final String m2 = "ExifIFDPointer";
    public static final short m3 = 5;
    public static final short m4 = 0;
    public static final int[] m5;
    private static final d[] m6;
    private static final int m7 = 11;
    public static final String n0 = "ExposureTime";
    public static final String n1 = "LensModel";
    private static final String n2 = "GPSInfoIFDPointer";
    public static final short n3 = 6;
    public static final short n4 = 1;
    public static final int[] n5;
    private static final d[] n6;
    private static final Pattern n7;
    public static final String o0 = "FNumber";
    public static final String o1 = "LensSerialNumber";
    private static final String o2 = "InteroperabilityIFDPointer";
    public static final short o3 = 255;
    public static final short o4 = 0;
    public static final int o5 = 0;
    static final int o6 = 0;
    private static final Pattern o7;
    public static final String p0 = "ExposureProgram";
    public static final String p1 = "GPSVersionID";
    private static final String p2 = "SubIFDPointer";
    public static final short p3 = 0;
    public static final short p4 = 1;
    public static final int p5 = 1;
    private static final int p6 = 1;
    public static final String q0 = "SpectralSensitivity";
    public static final String q1 = "GPSLatitudeRef";
    private static final String q2 = "CameraSettingsIFDPointer";
    public static final short q3 = 1;
    public static final short q4 = 2;
    public static final int q5 = 2;
    private static final int q6 = 2;
    private static final String r = "ExifInterface";
    @Deprecated
    public static final String r0 = "ISOSpeedRatings";
    public static final String r1 = "GPSLatitude";
    private static final String r2 = "ImageProcessingIFDPointer";
    public static final short r3 = 2;
    public static final short r4 = 3;
    public static final int r5 = 6;
    private static final int r6 = 3;
    private static final boolean s = false;
    public static final String s0 = "PhotographicSensitivity";
    public static final String s1 = "GPSLongitudeRef";
    private static final String s2 = "HasThumbnail";
    public static final short s3 = 3;
    public static final short s4 = 0;
    public static final int s5 = 0;
    static final int s6 = 4;
    public static final String t = "ImageWidth";
    public static final String t0 = "OECF";
    public static final String t1 = "GPSLongitude";
    private static final String t2 = "ThumbnailOffset";
    public static final short t3 = 4;
    public static final short t4 = 1;
    public static final int t5 = 1;
    static final int t6 = 5;
    public static final String u = "ImageLength";
    public static final String u0 = "SensitivityType";
    public static final String u1 = "GPSAltitudeRef";
    private static final String u2 = "ThumbnailLength";
    public static final short u3 = 9;
    public static final short u4 = 2;
    private static final int u5 = 5000;
    private static final int u6 = 6;
    public static final String v = "BitsPerSample";
    public static final String v0 = "StandardOutputSensitivity";
    public static final String v1 = "GPSAltitude";
    private static final String v2 = "ThumbnailData";
    public static final short v3 = 10;
    public static final short v4 = 3;
    static final byte[] v5;
    private static final int v6 = 7;
    public static final String w = "Compression";
    public static final String w0 = "RecommendedExposureIndex";
    public static final String w1 = "GPSTimeStamp";
    private static final int w2 = 512;
    public static final short w3 = 11;
    public static final short w4 = 4;
    private static final String w5 = "FUJIFILMCCD-RAW";
    private static final int w6 = 8;
    public static final String x = "PhotometricInterpretation";
    public static final String x0 = "ISOSpeed";
    public static final String x1 = "GPSSatellites";
    public static final int x2 = 0;
    public static final short x3 = 12;
    public static final short x4 = 0;
    private static final int x5 = 84;
    private static final int x6 = 9;
    public static final String y = "Orientation";
    public static final String y0 = "ISOSpeedLatitudeyyy";
    public static final String y1 = "GPSStatus";
    public static final int y2 = 1;
    public static final short y3 = 13;
    public static final short y4 = 1;
    private static final int y5 = 160;
    static final d[][] y6;
    public static final String z = "SamplesPerPixel";
    public static final String z0 = "ISOSpeedLatitudezzz";
    public static final String z1 = "GPSMeasureMode";
    public static final int z2 = 2;
    public static final short z3 = 14;
    public static final short z4 = 2;
    private static final int z5 = 4;
    private static final d[] z6;
    private final String a;
    private final AssetManager$AssetInputStream b;
    private int c;
    private final HashMap<String, c>[] d;
    private Set<Integer> e;
    private ByteOrder f;
    private boolean g;
    private int h;
    private int i;
    private byte[] j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    
    static {
        final Integer value = 1;
        final Integer value2 = 3;
        final Integer value3 = 2;
        final Integer value4 = 8;
        G2 = Arrays.asList(value, 6, value2, value4);
        final Integer value5 = 7;
        final Integer value6 = 5;
        H2 = Arrays.asList(value3, value5, 4, value6);
        l5 = new int[] { 8, 8, 8 };
        m5 = new int[] { 4 };
        n5 = new int[] { 8 };
        v5 = new byte[] { -1, -40, -1 };
        C5 = new byte[] { 79, 76, 89, 77, 80, 0 };
        D5 = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
        b6 = new String[] { "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE" };
        c6 = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1 };
        d6 = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
        final d[] array = e6 = new d[] { new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7) };
        final d[] array2 = f6 = new d[] { new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4) };
        final d[] array3 = g6 = new d[] { new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3) };
        final d[] array4 = h6 = new d[] { new d("InteroperabilityIndex", 1, 2) };
        final d[] array5 = i6 = new d[] { new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4) };
        j6 = new d("StripOffsets", 273, 3);
        final d[][] array6 = y6 = new d[][] { array, array2, array3, array4, array5, array, k6 = new d[] { new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4) }, l6 = new d[] { new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4) }, m6 = new d[] { new d("AspectFrame", 4371, 3) }, n6 = new d[] { new d("ColorSpace", 55, 3) } };
        z6 = new d[] { new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1) };
        A6 = new d("JPEGInterchangeFormat", 513, 4);
        B6 = new d("JPEGInterchangeFormatLength", 514, 4);
        C6 = new HashMap[array6.length];
        D6 = new HashMap[array6.length];
        E6 = new HashSet<String>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        F6 = new HashMap<Integer, Integer>();
        H6 = "Exif\u0000\u0000".getBytes(G6 = Charset.forName("US-ASCII"));
        (a.J5 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss")).setTimeZone(TimeZone.getTimeZone("UTC"));
        int n8 = 0;
        while (true) {
            final d[][] y7 = a.y6;
            if (n8 >= y7.length) {
                break;
            }
            a.C6[n8] = new HashMap<Integer, d>();
            a.D6[n8] = new HashMap<String, d>();
            for (final d d7 : y7[n8]) {
                a.C6[n8].put(d7.a, d7);
                a.D6[n8].put(d7.b, d7);
            }
            ++n8;
        }
        final HashMap<Integer, Integer> f7 = a.F6;
        final d[] z7 = a.z6;
        f7.put(z7[0].a, value6);
        f7.put(z7[1].a, value);
        f7.put(z7[2].a, value3);
        f7.put(z7[3].a, value2);
        f7.put(z7[4].a, value5);
        f7.put(z7[5].a, value4);
        n7 = Pattern.compile(".*[1-9].*");
        o7 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }
    
    public a(@j0 final InputStream inputStream) throws IOException {
        final d[][] y6 = androidx.exifinterface.media.a.y6;
        this.d = (HashMap<String, c>[])new HashMap[y6.length];
        this.e = new HashSet<Integer>(y6.length);
        this.f = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            AssetManager$AssetInputStream b = null;
            this.a = null;
            if (inputStream instanceof AssetManager$AssetInputStream) {
                b = (AssetManager$AssetInputStream)inputStream;
            }
            this.b = b;
            this.O(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }
    
    public a(@j0 final String s) throws IOException {
        final d[][] y6 = androidx.exifinterface.media.a.y6;
        this.d = (HashMap<String, c>[])new HashMap[y6.length];
        this.e = new HashSet<Integer>(y6.length);
        this.f = ByteOrder.BIG_ENDIAN;
        if (s == null) {
            throw new IllegalArgumentException("filename cannot be null");
        }
        Closeable closeable = null;
        this.b = null;
        this.a = s;
        try {
            final FileInputStream fileInputStream = new FileInputStream(s);
            try {
                this.O(fileInputStream);
                b(fileInputStream);
                return;
            }
            finally {
                closeable = fileInputStream;
            }
        }
        finally {}
        b(closeable);
    }
    
    private static Pair<Integer, Integer> C(final String s) {
        final boolean contains = s.contains(",");
        int i = 1;
        final Integer value = 2;
        final Integer value2 = -1;
        if (contains) {
            final String[] split = s.split(",", -1);
            Pair c;
            final Pair<Integer, Integer> pair = (Pair<Integer, Integer>)(c = C(split[0]));
            if ((int)pair.first == 2) {
                return pair;
            }
            while (i < split.length) {
                final Pair<Integer, Integer> c2 = C(split[i]);
                int intValue;
                if (!((Integer)c2.first).equals(c.first) && !((Integer)c2.second).equals(c.first)) {
                    intValue = -1;
                }
                else {
                    intValue = (int)c.first;
                }
                int intValue2;
                if ((int)c.second != -1 && (((Integer)c2.first).equals(c.second) || ((Integer)c2.second).equals(c.second))) {
                    intValue2 = (int)c.second;
                }
                else {
                    intValue2 = -1;
                }
                if (intValue == -1 && intValue2 == -1) {
                    return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                }
                if (intValue == -1) {
                    c = new Pair((Object)intValue2, (Object)value2);
                }
                else if (intValue2 == -1) {
                    c = new Pair((Object)intValue, (Object)value2);
                }
                ++i;
            }
            return (Pair<Integer, Integer>)c;
        }
        else {
            Label_0422: {
                if (!s.contains("/")) {
                    break Label_0422;
                }
                final String[] split2 = s.split("/", -1);
                Label_0411: {
                    if (split2.length != 2) {
                        break Label_0411;
                    }
                    try {
                        final long n = (long)Double.parseDouble(split2[0]);
                        final long n2 = (long)Double.parseDouble(split2[1]);
                        if (n < 0L || n2 < 0L) {
                            return (Pair<Integer, Integer>)new Pair((Object)10, (Object)value2);
                        }
                        if (n <= 2147483647L && n2 <= 2147483647L) {
                            return (Pair<Integer, Integer>)new Pair((Object)10, (Object)5);
                        }
                        return (Pair<Integer, Integer>)new Pair((Object)5, (Object)value2);
                        return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                        try {
                            final Long value3 = Long.parseLong(s);
                            if (value3 >= 0L && value3 <= 65535L) {
                                return (Pair<Integer, Integer>)new Pair((Object)3, (Object)4);
                            }
                            if (value3 < 0L) {
                                return (Pair<Integer, Integer>)new Pair((Object)9, (Object)value2);
                            }
                            return (Pair<Integer, Integer>)new Pair((Object)4, (Object)value2);
                        }
                        catch (NumberFormatException ex) {
                            try {
                                Double.parseDouble(s);
                                return (Pair<Integer, Integer>)new Pair((Object)12, (Object)value2);
                            }
                            catch (NumberFormatException ex2) {
                                return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                            }
                        }
                    }
                    catch (NumberFormatException ex3) {
                        return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                    }
                }
            }
        }
    }
    
    private void D(final a a, final HashMap hashMap) throws IOException {
        final c c = hashMap.get("JPEGInterchangeFormat");
        final c c2 = hashMap.get("JPEGInterchangeFormatLength");
        if (c != null && c2 != null) {
            final int p2 = c.p(this.f);
            final int min = Math.min(c2.p(this.f), a.available() - p2);
            final int c3 = this.c;
            int h = 0;
            Label_0120: {
                int n;
                if (c3 != 4 && c3 != 9 && c3 != 10) {
                    h = p2;
                    if (c3 != 7) {
                        break Label_0120;
                    }
                    n = this.m;
                }
                else {
                    n = this.l;
                }
                h = p2 + n;
            }
            if (h > 0 && min > 0) {
                this.g = true;
                this.h = h;
                this.i = min;
                if (this.a == null && this.b == null) {
                    final byte[] j = new byte[min];
                    a.c(h);
                    a.readFully(j);
                    this.j = j;
                }
            }
        }
    }
    
    private void E(final a a, final HashMap hashMap) throws IOException {
        final c c = hashMap.get("StripOffsets");
        final c c2 = hashMap.get("StripByteCounts");
        if (c != null && c2 != null) {
            final long[] e = e(c.r(this.f));
            final long[] e2 = e(c2.r(this.f));
            String s;
            if (e == null) {
                s = "stripOffsets should not be null.";
            }
            else {
                if (e2 != null) {
                    long n = 0L;
                    for (int length = e2.length, i = 0; i < length; ++i) {
                        n += e2[i];
                    }
                    final int j = (int)n;
                    final byte[] k = new byte[j];
                    int l = 0;
                    int n2 = 0;
                    int n3 = 0;
                    while (l < e.length) {
                        final int n4 = (int)e[l];
                        final int n5 = (int)e2[l];
                        final int n6 = n4 - n2;
                        if (n6 < 0) {
                            Log.d("ExifInterface", "Invalid strip offset value");
                        }
                        a.c(n6);
                        final byte[] b = new byte[n5];
                        a.read(b);
                        n2 = n2 + n6 + n5;
                        System.arraycopy(b, 0, k, n3, n5);
                        n3 += n5;
                        ++l;
                    }
                    this.g = true;
                    this.j = k;
                    this.i = j;
                    return;
                }
                s = "stripByteCounts should not be null.";
            }
            Log.w("ExifInterface", s);
        }
    }
    
    private static boolean H(final byte[] array) throws IOException {
        int n = 0;
        while (true) {
            final byte[] v5 = a.v5;
            if (n >= v5.length) {
                return true;
            }
            if (array[n] != v5[n]) {
                return false;
            }
            ++n;
        }
    }
    
    private boolean I(final byte[] array) throws IOException {
        final a a = new a(array);
        a.d(this.f = this.R(a));
        final short short1 = a.readShort();
        a.close();
        return short1 == 20306 || short1 == 21330;
    }
    
    private boolean J(final byte[] array) throws IOException {
        final byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; ++i) {
            if (array[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }
    
    private boolean K(final byte[] array) throws IOException {
        final a a = new a(array);
        a.d(this.f = this.R(a));
        final short short1 = a.readShort();
        a.close();
        return short1 == 85;
    }
    
    private boolean L(final HashMap hashMap) throws IOException {
        final c c = hashMap.get("BitsPerSample");
        if (c != null) {
            final int[] a = (int[])c.r(this.f);
            final int[] l5 = androidx.exifinterface.media.a.l5;
            if (Arrays.equals(l5, a)) {
                return true;
            }
            if (this.c == 3) {
                final c c2 = hashMap.get("PhotometricInterpretation");
                if (c2 != null) {
                    final int p = c2.p(this.f);
                    if ((p == 1 && Arrays.equals(a, androidx.exifinterface.media.a.n5)) || (p == 6 && Arrays.equals(a, l5))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean M(final HashMap hashMap) throws IOException {
        final c c = hashMap.get("ImageLength");
        final c c2 = hashMap.get("ImageWidth");
        if (c != null && c2 != null) {
            final int p = c.p(this.f);
            final int p2 = c2.p(this.f);
            if (p <= 512 && p2 <= 512) {
                return true;
            }
        }
        return false;
    }
    
    private void O(@j0 final InputStream in) throws IOException {
        int i = 0;
        try {
            try {
                while (i < androidx.exifinterface.media.a.y6.length) {
                    this.d[i] = new HashMap<String, c>();
                    ++i;
                }
                final BufferedInputStream bufferedInputStream = new BufferedInputStream(in, 5000);
                this.c = this.s(bufferedInputStream);
                final a a = new a(bufferedInputStream);
                switch (this.c) {
                    case 10: {
                        this.x(a);
                        break;
                    }
                    case 9: {
                        this.u(a);
                        break;
                    }
                    case 7: {
                        this.t(a);
                        break;
                    }
                    case 4: {
                        this.p(a, 0, 0);
                        break;
                    }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 11: {
                        this.v(a);
                        break;
                    }
                }
                this.f0(a);
                this.q = true;
            }
            finally {}
        }
        catch (IOException ex) {
            this.q = false;
        }
        this.a();
        return;
        this.a();
    }
    
    private void P(final a a, int i) throws IOException {
        a.d(this.f = this.R(a));
        final int unsignedShort = a.readUnsignedShort();
        final int c = this.c;
        if (c != 7 && c != 10 && unsignedShort != 42) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid start code: ");
            sb.append(Integer.toHexString(unsignedShort));
            throw new IOException(sb.toString());
        }
        final int int1 = a.readInt();
        if (int1 < 8 || int1 >= i) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid first Ifd offset: ");
            sb2.append(int1);
            throw new IOException(sb2.toString());
        }
        i = int1 - 8;
        if (i > 0 && a.skipBytes(i) != i) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Couldn't jump to first Ifd: ");
            sb3.append(i);
            throw new IOException(sb3.toString());
        }
    }
    
    private void Q() {
        for (int i = 0; i < this.d.length; ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i);
            sb.append("]: ");
            sb.append(this.d[i].size());
            Log.d("ExifInterface", sb.toString());
            for (final Map.Entry<String, c> entry : this.d[i].entrySet()) {
                final c c = entry.getValue();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append(entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(c.toString());
                sb2.append(", tagValue: '");
                sb2.append(c.q(this.f));
                sb2.append("'");
                Log.d("ExifInterface", sb2.toString());
            }
        }
    }
    
    private ByteOrder R(final a a) throws IOException {
        final short short1 = a.readShort();
        if (short1 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (short1 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(Integer.toHexString(short1));
        throw new IOException(sb.toString());
    }
    
    private void S(final byte[] array, final int n) throws IOException {
        final a a = new a(array);
        this.P(a, array.length);
        this.T(a, n);
    }
    
    private void T(final a a, int int1) throws IOException {
        this.e.add(a.J);
        if (a.J + 2 > a.I) {
            return;
        }
        final short short1 = a.readShort();
        if (a.J + short1 * 12 <= a.I) {
            if (short1 > 0) {
            Label_1130:
                for (short n = 0; n < short1; ++n) {
                    final int unsignedShort = a.readUnsignedShort();
                    final int unsignedShort2 = a.readUnsignedShort();
                    final int int2 = a.readInt();
                    final long n2 = a.a() + 4L;
                    final d d = a.C6[int1].get(unsignedShort);
                    int c7 = 0;
                    boolean b = false;
                    long n4 = 0L;
                    Label_0412: {
                        long n3 = 0L;
                        Label_0405: {
                            Label_0398: {
                                String s = null;
                                Label_0153: {
                                    if (d != null) {
                                        if (unsignedShort2 > 0) {
                                            final int[] c6 = a.c6;
                                            if (unsignedShort2 < c6.length) {
                                                if (!d.a(unsignedShort2)) {
                                                    final StringBuilder sb = new StringBuilder();
                                                    sb.append("Skip the tag entry since data format (");
                                                    sb.append(a.b6[unsignedShort2]);
                                                    sb.append(") is unexpected for tag: ");
                                                    sb.append(d.b);
                                                    s = sb.toString();
                                                    break Label_0153;
                                                }
                                                if ((c7 = unsignedShort2) == 7) {
                                                    c7 = d.c;
                                                }
                                                n3 = c6[c7] * (long)int2;
                                                if (n3 >= 0L && n3 <= 2147483647L) {
                                                    b = true;
                                                    n4 = n3;
                                                    break Label_0412;
                                                }
                                                final StringBuilder sb2 = new StringBuilder();
                                                sb2.append("Skip the tag entry since the number of components is invalid: ");
                                                sb2.append(int2);
                                                Log.w("ExifInterface", sb2.toString());
                                                break Label_0405;
                                            }
                                        }
                                        final StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Skip the tag entry since data format is invalid: ");
                                        sb3.append(unsignedShort2);
                                        Log.w("ExifInterface", sb3.toString());
                                        break Label_0398;
                                    }
                                    final StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Skip the tag entry since tag number is not defined: ");
                                    sb4.append(unsignedShort);
                                    s = sb4.toString();
                                }
                                Log.w("ExifInterface", s);
                            }
                            n3 = 0L;
                            c7 = unsignedShort2;
                        }
                        b = false;
                        n4 = n3;
                    }
                    if (!b) {
                        a.c(n2);
                    }
                    else {
                    Label_0766_Outer:
                        while (true) {
                            long n5 = 0L;
                            Label_0707: {
                                if (n4 <= 4L) {
                                    n5 = n2;
                                    break Label_0707;
                                }
                                final int int3 = a.readInt();
                                final int c8 = this.c;
                                if (c8 == 7) {
                                    if ("MakerNote".equals(d.b)) {
                                        this.m = int3;
                                    }
                                    else if (int1 == 6 && "ThumbnailImage".equals(d.b)) {
                                        this.n = int3;
                                        this.o = int2;
                                        final c m = androidx.exifinterface.media.a.c.m(6, this.f);
                                        final c i = androidx.exifinterface.media.a.c.i(this.n, this.f);
                                        final c j = androidx.exifinterface.media.a.c.i(this.o, this.f);
                                        this.d[4].put("Compression", m);
                                        this.d[4].put("JPEGInterchangeFormat", i);
                                        this.d[4].put("JPEGInterchangeFormatLength", j);
                                    }
                                }
                                else if (c8 == 10 && "JpgFromRaw".equals(d.b)) {
                                    this.p = int3;
                                }
                                n5 = n2;
                                final long n6 = int3;
                                if (n6 + n4 <= a.I) {
                                    a.c(n6);
                                    break Label_0707;
                                }
                                final StringBuilder sb5 = new StringBuilder();
                                sb5.append("Skip the tag entry since data offset is invalid: ");
                                sb5.append(int3);
                                Log.w("ExifInterface", sb5.toString());
                                a.c(n5);
                                continue Label_1130;
                            }
                            final Integer obj = a.F6.get(unsignedShort);
                            if (obj != null) {
                                long b2 = -1L;
                                while (true) {
                                    int n7 = 0;
                                    Label_0802: {
                                        if (c7 == 3) {
                                            n7 = a.readUnsignedShort();
                                            break Label_0802;
                                        }
                                        if (c7 != 4) {
                                            if (c7 == 8) {
                                                n7 = a.readShort();
                                                break Label_0802;
                                            }
                                            if (c7 == 9 || c7 == 13) {
                                                n7 = a.readInt();
                                                break Label_0802;
                                            }
                                        }
                                        else {
                                            b2 = a.b();
                                        }
                                        String s2;
                                        if (b2 > 0L && b2 < a.I) {
                                            if (!this.e.contains((int)b2)) {
                                                a.c(b2);
                                                this.T(a, obj);
                                                continue Label_0766_Outer;
                                            }
                                            final StringBuilder sb6 = new StringBuilder();
                                            sb6.append("Skip jump into the IFD since it has already been read: IfdType ");
                                            sb6.append(obj);
                                            sb6.append(" (at ");
                                            sb6.append(b2);
                                            sb6.append(")");
                                            s2 = sb6.toString();
                                        }
                                        else {
                                            final StringBuilder sb7 = new StringBuilder();
                                            sb7.append("Skip jump into the IFD since its offset is invalid: ");
                                            sb7.append(b2);
                                            s2 = sb7.toString();
                                        }
                                        Log.w("ExifInterface", s2);
                                        continue Label_0766_Outer;
                                    }
                                    b2 = n7;
                                    continue;
                                }
                            }
                            final byte[] array = new byte[(int)n4];
                            a.readFully(array);
                            final c value = new c(c7, int2, array);
                            this.d[int1].put(d.b, value);
                            if ("DNGVersion".equals(d.b)) {
                                this.c = 3;
                            }
                            if ((("Make".equals(d.b) || "Model".equals(d.b)) && value.q(this.f).contains("PENTAX")) || ("Compression".equals(d.b) && value.p(this.f) == 65535)) {
                                this.c = 8;
                            }
                            if (a.a() != n5) {
                                continue;
                            }
                            break;
                        }
                    }
                }
                if (a.a() + 4 <= a.I) {
                    int1 = a.readInt();
                    final long n8 = int1;
                    StringBuilder sb8;
                    String str;
                    if (n8 > 0L && int1 < a.I) {
                        if (!this.e.contains(int1)) {
                            a.c(n8);
                            final HashMap<String, c>[] d2 = this.d;
                            int1 = 4;
                            if (!d2[4].isEmpty()) {
                                final HashMap<String, c>[] d3 = this.d;
                                int1 = 5;
                                if (!d3[5].isEmpty()) {
                                    return;
                                }
                            }
                            this.T(a, int1);
                            return;
                        }
                        sb8 = new StringBuilder();
                        str = "Stop reading file since re-reading an IFD may cause an infinite loop: ";
                    }
                    else {
                        sb8 = new StringBuilder();
                        str = "Stop reading file since a wrong offset may cause an infinite loop: ";
                    }
                    sb8.append(str);
                    sb8.append(int1);
                    Log.w("ExifInterface", sb8.toString());
                }
            }
        }
    }
    
    private void U(final String key) {
        for (int i = 0; i < androidx.exifinterface.media.a.y6.length; ++i) {
            this.d[i].remove(key);
        }
    }
    
    private void W(final a a, final int n) throws IOException {
        final c c = this.d[n].get("ImageLength");
        final c c2 = this.d[n].get("ImageWidth");
        if (c == null || c2 == null) {
            final c c3 = this.d[n].get("JPEGInterchangeFormat");
            if (c3 != null) {
                this.p(a, c3.p(this.f), n);
            }
        }
    }
    
    private void Z(final InputStream in, final OutputStream outputStream) throws IOException {
        final DataInputStream dataInputStream = new DataInputStream(in);
        final b b = new b(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        b.A(-1);
        if (dataInputStream.readByte() == -40) {
            b.A(-40);
            b.A(-1);
            b.A(-31);
            this.k0(b, 6);
            final byte[] array = new byte[4096];
            while (dataInputStream.readByte() == -1) {
                final byte byte1 = dataInputStream.readByte();
                if (byte1 == -39 || byte1 == -38) {
                    b.A(-1);
                    b.A(byte1);
                    f(dataInputStream, b);
                    return;
                }
                if (byte1 != -31) {
                    b.A(-1);
                    b.A(byte1);
                    int i = dataInputStream.readUnsignedShort();
                    b.e(i);
                    i -= 2;
                    if (i < 0) {
                        throw new IOException("Invalid length");
                    }
                    while (i > 0) {
                        final int read = dataInputStream.read(array, 0, Math.min(i, 4096));
                        if (read < 0) {
                            break;
                        }
                        b.write(array, 0, read);
                        i -= read;
                    }
                }
                else {
                    final int n = dataInputStream.readUnsignedShort() - 2;
                    if (n < 0) {
                        throw new IOException("Invalid length");
                    }
                    final byte[] array2 = new byte[6];
                    if (n >= 6) {
                        if (dataInputStream.read(array2) != 6) {
                            throw new IOException("Invalid exif");
                        }
                        if (Arrays.equals(array2, androidx.exifinterface.media.a.H6)) {
                            final int n2 = n - 6;
                            if (dataInputStream.skipBytes(n2) == n2) {
                                continue;
                            }
                            throw new IOException("Invalid length");
                        }
                    }
                    b.A(-1);
                    b.A(byte1);
                    b.e(n + 2);
                    int j;
                    if ((j = n) >= 6) {
                        j = n - 6;
                        b.write(array2);
                    }
                    while (j > 0) {
                        final int read2 = dataInputStream.read(array, 0, Math.min(j, 4096));
                        if (read2 < 0) {
                            break;
                        }
                        b.write(array, 0, read2);
                        j -= read2;
                    }
                }
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }
    
    private void a() {
        final String j = this.j("DateTimeOriginal");
        if (j != null && this.j("DateTime") == null) {
            this.d[0].put("DateTime", androidx.exifinterface.media.a.c.h(j));
        }
        if (this.j("ImageWidth") == null) {
            this.d[0].put("ImageWidth", androidx.exifinterface.media.a.c.i(0L, this.f));
        }
        if (this.j("ImageLength") == null) {
            this.d[0].put("ImageLength", androidx.exifinterface.media.a.c.i(0L, this.f));
        }
        if (this.j("Orientation") == null) {
            this.d[0].put("Orientation", androidx.exifinterface.media.a.c.i(0L, this.f));
        }
        if (this.j("LightSource") == null) {
            this.d[1].put("LightSource", androidx.exifinterface.media.a.c.i(0L, this.f));
        }
    }
    
    private static void b(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0016;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {
            goto Label_0016;
        }
    }
    
    private String c(double n) {
        final long lng = (long)n;
        n -= lng;
        final long lng2 = (long)(n * 60.0);
        final long round = Math.round((n - lng2 / 60.0) * 3600.0 * 1.0E7);
        final StringBuilder sb = new StringBuilder();
        sb.append(lng);
        sb.append("/1,");
        sb.append(lng2);
        sb.append("/1,");
        sb.append(round);
        sb.append("/10000000");
        return sb.toString();
    }
    
    private static double d(final String s, final String s2) {
        try {
            final String[] split = s.split(",", -1);
            final String[] split2 = split[0].split("/", -1);
            final double n = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            final String[] split3 = split[1].split("/", -1);
            final double n2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            final String[] split4 = split[2].split("/", -1);
            final double n3 = n + n2 / 60.0 + Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim()) / 3600.0;
            if (s2.equals("S") || s2.equals("W")) {
                return -n3;
            }
            if (!s2.equals("N") && !s2.equals("E")) {
                throw new IllegalArgumentException();
            }
            return n3;
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
            throw new IllegalArgumentException();
        }
    }
    
    private static long[] e(final Object o) {
        if (o instanceof int[]) {
            final int[] array = (int[])o;
            final long[] array2 = new long[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        if (o instanceof long[]) {
            return (long[])o;
        }
        return null;
    }
    
    private static int f(final InputStream inputStream, final OutputStream outputStream) throws IOException {
        final byte[] array = new byte[8192];
        int n = 0;
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            n += read;
            outputStream.write(array, 0, read);
        }
        return n;
    }
    
    private void f0(final a a) throws IOException {
        final HashMap<String, c> hashMap = this.d[4];
        final c c = hashMap.get("Compression");
        Label_0084: {
            if (c != null) {
                final int p = c.p(this.f);
                if ((this.k = p) != 1) {
                    if (p == 6) {
                        break Label_0084;
                    }
                    if (p != 7) {
                        return;
                    }
                }
                if (this.L(hashMap)) {
                    this.E(a, hashMap);
                }
                return;
            }
            else {
                this.k = 6;
            }
        }
        this.D(a, hashMap);
    }
    
    private void g0(final int n, final int n2) throws IOException {
        if (!this.d[n].isEmpty()) {
            if (!this.d[n2].isEmpty()) {
                final c c = this.d[n].get("ImageLength");
                final c c2 = this.d[n].get("ImageWidth");
                final c c3 = this.d[n2].get("ImageLength");
                final c c4 = this.d[n2].get("ImageWidth");
                if (c != null) {
                    if (c2 != null) {
                        if (c3 != null) {
                            if (c4 != null) {
                                final int p2 = c.p(this.f);
                                final int p3 = c2.p(this.f);
                                final int p4 = c3.p(this.f);
                                final int p5 = c4.p(this.f);
                                if (p2 < p4 && p3 < p5) {
                                    final HashMap<String, c>[] d = this.d;
                                    final HashMap<String, c> hashMap = d[n];
                                    d[n] = d[n2];
                                    d[n2] = hashMap;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private boolean h0(final String s, final c value) {
        int i = 0;
        boolean b = false;
        while (i < androidx.exifinterface.media.a.y6.length) {
            if (this.d[i].containsKey(s)) {
                this.d[i].put(s, value);
                b = true;
            }
            ++i;
        }
        return b;
    }
    
    private void i0(final a a, final int n) throws IOException {
        final c c = this.d[n].get("DefaultCropSize");
        final c c2 = this.d[n].get("SensorTopBorder");
        final c c3 = this.d[n].get("SensorLeftBorder");
        final c c4 = this.d[n].get("SensorBottomBorder");
        final c c5 = this.d[n].get("SensorRightBorder");
        if (c != null) {
            c value = null;
            c value2 = null;
            Label_0236: {
                StringBuilder sb;
                String str;
                if (c.a == 5) {
                    final f[] a2 = (f[])c.r(this.f);
                    if (a2 != null && a2.length == 2) {
                        value = androidx.exifinterface.media.a.c.k(a2[0], this.f);
                        value2 = androidx.exifinterface.media.a.c.k(a2[1], this.f);
                        break Label_0236;
                    }
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    str = Arrays.toString(a2);
                }
                else {
                    final int[] a3 = (int[])c.r(this.f);
                    if (a3 != null && a3.length == 2) {
                        value = androidx.exifinterface.media.a.c.m(a3[0], this.f);
                        value2 = androidx.exifinterface.media.a.c.m(a3[1], this.f);
                        break Label_0236;
                    }
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    str = Arrays.toString(a3);
                }
                sb.append(str);
                Log.w("ExifInterface", sb.toString());
                return;
            }
            this.d[n].put("ImageWidth", value);
            this.d[n].put("ImageLength", value2);
        }
        else if (c2 != null && c3 != null && c4 != null && c5 != null) {
            final int p2 = c2.p(this.f);
            final int p3 = c4.p(this.f);
            final int p4 = c5.p(this.f);
            final int p5 = c3.p(this.f);
            if (p3 > p2 && p4 > p5) {
                final c m = androidx.exifinterface.media.a.c.m(p3 - p2, this.f);
                final c i = androidx.exifinterface.media.a.c.m(p4 - p5, this.f);
                this.d[n].put("ImageLength", m);
                this.d[n].put("ImageWidth", i);
            }
        }
        else {
            this.W(a, n);
        }
    }
    
    private void j0(final InputStream inputStream) throws IOException {
        this.g0(0, 5);
        this.g0(0, 4);
        this.g0(5, 4);
        final c value = this.d[1].get("PixelXDimension");
        final c value2 = this.d[1].get("PixelYDimension");
        if (value != null && value2 != null) {
            this.d[0].put("ImageWidth", value);
            this.d[0].put("ImageLength", value2);
        }
        if (this.d[4].isEmpty() && this.M(this.d[5])) {
            final HashMap<String, c>[] d = this.d;
            d[4] = d[5];
            d[5] = new HashMap<String, c>();
        }
        if (!this.M(this.d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }
    
    private int k0(final b b, int i) throws IOException {
        final d[][] y6 = androidx.exifinterface.media.a.y6;
        final int[] array = new int[y6.length];
        final int[] array2 = new int[y6.length];
        final d[] z6 = androidx.exifinterface.media.a.z6;
        for (int length = z6.length, j = 0; j < length; ++j) {
            this.U(z6[j].b);
        }
        this.U(androidx.exifinterface.media.a.A6.b);
        this.U(androidx.exifinterface.media.a.B6.b);
        for (int k = 0; k < androidx.exifinterface.media.a.y6.length; ++k) {
            final Object[] array3 = this.d[k].entrySet().toArray();
            for (int length2 = array3.length, l = 0; l < length2; ++l) {
                final Map.Entry entry = (Map.Entry)array3[l];
                if (entry.getValue() == null) {
                    this.d[k].remove(entry.getKey());
                }
            }
        }
        if (!this.d[1].isEmpty()) {
            this.d[0].put(androidx.exifinterface.media.a.z6[1].b, androidx.exifinterface.media.a.c.i(0L, this.f));
        }
        if (!this.d[2].isEmpty()) {
            this.d[0].put(androidx.exifinterface.media.a.z6[2].b, androidx.exifinterface.media.a.c.i(0L, this.f));
        }
        if (!this.d[3].isEmpty()) {
            this.d[1].put(androidx.exifinterface.media.a.z6[3].b, androidx.exifinterface.media.a.c.i(0L, this.f));
        }
        if (this.g) {
            this.d[4].put(androidx.exifinterface.media.a.A6.b, androidx.exifinterface.media.a.c.i(0L, this.f));
            this.d[4].put(androidx.exifinterface.media.a.B6.b, androidx.exifinterface.media.a.c.i(this.i, this.f));
        }
        for (int n = 0; n < androidx.exifinterface.media.a.y6.length; ++n) {
            final Iterator<Map.Entry<String, c>> iterator = this.d[n].entrySet().iterator();
            int n2 = 0;
            while (iterator.hasNext()) {
                final int s = iterator.next().getValue().s();
                if (s > 4) {
                    n2 += s;
                }
            }
            array2[n] += n2;
        }
        int n3 = 0;
        int n4 = 8;
        while (n3 < androidx.exifinterface.media.a.y6.length) {
            int n5 = n4;
            if (!this.d[n3].isEmpty()) {
                array[n3] = n4;
                n5 = n4 + (this.d[n3].size() * 12 + 2 + 4 + array2[n3]);
            }
            ++n3;
            n4 = n5;
        }
        int n6 = n4;
        if (this.g) {
            this.d[4].put(androidx.exifinterface.media.a.A6.b, androidx.exifinterface.media.a.c.i(n4, this.f));
            this.h = i + n4;
            n6 = n4 + this.i;
        }
        final int n7 = n6 + 8;
        if (!this.d[1].isEmpty()) {
            this.d[0].put(androidx.exifinterface.media.a.z6[1].b, androidx.exifinterface.media.a.c.i(array[1], this.f));
        }
        if (!this.d[2].isEmpty()) {
            this.d[0].put(androidx.exifinterface.media.a.z6[2].b, androidx.exifinterface.media.a.c.i(array[2], this.f));
        }
        if (!this.d[3].isEmpty()) {
            this.d[1].put(androidx.exifinterface.media.a.z6[3].b, androidx.exifinterface.media.a.c.i(array[3], this.f));
        }
        b.e(n7);
        b.write(androidx.exifinterface.media.a.H6);
        short n8;
        if (this.f == ByteOrder.BIG_ENDIAN) {
            i = (n8 = 19789);
        }
        else {
            i = (n8 = 18761);
        }
        b.c(n8);
        b.a(this.f);
        b.e(42);
        b.d(8L);
        int n9;
        Iterator<Map.Entry<String, c>> iterator2;
        Map.Entry<String, c> entry2;
        int a;
        c c;
        int s2;
        Iterator<Map.Entry<String, c>> iterator3;
        byte[] c2;
        for (i = 0; i < androidx.exifinterface.media.a.y6.length; ++i) {
            if (!this.d[i].isEmpty()) {
                b.e(this.d[i].size());
                n9 = array[i] + 2 + this.d[i].size() * 12 + 4;
                iterator2 = this.d[i].entrySet().iterator();
                while (iterator2.hasNext()) {
                    entry2 = iterator2.next();
                    a = androidx.exifinterface.media.a.D6[i].get(entry2.getKey()).a;
                    c = entry2.getValue();
                    s2 = c.s();
                    b.e(a);
                    b.e(c.a);
                    b.b(c.b);
                    if (s2 > 4) {
                        b.d(n9);
                        n9 += s2;
                    }
                    else {
                        b.write(c.c);
                        if (s2 >= 4) {
                            continue;
                        }
                        while (s2 < 4) {
                            b.A(0);
                            ++s2;
                        }
                    }
                }
                if (i == 0 && !this.d[4].isEmpty()) {
                    b.d(array[4]);
                }
                else {
                    b.d(0L);
                }
                iterator3 = this.d[i].entrySet().iterator();
                while (iterator3.hasNext()) {
                    c2 = iterator3.next().getValue().c;
                    if (c2.length > 4) {
                        b.write(c2, 0, c2.length);
                    }
                }
            }
        }
        if (this.g) {
            b.write(this.A());
        }
        b.a(ByteOrder.BIG_ENDIAN);
        return n7;
    }
    
    @k0
    private c n(@j0 final String anObject) {
        String key = anObject;
        if ("ISOSpeedRatings".equals(anObject)) {
            key = "PhotographicSensitivity";
        }
        for (int i = 0; i < androidx.exifinterface.media.a.y6.length; ++i) {
            final c c = this.d[i].get(key);
            if (c != null) {
                return c;
            }
        }
        return null;
    }
    
    private void p(final a a, int n, final int n2) throws IOException {
        a.d(ByteOrder.BIG_ENDIAN);
        a.c(n);
        final byte byte1 = a.readByte();
        if (byte1 != -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid marker: ");
            sb.append(Integer.toHexString(byte1 & 0xFF));
            throw new IOException(sb.toString());
        }
        if (a.readByte() != -40) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid marker: ");
            sb2.append(Integer.toHexString(byte1 & 0xFF));
            throw new IOException(sb2.toString());
        }
        n = n + 1 + 1;
        while (true) {
            final byte byte2 = a.readByte();
            if (byte2 != -1) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Invalid marker:");
                sb3.append(Integer.toHexString(byte2 & 0xFF));
                throw new IOException(sb3.toString());
            }
            final byte byte3 = a.readByte();
            if (byte3 == -39 || byte3 == -38) {
                a.d(this.f);
                return;
            }
            final int n3 = a.readUnsignedShort() - 2;
            int l = n + 1 + 1 + 2;
            if (n3 < 0) {
                throw new IOException("Invalid length");
            }
            int n4 = 0;
            Label_0501: {
                if (byte3 != -31) {
                    if (byte3 != -2) {
                        Label_0238: {
                            switch (byte3) {
                                default: {
                                    switch (byte3) {
                                        default: {
                                            switch (byte3) {
                                                default: {
                                                    switch (byte3) {
                                                        default: {
                                                            n = n3;
                                                            n4 = l;
                                                            break Label_0501;
                                                        }
                                                        case -51:
                                                        case -50:
                                                        case -49: {
                                                            break Label_0238;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case -55:
                                                case -54:
                                                case -53: {
                                                    break Label_0238;
                                                }
                                            }
                                            break;
                                        }
                                        case -59:
                                        case -58:
                                        case -57: {
                                            break Label_0238;
                                        }
                                    }
                                    break;
                                }
                                case -64:
                                case -63:
                                case -62:
                                case -61: {
                                    if (a.skipBytes(1) == 1) {
                                        this.d[n2].put("ImageLength", androidx.exifinterface.media.a.c.i(a.readUnsignedShort(), this.f));
                                        this.d[n2].put("ImageWidth", androidx.exifinterface.media.a.c.i(a.readUnsignedShort(), this.f));
                                        n = n3 - 5;
                                        n4 = l;
                                        break Label_0501;
                                    }
                                    throw new IOException("Invalid SOFx");
                                }
                            }
                        }
                    }
                    else {
                        final byte[] array = new byte[n3];
                        if (a.read(array) != n3) {
                            throw new IOException("Invalid exif");
                        }
                        n4 = l;
                        if (this.j("UserComment") == null) {
                            this.d[1].put("UserComment", androidx.exifinterface.media.a.c.h(new String(array, a.G6)));
                            n4 = l;
                        }
                    }
                }
                else {
                    if (n3 < 6) {
                        n = n3;
                        n4 = l;
                        break Label_0501;
                    }
                    final byte[] array2 = new byte[6];
                    if (a.read(array2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    l += 6;
                    n = n3 - 6;
                    if (!Arrays.equals(array2, a.H6)) {
                        n4 = l;
                        break Label_0501;
                    }
                    if (n <= 0) {
                        throw new IOException("Invalid exif");
                    }
                    this.l = l;
                    final byte[] b = new byte[n];
                    if (a.read(b) != n) {
                        throw new IOException("Invalid exif");
                    }
                    n4 = l + n;
                    this.S(b, n2);
                }
                n = 0;
            }
            if (n < 0) {
                throw new IOException("Invalid length");
            }
            if (a.skipBytes(n) != n) {
                throw new IOException("Invalid JPEG segment");
            }
            n += n4;
        }
    }
    
    private int s(final BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        final byte[] b = new byte[5000];
        bufferedInputStream.read(b);
        bufferedInputStream.reset();
        if (H(b)) {
            return 4;
        }
        if (this.J(b)) {
            return 9;
        }
        if (this.I(b)) {
            return 7;
        }
        if (this.K(b)) {
            return 10;
        }
        return 0;
    }
    
    private void t(final a a) throws IOException {
        this.v(a);
        final c c = this.d[1].get("MakerNote");
        if (c != null) {
            final a a2 = new a(c.c);
            a2.d(this.f);
            final byte[] c2 = a.C5;
            final byte[] a3 = new byte[c2.length];
            a2.readFully(a3);
            a2.c(0L);
            final byte[] d5 = a.D5;
            final byte[] a4 = new byte[d5.length];
            a2.readFully(a4);
            Label_0122: {
                long n;
                if (Arrays.equals(a3, c2)) {
                    n = 8L;
                }
                else {
                    if (!Arrays.equals(a4, d5)) {
                        break Label_0122;
                    }
                    n = 12L;
                }
                a2.c(n);
            }
            this.T(a2, 6);
            final c value = this.d[7].get("PreviewImageStart");
            final c value2 = this.d[7].get("PreviewImageLength");
            if (value != null && value2 != null) {
                this.d[5].put("JPEGInterchangeFormat", value);
                this.d[5].put("JPEGInterchangeFormatLength", value2);
            }
            final c c3 = this.d[8].get("AspectFrame");
            if (c3 != null) {
                final int[] a5 = (int[])c3.r(this.f);
                if (a5 != null && a5.length == 4) {
                    if (a5[2] > a5[0] && a5[3] > a5[1]) {
                        final int n2 = a5[2] - a5[0] + 1;
                        final int n3 = a5[3] - a5[1] + 1;
                        int n4;
                        int n5;
                        if ((n4 = n2) < (n5 = n3)) {
                            final int n6 = n2 + n3;
                            n5 = n6 - n3;
                            n4 = n6 - n5;
                        }
                        final c m = androidx.exifinterface.media.a.c.m(n4, this.f);
                        final c i = androidx.exifinterface.media.a.c.m(n5, this.f);
                        this.d[0].put("ImageWidth", m);
                        this.d[0].put("ImageLength", i);
                    }
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(a5));
                    Log.w("ExifInterface", sb.toString());
                }
            }
        }
    }
    
    private void u(final a a) throws IOException {
        a.skipBytes(84);
        final byte[] array = new byte[4];
        final byte[] array2 = new byte[4];
        a.read(array);
        a.skipBytes(4);
        a.read(array2);
        final int int1 = ByteBuffer.wrap(array).getInt();
        final int int2 = ByteBuffer.wrap(array2).getInt();
        this.p(a, int1, 5);
        a.c(int2);
        a.d(ByteOrder.BIG_ENDIAN);
        for (int int3 = a.readInt(), i = 0; i < int3; ++i) {
            final int unsignedShort = a.readUnsignedShort();
            final int unsignedShort2 = a.readUnsignedShort();
            if (unsignedShort == a.j6.a) {
                final short short1 = a.readShort();
                final short short2 = a.readShort();
                final c m = androidx.exifinterface.media.a.c.m(short1, this.f);
                final c j = androidx.exifinterface.media.a.c.m(short2, this.f);
                this.d[0].put("ImageLength", m);
                this.d[0].put("ImageWidth", j);
                return;
            }
            a.skipBytes(unsignedShort2);
        }
    }
    
    private void v(a a) throws IOException {
        this.P(a, a.available());
        this.T(a, 0);
        this.i0(a, 0);
        this.i0(a, 5);
        this.i0(a, 4);
        this.j0(a);
        if (this.c == 8) {
            final c c = this.d[1].get("MakerNote");
            if (c != null) {
                a = new a(c.c);
                a.d(this.f);
                a.c(6L);
                this.T(a, 9);
                final c value = this.d[9].get("ColorSpace");
                if (value != null) {
                    this.d[1].put("ColorSpace", value);
                }
            }
        }
    }
    
    private void x(final a a) throws IOException {
        this.v(a);
        if (this.d[0].get("JpgFromRaw") != null) {
            this.p(a, this.p, 5);
        }
        final c value = this.d[0].get("ISO");
        final c c = this.d[1].get("PhotographicSensitivity");
        if (value != null && c == null) {
            this.d[1].put("PhotographicSensitivity", value);
        }
    }
    
    @k0
    public byte[] A() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        androidx/exifinterface/media/a.g:Z
        //     4: istore_1       
        //     5: aconst_null    
        //     6: astore_2       
        //     7: iload_1        
        //     8: ifne            13
        //    11: aconst_null    
        //    12: areturn        
        //    13: aload_0        
        //    14: getfield        androidx/exifinterface/media/a.j:[B
        //    17: astore_3       
        //    18: aload_3        
        //    19: ifnull          24
        //    22: aload_3        
        //    23: areturn        
        //    24: aload_0        
        //    25: getfield        androidx/exifinterface/media/a.b:Landroid/content/res/AssetManager$AssetInputStream;
        //    28: astore_3       
        //    29: aload_3        
        //    30: ifnull          82
        //    33: aload_3        
        //    34: astore          4
        //    36: aload_3        
        //    37: astore_2       
        //    38: aload_3        
        //    39: invokevirtual   java/io/InputStream.markSupported:()Z
        //    42: ifeq            57
        //    45: aload_3        
        //    46: astore          4
        //    48: aload_3        
        //    49: astore_2       
        //    50: aload_3        
        //    51: invokevirtual   java/io/InputStream.reset:()V
        //    54: goto            106
        //    57: aload_3        
        //    58: astore          4
        //    60: aload_3        
        //    61: astore_2       
        //    62: ldc_w           "ExifInterface"
        //    65: ldc_w           "Cannot read thumbnail from inputstream without mark/reset support"
        //    68: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    71: pop            
        //    72: aload_3        
        //    73: invokestatic    androidx/exifinterface/media/a.b:(Ljava/io/Closeable;)V
        //    76: aconst_null    
        //    77: areturn        
        //    78: astore_3       
        //    79: goto            293
        //    82: aload_0        
        //    83: getfield        androidx/exifinterface/media/a.a:Ljava/lang/String;
        //    86: ifnull          104
        //    89: new             Ljava/io/FileInputStream;
        //    92: dup            
        //    93: aload_0        
        //    94: getfield        androidx/exifinterface/media/a.a:Ljava/lang/String;
        //    97: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //   100: astore_3       
        //   101: goto            106
        //   104: aconst_null    
        //   105: astore_3       
        //   106: aload_3        
        //   107: ifnull          257
        //   110: aload_3        
        //   111: astore          4
        //   113: aload_3        
        //   114: astore_2       
        //   115: aload_3        
        //   116: aload_0        
        //   117: getfield        androidx/exifinterface/media/a.h:I
        //   120: i2l            
        //   121: invokevirtual   java/io/InputStream.skip:(J)J
        //   124: lstore          5
        //   126: aload_3        
        //   127: astore          4
        //   129: aload_3        
        //   130: astore_2       
        //   131: aload_0        
        //   132: getfield        androidx/exifinterface/media/a.h:I
        //   135: istore          7
        //   137: lload           5
        //   139: iload           7
        //   141: i2l            
        //   142: lcmp           
        //   143: ifne            226
        //   146: aload_3        
        //   147: astore          4
        //   149: aload_3        
        //   150: astore_2       
        //   151: aload_0        
        //   152: getfield        androidx/exifinterface/media/a.i:I
        //   155: newarray        B
        //   157: astore          8
        //   159: aload_3        
        //   160: astore          4
        //   162: aload_3        
        //   163: astore_2       
        //   164: aload_3        
        //   165: aload           8
        //   167: invokevirtual   java/io/InputStream.read:([B)I
        //   170: aload_0        
        //   171: getfield        androidx/exifinterface/media/a.i:I
        //   174: if_icmpne       195
        //   177: aload_3        
        //   178: astore          4
        //   180: aload_3        
        //   181: astore_2       
        //   182: aload_0        
        //   183: aload           8
        //   185: putfield        androidx/exifinterface/media/a.j:[B
        //   188: aload_3        
        //   189: invokestatic    androidx/exifinterface/media/a.b:(Ljava/io/Closeable;)V
        //   192: aload           8
        //   194: areturn        
        //   195: aload_3        
        //   196: astore          4
        //   198: aload_3        
        //   199: astore_2       
        //   200: new             Ljava/io/IOException;
        //   203: astore          8
        //   205: aload_3        
        //   206: astore          4
        //   208: aload_3        
        //   209: astore_2       
        //   210: aload           8
        //   212: ldc_w           "Corrupted image"
        //   215: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   218: aload_3        
        //   219: astore          4
        //   221: aload_3        
        //   222: astore_2       
        //   223: aload           8
        //   225: athrow         
        //   226: aload_3        
        //   227: astore          4
        //   229: aload_3        
        //   230: astore_2       
        //   231: new             Ljava/io/IOException;
        //   234: astore          8
        //   236: aload_3        
        //   237: astore          4
        //   239: aload_3        
        //   240: astore_2       
        //   241: aload           8
        //   243: ldc_w           "Corrupted image"
        //   246: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   249: aload_3        
        //   250: astore          4
        //   252: aload_3        
        //   253: astore_2       
        //   254: aload           8
        //   256: athrow         
        //   257: aload_3        
        //   258: astore          4
        //   260: aload_3        
        //   261: astore_2       
        //   262: new             Ljava/io/FileNotFoundException;
        //   265: astore          8
        //   267: aload_3        
        //   268: astore          4
        //   270: aload_3        
        //   271: astore_2       
        //   272: aload           8
        //   274: invokespecial   java/io/FileNotFoundException.<init>:()V
        //   277: aload_3        
        //   278: astore          4
        //   280: aload_3        
        //   281: astore_2       
        //   282: aload           8
        //   284: athrow         
        //   285: astore_3       
        //   286: goto            315
        //   289: astore_3       
        //   290: aconst_null    
        //   291: astore          4
        //   293: aload           4
        //   295: astore_2       
        //   296: ldc_w           "ExifInterface"
        //   299: ldc_w           "Encountered exception while getting thumbnail"
        //   302: aload_3        
        //   303: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   306: pop            
        //   307: aload           4
        //   309: invokestatic    androidx/exifinterface/media/a.b:(Ljava/io/Closeable;)V
        //   312: aconst_null    
        //   313: areturn        
        //   314: astore_3       
        //   315: aload_2        
        //   316: invokestatic    androidx/exifinterface/media/a.b:(Ljava/io/Closeable;)V
        //   319: aload_3        
        //   320: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  24     29     289    293    Ljava/io/IOException;
        //  24     29     285    289    Any
        //  38     45     78     82     Ljava/io/IOException;
        //  38     45     314    315    Any
        //  50     54     78     82     Ljava/io/IOException;
        //  50     54     314    315    Any
        //  62     72     78     82     Ljava/io/IOException;
        //  62     72     314    315    Any
        //  82     101    289    293    Ljava/io/IOException;
        //  82     101    285    289    Any
        //  115    126    78     82     Ljava/io/IOException;
        //  115    126    314    315    Any
        //  131    137    78     82     Ljava/io/IOException;
        //  131    137    314    315    Any
        //  151    159    78     82     Ljava/io/IOException;
        //  151    159    314    315    Any
        //  164    177    78     82     Ljava/io/IOException;
        //  164    177    314    315    Any
        //  182    188    78     82     Ljava/io/IOException;
        //  182    188    314    315    Any
        //  200    205    78     82     Ljava/io/IOException;
        //  200    205    314    315    Any
        //  210    218    78     82     Ljava/io/IOException;
        //  210    218    314    315    Any
        //  223    226    78     82     Ljava/io/IOException;
        //  223    226    314    315    Any
        //  231    236    78     82     Ljava/io/IOException;
        //  231    236    314    315    Any
        //  241    249    78     82     Ljava/io/IOException;
        //  241    249    314    315    Any
        //  254    257    78     82     Ljava/io/IOException;
        //  254    257    314    315    Any
        //  262    267    78     82     Ljava/io/IOException;
        //  262    267    314    315    Any
        //  272    277    78     82     Ljava/io/IOException;
        //  272    277    314    315    Any
        //  282    285    78     82     Ljava/io/IOException;
        //  282    285    314    315    Any
        //  296    307    314    315    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @k0
    public long[] B() {
        if (!this.g) {
            return null;
        }
        return new long[] { this.h, this.i };
    }
    
    public boolean F() {
        return this.g;
    }
    
    public boolean G() {
        final int l = this.l("Orientation", 1);
        return l == 2 || l == 7 || l == 4 || l == 5;
    }
    
    public boolean N() {
        final int k = this.k;
        return k == 6 || k == 7;
    }
    
    public void V() {
        this.b0("Orientation", Integer.toString(1));
    }
    
    public void X(int n) {
        if (n % 90 == 0) {
            final int l = this.l("Orientation", 1);
            final List<Integer> g2 = androidx.exifinterface.media.a.G2;
            final boolean contains = g2.contains(l);
            int intValue = 0;
            final int n2 = 0;
            Label_0160: {
                List<Integer> list = null;
                int n4 = 0;
                Label_0082: {
                    if (contains) {
                        final int n3 = n = (g2.indexOf(l) + n / 90) % 4;
                        list = g2;
                        n4 = n2;
                        if (n3 >= 0) {
                            break Label_0082;
                        }
                        list = g2;
                        n = n3;
                    }
                    else {
                        final List<Integer> h2 = androidx.exifinterface.media.a.H2;
                        if (!h2.contains(l)) {
                            break Label_0160;
                        }
                        final int n5 = n = (h2.indexOf(l) + n / 90) % 4;
                        list = h2;
                        n4 = n2;
                        if (n5 >= 0) {
                            break Label_0082;
                        }
                        n = n5;
                        list = h2;
                    }
                    n4 = 4;
                }
                intValue = list.get(n + n4);
            }
            this.b0("Orientation", Integer.toString(intValue));
            return;
        }
        throw new IllegalArgumentException("degree should be a multiple of 90");
    }
    
    public void Y() throws IOException {
        if (!this.q || this.c != 4) {
            throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
        }
        if (this.a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        this.j = this.y();
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(".tmp");
        final File file = new File(sb.toString());
        if (!new File(this.a).renameTo(file)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not rename to ");
            sb2.append(file.getAbsolutePath());
            throw new IOException(sb2.toString());
        }
        Closeable closeable;
        try {
            final FileInputStream fileInputStream = new FileInputStream(file);
            try {
                final FileOutputStream fileOutputStream = new FileOutputStream(this.a);
                try {
                    this.Z(fileInputStream, fileOutputStream);
                    b(fileInputStream);
                    b(fileOutputStream);
                    file.delete();
                    this.j = null;
                    return;
                }
                finally {}
            }
            finally {}
        }
        finally {
            closeable = null;
        }
        b(closeable);
        b(closeable);
        file.delete();
    }
    
    public void a0(final double a) {
        String s;
        if (a >= 0.0) {
            s = "0";
        }
        else {
            s = "1";
        }
        this.b0("GPSAltitude", new f(Math.abs(a)).toString());
        this.b0("GPSAltitudeRef", s);
    }
    
    public void b0(@j0 String anObject, @k0 String str) {
        final String s = str;
        String s2;
        if ("ISOSpeedRatings".equals(anObject)) {
            s2 = "PhotographicSensitivity";
        }
        else {
            s2 = anObject;
        }
        anObject = "ExifInterface";
        String s3 = s;
        Label_0240: {
            if (s != null) {
                s3 = s;
                if (androidx.exifinterface.media.a.E6.contains(s2)) {
                    StringBuilder sb = null;
                    Label_0082: {
                        if (!s2.equals("GPSTimeStamp")) {
                            try {
                                s3 = new f(Double.parseDouble(str)).toString();
                            }
                            catch (NumberFormatException ex) {
                                sb = new StringBuilder();
                                break Label_0082;
                            }
                            break Label_0240;
                        }
                        final Matcher matcher = androidx.exifinterface.media.a.o7.matcher(s);
                        if (matcher.find()) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(Integer.parseInt(matcher.group(1)));
                            sb2.append("/1,");
                            sb2.append(Integer.parseInt(matcher.group(2)));
                            sb2.append("/1,");
                            sb2.append(Integer.parseInt(matcher.group(3)));
                            sb2.append("/1");
                            s3 = sb2.toString();
                            break Label_0240;
                        }
                        sb = new StringBuilder();
                    }
                    sb.append("Invalid value for ");
                    sb.append(s2);
                    sb.append(" : ");
                    sb.append(s);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
            }
        }
        for (int i = 0; i < androidx.exifinterface.media.a.y6.length; ++i) {
            Label_1300: {
                if (i == 4 && !this.g) {
                    str = anObject;
                }
                else {
                    final d d = androidx.exifinterface.media.a.D6[i].get(s2);
                    str = anObject;
                    if (d != null) {
                        if (s3 != null) {
                            final Pair<Integer, Integer> c = C(s3);
                            int j;
                            if (d.c != (int)c.first && d.c != (int)c.second) {
                                final int d2 = d.d;
                                if (d2 != -1 && (d2 == (int)c.first || d.d == (int)c.second)) {
                                    j = d.d;
                                }
                                else {
                                    j = d.c;
                                    if (j != 1 && j != 7 && j != 2) {
                                        final StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Given tag (");
                                        sb3.append(s2);
                                        sb3.append(") value didn't match with one of expected ");
                                        sb3.append("formats: ");
                                        final String[] b6 = androidx.exifinterface.media.a.b6;
                                        sb3.append(b6[d.c]);
                                        final int d3 = d.d;
                                        final String s4 = "";
                                        if (d3 == -1) {
                                            str = "";
                                        }
                                        else {
                                            final StringBuilder sb4 = new StringBuilder();
                                            sb4.append(", ");
                                            sb4.append(b6[d.d]);
                                            str = sb4.toString();
                                        }
                                        sb3.append(str);
                                        sb3.append(" (guess: ");
                                        sb3.append(b6[(int)c.first]);
                                        if ((int)c.second == -1) {
                                            str = s4;
                                        }
                                        else {
                                            final StringBuilder sb5 = new StringBuilder();
                                            sb5.append(", ");
                                            sb5.append(b6[(int)c.second]);
                                            str = sb5.toString();
                                        }
                                        sb3.append(str);
                                        sb3.append(")");
                                        Log.w(anObject, sb3.toString());
                                        str = anObject;
                                        break Label_1300;
                                    }
                                }
                            }
                            else {
                                j = d.c;
                            }
                            HashMap<String, c> hashMap2 = null;
                            c value2 = null;
                            Label_1289: {
                                HashMap<String, c> hashMap = null;
                                c value = null;
                                switch (j) {
                                    default: {
                                        final StringBuilder sb6 = new StringBuilder();
                                        sb6.append("Data format isn't one of expected formats: ");
                                        sb6.append(j);
                                        str = sb6.toString();
                                        Log.w(anObject, str);
                                        continue;
                                    }
                                    case 12: {
                                        final String[] split = s3.split(",", -1);
                                        final double[] array = new double[split.length];
                                        for (int k = 0; k < split.length; ++k) {
                                            array[k] = Double.parseDouble(split[k]);
                                        }
                                        this.d[i].put(s2, androidx.exifinterface.media.a.c.c(array, this.f));
                                        str = anObject;
                                        break Label_1300;
                                    }
                                    case 10: {
                                        final String[] split2 = s3.split(",", -1);
                                        final f[] array2 = new f[split2.length];
                                        for (int l = 0; l < split2.length; ++l) {
                                            final String[] split3 = split2[l].split("/", -1);
                                            array2[l] = new f((long)Double.parseDouble(split3[0]), (long)Double.parseDouble(split3[1]));
                                        }
                                        hashMap = this.d[i];
                                        value = androidx.exifinterface.media.a.c.g(array2, this.f);
                                        break;
                                    }
                                    case 9: {
                                        final String[] split4 = s3.split(",", -1);
                                        final int[] array3 = new int[split4.length];
                                        for (int n = 0; n < split4.length; ++n) {
                                            array3[n] = Integer.parseInt(split4[n]);
                                        }
                                        hashMap = this.d[i];
                                        value = androidx.exifinterface.media.a.c.e(array3, this.f);
                                        break;
                                    }
                                    case 5: {
                                        final String[] split5 = s3.split(",", -1);
                                        final f[] array4 = new f[split5.length];
                                        for (int n2 = 0; n2 < split5.length; ++n2) {
                                            final String[] split6 = split5[n2].split("/", -1);
                                            array4[n2] = new f((long)Double.parseDouble(split6[0]), (long)Double.parseDouble(split6[1]));
                                        }
                                        hashMap2 = this.d[i];
                                        value2 = androidx.exifinterface.media.a.c.l(array4, this.f);
                                        break Label_1289;
                                    }
                                    case 4: {
                                        final String[] split7 = s3.split(",", -1);
                                        final long[] array5 = new long[split7.length];
                                        for (int n3 = 0; n3 < split7.length; ++n3) {
                                            array5[n3] = Long.parseLong(split7[n3]);
                                        }
                                        hashMap2 = this.d[i];
                                        value2 = androidx.exifinterface.media.a.c.j(array5, this.f);
                                        break Label_1289;
                                    }
                                    case 3: {
                                        final String[] split8 = s3.split(",", -1);
                                        final int[] array6 = new int[split8.length];
                                        for (int n4 = 0; n4 < split8.length; ++n4) {
                                            array6[n4] = Integer.parseInt(split8[n4]);
                                        }
                                        hashMap2 = this.d[i];
                                        value2 = androidx.exifinterface.media.a.c.n(array6, this.f);
                                        break Label_1289;
                                    }
                                    case 2:
                                    case 7: {
                                        hashMap2 = this.d[i];
                                        value2 = androidx.exifinterface.media.a.c.h(s3);
                                        break Label_1289;
                                    }
                                    case 1: {
                                        hashMap2 = this.d[i];
                                        value2 = androidx.exifinterface.media.a.c.a(s3);
                                        break Label_1289;
                                    }
                                }
                                hashMap.put(s2, value);
                                str = anObject;
                                break Label_1300;
                            }
                            hashMap2.put(s2, value2);
                            continue;
                        }
                        this.d[i].remove(s2);
                        str = anObject;
                    }
                }
            }
            anObject = str;
        }
    }
    
    @t0({ androidx.annotation.t0.a.G })
    public void c0(final long date) {
        this.b0("DateTime", androidx.exifinterface.media.a.J5.format(new Date(date)));
        this.b0("SubSecTime", Long.toString(date % 1000L));
    }
    
    public void d0(final Location location) {
        if (location == null) {
            return;
        }
        this.b0("GPSProcessingMethod", location.getProvider());
        this.e0(location.getLatitude(), location.getLongitude());
        this.a0(location.getAltitude());
        this.b0("GPSSpeedRef", "K");
        this.b0("GPSSpeed", new f(location.getSpeed() * TimeUnit.HOURS.toSeconds(1L) / 1000.0f).toString());
        final String[] split = androidx.exifinterface.media.a.J5.format(new Date(location.getTime())).split("\\s+", -1);
        this.b0("GPSDateStamp", split[0]);
        this.b0("GPSTimeStamp", split[1]);
    }
    
    public void e0(final double a, final double d) {
        if (a < -90.0 || a > 90.0 || Double.isNaN(a)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Latitude value ");
            sb.append(a);
            sb.append(" is not valid.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (d >= -180.0 && d <= 180.0 && !Double.isNaN(d)) {
            String s;
            if (a >= 0.0) {
                s = "N";
            }
            else {
                s = "S";
            }
            this.b0("GPSLatitudeRef", s);
            this.b0("GPSLatitude", this.c(Math.abs(a)));
            String s2;
            if (d >= 0.0) {
                s2 = "E";
            }
            else {
                s2 = "W";
            }
            this.b0("GPSLongitudeRef", s2);
            this.b0("GPSLongitude", this.c(Math.abs(d)));
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Longitude value ");
        sb2.append(d);
        sb2.append(" is not valid.");
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public void g() {
        int i = 1;
        while (true) {
            switch (this.l("Orientation", 1)) {
                default: {
                    i = 0;
                }
                case 2: {
                    this.b0("Orientation", Integer.toString(i));
                }
                case 8: {
                    i = 7;
                    continue;
                }
                case 7: {
                    i = 8;
                    continue;
                }
                case 6: {
                    i = 5;
                    continue;
                }
                case 5: {
                    i = 6;
                    continue;
                }
                case 4: {
                    i = 3;
                    continue;
                }
                case 3: {
                    i = 4;
                    continue;
                }
                case 1: {
                    i = 2;
                    continue;
                }
            }
            break;
        }
    }
    
    public void h() {
        int i = 1;
        while (true) {
            switch (this.l("Orientation", 1)) {
                default: {
                    i = 0;
                }
                case 4: {
                    this.b0("Orientation", Integer.toString(i));
                }
                case 8: {
                    i = 5;
                    continue;
                }
                case 7: {
                    i = 6;
                    continue;
                }
                case 6: {
                    i = 7;
                    continue;
                }
                case 5: {
                    i = 8;
                    continue;
                }
                case 3: {
                    i = 2;
                    continue;
                }
                case 2: {
                    i = 3;
                    continue;
                }
                case 1: {
                    i = 4;
                    continue;
                }
            }
            break;
        }
    }
    
    public double i(final double n) {
        final double k = this.k("GPSAltitude", -1.0);
        int n2 = -1;
        final int l = this.l("GPSAltitudeRef", -1);
        if (k >= 0.0 && l >= 0) {
            if (l != 1) {
                n2 = 1;
            }
            return k * n2;
        }
        return n;
    }
    
    @k0
    public String j(@j0 String o) {
        final c n = this.n(o);
        Label_0244: {
            if (n == null) {
                break Label_0244;
            }
            if (!androidx.exifinterface.media.a.E6.contains(o)) {
                return n.q(this.f);
            }
            if (o.equals("GPSTimeStamp")) {
                final int a = n.a;
                if (a != 5 && a != 10) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("GPS Timestamp format is not rational. format=");
                    sb.append(n.a);
                    o = sb.toString();
                }
                else {
                    final f[] a2 = (f[])n.r(this.f);
                    if (a2 != null && a2.length == 3) {
                        return String.format("%02d:%02d:%02d", (int)(a2[0].a / (float)a2[0].b), (int)(a2[1].a / (float)a2[1].b), (int)(a2[2].a / (float)a2[2].b));
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid GPS Timestamp array. array=");
                    sb2.append(Arrays.toString(a2));
                    o = sb2.toString();
                }
                Log.w("ExifInterface", o);
                return null;
            }
            try {
                o = Double.toString(n.o(this.f));
                return o;
                return null;
            }
            catch (NumberFormatException ex) {
                return null;
            }
        }
    }
    
    public double k(@j0 final String s, final double n) {
        final c n2 = this.n(s);
        if (n2 == null) {
            return n;
        }
        try {
            return n2.o(this.f);
        }
        catch (NumberFormatException ex) {
            return n;
        }
    }
    
    public int l(@j0 final String s, final int n) {
        final c n2 = this.n(s);
        if (n2 == null) {
            return n;
        }
        try {
            return n2.p(this.f);
        }
        catch (NumberFormatException ex) {
            return n;
        }
    }
    
    @t0({ androidx.annotation.t0.a.G })
    public long m() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "DateTime"
        //     4: invokevirtual   androidx/exifinterface/media/a.j:(Ljava/lang/String;)Ljava/lang/String;
        //     7: astore_1       
        //     8: aload_1        
        //     9: ifnull          109
        //    12: getstatic       androidx/exifinterface/media/a.n7:Ljava/util/regex/Pattern;
        //    15: aload_1        
        //    16: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    19: invokevirtual   java/util/regex/Matcher.matches:()Z
        //    22: ifne            28
        //    25: goto            109
        //    28: new             Ljava/text/ParsePosition;
        //    31: dup            
        //    32: iconst_0       
        //    33: invokespecial   java/text/ParsePosition.<init>:(I)V
        //    36: astore_2       
        //    37: getstatic       androidx/exifinterface/media/a.J5:Ljava/text/SimpleDateFormat;
        //    40: aload_1        
        //    41: aload_2        
        //    42: invokevirtual   java/text/SimpleDateFormat.parse:(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
        //    45: astore_1       
        //    46: aload_1        
        //    47: ifnonnull       54
        //    50: ldc2_w          -1
        //    53: lreturn        
        //    54: aload_1        
        //    55: invokevirtual   java/util/Date.getTime:()J
        //    58: lstore_3       
        //    59: aload_0        
        //    60: ldc_w           "SubSecTime"
        //    63: invokevirtual   androidx/exifinterface/media/a.j:(Ljava/lang/String;)Ljava/lang/String;
        //    66: astore_1       
        //    67: lload_3        
        //    68: lstore          5
        //    70: aload_1        
        //    71: ifnull          106
        //    74: aload_1        
        //    75: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    78: lstore          5
        //    80: lload           5
        //    82: ldc2_w          1000
        //    85: lcmp           
        //    86: ifle            100
        //    89: lload           5
        //    91: ldc2_w          10
        //    94: ldiv           
        //    95: lstore          5
        //    97: goto            80
        //   100: lload_3        
        //   101: lload           5
        //   103: ladd           
        //   104: lstore          5
        //   106: lload           5
        //   108: lreturn        
        //   109: ldc2_w          -1
        //   112: lreturn        
        //   113: astore_1       
        //   114: goto            109
        //   117: astore_1       
        //   118: lload_3        
        //   119: lstore          5
        //   121: goto            106
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  37     46     113    117    Ljava/lang/IllegalArgumentException;
        //  54     67     113    117    Ljava/lang/IllegalArgumentException;
        //  74     80     117    124    Ljava/lang/NumberFormatException;
        //  74     80     113    117    Ljava/lang/IllegalArgumentException;
        //  89     97     117    124    Ljava/lang/NumberFormatException;
        //  89     97     113    117    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0080:
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @t0({ androidx.annotation.t0.a.G })
    public long o() {
        final String j = this.j("GPSDateStamp");
        final String i = this.j("GPSTimeStamp");
        if (j == null || i == null) {
            return -1L;
        }
        final Pattern n7 = androidx.exifinterface.media.a.n7;
        if (!n7.matcher(j).matches() && !n7.matcher(i).matches()) {
            return -1L;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(' ');
        sb.append(i);
        final String string = sb.toString();
        final ParsePosition pos = new ParsePosition(0);
        try {
            final Date parse = androidx.exifinterface.media.a.J5.parse(string, pos);
            if (parse == null) {
                return -1L;
            }
            return parse.getTime();
        }
        catch (IllegalArgumentException ex) {
            return -1L;
        }
    }
    
    @Deprecated
    public boolean q(final float[] array) {
        final double[] r = this.r();
        if (r == null) {
            return false;
        }
        array[0] = (float)r[0];
        array[1] = (float)r[1];
        return true;
    }
    
    @k0
    public double[] r() {
        final String j = this.j("GPSLatitude");
        final String i = this.j("GPSLatitudeRef");
        final String k = this.j("GPSLongitude");
        final String l = this.j("GPSLongitudeRef");
        if (j != null && i != null && k != null && l != null) {
            try {
                return new double[] { d(j, i), d(k, l) };
            }
            catch (IllegalArgumentException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Latitude/longitude values are not parseable. ");
                sb.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", j, i, k, l));
                Log.w("ExifInterface", sb.toString());
            }
        }
        return null;
    }
    
    public int w() {
        switch (this.l("Orientation", 1)) {
            default: {
                return 0;
            }
            case 6:
            case 7: {
                return 90;
            }
            case 5:
            case 8: {
                return 270;
            }
            case 3:
            case 4: {
                return 180;
            }
        }
    }
    
    @k0
    public byte[] y() {
        final int k = this.k;
        if (k != 6 && k != 7) {
            return null;
        }
        return this.A();
    }
    
    @k0
    public Bitmap z() {
        if (!this.g) {
            return null;
        }
        if (this.j == null) {
            this.j = this.A();
        }
        final int k = this.k;
        if (k != 6 && k != 7) {
            if (k == 1) {
                final int n = this.j.length / 3;
                final int[] array = new int[n];
                for (int i = 0; i < n; ++i) {
                    final byte[] j = this.j;
                    final int n2 = i * 3;
                    array[i] = (j[n2] << 16) + 0 + (j[n2 + 1] << 8) + j[n2 + 2];
                }
                final c c = this.d[4].get("ImageLength");
                final c c2 = this.d[4].get("ImageWidth");
                if (c != null && c2 != null) {
                    return Bitmap.createBitmap(array, c2.p(this.f), c.p(this.f), Bitmap$Config.ARGB_8888);
                }
            }
            return null;
        }
        return BitmapFactory.decodeByteArray(this.j, 0, this.i);
    }
    
    private static class a extends InputStream implements DataInput
    {
        private static final ByteOrder K;
        private static final ByteOrder L;
        private DataInputStream G;
        private ByteOrder H;
        final int I;
        int J;
        
        static {
            K = ByteOrder.LITTLE_ENDIAN;
            L = ByteOrder.BIG_ENDIAN;
        }
        
        public a(final InputStream in) throws IOException {
            this.H = ByteOrder.BIG_ENDIAN;
            final DataInputStream g = new DataInputStream(in);
            this.G = g;
            final int available = g.available();
            this.I = available;
            this.J = 0;
            this.G.mark(available);
        }
        
        public a(final byte[] buf) throws IOException {
            this(new ByteArrayInputStream(buf));
        }
        
        public int a() {
            return this.J;
        }
        
        @Override
        public int available() throws IOException {
            return this.G.available();
        }
        
        public long b() throws IOException {
            return (long)this.readInt() & 0xFFFFFFFFL;
        }
        
        public void c(long n) throws IOException {
            final int j = this.J;
            if (j > n) {
                this.J = 0;
                this.G.reset();
                this.G.mark(this.I);
            }
            else {
                n -= j;
            }
            final int n2 = (int)n;
            if (this.skipBytes(n2) == n2) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }
        
        public void d(final ByteOrder h) {
            this.H = h;
        }
        
        @Override
        public int read() throws IOException {
            ++this.J;
            return this.G.read();
        }
        
        @Override
        public int read(final byte[] b, int read, final int len) throws IOException {
            read = this.G.read(b, read, len);
            this.J += read;
            return read;
        }
        
        @Override
        public boolean readBoolean() throws IOException {
            ++this.J;
            return this.G.readBoolean();
        }
        
        @Override
        public byte readByte() throws IOException {
            final int j = this.J + 1;
            this.J = j;
            if (j > this.I) {
                throw new EOFException();
            }
            final int read = this.G.read();
            if (read >= 0) {
                return (byte)read;
            }
            throw new EOFException();
        }
        
        @Override
        public char readChar() throws IOException {
            this.J += 2;
            return this.G.readChar();
        }
        
        @Override
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(this.readLong());
        }
        
        @Override
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(this.readInt());
        }
        
        @Override
        public void readFully(final byte[] b) throws IOException {
            final int j = this.J + b.length;
            this.J = j;
            if (j > this.I) {
                throw new EOFException();
            }
            if (this.G.read(b, 0, b.length) == b.length) {
                return;
            }
            throw new IOException("Couldn't read up to the length of buffer");
        }
        
        @Override
        public void readFully(final byte[] b, final int off, final int len) throws IOException {
            final int j = this.J + len;
            this.J = j;
            if (j > this.I) {
                throw new EOFException();
            }
            if (this.G.read(b, off, len) == len) {
                return;
            }
            throw new IOException("Couldn't read up to the length of buffer");
        }
        
        @Override
        public int readInt() throws IOException {
            final int j = this.J + 4;
            this.J = j;
            if (j > this.I) {
                throw new EOFException();
            }
            final int read = this.G.read();
            final int read2 = this.G.read();
            final int read3 = this.G.read();
            final int read4 = this.G.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            final ByteOrder h = this.H;
            if (h == a.K) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (h == a.L) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(this.H);
            throw new IOException(sb.toString());
        }
        
        @Override
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }
        
        @Override
        public long readLong() throws IOException {
            final int j = this.J + 8;
            this.J = j;
            if (j > this.I) {
                throw new EOFException();
            }
            final int read = this.G.read();
            final int read2 = this.G.read();
            final int read3 = this.G.read();
            final int read4 = this.G.read();
            final int read5 = this.G.read();
            final int read6 = this.G.read();
            final int read7 = this.G.read();
            final int read8 = this.G.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            final ByteOrder h = this.H;
            if (h == a.K) {
                return ((long)read8 << 56) + ((long)read7 << 48) + ((long)read6 << 40) + ((long)read5 << 32) + ((long)read4 << 24) + ((long)read3 << 16) + ((long)read2 << 8) + read;
            }
            if (h == a.L) {
                return ((long)read << 56) + ((long)read2 << 48) + ((long)read3 << 40) + ((long)read4 << 32) + ((long)read5 << 24) + ((long)read6 << 16) + ((long)read7 << 8) + read8;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(this.H);
            throw new IOException(sb.toString());
        }
        
        @Override
        public short readShort() throws IOException {
            final int j = this.J + 2;
            this.J = j;
            if (j > this.I) {
                throw new EOFException();
            }
            final int read = this.G.read();
            final int read2 = this.G.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            final ByteOrder h = this.H;
            if (h == a.K) {
                return (short)((read2 << 8) + read);
            }
            if (h == a.L) {
                return (short)((read << 8) + read2);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(this.H);
            throw new IOException(sb.toString());
        }
        
        @Override
        public String readUTF() throws IOException {
            this.J += 2;
            return this.G.readUTF();
        }
        
        @Override
        public int readUnsignedByte() throws IOException {
            ++this.J;
            return this.G.readUnsignedByte();
        }
        
        @Override
        public int readUnsignedShort() throws IOException {
            final int j = this.J + 2;
            this.J = j;
            if (j > this.I) {
                throw new EOFException();
            }
            final int read = this.G.read();
            final int read2 = this.G.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            final ByteOrder h = this.H;
            if (h == a.K) {
                return (read2 << 8) + read;
            }
            if (h == a.L) {
                return (read << 8) + read2;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(this.H);
            throw new IOException(sb.toString());
        }
        
        @Override
        public int skipBytes(int i) throws IOException {
            int min;
            for (min = Math.min(i, this.I - this.J), i = 0; i < min; i += this.G.skipBytes(min - i)) {}
            this.J += i;
            return i;
        }
    }
    
    private static class b extends FilterOutputStream
    {
        private final OutputStream G;
        private ByteOrder H;
        
        public b(final OutputStream outputStream, final ByteOrder h) {
            super(outputStream);
            this.G = outputStream;
            this.H = h;
        }
        
        public void A(final int n) throws IOException {
            this.G.write(n);
        }
        
        public void a(final ByteOrder h) {
            this.H = h;
        }
        
        public void b(int n) throws IOException {
            final ByteOrder h = this.H;
            OutputStream outputStream;
            if (h == ByteOrder.LITTLE_ENDIAN) {
                this.G.write(n >>> 0 & 0xFF);
                this.G.write(n >>> 8 & 0xFF);
                this.G.write(n >>> 16 & 0xFF);
                outputStream = this.G;
                n >>>= 24;
            }
            else {
                if (h != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.G.write(n >>> 24 & 0xFF);
                this.G.write(n >>> 16 & 0xFF);
                this.G.write(n >>> 8 & 0xFF);
                outputStream = this.G;
                n >>>= 0;
            }
            outputStream.write(n & 0xFF);
        }
        
        public void c(final short n) throws IOException {
            final ByteOrder h = this.H;
            OutputStream outputStream;
            int n2;
            if (h == ByteOrder.LITTLE_ENDIAN) {
                this.G.write(n >>> 0 & 0xFF);
                outputStream = this.G;
                n2 = n >>> 8;
            }
            else {
                if (h != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.G.write(n >>> 8 & 0xFF);
                outputStream = this.G;
                n2 = n >>> 0;
            }
            outputStream.write(n2 & 0xFF);
        }
        
        public void d(final long n) throws IOException {
            this.b((int)n);
        }
        
        public void e(final int n) throws IOException {
            this.c((short)n);
        }
        
        @Override
        public void write(final byte[] b) throws IOException {
            this.G.write(b);
        }
        
        @Override
        public void write(final byte[] b, final int off, final int len) throws IOException {
            this.G.write(b, off, len);
        }
    }
    
    private static class c
    {
        public final int a;
        public final int b;
        public final byte[] c;
        
        c(final int a, final int b, final byte[] c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static c a(final String s) {
            if (s.length() == 1 && s.charAt(0) >= '0' && s.charAt(0) <= '1') {
                return new c(1, 1, new byte[] { (byte)(s.charAt(0) - '0') });
            }
            final byte[] bytes = s.getBytes(a.G6);
            return new c(1, bytes.length, bytes);
        }
        
        public static c b(final double n, final ByteOrder byteOrder) {
            return c(new double[] { n }, byteOrder);
        }
        
        public static c c(final double[] array, final ByteOrder bo) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.c6[12] * array.length]);
            wrap.order(bo);
            for (int length = array.length, i = 0; i < length; ++i) {
                wrap.putDouble(array[i]);
            }
            return new c(12, array.length, wrap.array());
        }
        
        public static c d(final int n, final ByteOrder byteOrder) {
            return e(new int[] { n }, byteOrder);
        }
        
        public static c e(final int[] array, final ByteOrder bo) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.c6[9] * array.length]);
            wrap.order(bo);
            for (int length = array.length, i = 0; i < length; ++i) {
                wrap.putInt(array[i]);
            }
            return new c(9, array.length, wrap.array());
        }
        
        public static c f(final f f, final ByteOrder byteOrder) {
            return g(new f[] { f }, byteOrder);
        }
        
        public static c g(final f[] array, final ByteOrder bo) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.c6[10] * array.length]);
            wrap.order(bo);
            for (final f f : array) {
                wrap.putInt((int)f.a);
                wrap.putInt((int)f.b);
            }
            return new c(10, array.length, wrap.array());
        }
        
        public static c h(final String str) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('\0');
            final byte[] bytes = sb.toString().getBytes(a.G6);
            return new c(2, bytes.length, bytes);
        }
        
        public static c i(final long n, final ByteOrder byteOrder) {
            return j(new long[] { n }, byteOrder);
        }
        
        public static c j(final long[] array, final ByteOrder bo) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.c6[4] * array.length]);
            wrap.order(bo);
            for (int length = array.length, i = 0; i < length; ++i) {
                wrap.putInt((int)array[i]);
            }
            return new c(4, array.length, wrap.array());
        }
        
        public static c k(final f f, final ByteOrder byteOrder) {
            return l(new f[] { f }, byteOrder);
        }
        
        public static c l(final f[] array, final ByteOrder bo) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.c6[5] * array.length]);
            wrap.order(bo);
            for (final f f : array) {
                wrap.putInt((int)f.a);
                wrap.putInt((int)f.b);
            }
            return new c(5, array.length, wrap.array());
        }
        
        public static c m(final int n, final ByteOrder byteOrder) {
            return n(new int[] { n }, byteOrder);
        }
        
        public static c n(final int[] array, final ByteOrder bo) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.c6[3] * array.length]);
            wrap.order(bo);
            for (int length = array.length, i = 0; i < length; ++i) {
                wrap.putShort((short)array[i]);
            }
            return new c(3, array.length, wrap.array());
        }
        
        public double o(final ByteOrder byteOrder) {
            final Object r = this.r(byteOrder);
            if (r == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (r instanceof String) {
                return Double.parseDouble((String)r);
            }
            if (r instanceof long[]) {
                final long[] array = (long[])r;
                if (array.length == 1) {
                    return (double)array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else if (r instanceof int[]) {
                final int[] array2 = (int[])r;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else if (r instanceof double[]) {
                final double[] array3 = (double[])r;
                if (array3.length == 1) {
                    return array3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else {
                if (!(r instanceof f[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                final f[] array4 = (f[])r;
                if (array4.length == 1) {
                    return array4[0].a();
                }
                throw new NumberFormatException("There are more than one component");
            }
        }
        
        public int p(final ByteOrder byteOrder) {
            final Object r = this.r(byteOrder);
            if (r == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (r instanceof String) {
                return Integer.parseInt((String)r);
            }
            if (r instanceof long[]) {
                final long[] array = (long[])r;
                if (array.length == 1) {
                    return (int)array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else {
                if (!(r instanceof int[])) {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
                final int[] array2 = (int[])r;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
        }
        
        public String q(final ByteOrder byteOrder) {
            final Object r = this.r(byteOrder);
            if (r == null) {
                return null;
            }
            if (r instanceof String) {
                return (String)r;
            }
            final StringBuilder sb = new StringBuilder();
            final boolean b = r instanceof long[];
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            int i = 0;
            if (b) {
                int n4;
                for (long[] array = (long[])r; i < array.length; i = n4) {
                    sb.append(array[i]);
                    n4 = i + 1;
                    if ((i = n4) != array.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (r instanceof int[]) {
                final int[] array2 = (int[])r;
                int n5;
                for (int j = n; j < array2.length; j = n5) {
                    sb.append(array2[j]);
                    n5 = j + 1;
                    if ((j = n5) != array2.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (r instanceof double[]) {
                final double[] array3 = (double[])r;
                int n6;
                for (int k = n2; k < array3.length; k = n6) {
                    sb.append(array3[k]);
                    n6 = k + 1;
                    if ((k = n6) != array3.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (r instanceof f[]) {
                final f[] array4 = (f[])r;
                int n7;
                for (int l = n3; l < array4.length; l = n7) {
                    sb.append(array4[l].a);
                    sb.append('/');
                    sb.append(array4[l].b);
                    n7 = l + 1;
                    if ((l = n7) != array4.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            return null;
        }
        
        Object r(final ByteOrder p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     2: new             Landroidx/exifinterface/media/a$a;
            //     5: astore_3       
            //     6: aload_3        
            //     7: aload_0        
            //     8: getfield        androidx/exifinterface/media/a$c.c:[B
            //    11: invokespecial   androidx/exifinterface/media/a$a.<init>:([B)V
            //    14: aload_3        
            //    15: astore_2       
            //    16: aload_3        
            //    17: aload_1        
            //    18: invokevirtual   androidx/exifinterface/media/a$a.d:(Ljava/nio/ByteOrder;)V
            //    21: aload_3        
            //    22: astore_2       
            //    23: aload_0        
            //    24: getfield        androidx/exifinterface/media/a$c.a:I
            //    27: istore          4
            //    29: iconst_1       
            //    30: istore          5
            //    32: iconst_0       
            //    33: istore          6
            //    35: iconst_0       
            //    36: istore          7
            //    38: iconst_0       
            //    39: istore          8
            //    41: iconst_0       
            //    42: istore          9
            //    44: iconst_0       
            //    45: istore          10
            //    47: iconst_0       
            //    48: istore          11
            //    50: iconst_0       
            //    51: istore          12
            //    53: iconst_0       
            //    54: istore          13
            //    56: iconst_0       
            //    57: istore          14
            //    59: iload           4
            //    61: tableswitch {
            //                2: 807
            //                3: 622
            //                4: 563
            //                5: 504
            //                6: 433
            //                7: 807
            //                8: 622
            //                9: 374
            //               10: 315
            //               11: 242
            //               12: 182
            //               13: 127
            //          default: 124
            //        }
            //   124: goto            910
            //   127: aload_3        
            //   128: astore_2       
            //   129: aload_0        
            //   130: getfield        androidx/exifinterface/media/a$c.b:I
            //   133: newarray        D
            //   135: astore_1       
            //   136: aload_3        
            //   137: astore_2       
            //   138: iload           14
            //   140: aload_0        
            //   141: getfield        androidx/exifinterface/media/a$c.b:I
            //   144: if_icmpge       163
            //   147: aload_3        
            //   148: astore_2       
            //   149: aload_1        
            //   150: iload           14
            //   152: aload_3        
            //   153: invokevirtual   androidx/exifinterface/media/a$a.readDouble:()D
            //   156: dastore        
            //   157: iinc            14, 1
            //   160: goto            136
            //   163: aload_3        
            //   164: invokevirtual   java/io/InputStream.close:()V
            //   167: goto            180
            //   170: astore_2       
            //   171: ldc             "ExifInterface"
            //   173: ldc             "IOException occurred while closing InputStream"
            //   175: aload_2        
            //   176: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   179: pop            
            //   180: aload_1        
            //   181: areturn        
            //   182: aload_3        
            //   183: astore_2       
            //   184: aload_0        
            //   185: getfield        androidx/exifinterface/media/a$c.b:I
            //   188: newarray        D
            //   190: astore_1       
            //   191: iload           6
            //   193: istore          14
            //   195: aload_3        
            //   196: astore_2       
            //   197: iload           14
            //   199: aload_0        
            //   200: getfield        androidx/exifinterface/media/a$c.b:I
            //   203: if_icmpge       223
            //   206: aload_3        
            //   207: astore_2       
            //   208: aload_1        
            //   209: iload           14
            //   211: aload_3        
            //   212: invokevirtual   androidx/exifinterface/media/a$a.readFloat:()F
            //   215: f2d            
            //   216: dastore        
            //   217: iinc            14, 1
            //   220: goto            195
            //   223: aload_3        
            //   224: invokevirtual   java/io/InputStream.close:()V
            //   227: goto            240
            //   230: astore_2       
            //   231: ldc             "ExifInterface"
            //   233: ldc             "IOException occurred while closing InputStream"
            //   235: aload_2        
            //   236: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   239: pop            
            //   240: aload_1        
            //   241: areturn        
            //   242: aload_3        
            //   243: astore_2       
            //   244: aload_0        
            //   245: getfield        androidx/exifinterface/media/a$c.b:I
            //   248: anewarray       Landroidx/exifinterface/media/a$f;
            //   251: astore_1       
            //   252: iload           7
            //   254: istore          14
            //   256: aload_3        
            //   257: astore_2       
            //   258: iload           14
            //   260: aload_0        
            //   261: getfield        androidx/exifinterface/media/a$c.b:I
            //   264: if_icmpge       296
            //   267: aload_3        
            //   268: astore_2       
            //   269: aload_1        
            //   270: iload           14
            //   272: new             Landroidx/exifinterface/media/a$f;
            //   275: dup            
            //   276: aload_3        
            //   277: invokevirtual   androidx/exifinterface/media/a$a.readInt:()I
            //   280: i2l            
            //   281: aload_3        
            //   282: invokevirtual   androidx/exifinterface/media/a$a.readInt:()I
            //   285: i2l            
            //   286: invokespecial   androidx/exifinterface/media/a$f.<init>:(JJ)V
            //   289: aastore        
            //   290: iinc            14, 1
            //   293: goto            256
            //   296: aload_3        
            //   297: invokevirtual   java/io/InputStream.close:()V
            //   300: goto            313
            //   303: astore_2       
            //   304: ldc             "ExifInterface"
            //   306: ldc             "IOException occurred while closing InputStream"
            //   308: aload_2        
            //   309: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   312: pop            
            //   313: aload_1        
            //   314: areturn        
            //   315: aload_3        
            //   316: astore_2       
            //   317: aload_0        
            //   318: getfield        androidx/exifinterface/media/a$c.b:I
            //   321: newarray        I
            //   323: astore_1       
            //   324: iload           8
            //   326: istore          14
            //   328: aload_3        
            //   329: astore_2       
            //   330: iload           14
            //   332: aload_0        
            //   333: getfield        androidx/exifinterface/media/a$c.b:I
            //   336: if_icmpge       355
            //   339: aload_3        
            //   340: astore_2       
            //   341: aload_1        
            //   342: iload           14
            //   344: aload_3        
            //   345: invokevirtual   androidx/exifinterface/media/a$a.readInt:()I
            //   348: iastore        
            //   349: iinc            14, 1
            //   352: goto            328
            //   355: aload_3        
            //   356: invokevirtual   java/io/InputStream.close:()V
            //   359: goto            372
            //   362: astore_2       
            //   363: ldc             "ExifInterface"
            //   365: ldc             "IOException occurred while closing InputStream"
            //   367: aload_2        
            //   368: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   371: pop            
            //   372: aload_1        
            //   373: areturn        
            //   374: aload_3        
            //   375: astore_2       
            //   376: aload_0        
            //   377: getfield        androidx/exifinterface/media/a$c.b:I
            //   380: newarray        I
            //   382: astore_1       
            //   383: iload           9
            //   385: istore          14
            //   387: aload_3        
            //   388: astore_2       
            //   389: iload           14
            //   391: aload_0        
            //   392: getfield        androidx/exifinterface/media/a$c.b:I
            //   395: if_icmpge       414
            //   398: aload_3        
            //   399: astore_2       
            //   400: aload_1        
            //   401: iload           14
            //   403: aload_3        
            //   404: invokevirtual   androidx/exifinterface/media/a$a.readShort:()S
            //   407: iastore        
            //   408: iinc            14, 1
            //   411: goto            387
            //   414: aload_3        
            //   415: invokevirtual   java/io/InputStream.close:()V
            //   418: goto            431
            //   421: astore_2       
            //   422: ldc             "ExifInterface"
            //   424: ldc             "IOException occurred while closing InputStream"
            //   426: aload_2        
            //   427: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   430: pop            
            //   431: aload_1        
            //   432: areturn        
            //   433: aload_3        
            //   434: astore_2       
            //   435: aload_0        
            //   436: getfield        androidx/exifinterface/media/a$c.b:I
            //   439: anewarray       Landroidx/exifinterface/media/a$f;
            //   442: astore_1       
            //   443: iload           10
            //   445: istore          14
            //   447: aload_3        
            //   448: astore_2       
            //   449: iload           14
            //   451: aload_0        
            //   452: getfield        androidx/exifinterface/media/a$c.b:I
            //   455: if_icmpge       485
            //   458: aload_3        
            //   459: astore_2       
            //   460: aload_1        
            //   461: iload           14
            //   463: new             Landroidx/exifinterface/media/a$f;
            //   466: dup            
            //   467: aload_3        
            //   468: invokevirtual   androidx/exifinterface/media/a$a.b:()J
            //   471: aload_3        
            //   472: invokevirtual   androidx/exifinterface/media/a$a.b:()J
            //   475: invokespecial   androidx/exifinterface/media/a$f.<init>:(JJ)V
            //   478: aastore        
            //   479: iinc            14, 1
            //   482: goto            447
            //   485: aload_3        
            //   486: invokevirtual   java/io/InputStream.close:()V
            //   489: goto            502
            //   492: astore_2       
            //   493: ldc             "ExifInterface"
            //   495: ldc             "IOException occurred while closing InputStream"
            //   497: aload_2        
            //   498: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   501: pop            
            //   502: aload_1        
            //   503: areturn        
            //   504: aload_3        
            //   505: astore_2       
            //   506: aload_0        
            //   507: getfield        androidx/exifinterface/media/a$c.b:I
            //   510: newarray        J
            //   512: astore_1       
            //   513: iload           11
            //   515: istore          14
            //   517: aload_3        
            //   518: astore_2       
            //   519: iload           14
            //   521: aload_0        
            //   522: getfield        androidx/exifinterface/media/a$c.b:I
            //   525: if_icmpge       544
            //   528: aload_3        
            //   529: astore_2       
            //   530: aload_1        
            //   531: iload           14
            //   533: aload_3        
            //   534: invokevirtual   androidx/exifinterface/media/a$a.b:()J
            //   537: lastore        
            //   538: iinc            14, 1
            //   541: goto            517
            //   544: aload_3        
            //   545: invokevirtual   java/io/InputStream.close:()V
            //   548: goto            561
            //   551: astore_2       
            //   552: ldc             "ExifInterface"
            //   554: ldc             "IOException occurred while closing InputStream"
            //   556: aload_2        
            //   557: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   560: pop            
            //   561: aload_1        
            //   562: areturn        
            //   563: aload_3        
            //   564: astore_2       
            //   565: aload_0        
            //   566: getfield        androidx/exifinterface/media/a$c.b:I
            //   569: newarray        I
            //   571: astore_1       
            //   572: iload           12
            //   574: istore          14
            //   576: aload_3        
            //   577: astore_2       
            //   578: iload           14
            //   580: aload_0        
            //   581: getfield        androidx/exifinterface/media/a$c.b:I
            //   584: if_icmpge       603
            //   587: aload_3        
            //   588: astore_2       
            //   589: aload_1        
            //   590: iload           14
            //   592: aload_3        
            //   593: invokevirtual   androidx/exifinterface/media/a$a.readUnsignedShort:()I
            //   596: iastore        
            //   597: iinc            14, 1
            //   600: goto            576
            //   603: aload_3        
            //   604: invokevirtual   java/io/InputStream.close:()V
            //   607: goto            620
            //   610: astore_2       
            //   611: ldc             "ExifInterface"
            //   613: ldc             "IOException occurred while closing InputStream"
            //   615: aload_2        
            //   616: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   619: pop            
            //   620: aload_1        
            //   621: areturn        
            //   622: iload           13
            //   624: istore          14
            //   626: aload_3        
            //   627: astore_2       
            //   628: aload_0        
            //   629: getfield        androidx/exifinterface/media/a$c.b:I
            //   632: getstatic       androidx/exifinterface/media/a.d6:[B
            //   635: arraylength    
            //   636: if_icmplt       704
            //   639: iconst_0       
            //   640: istore          14
            //   642: aload_3        
            //   643: astore_2       
            //   644: getstatic       androidx/exifinterface/media/a.d6:[B
            //   647: astore_1       
            //   648: iload           5
            //   650: istore          6
            //   652: aload_3        
            //   653: astore_2       
            //   654: iload           14
            //   656: aload_1        
            //   657: arraylength    
            //   658: if_icmpge       689
            //   661: aload_3        
            //   662: astore_2       
            //   663: aload_0        
            //   664: getfield        androidx/exifinterface/media/a$c.c:[B
            //   667: iload           14
            //   669: baload         
            //   670: aload_1        
            //   671: iload           14
            //   673: baload         
            //   674: if_icmpeq       683
            //   677: iconst_0       
            //   678: istore          6
            //   680: goto            689
            //   683: iinc            14, 1
            //   686: goto            642
            //   689: iload           13
            //   691: istore          14
            //   693: iload           6
            //   695: ifeq            704
            //   698: aload_3        
            //   699: astore_2       
            //   700: aload_1        
            //   701: arraylength    
            //   702: istore          14
            //   704: aload_3        
            //   705: astore_2       
            //   706: new             Ljava/lang/StringBuilder;
            //   709: astore_1       
            //   710: aload_3        
            //   711: astore_2       
            //   712: aload_1        
            //   713: invokespecial   java/lang/StringBuilder.<init>:()V
            //   716: aload_3        
            //   717: astore_2       
            //   718: iload           14
            //   720: aload_0        
            //   721: getfield        androidx/exifinterface/media/a$c.b:I
            //   724: if_icmpge       781
            //   727: aload_3        
            //   728: astore_2       
            //   729: aload_0        
            //   730: getfield        androidx/exifinterface/media/a$c.c:[B
            //   733: iload           14
            //   735: baload         
            //   736: istore          6
            //   738: iload           6
            //   740: ifne            746
            //   743: goto            781
            //   746: iload           6
            //   748: bipush          32
            //   750: if_icmplt       766
            //   753: aload_3        
            //   754: astore_2       
            //   755: aload_1        
            //   756: iload           6
            //   758: i2c            
            //   759: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
            //   762: pop            
            //   763: goto            775
            //   766: aload_3        
            //   767: astore_2       
            //   768: aload_1        
            //   769: bipush          63
            //   771: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
            //   774: pop            
            //   775: iinc            14, 1
            //   778: goto            716
            //   781: aload_3        
            //   782: astore_2       
            //   783: aload_1        
            //   784: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   787: astore_1       
            //   788: aload_3        
            //   789: invokevirtual   java/io/InputStream.close:()V
            //   792: goto            805
            //   795: astore_2       
            //   796: ldc             "ExifInterface"
            //   798: ldc             "IOException occurred while closing InputStream"
            //   800: aload_2        
            //   801: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   804: pop            
            //   805: aload_1        
            //   806: areturn        
            //   807: aload_3        
            //   808: astore_2       
            //   809: aload_0        
            //   810: getfield        androidx/exifinterface/media/a$c.c:[B
            //   813: astore_1       
            //   814: aload_3        
            //   815: astore_2       
            //   816: aload_1        
            //   817: arraylength    
            //   818: iconst_1       
            //   819: if_icmpne       877
            //   822: aload_1        
            //   823: iconst_0       
            //   824: baload         
            //   825: iflt            877
            //   828: aload_1        
            //   829: iconst_0       
            //   830: baload         
            //   831: iconst_1       
            //   832: if_icmpgt       877
            //   835: aload_3        
            //   836: astore_2       
            //   837: new             Ljava/lang/String;
            //   840: dup            
            //   841: iconst_1       
            //   842: newarray        C
            //   844: dup            
            //   845: iconst_0       
            //   846: aload_1        
            //   847: iconst_0       
            //   848: baload         
            //   849: bipush          48
            //   851: iadd           
            //   852: i2c            
            //   853: castore        
            //   854: invokespecial   java/lang/String.<init>:([C)V
            //   857: astore_1       
            //   858: aload_3        
            //   859: invokevirtual   java/io/InputStream.close:()V
            //   862: goto            875
            //   865: astore_2       
            //   866: ldc             "ExifInterface"
            //   868: ldc             "IOException occurred while closing InputStream"
            //   870: aload_2        
            //   871: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   874: pop            
            //   875: aload_1        
            //   876: areturn        
            //   877: aload_3        
            //   878: astore_2       
            //   879: new             Ljava/lang/String;
            //   882: dup            
            //   883: aload_1        
            //   884: getstatic       androidx/exifinterface/media/a.G6:Ljava/nio/charset/Charset;
            //   887: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
            //   890: astore_1       
            //   891: aload_3        
            //   892: invokevirtual   java/io/InputStream.close:()V
            //   895: goto            908
            //   898: astore_2       
            //   899: ldc             "ExifInterface"
            //   901: ldc             "IOException occurred while closing InputStream"
            //   903: aload_2        
            //   904: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   907: pop            
            //   908: aload_1        
            //   909: areturn        
            //   910: aload_3        
            //   911: invokevirtual   java/io/InputStream.close:()V
            //   914: goto            927
            //   917: astore_1       
            //   918: ldc             "ExifInterface"
            //   920: ldc             "IOException occurred while closing InputStream"
            //   922: aload_1        
            //   923: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   926: pop            
            //   927: aconst_null    
            //   928: areturn        
            //   929: astore_2       
            //   930: aload_3        
            //   931: astore_1       
            //   932: aload_2        
            //   933: astore_3       
            //   934: goto            944
            //   937: astore_1       
            //   938: goto            979
            //   941: astore_3       
            //   942: aconst_null    
            //   943: astore_1       
            //   944: aload_1        
            //   945: astore_2       
            //   946: ldc             "ExifInterface"
            //   948: ldc             "IOException occurred during reading a value"
            //   950: aload_3        
            //   951: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   954: pop            
            //   955: aload_1        
            //   956: ifnull          976
            //   959: aload_1        
            //   960: invokevirtual   java/io/InputStream.close:()V
            //   963: goto            976
            //   966: astore_1       
            //   967: ldc             "ExifInterface"
            //   969: ldc             "IOException occurred while closing InputStream"
            //   971: aload_1        
            //   972: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   975: pop            
            //   976: aconst_null    
            //   977: areturn        
            //   978: astore_1       
            //   979: aload_2        
            //   980: ifnull          1000
            //   983: aload_2        
            //   984: invokevirtual   java/io/InputStream.close:()V
            //   987: goto            1000
            //   990: astore_2       
            //   991: ldc             "ExifInterface"
            //   993: ldc             "IOException occurred while closing InputStream"
            //   995: aload_2        
            //   996: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   999: pop            
            //  1000: aload_1        
            //  1001: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  2      14     941    944    Ljava/io/IOException;
            //  2      14     937    941    Any
            //  16     21     929    937    Ljava/io/IOException;
            //  16     21     978    979    Any
            //  23     29     929    937    Ljava/io/IOException;
            //  23     29     978    979    Any
            //  129    136    929    937    Ljava/io/IOException;
            //  129    136    978    979    Any
            //  138    147    929    937    Ljava/io/IOException;
            //  138    147    978    979    Any
            //  149    157    929    937    Ljava/io/IOException;
            //  149    157    978    979    Any
            //  163    167    170    180    Ljava/io/IOException;
            //  184    191    929    937    Ljava/io/IOException;
            //  184    191    978    979    Any
            //  197    206    929    937    Ljava/io/IOException;
            //  197    206    978    979    Any
            //  208    217    929    937    Ljava/io/IOException;
            //  208    217    978    979    Any
            //  223    227    230    240    Ljava/io/IOException;
            //  244    252    929    937    Ljava/io/IOException;
            //  244    252    978    979    Any
            //  258    267    929    937    Ljava/io/IOException;
            //  258    267    978    979    Any
            //  269    290    929    937    Ljava/io/IOException;
            //  269    290    978    979    Any
            //  296    300    303    313    Ljava/io/IOException;
            //  317    324    929    937    Ljava/io/IOException;
            //  317    324    978    979    Any
            //  330    339    929    937    Ljava/io/IOException;
            //  330    339    978    979    Any
            //  341    349    929    937    Ljava/io/IOException;
            //  341    349    978    979    Any
            //  355    359    362    372    Ljava/io/IOException;
            //  376    383    929    937    Ljava/io/IOException;
            //  376    383    978    979    Any
            //  389    398    929    937    Ljava/io/IOException;
            //  389    398    978    979    Any
            //  400    408    929    937    Ljava/io/IOException;
            //  400    408    978    979    Any
            //  414    418    421    431    Ljava/io/IOException;
            //  435    443    929    937    Ljava/io/IOException;
            //  435    443    978    979    Any
            //  449    458    929    937    Ljava/io/IOException;
            //  449    458    978    979    Any
            //  460    479    929    937    Ljava/io/IOException;
            //  460    479    978    979    Any
            //  485    489    492    502    Ljava/io/IOException;
            //  506    513    929    937    Ljava/io/IOException;
            //  506    513    978    979    Any
            //  519    528    929    937    Ljava/io/IOException;
            //  519    528    978    979    Any
            //  530    538    929    937    Ljava/io/IOException;
            //  530    538    978    979    Any
            //  544    548    551    561    Ljava/io/IOException;
            //  565    572    929    937    Ljava/io/IOException;
            //  565    572    978    979    Any
            //  578    587    929    937    Ljava/io/IOException;
            //  578    587    978    979    Any
            //  589    597    929    937    Ljava/io/IOException;
            //  589    597    978    979    Any
            //  603    607    610    620    Ljava/io/IOException;
            //  628    639    929    937    Ljava/io/IOException;
            //  628    639    978    979    Any
            //  644    648    929    937    Ljava/io/IOException;
            //  644    648    978    979    Any
            //  654    661    929    937    Ljava/io/IOException;
            //  654    661    978    979    Any
            //  663    677    929    937    Ljava/io/IOException;
            //  663    677    978    979    Any
            //  700    704    929    937    Ljava/io/IOException;
            //  700    704    978    979    Any
            //  706    710    929    937    Ljava/io/IOException;
            //  706    710    978    979    Any
            //  712    716    929    937    Ljava/io/IOException;
            //  712    716    978    979    Any
            //  718    727    929    937    Ljava/io/IOException;
            //  718    727    978    979    Any
            //  729    738    929    937    Ljava/io/IOException;
            //  729    738    978    979    Any
            //  755    763    929    937    Ljava/io/IOException;
            //  755    763    978    979    Any
            //  768    775    929    937    Ljava/io/IOException;
            //  768    775    978    979    Any
            //  783    788    929    937    Ljava/io/IOException;
            //  783    788    978    979    Any
            //  788    792    795    805    Ljava/io/IOException;
            //  809    814    929    937    Ljava/io/IOException;
            //  809    814    978    979    Any
            //  816    822    929    937    Ljava/io/IOException;
            //  816    822    978    979    Any
            //  837    858    929    937    Ljava/io/IOException;
            //  837    858    978    979    Any
            //  858    862    865    875    Ljava/io/IOException;
            //  879    891    929    937    Ljava/io/IOException;
            //  879    891    978    979    Any
            //  891    895    898    908    Ljava/io/IOException;
            //  910    914    917    927    Ljava/io/IOException;
            //  946    955    978    979    Any
            //  959    963    966    976    Ljava/io/IOException;
            //  983    987    990    1000   Ljava/io/IOException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
        
        public int s() {
            return androidx.exifinterface.media.a.c6[this.a] * this.b;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(androidx.exifinterface.media.a.b6[this.a]);
            sb.append(", data length:");
            sb.append(this.c.length);
            sb.append(")");
            return sb.toString();
        }
    }
    
    static class d
    {
        public final int a;
        public final String b;
        public final int c;
        public final int d;
        
        d(final String b, final int a, final int c) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = -1;
        }
        
        d(final String b, final int a, final int c, final int d) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = d;
        }
        
        boolean a(final int n) {
            final int c = this.c;
            if (c != 7) {
                if (n != 7) {
                    if (c != n) {
                        final int d = this.d;
                        if (d != n) {
                            return ((c == 4 || d == 4) && n == 3) || ((c == 9 || d == 9) && n == 8) || ((c == 12 || d == 12) && n == 11);
                        }
                    }
                }
            }
            return true;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.G })
    public @interface e {
    }
    
    private static class f
    {
        public final long a;
        public final long b;
        
        f(final double n) {
            this((long)(n * 10000.0), 10000L);
        }
        
        f(final long a, final long b) {
            if (b == 0L) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = a;
            this.b = b;
        }
        
        public double a() {
            return this.a / (double)this.b;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("/");
            sb.append(this.b);
            return sb.toString();
        }
    }
}
