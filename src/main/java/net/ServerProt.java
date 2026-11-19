package net;

/**
 * Server-to-client packet table.
 *
 * <p>Naming rule: every opcode that rs-majula (RustCityRS) defines for rev 742 uses that
 * project's identifier, adapted to this deob's underscore/case style. rs-majula defines 140 of
 * the 163 opcodes below; the rest are named as documented per constant:
 *
 * <ul>
 * <li>rev-634 table names, where the 634 packet's size and effect match this client's handler:
 * opcodes 12, 33, 52, 68, 88, 97, 98, 105, 131, 135, 142;</li>
 * <li>descriptive names for the JagTheora video-stream packets (class817), which neither table
 * defines: opcodes 104, 122, 128;</li>
 * <li>{@code UNKNOWN_<opcode>} where no candidate survived review: opcodes 13, 48, 80, 102, 111,
 * 115, 121, 139, 154.</li>
 * </ul>
 */
public class ServerProt {
   private final int opcode;
   public final int size;
   private final String name;
   private static ServerProt[] values;

   private ServerProt(String arg0, int arg1, int arg2) {
      this.name = arg0;
      this.opcode = arg1;
      this.size = arg2;
   }

   public int getOpcode() {
      return this.opcode;
   }

   public String getName() {
      return this.name;
   }

