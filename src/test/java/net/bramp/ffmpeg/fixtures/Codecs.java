package net.bramp.ffmpeg.fixtures;

import com.google.common.collect.ImmutableList;
import net.bramp.ffmpeg.info.Codec;

/**
 * Class that contains all codecs as defined in the unit tests This should not be used as a concise
 * list of available codecs, as every install of ffmpeg is different. Call ffmpeg.codec() to
 * discover.
 *
 * @author bramp
 */
public final class Codecs {

  private Codecs() {
    throw new AssertionError("No instances for you!");
  }

  public static final ImmutableList<Codec> CODECS =
      new ImmutableList.Builder<Codec>()
          .add(
              new Codec("4xm", "4X Movie", "D V D "),
              new Codec("8bps", "QuickTime 8BPS video", "D V D "),
              new Codec("8svx_exp", "8SVX exponential", "D A D "),
              new Codec("8svx_fib", "8SVX fibonacci", "D A D "),
              new Codec("a64multi", "Multicolor charset for Commodore 64", " EV   "),
              new Codec("aac", "Advanced Audio Coding", "DEA D "),
              new Codec("aac_latm", "AAC LATM (Advanced Audio Codec LATM syntax)", "D A D "),
              new Codec("aasc", "Autodesk RLE", "D V D "),
              new Codec("ac3", "ATSC A/52A (AC-3)", "DEA D "),
              new Codec("ac3_fixed", "ATSC A/52A (AC-3)", " EA   "),
              new Codec("adpcm_4xm", "ADPCM 4X Movie", "D A D "),
              new Codec("adpcm_adx", "SEGA CRI ADX ADPCM", "DEA D "),
              new Codec("adpcm_ct", "ADPCM Creative Technology", "D A D "),
              new Codec("adpcm_ea", "ADPCM Electronic Arts", "D A D "),
              new Codec("adpcm_ea_maxis_xa", "ADPCM Electronic Arts Maxis CDROM XA", "D A D "),
              new Codec("adpcm_ea_r1", "ADPCM Electronic Arts R1", "D A D "),
              new Codec("adpcm_ea_r2", "ADPCM Electronic Arts R2", "D A D "),
              new Codec("adpcm_ea_r3", "ADPCM Electronic Arts R3", "D A D "),
              new Codec("adpcm_ea_xas", "ADPCM Electronic Arts XAS", "D A D "),
              new Codec("adpcm_ima_amv", "ADPCM IMA AMV", "D A D "),
              new Codec("adpcm_ima_apc", "ADPCM IMA CRYO APC", "D A D "),
              new Codec("adpcm_ima_dk3", "ADPCM IMA Duck DK3", "D A D "),
              new Codec("adpcm_ima_dk4", "ADPCM IMA Duck DK4", "D A D "),
              new Codec("adpcm_ima_ea_eacs", "ADPCM IMA Electronic Arts EACS", "D A D "),
              new Codec("adpcm_ima_ea_sead", "ADPCM IMA Electronic Arts SEAD", "D A D "),
              new Codec("adpcm_ima_iss", "ADPCM IMA Funcom ISS", "D A D "),
              new Codec("adpcm_ima_qt", "ADPCM IMA QuickTime", "DEA D "),
              new Codec("adpcm_ima_smjpeg", "ADPCM IMA Loki SDL MJPEG", "D A D "),
              new Codec("adpcm_ima_wav", "ADPCM IMA WAV", "DEA D "),
              new Codec("adpcm_ima_ws", "ADPCM IMA Westwood", "D A D "),
              new Codec("adpcm_ms", "ADPCM Microsoft", "DEA D "),
              new Codec("adpcm_sbpro_2", "ADPCM Sound Blaster Pro 2-bit", "D A D "),
              new Codec("adpcm_sbpro_3", "ADPCM Sound Blaster Pro 2.6-bit", "D A D "),
              new Codec("adpcm_sbpro_4", "ADPCM Sound Blaster Pro 4-bit", "D A D "),
              new Codec("adpcm_swf", "ADPCM Shockwave Flash", "DEA D "),
              new Codec("adpcm_thp", "ADPCM Nintendo Gamecube THP", "D A D "),
              new Codec("adpcm_xa", "ADPCM CDROM XA", "D A D "),
              new Codec("adpcm_yamaha", "ADPCM Yamaha", "DEA D "),
              new Codec("alac", "ALAC (Apple Lossless Audio Codec)", "DEA D "),
              new Codec("als", "MPEG-4 Audio Lossless Coding (ALS)", "D A D "),
              new Codec("amrnb", "Adaptive Multi-Rate NarrowBand", "D A D "),
              new Codec("amrwb", "Adaptive Multi-Rate WideBand", "D A D "),
              new Codec("amv", "AMV Video", "DEV   "),
              new Codec("anm", "Deluxe Paint Animation", "D V D "),
              new Codec("ansi", "ASCII/ANSI art", "D V D "),
              new Codec("ape", "Monkey's Audio", "D A D "),
              new Codec("ass", "Advanced SubStation Alpha subtitle", "DES   "),
              new Codec("asv1", "ASUS V1", "DEV D "),
              new Codec("asv2", "ASUS V2", "DEV D "),
              new Codec("atrac1", "Atrac 1 (Adaptive TRansform Acoustic Coding)", "D A D "),
              new Codec("atrac3", "Atrac 3 (Adaptive TRansform Acoustic Coding 3)", "D A D "),
              new Codec("aura", "Auravision AURA", "D V D "),
              new Codec("aura2", "Auravision Aura 2", "D V D "),
              new Codec("avrp", "Avid 1:1 10-bit RGB Packer", "DEV D "),
              new Codec("avs", "AVS (Audio Video Standard) video", "D V D "),
              new Codec("bethsoftvid", "Bethesda VID video", "D V D "),
              new Codec("bfi", "Brute Force & Ignorance", "D V D "),
              new Codec("binkaudio_dct", "Bink Audio (DCT)", "D A D "),
              new Codec("binkaudio_rdft", "Bink Audio (RDFT)", "D A D "),
              new Codec("binkvideo", "Bink video", "D V   "),
              new Codec("bintext", "Binary text", "D V D "),
              new Codec("bmp", "BMP image", "DEV D "),
              new Codec("bmv_audio", "Discworld II BMV audio", "D A D "),
              new Codec("bmv_video", "Discworld II BMV video", "D V   "),
              new Codec("c93", "Interplay C93", "D V D "),
              new Codec("camstudio", "CamStudio", "D V D "),
              new Codec("camtasia", "TechSmith Screen Capture Codec", "D V D "),
              new Codec("cavs", "Chinese AVS video (AVS1-P2, JiZhun profile)", "D V D "),
              new Codec("cdgraphics", "CD Graphics video", "D V D "),
              new Codec("cinepak", "Cinepak", "D V D "),
              new Codec("cljr", "Cirrus Logic AccuPak", "DEV D "),
              new Codec("cook", "COOK", "D A D "),
              new Codec("cyuv", "Creative YUV (CYUV)", "D V D "),
              new Codec("dca", "DCA (DTS Coherent Acoustics)", "DEA D "),
              new Codec("dfa", "Chronomaster DFA", "D V D "),
              new Codec("dirac", "BBC Dirac VC-2", "D V   "),
              new Codec("dnxhd", "VC3/DNxHD", "DEV D "),
              new Codec("dpx", "DPX image", "DEV   "),
              new Codec("dsicinaudio", "Delphine Software International CIN audio", "D A D "),
              new Codec("dsicinvideo", "Delphine Software International CIN video", "D V D "),
              new Codec("dvbsub", "DVB subtitles", "DES   "),
              new Codec("dvdsub", "DVD subtitles", "DES   "),
              new Codec("dvvideo", "DV (Digital Video)", "DEV D "),
              new Codec("dxa", "Feeble Files/ScummVM DXA", "D V D "),
              new Codec("dxtory", "Dxtory", "D V D "),
              new Codec("eac3", "ATSC A/52 E-AC-3", "DEA D "),
              new Codec("eacmv", "Electronic Arts CMV video", "D V D "),
              new Codec("eamad", "Electronic Arts Madcow Video", "D V D "),
              new Codec("eatgq", "Electronic Arts TGQ video", "D V D "),
              new Codec("eatgv", "Electronic Arts TGV video", "D V   "),
              new Codec("eatqi", "Electronic Arts TQI Video", "D V D "),
              new Codec("escape124", "Escape 124", "D V D "),
              new Codec("escape130", "Escape 130", "D V D "),
              new Codec("ffv1", "FFmpeg video codec #1", "DEV D "),
              new Codec("ffvhuff", "Huffyuv FFmpeg variant", "DEVSD "),
              new Codec("flac", "FLAC (Free Lossless Audio Codec)", "DEA D "),
              new Codec("flashsv", "Flash Screen Video", "DEV D "),
              new Codec("flashsv2", "Flash Screen Video Version 2", "DEV D "),
              new Codec("flic", "Autodesk Animator Flic video", "D V D "),
              new Codec("flv", "Flash Video (FLV) / Sorenson Spark / Sorenson H.263", "DEVSD "),
              new Codec("fraps", "Fraps", "D V D "),
              new Codec("frwu", "Forward Uncompressed", "D V D "),
              new Codec("g722", "G.722 ADPCM", "DEA D "),
              new Codec("g723_1", "G.723.1", "DEA   "),
              new Codec("g726", "G.726 ADPCM", "DEA D "),
              new Codec("g729", "G.729", "D A D "),
              new Codec("gif", "GIF (Graphics Interchange Format)", "DEV D "),
              new Codec("gsm", "GSM", "D A D "),
              new Codec("gsm_ms", "GSM Microsoft variant", "D A D "),
              new Codec("h261", "H.261", "DEV D "),
              new Codec("h263", "H.263 / H.263-1996", "DEVSDT"),
              new Codec("h263i", "Intel H.263", "D VSD "),
              new Codec("h263p", "H.263+ / H.263-1998 / H.263 version 2", " EV   "),
              new Codec("h264", "H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10", "D V D "),
              new Codec("huffyuv", "Huffyuv / HuffYUV", "DEVSD "),
              new Codec("idcinvideo", "id Quake II CIN video", "D V D "),
              new Codec("idf", "iCEDraw text", "D V D "),
              new Codec("iff_byterun1", "IFF ByteRun1", "D V D "),
              new Codec("iff_ilbm", "IFF ILBM", "D V D "),
              new Codec("imc", "IMC (Intel Music Coder)", "D A D "),
              new Codec("indeo2", "Intel Indeo 2", "D V D "),
              new Codec("indeo3", "Intel Indeo 3", "D V   "),
              new Codec("indeo4", "Intel Indeo Video Interactive 4", "D V   "),
              new Codec("indeo5", "Intel Indeo Video Interactive 5", "D V   "),
              new Codec("interplay_dpcm", "DPCM Interplay", "D A D "),
              new Codec("interplayvideo", "Interplay MVE video", "D V D "),
              new Codec("j2k", "JPEG 2000", "DEV   "),
              new Codec("jpegls", "JPEG-LS", "DEV D "),
              new Codec("jv", "Bitmap Brothers JV video", "D V D "),
              new Codec("kgv1", "Kega Game Video", "D V   "),
              new Codec("kmvc", "Karl Morton's video codec", "D V D "),
              new Codec("lagarith", "Lagarith lossless", "D V D "),
              new Codec("libgsm", "libgsm GSM", "DEA D "),
              new Codec("libgsm_ms", "libgsm GSM Microsoft variant", "DEA D "),
              new Codec("libmp3lame", "libmp3lame MP3 (MPEG audio layer 3)", " EA   "),
              new Codec("libopenjpeg", "OpenJPEG based JPEG 2000 encoder", "DEV D "),
              new Codec("libschroedinger", "libschroedinger Dirac 2.2", "DEV   "),
              new Codec("libspeex", "libspeex Speex", "DEA D "),
              new Codec("libtheora", "libtheora Theora", " EV   "),
              new Codec("libvorbis", "libvorbis Vorbis", " EA   "),
              new Codec("libvpx", "libvpx VP8", "DEV   "),
              new Codec("libx264", "libx264 H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10", " EV   "),
              new Codec(
                  "libx264rgb", "libx264 H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10 RGB", " EV   "),
              new Codec("ljpeg", "Lossless JPEG", " EV   "),
              new Codec("loco", "LOCO", "D V D "),
              new Codec("mace3", "MACE (Macintosh Audio Compression/Expansion) 3:1", "D A D "),
              new Codec("mace6", "MACE (Macintosh Audio Compression/Expansion) 6:1", "D A D "),
              new Codec("mdec", "Sony PlayStation MDEC (Motion DECoder)", "D V D "),
              new Codec("mimic", "Mimic", "D V D "),
              new Codec("mjpeg", "MJPEG (Motion JPEG)", "DEV D "),
              new Codec("mjpegb", "Apple MJPEG-B", "D V D "),
              new Codec("mlp", "MLP (Meridian Lossless Packing)", "D A D "),
              new Codec("mmvideo", "American Laser Games MM Video", "D V D "),
              new Codec("motionpixels", "Motion Pixels video", "D V D "),
              new Codec("mp1", "MP1 (MPEG audio layer 1)", "D A D "),
              new Codec("mp1float", "MP1 (MPEG audio layer 1)", "D A D "),
              new Codec("mp2", "MP2 (MPEG audio layer 2)", "DEA D "),
              new Codec("mp2float", "MP2 (MPEG audio layer 2)", "D A D "),
              new Codec("mp3", "MP3 (MPEG audio layer 3)", "D A D "),
              new Codec("mp3adu", "ADU (Application Data Unit) MP3 (MPEG audio layer 3)", "D A D "),
              new Codec(
                  "mp3adufloat", "ADU (Application Data Unit) MP3 (MPEG audio layer 3)", "D A D "),
              new Codec("mp3float", "MP3 (MPEG audio layer 3)", "D A D "),
              new Codec("mp3on4", "MP3onMP4", "D A D "),
              new Codec("mp3on4float", "MP3onMP4", "D A D "),
              new Codec("mpc7", "Musepack SV7", "D A D "),
              new Codec("mpc8", "Musepack SV8", "D A D "),
              new Codec("mpeg1video", "MPEG-1 video", "DEVSDT"),
              new Codec("mpeg1video_vdpau", "MPEG-1 video (VDPAU acceleration)", "D V DT"),
              new Codec("mpeg2video", "MPEG-2 video", "DEVSDT"),
              new Codec("mpeg4", "MPEG-4 part 2", "DEVSDT"),
              new Codec("mpeg4_vdpau", "MPEG-4 part 2 (VDPAU)", "D V DT"),
              new Codec("mpegvideo", "MPEG-1 video", "D VSDT"),
              new Codec("mpegvideo_vdpau", "MPEG-1/2 video (VDPAU acceleration)", "D V DT"),
              new Codec(
                  "mpegvideo_xvmc", "MPEG-1/2 video XvMC (X-Video Motion Compensation)", "D VSDT"),
              new Codec("msmpeg4", "MPEG-4 part 2 Microsoft variant version 3", "DEVSD "),
              new Codec("msmpeg4v1", "MPEG-4 part 2 Microsoft variant version 1", "D VSD "),
              new Codec("msmpeg4v2", "MPEG-4 part 2 Microsoft variant version 2", "DEVSD "),
              new Codec("msrle", "Microsoft RLE", "D V D "),
              new Codec("msvideo1", "Microsoft Video-1", "DEV D "),
              new Codec("mszh", "LCL (LossLess Codec Library) MSZH", "D V D "),
              new Codec("mxpeg", "Mobotix MxPEG video", "D V D "),
              new Codec("nellymoser", "Nellymoser Asao", "DEA D "),
              new Codec("nuv", "NuppelVideo/RTJPEG", "D V D "),
              new Codec("pam", "PAM (Portable AnyMap) image", "DEV D "),
              new Codec("pbm", "PBM (Portable BitMap) image", "DEV D "),
              new Codec("pcm_alaw", "PCM A-law", "DEA D "),
              new Codec(
                  "pcm_bluray", "PCM signed 16|20|24-bit big-endian for Blu-ray media", "D A D "),
              new Codec("pcm_dvd", "PCM signed 20|24-bit big-endian", "D A D "),
              new Codec("pcm_f32be", "PCM 32-bit floating point big-endian", "DEA D "),
              new Codec("pcm_f32le", "PCM 32-bit floating point little-endian", "DEA D "),
              new Codec("pcm_f64be", "PCM 64-bit floating point big-endian", "DEA D "),
              new Codec("pcm_f64le", "PCM 64-bit floating point little-endian", "DEA D "),
              new Codec("pcm_lxf", "PCM signed 20-bit little-endian planar", "D A D "),
              new Codec("pcm_mulaw", "PCM mu-law", "DEA D "),
              new Codec("pcm_s16be", "PCM signed 16-bit big-endian", "DEA D "),
              new Codec("pcm_s16le", "PCM signed 16-bit little-endian", "DEA D "),
              new Codec("pcm_s16le_planar", "PCM 16-bit little-endian planar", "D A D "),
              new Codec("pcm_s24be", "PCM signed 24-bit big-endian", "DEA D "),
              new Codec("pcm_s24daud", "PCM D-Cinema audio signed 24-bit", "DEA D "),
              new Codec("pcm_s24le", "PCM signed 24-bit little-endian", "DEA D "),
              new Codec("pcm_s32be", "PCM signed 32-bit big-endian", "DEA D "),
              new Codec("pcm_s32le", "PCM signed 32-bit little-endian", "DEA D "),
              new Codec("pcm_s8", "PCM signed 8-bit", "DEA D "),
              new Codec("pcm_s8_planar", "PCM signed 8-bit planar", "D A D "),
              new Codec("pcm_u16be", "PCM unsigned 16-bit big-endian", "DEA D "),
              new Codec("pcm_u16le", "PCM unsigned 16-bit little-endian", "DEA D "),
              new Codec("pcm_u24be", "PCM unsigned 24-bit big-endian", "DEA D "),
              new Codec("pcm_u24le", "PCM unsigned 24-bit little-endian", "DEA D "),
              new Codec("pcm_u32be", "PCM unsigned 32-bit big-endian", "DEA D "),
              new Codec("pcm_u32le", "PCM unsigned 32-bit little-endian", "DEA D "),
              new Codec("pcm_u8", "PCM unsigned 8-bit", "DEA D "),
              new Codec("pcm_zork", "PCM Zork", "D A D "),
              new Codec("pcx", "PC Paintbrush PCX image", "DEV D "),
              new Codec("pgm", "PGM (Portable GrayMap) image", "DEV D "),
              new Codec("pgmyuv", "PGMYUV (Portable GrayMap YUV) image", "DEV D "),
              new Codec("pgssub", "HDMV Presentation Graphic Stream subtitles", "D S   "),
              new Codec("pictor", "Pictor/PC Paint", "D V D "),
              new Codec("png", "PNG image", "DEV D "),
              new Codec("ppm", "PPM (Portable PixelMap) image", "DEV D "),
              new Codec("prores", "Apple ProRes", "DEV D "),
              new Codec("prores_lgpl", "Apple ProRes (iCodec Pro)", "D V D "),
              new Codec("ptx", "V.Flash PTX image", "D V D "),
              new Codec("qcelp", "QCELP / PureVoice", "D A D "),
              new Codec("qdm2", "QDesign Music Codec 2", "D A D "),
              new Codec("qdraw", "Apple QuickDraw", "D V D "),
              new Codec("qpeg", "Q-team QPEG", "D V D "),
              new Codec("qtrle", "QuickTime Animation (RLE) video", "DEV D "),
              new Codec("r10k", "AJA Kona 10-bit RGB Codec", "DEV D "),
              new Codec("r210", "Uncompressed RGB 10-bit", "DEV D "),
              new Codec("rawvideo", "raw video", "DEV   "),
              new Codec("real_144", "RealAudio 1.0 (14.4K) encoder", "DEA D "),
              new Codec("real_288", "RealAudio 2.0 (28.8K)", "D A D "),
              new Codec("rl2", "RL2 video", "D V D "),
              new Codec("roq_dpcm", "id RoQ DPCM", "DEA D "),
              new Codec("roqvideo", "id RoQ video", "DEV D "),
              new Codec("rpza", "QuickTime video (RPZA)", "D V D "),
              new Codec("rv10", "RealVideo 1.0", "DEV D "),
              new Codec("rv20", "RealVideo 2.0", "DEV D "),
              new Codec("rv30", "RealVideo 3.0", "D V D "),
              new Codec("rv40", "RealVideo 4.0", "D V D "),
              new Codec("s302m", "SMPTE 302M", "D A D "),
              new Codec("sgi", "SGI image", "DEV   "),
              new Codec("shorten", "Shorten", "D A D "),
              new Codec("sipr", "RealAudio SIPR / ACELP.NET", "D A D "),
              new Codec("smackaud", "Smacker audio", "D A D "),
              new Codec("smackvid", "Smacker video", "D V D "),
              new Codec("smc", "QuickTime Graphics (SMC)", "D V D "),
              new Codec("snow", "Snow", "DEV D "),
              new Codec("sol_dpcm", "DPCM Sol", "D A D "),
              new Codec("sonic", "Sonic", "DEA D "),
              new Codec("sonicls", "Sonic lossless", " EA   "),
              new Codec("sp5x", "Sunplus JPEG (SP5X)", "D V D "),
              new Codec("srt", "SubRip subtitle", "DES   "),
              new Codec("sunrast", "Sun Rasterfile image", "D V D "),
              new Codec("svq1", "Sorenson Vector Quantizer 1 / Sorenson Video 1 / SVQ1", "DEV D "),
              new Codec("svq3", "Sorenson Vector Quantizer 3 / Sorenson Video 3 / SVQ3", "D VSD "),
              new Codec("targa", "Truevision Targa image", "DEV D "),
              new Codec("theora", "Theora", "D VSD "),
              new Codec("thp", "Nintendo Gamecube THP video", "D V D "),
              new Codec("tiertexseqvideo", "Tiertex Limited SEQ video", "D V D "),
              new Codec("tiff", "TIFF image", "DEV D "),
              new Codec("tmv", "8088flex TMV", "D V D "),
              new Codec("truehd", "TrueHD", "D A D "),
              new Codec("truemotion1", "Duck TrueMotion 1.0", "D V D "),
              new Codec("truemotion2", "Duck TrueMotion 2.0", "D V D "),
              new Codec("truespeech", "DSP Group TrueSpeech", "D A D "),
              new Codec("tta", "True Audio (TTA)", "D A D "),
              new Codec("twinvq", "VQF TwinVQ", "D A D "),
              new Codec("txd", "Renderware TXD (TeXture Dictionary) image", "D V D "),
              new Codec("ultimotion", "IBM UltiMotion", "D V D "),
              new Codec("utvideo", "Ut Video", "D V D "),
              new Codec("v210", "Uncompressed 4:2:2 10-bit", "DEV D "),
              new Codec("v210x", "Uncompressed 4:2:2 10-bit", "D V D "),
              new Codec("v308", "Uncompressed packed 4:4:4", "DEV D "),
              new Codec("v410", "Uncompressed 4:4:4 10-bit", "DEV D "),
              new Codec("vb", "Beam Software VB", "D V   "),
              new Codec("vble", "VBLE Lossless Codec", "D V D "),
              new Codec("vc1", "SMPTE VC-1", "D V D "),
              new Codec("vc1_vdpau", "SMPTE VC-1 VDPAU", "D V D "),
              new Codec("vc1image", "Windows Media Video 9 Image v2", "D V D "),
              new Codec("vcr1", "ATI VCR1", "D V D "),
              new Codec("vmdaudio", "Sierra VMD audio", "D A D "),
              new Codec("vmdvideo", "Sierra VMD video", "D V D "),
              new Codec("vmnc", "VMware Screen Codec / VMware Video", "D V D "),
              new Codec("vorbis", "Vorbis", "DEA D "),
              new Codec("vp3", "On2 VP3", "D VSD "),
              new Codec("vp5", "On2 VP5", "D V D "),
              new Codec("vp6", "On2 VP6", "D V D "),
              new Codec("vp6a", "On2 VP6 (Flash version, with alpha channel)", "D V D "),
              new Codec("vp6f", "On2 VP6 (Flash version)", "D V D "),
              new Codec("vp8", "On2 VP8", "D V D "),
              new Codec(
                  "vqavideo", "Westwood Studios VQA (Vector Quantized Animation) video", "D V D "),
              new Codec("wavesynth", "Wave synthesis pseudo-codec", "D A D "),
              new Codec("wavpack", "WavPack", "D A D "),
              new Codec("wmalossless", "Windows Media Audio 9 Lossless", "D A   "),
              new Codec("wmapro", "Windows Media Audio 9 Professional", "D A D "),
              new Codec("wmav1", "Windows Media Audio 1", "DEA D "),
              new Codec("wmav2", "Windows Media Audio 2", "DEA D "),
              new Codec("wmavoice", "Windows Media Audio Voice", "D A D "),
              new Codec("wmv1", "Windows Media Video 7", "DEVSD "),
              new Codec("wmv2", "Windows Media Video 8", "DEVSD "),
              new Codec("wmv3", "Windows Media Video 9", "D V D "),
              new Codec("wmv3_vdpau", "Windows Media Video 9 VDPAU", "D V D "),
              new Codec("wmv3image", "Windows Media Video 9 Image", "D V D "),
              new Codec("wnv1", "Winnov WNV1", "D V D "),
              new Codec("ws_snd1", "Westwood Audio (SND1)", "D A D "),
              new Codec("xan_dpcm", "DPCM Xan", "D A D "),
              new Codec("xan_wc3", "Wing Commander III / Xan", "D V D "),
              new Codec("xan_wc4", "Wing Commander IV / Xxan", "D V D "),
              new Codec("xbin", "eXtended BINary text", "D V D "),
              new Codec("xl", "Miro VideoXL", "D V D "),
              new Codec("xsub", "DivX subtitles (XSUB)", "DES   "),
              new Codec("xwd", "XWD (X Window Dump) image", "DEV D "),
              new Codec("y41p", "Uncompressed YUV 4:1:1 12-bit", "DEV D "),
              new Codec("yop", "Psygnosis YOP Video", "D V   "),
              new Codec("yuv4", "Uncompressed packed 4:2:0", "DEV D "),
              new Codec("zlib", "LCL (LossLess Codec Library) ZLIB", "DEV D "),
              new Codec("zmbv", "Zip Motion Blocks Video", "DEV D "))
          .build();
}
