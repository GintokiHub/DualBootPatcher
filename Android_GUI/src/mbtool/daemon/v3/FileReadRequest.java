// automatically generated by the FlatBuffers compiler, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FileReadRequest extends Table {
  public static FileReadRequest getRootAsFileReadRequest(ByteBuffer _bb) { return getRootAsFileReadRequest(_bb, new FileReadRequest()); }
  public static FileReadRequest getRootAsFileReadRequest(ByteBuffer _bb, FileReadRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public FileReadRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public long count() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0; }

  public static int createFileReadRequest(FlatBufferBuilder builder,
      int id,
      long count) {
    builder.startObject(2);
    FileReadRequest.addCount(builder, count);
    FileReadRequest.addId(builder, id);
    return FileReadRequest.endFileReadRequest(builder);
  }

  public static void startFileReadRequest(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addCount(FlatBufferBuilder builder, long count) { builder.addLong(1, count, 0); }
  public static int endFileReadRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