   public static ServerProt[] values() {
      if (values == null) {
         ServerProt[] var0 = new ServerProt[163];
         var0[0] = IF_MOVESUB;
         var0[1] = CLANSETTINGS_FULL;
         var0[2] = MESSAGE_GAME;
         var0[3] = IF_SETANGLE;
         var0[4] = UPDATE_STAT;
         var0[5] = IF_SETPLAYERHEAD_OTHER;
         var0[6] = UPDATE_ZONE_PARTIAL_FOLLOWS;
         var0[7] = IF_OPENSUB_ACTIVE_LOC;
         var0[8] = SET_MOVEACTION;
         var0[9] = CAM_SMOOTHRESET;
         var0[10] = VARP_SMALL;
         var0[11] = SET_TARGET;
         var0[12] = LOGOUT_LOBBY;
         var0[13] = UNKNOWN_13;
         var0[14] = IF_SETGRAPHIC;
         var0[15] = SYNTH_SOUND;
         var0[16] = IF_SETPOSITION;
         var0[17] = IF_SETANIM;
         var0[18] = FRIENDLIST_LOADED;
         var0[19] = RESET_CLIENT_VAR_CACHE;
         var0[20] = VARCLAN_LONG;
         var0[21] = LOGOUT_FULL;
         var0[22] = VARC_SMALL;
         var0[23] = UPDATE_FRIENDCHAT_CHANNEL_FULL;
         var0[24] = REFLECTION_CHECKER;
         var0[25] = CAM_MOVETO;
         var0[26] = VORBIS_SPEECH_SOUND;
         var0[27] = VARCLAN_ENABLE;
         var0[28] = CAM_RESET;
         var0[29] = RUN_CLIENT_SCRIPT;
         var0[30] = OBJ_ADD;
         var0[31] = MESSAGE_QUICKCHAT_PRIVATE;
         var0[32] = CAM2_ENABLE;
         var0[33] = UPDATE_INV_STOP_TRANSMIT;
         var0[34] = JS5_RELOAD;
         var0[35] = LOGOUT;
         var0[36] = VARCLAN_STR;
         var0[37] = LOC_DEL;
         var0[38] = LAST_LOGIN_INFO;
         var0[39] = MIDI_SONG;
         var0[40] = CREATE_ACCOUNT_REPLY;
         var0[41] = OBJ_COUNT;
         var0[42] = IF_SETOBJECT;
         var0[43] = LOC_ADD_CHANGE;
         var0[44] = MESSAGE_QUICKCHAT_FRIENDCHAT;
         var0[45] = IF_OPENTOP;
         var0[46] = TEXT_COORD;
         var0[47] = IF_OPENSUB;
         var0[48] = UNKNOWN_48;
         var0[49] = IF_SETPLAYERHEAD;
         var0[50] = VARCSTR_SMALL;
         var0[51] = LOC_PREFETCH;
         var0[52] = SET_SONG_VOLUME;
         var0[53] = IF_SETVIDEO;
         var0[54] = UPDATE_RUN_WEIGHT;
         var0[55] = VARCSTR_LARGE;
         var0[56] = CAM_FORCEANGLE;
         var0[57] = MESSAGE_PUBLIC;
         var0[58] = LOGOUT_TRANSFER;
         var0[59] = SOCIAL_NETWORK_LOGOUT;
         var0[60] = MESSAGE_QUICKCHAT_CLANCHANNEL;
         var0[61] = URL_OPEN;
         var0[62] = UPDATE_ZONE_FULL_FOLLOWS;
         var0[63] = CAM_REMOVEROOF;
         var0[64] = IF_OPENSUB_ACTIVE_NPC;
         var0[65] = NPC_INFO_LARGE;
         var0[66] = IF_SETSCROLLPOS;
         var0[67] = UPDATE_INV_FULL;
         var0[68] = UPDATE_GE_SLOT;
         var0[69] = UPDATE_RUN_ENERGY;
         var0[70] = VARCLAN_SMALL;
         var0[71] = OBJ_DEL;
         var0[72] = NPC_INFO;
         var0[73] = SETDRAWORDER;
         var0[74] = HINT_ARROW;
         var0[75] = CHAT_FILTER_SETTINGS;
         var0[76] = CHAT_FILTER_SETTINGS_PRIVATECHAT;
         var0[77] = NPC_ANIM_SPECIFIC;
         var0[78] = IF_SETMODEL;
         var0[79] = LOYALTY_UPDATE;
         var0[80] = UNKNOWN_80;
         var0[81] = JCOINS_UPDATE;
         var0[82] = VARP_LARGE;
         var0[83] = IF_SETTEXT_ANTIMACRO;
         var0[84] = IF_SETRETEX;
         var0[85] = SPOT_ANIM_SPECIFIC;
         var0[86] = MESSAGE_FRIENDCHAT;
         var0[87] = VARCLAN_DISABLE;
         var0[88] = UPDATE_UID192;
         var0[89] = REBUILD_NORMAL;
         var0[90] = PLAYER_INFO;
         var0[91] = CAM_SHAKE;
         var0[92] = SONG_PRELOAD;
         var0[93] = CLANCHANNEL_DELTA;
         var0[94] = UPDATE_INV_PARTIAL;
         var0[95] = VARCLAN_LARGE;
         var0[96] = SOUND_AREA;
         var0[97] = IF_SETTEXTFONT;
         var0[98] = UPDATE_IGNORE_LIST;
         var0[99] = VARP_BIT_LARGE;
         var0[100] = VORBIS_SOUND;
         var0[101] = SET_MAP_FLAG;
         var0[102] = UNKNOWN_102;
         var0[103] = IF_SETRECOL;
         var0[104] = VIDEO_MUTE;
         var0[105] = IF_SETPLAYERMODEL_OTHER;
         var0[106] = SERVER_REPLY;
         var0[107] = IF_SETTEXT;
         var0[108] = IF_SETCOLOUR;
         var0[109] = CAM_LOOKAT;
         var0[110] = IF_OPENSUB_ACTIVE_OBJ;
         var0[111] = UNKNOWN_111;
         var0[112] = IF_SETCLICKMASK;
         var0[113] = IF_SETHIDE;
         var0[114] = WORLDLIST_FETCH_REPLY;
         var0[115] = UNKNOWN_115;
         var0[116] = DO_CHEAT;
         var0[117] = MIDI_SONG_LOCATION;
         var0[118] = IF_SETEVENTS;
         var0[119] = MIDI_JINGLE;
         var0[120] = MESSAGE_CLANCHANNEL;
         var0[121] = UNKNOWN_121;
         var0[122] = VIDEO_STOP;
         var0[123] = CLANCHANNEL_FULL;
         var0[124] = CREATE_CHECK_NAME_REPLY;
         var0[125] = OBJ_REVEAL;
         var0[126] = IF_SETTARGETPARAM;
         var0[127] = MAP_PROJANIM;
         var0[128] = VIDEO_START;
         var0[129] = LOC_ANIM_SPECIFIC;
         var0[130] = HINT_TRAIL;
         var0[131] = UPDATE_SITESETTINGS_COOKIE;
         var0[132] = LOC_MERGE;
         var0[133] = MAP_ANIM;
         var0[134] = IF_SETNPCHEAD;
         var0[135] = RESET_ALL_ANIMATIONS;
         var0[136] = MESSAGE_PRIVATE;
         var0[137] = MESSAGE_PRIVATE_ECHO;
         var0[138] = VORBIS_SPEECH_STOP;
         var0[139] = UNKNOWN_139;
         var0[140] = UPDATE_FRIENDLIST;
         var0[141] = MAP_PROJANIM_HALFSQ;
         var0[142] = IF_SETPLAYERMODEL;
         var0[143] = CUTSCENE;
         var0[144] = UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER;
         var0[145] = EXECUTE_CLIENT_CHEAT;
         var0[146] = MESSAGE_QUICKCHAT_PRIVATE_ECHO;
         var0[147] = UPDATE_REBOOT_TIMER;
         var0[148] = IF_CLOSESUB;
         var0[149] = CAMERA_UPDATE;
         var0[150] = SEND_PING;
         var0[151] = SET_PLAYER_OP;
         var0[152] = VARC_LARGE;
         var0[153] = REBUILD_REGION;
         var0[154] = UNKNOWN_154;
         var0[155] = PROJ_ANIM_SPECIFIC;
         var0[156] = VARP_BIT_SMALL;
         var0[157] = LOC_ANIM;
         var0[158] = CREATE_CHECK_NAME;
         var0[159] = MINIMAP_TOGGLE;
         var0[160] = IF_OPENSUB_ACTIVE_PLAYER;
         var0[161] = CLANSETTINGS_DELTA;
         var0[162] = UPDATE_ZONE_PARTIAL_ENCLOSED;
         values = var0;
      }

      return values;
   }

   public static final ServerProt IF_MOVESUB = new ServerProt("IF_MOVESUB", 0, 8);
   public static final ServerProt CLANSETTINGS_FULL = new ServerProt("CLANSETTINGS_FULL", 1, -2);
   public static final ServerProt MESSAGE_GAME = new ServerProt("MESSAGE_GAME", 2, -1);
   public static final ServerProt IF_SETANGLE = new ServerProt("IF_SETANGLE", 3, 10);
   public static final ServerProt UPDATE_STAT = new ServerProt("UPDATE_STAT", 4, 6);
   public static final ServerProt IF_SETPLAYERHEAD_OTHER = new ServerProt("IF_SETPLAYERHEAD_OTHER", 5, 10);
   public static final ServerProt UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerProt("UPDATE_ZONE_PARTIAL_FOLLOWS", 6, 3);
   public static final ServerProt IF_OPENSUB_ACTIVE_LOC = new ServerProt("IF_OPENSUB_ACTIVE_LOC", 7, 32);
   public static final ServerProt SET_MOVEACTION = new ServerProt("SET_MOVEACTION", 8, -1);
   public static final ServerProt CAM_SMOOTHRESET = new ServerProt("CAM_SMOOTHRESET", 9, 0);
   public static final ServerProt VARP_SMALL = new ServerProt("VARP_SMALL", 10, 3);
   public static final ServerProt SET_TARGET = new ServerProt("SET_TARGET", 11, 2);
   // 634 name; rs-majula's rev-742 set does not define opcode 12 (0-byte payload).
   public static final ServerProt LOGOUT_LOBBY = new ServerProt("LOGOUT_LOBBY", 12, 0);
   public static final ServerProt UNKNOWN_13 = new ServerProt("UNKNOWN_13", 13, 8);
   public static final ServerProt IF_SETGRAPHIC = new ServerProt("IF_SETGRAPHIC", 14, 8);
   public static final ServerProt SYNTH_SOUND = new ServerProt("SYNTH_SOUND", 15, 8);
   public static final ServerProt IF_SETPOSITION = new ServerProt("IF_SETPOSITION", 16, 8);
   public static final ServerProt IF_SETANIM = new ServerProt("IF_SETANIM", 17, 8);
   public static final ServerProt FRIENDLIST_LOADED = new ServerProt("FRIENDLIST_LOADED", 18, 0);
   public static final ServerProt RESET_CLIENT_VAR_CACHE = new ServerProt("RESET_CLIENT_VAR_CACHE", 19, 0);
   public static final ServerProt VARCLAN_LONG = new ServerProt("VARCLAN_LONG", 20, 10);
   public static final ServerProt LOGOUT_FULL = new ServerProt("LOGOUT_FULL", 21, 0);
   public static final ServerProt VARC_SMALL = new ServerProt("VARC_SMALL", 22, 3);
   public static final ServerProt UPDATE_FRIENDCHAT_CHANNEL_FULL = new ServerProt("UPDATE_FRIENDCHAT_CHANNEL_FULL", 23, -2);
   public static final ServerProt REFLECTION_CHECKER = new ServerProt("REFLECTION_CHECKER", 24, -2);
   public static final ServerProt CAM_MOVETO = new ServerProt("CAM_MOVETO", 25, 6);
   public static final ServerProt VORBIS_SPEECH_SOUND = new ServerProt("VORBIS_SPEECH_SOUND", 26, 6);
   public static final ServerProt VARCLAN_ENABLE = new ServerProt("VARCLAN_ENABLE", 27, 0);
   public static final ServerProt CAM_RESET = new ServerProt("CAM_RESET", 28, 0);
   public static final ServerProt RUN_CLIENT_SCRIPT = new ServerProt("RUN_CLIENT_SCRIPT", 29, -2);
   public static final ServerProt OBJ_ADD = new ServerProt("OBJ_ADD", 30, 5);
   public static final ServerProt MESSAGE_QUICKCHAT_PRIVATE = new ServerProt("MESSAGE_QUICKCHAT_PRIVATE", 31, -1);
   public static final ServerProt CAM2_ENABLE = new ServerProt("CAM2_ENABLE", 32, 1);
   public static final ServerProt UPDATE_INV_STOP_TRANSMIT = new ServerProt("UPDATE_INV_STOP_TRANSMIT", 33, 3);
   public static final ServerProt JS5_RELOAD = new ServerProt("JS5_RELOAD", 34, 0);
   public static final ServerProt LOGOUT = new ServerProt("LOGOUT", 35, 0);
   public static final ServerProt VARCLAN_STR = new ServerProt("VARCLAN_STR", 36, -1);
   public static final ServerProt LOC_DEL = new ServerProt("LOC_DEL", 37, 2);
   public static final ServerProt LAST_LOGIN_INFO = new ServerProt("LAST_LOGIN_INFO", 38, 4);
   public static final ServerProt MIDI_SONG = new ServerProt("MIDI_SONG", 39, 4);
   public static final ServerProt CREATE_ACCOUNT_REPLY = new ServerProt("CREATE_ACCOUNT_REPLY", 40, 1);
   public static final ServerProt OBJ_COUNT = new ServerProt("OBJ_COUNT", 41, 7);
   public static final ServerProt IF_SETOBJECT = new ServerProt("IF_SETOBJECT", 42, 10);
   public static final ServerProt LOC_ADD_CHANGE = new ServerProt("LOC_ADD_CHANGE", 43, 6);
   public static final ServerProt MESSAGE_QUICKCHAT_FRIENDCHAT = new ServerProt("MESSAGE_QUICKCHAT_FRIENDCHAT", 44, -1);
   public static final ServerProt IF_OPENTOP = new ServerProt("IF_OPENTOP", 45, 19);
   public static final ServerProt TEXT_COORD = new ServerProt("TEXT_COORD", 46, -1);
   public static final ServerProt IF_OPENSUB = new ServerProt("IF_OPENSUB", 47, 23);
   public static final ServerProt UNKNOWN_48 = new ServerProt("UNKNOWN_48", 48, 0);
   public static final ServerProt IF_SETPLAYERHEAD = new ServerProt("IF_SETPLAYERHEAD", 49, 4);
   public static final ServerProt VARCSTR_SMALL = new ServerProt("VARCSTR_SMALL", 50, -1);
   public static final ServerProt LOC_PREFETCH = new ServerProt("LOC_PREFETCH", 51, 5);
   public static final ServerProt SET_SONG_VOLUME = new ServerProt("SET_SONG_VOLUME", 52, 2);
   public static final ServerProt IF_SETVIDEO = new ServerProt("IF_SETVIDEO", 53, 6);
   public static final ServerProt UPDATE_RUN_WEIGHT = new ServerProt("UPDATE_RUN_WEIGHT", 54, 2);
   public static final ServerProt VARCSTR_LARGE = new ServerProt("VARCSTR_LARGE", 55, -2);
   public static final ServerProt CAM_FORCEANGLE = new ServerProt("CAM_FORCEANGLE", 56, 4);
   public static final ServerProt MESSAGE_PUBLIC = new ServerProt("MESSAGE_PUBLIC", 57, -1);
   public static final ServerProt LOGOUT_TRANSFER = new ServerProt("LOGOUT_TRANSFER", 58, -1);
   public static final ServerProt SOCIAL_NETWORK_LOGOUT = new ServerProt("SOCIAL_NETWORK_LOGOUT", 59, -2);
   public static final ServerProt MESSAGE_QUICKCHAT_CLANCHANNEL = new ServerProt("MESSAGE_QUICKCHAT_CLANCHANNEL", 60, -1);
   public static final ServerProt URL_OPEN = new ServerProt("URL_OPEN", 61, -2);
   public static final ServerProt UPDATE_ZONE_FULL_FOLLOWS = new ServerProt("UPDATE_ZONE_FULL_FOLLOWS", 62, 3);
   public static final ServerProt CAM_REMOVEROOF = new ServerProt("CAM_REMOVEROOF", 63, 4);
   public static final ServerProt IF_OPENSUB_ACTIVE_NPC = new ServerProt("IF_OPENSUB_ACTIVE_NPC", 64, 25);
   public static final ServerProt NPC_INFO_LARGE = new ServerProt("NPC_INFO_LARGE", 65, -2);
   public static final ServerProt IF_SETSCROLLPOS = new ServerProt("IF_SETSCROLLPOS", 66, 6);
   public static final ServerProt UPDATE_INV_FULL = new ServerProt("UPDATE_INV_FULL", 67, -2);
   public static final ServerProt UPDATE_GE_SLOT = new ServerProt("UPDATE_GE_SLOT", 68, 20);
   public static final ServerProt UPDATE_RUN_ENERGY = new ServerProt("UPDATE_RUN_ENERGY", 69, 1);
   public static final ServerProt VARCLAN_SMALL = new ServerProt("VARCLAN_SMALL", 70, 3);
   public static final ServerProt OBJ_DEL = new ServerProt("OBJ_DEL", 71, 3);
   public static final ServerProt NPC_INFO = new ServerProt("NPC_INFO", 72, -2);
   public static final ServerProt SETDRAWORDER = new ServerProt("SETDRAWORDER", 73, 1);
   public static final ServerProt HINT_ARROW = new ServerProt("HINT_ARROW", 74, 14);
   public static final ServerProt CHAT_FILTER_SETTINGS = new ServerProt("CHAT_FILTER_SETTINGS", 75, 2);
   public static final ServerProt CHAT_FILTER_SETTINGS_PRIVATECHAT = new ServerProt("CHAT_FILTER_SETTINGS_PRIVATECHAT", 76, 1);
   public static final ServerProt NPC_ANIM_SPECIFIC = new ServerProt("NPC_ANIM_SPECIFIC", 77, 19);
   public static final ServerProt IF_SETMODEL = new ServerProt("IF_SETMODEL", 78, 8);
   public static final ServerProt LOYALTY_UPDATE = new ServerProt("LOYALTY_UPDATE", 79, 5);
   public static final ServerProt UNKNOWN_80 = new ServerProt("UNKNOWN_80", 80, -1);
   public static final ServerProt JCOINS_UPDATE = new ServerProt("JCOINS_UPDATE", 81, 4);
   public static final ServerProt VARP_LARGE = new ServerProt("VARP_LARGE", 82, 6);
   public static final ServerProt IF_SETTEXT_ANTIMACRO = new ServerProt("IF_SETTEXT_ANTIMACRO", 83, 5);
   public static final ServerProt IF_SETRETEX = new ServerProt("IF_SETRETEX", 84, 9);
   public static final ServerProt SPOT_ANIM_SPECIFIC = new ServerProt("SPOT_ANIM_SPECIFIC", 85, 12);
   public static final ServerProt MESSAGE_FRIENDCHAT = new ServerProt("MESSAGE_FRIENDCHAT", 86, -1);
   public static final ServerProt VARCLAN_DISABLE = new ServerProt("VARCLAN_DISABLE", 87, 0);
   // 634 name; rs-majula's rev-742 set does not define opcode 88 (fixed 28-byte block).
   public static final ServerProt UPDATE_UID192 = new ServerProt("UPDATE_UID192", 88, 28);
   public static final ServerProt REBUILD_NORMAL = new ServerProt("REBUILD_NORMAL", 89, -2);
   public static final ServerProt PLAYER_INFO = new ServerProt("PLAYER_INFO", 90, -2);
   public static final ServerProt CAM_SHAKE = new ServerProt("CAM_SHAKE", 91, 6);
   public static final ServerProt SONG_PRELOAD = new ServerProt("SONG_PRELOAD", 92, 2);
   public static final ServerProt CLANCHANNEL_DELTA = new ServerProt("CLANCHANNEL_DELTA", 93, -2);
   public static final ServerProt UPDATE_INV_PARTIAL = new ServerProt("UPDATE_INV_PARTIAL", 94, -2);
   public static final ServerProt VARCLAN_LARGE = new ServerProt("VARCLAN_LARGE", 95, 6);
   public static final ServerProt SOUND_AREA = new ServerProt("SOUND_AREA", 96, 6);
   public static final ServerProt IF_SETTEXTFONT = new ServerProt("IF_SETTEXTFONT", 97, 8);
   // 634 name; rs-majula's rev-742 set does not define opcode 98 (-2 = u16-length-prefixed list).
   public static final ServerProt UPDATE_IGNORE_LIST = new ServerProt("UPDATE_IGNORE_LIST", 98, -2);
   public static final ServerProt VARP_BIT_LARGE = new ServerProt("VARP_BIT_LARGE", 99, 6);
   public static final ServerProt VORBIS_SOUND = new ServerProt("VORBIS_SOUND", 100, 8);
   public static final ServerProt SET_MAP_FLAG = new ServerProt("SET_MAP_FLAG", 101, 2);
   public static final ServerProt UNKNOWN_102 = new ServerProt("UNKNOWN_102", 102, 4);
   public static final ServerProt IF_SETRECOL = new ServerProt("IF_SETRECOL", 103, 9);
   public static final ServerProt VIDEO_MUTE = new ServerProt("VIDEO_MUTE", 104, 2);
   public static final ServerProt IF_SETPLAYERMODEL_OTHER = new ServerProt("IF_SETPLAYERMODEL_OTHER", 105, 10);
   public static final ServerProt SERVER_REPLY = new ServerProt("SERVER_REPLY", 106, -2);
   public static final ServerProt IF_SETTEXT = new ServerProt("IF_SETTEXT", 107, -2);
   public static final ServerProt IF_SETCOLOUR = new ServerProt("IF_SETCOLOUR", 108, 6);
   public static final ServerProt CAM_LOOKAT = new ServerProt("CAM_LOOKAT", 109, 6);
   public static final ServerProt IF_OPENSUB_ACTIVE_OBJ = new ServerProt("IF_OPENSUB_ACTIVE_OBJ", 110, 29);
   public static final ServerProt UNKNOWN_111 = new ServerProt("UNKNOWN_111", 111, 1);
   public static final ServerProt IF_SETCLICKMASK = new ServerProt("IF_SETCLICKMASK", 112, 5);
   public static final ServerProt IF_SETHIDE = new ServerProt("IF_SETHIDE", 113, 5);
   public static final ServerProt WORLDLIST_FETCH_REPLY = new ServerProt("WORLDLIST_FETCH_REPLY", 114, -2);
   public static final ServerProt UNKNOWN_115 = new ServerProt("UNKNOWN_115", 115, 10);
   public static final ServerProt DO_CHEAT = new ServerProt("DO_CHEAT", 116, -1);
   public static final ServerProt MIDI_SONG_LOCATION = new ServerProt("MIDI_SONG_LOCATION", 117, 11);
   public static final ServerProt IF_SETEVENTS = new ServerProt("IF_SETEVENTS", 118, 12);
   public static final ServerProt MIDI_JINGLE = new ServerProt("MIDI_JINGLE", 119, 6);
   public static final ServerProt MESSAGE_CLANCHANNEL = new ServerProt("MESSAGE_CLANCHANNEL", 120, -1);
   public static final ServerProt UNKNOWN_121 = new ServerProt("UNKNOWN_121", 121, -1);
   public static final ServerProt VIDEO_STOP = new ServerProt("VIDEO_STOP", 122, 2);
   public static final ServerProt CLANCHANNEL_FULL = new ServerProt("CLANCHANNEL_FULL", 123, -2);
   public static final ServerProt CREATE_CHECK_NAME_REPLY = new ServerProt("CREATE_CHECK_NAME_REPLY", 124, 1);
   public static final ServerProt OBJ_REVEAL = new ServerProt("OBJ_REVEAL", 125, 7);
   public static final ServerProt IF_SETTARGETPARAM = new ServerProt("IF_SETTARGETPARAM", 126, 10);
   public static final ServerProt MAP_PROJANIM = new ServerProt("MAP_PROJANIM", 127, 18);
   public static final ServerProt VIDEO_START = new ServerProt("VIDEO_START", 128, 3);
   public static final ServerProt LOC_ANIM_SPECIFIC = new ServerProt("LOC_ANIM_SPECIFIC", 129, 9);
   public static final ServerProt HINT_TRAIL = new ServerProt("HINT_TRAIL", 130, -2);
   public static final ServerProt UPDATE_SITESETTINGS_COOKIE = new ServerProt("UPDATE_SITESETTINGS_COOKIE", 131, -1);
   public static final ServerProt LOC_MERGE = new ServerProt("LOC_MERGE", 132, -1);
   public static final ServerProt MAP_ANIM = new ServerProt("MAP_ANIM", 133, 10);
   public static final ServerProt IF_SETNPCHEAD = new ServerProt("IF_SETNPCHEAD", 134, 8);
   // 634 name; rs-majula's rev-742 set does not define opcode 135 (0-byte payload).
   public static final ServerProt RESET_ALL_ANIMATIONS = new ServerProt("RESET_ALL_ANIMATIONS", 135, 0);
   public static final ServerProt MESSAGE_PRIVATE = new ServerProt("MESSAGE_PRIVATE", 136, -2);
   public static final ServerProt MESSAGE_PRIVATE_ECHO = new ServerProt("MESSAGE_PRIVATE_ECHO", 137, -2);
   public static final ServerProt VORBIS_SPEECH_STOP = new ServerProt("VORBIS_SPEECH_STOP", 138, 0);
   public static final ServerProt UNKNOWN_139 = new ServerProt("UNKNOWN_139", 139, -1);
   public static final ServerProt UPDATE_FRIENDLIST = new ServerProt("UPDATE_FRIENDLIST", 140, -2);
   public static final ServerProt MAP_PROJANIM_HALFSQ = new ServerProt("MAP_PROJANIM_HALFSQ", 141, 21);
   public static final ServerProt IF_SETPLAYERMODEL = new ServerProt("IF_SETPLAYERMODEL", 142, 4);
   public static final ServerProt CUTSCENE = new ServerProt("CUTSCENE", 143, -2);
   public static final ServerProt UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER = new ServerProt("UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER", 144, -1);
   public static final ServerProt EXECUTE_CLIENT_CHEAT = new ServerProt("EXECUTE_CLIENT_CHEAT", 145, 2);
   public static final ServerProt MESSAGE_QUICKCHAT_PRIVATE_ECHO = new ServerProt("MESSAGE_QUICKCHAT_PRIVATE_ECHO", 146, -1);
   public static final ServerProt UPDATE_REBOOT_TIMER = new ServerProt("UPDATE_REBOOT_TIMER", 147, 2);
   public static final ServerProt IF_CLOSESUB = new ServerProt("IF_CLOSESUB", 148, 4);
   public static final ServerProt CAMERA_UPDATE = new ServerProt("CAMERA_UPDATE", 149, -2);
   public static final ServerProt SEND_PING = new ServerProt("SEND_PING", 150, 8);
   public static final ServerProt SET_PLAYER_OP = new ServerProt("SET_PLAYER_OP", 151, -1);
   public static final ServerProt VARC_LARGE = new ServerProt("VARC_LARGE", 152, 6);
   public static final ServerProt REBUILD_REGION = new ServerProt("REBUILD_REGION", 153, -2);
   public static final ServerProt UNKNOWN_154 = new ServerProt("UNKNOWN_154", 154, 1);
   public static final ServerProt PROJ_ANIM_SPECIFIC = new ServerProt("PROJ_ANIM_SPECIFIC", 155, 22);
   public static final ServerProt VARP_BIT_SMALL = new ServerProt("VARP_BIT_SMALL", 156, 3);
   public static final ServerProt LOC_ANIM = new ServerProt("LOC_ANIM", 157, 6);
   public static final ServerProt CREATE_CHECK_NAME = new ServerProt("CREATE_CHECK_NAME", 158, 1);
   public static final ServerProt MINIMAP_TOGGLE = new ServerProt("MINIMAP_TOGGLE", 159, 1);
   public static final ServerProt IF_OPENSUB_ACTIVE_PLAYER = new ServerProt("IF_OPENSUB_ACTIVE_PLAYER", 160, 25);
   public static final ServerProt CLANSETTINGS_DELTA = new ServerProt("CLANSETTINGS_DELTA", 161, -2);
   public static final ServerProt UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerProt("UPDATE_ZONE_PARTIAL_ENCLOSED", 162, -2);
}
