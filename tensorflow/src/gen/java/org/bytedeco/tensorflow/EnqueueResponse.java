// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow::eager") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EnqueueResponse extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EnqueueResponse(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EnqueueResponse(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public EnqueueResponse position(long position) {
        return (EnqueueResponse)super.position(position);
    }

  public EnqueueResponse() { super((Pointer)null); allocate(); }
  private native void allocate();

  public EnqueueResponse(@Const @ByRef EnqueueResponse from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef EnqueueResponse from);

  public native @ByRef @Name("operator =") EnqueueResponse put(@Const @ByRef EnqueueResponse from);

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef EnqueueResponse default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const EnqueueResponse internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(EnqueueResponse other);
  

  // implements Message ----------------------------------------------

  public native EnqueueResponse New();

  public native EnqueueResponse New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef EnqueueResponse from);
  public native void MergeFrom(@Const @ByRef EnqueueResponse from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated .tensorflow.eager.QueueResponse queue_response = 1;
  public native int queue_response_size();
  public native void clear_queue_response();
  @MemberGetter public static native int kQueueResponseFieldNumber();
  public static final int kQueueResponseFieldNumber = kQueueResponseFieldNumber();
  public native QueueResponse mutable_queue_response(int index);
  public native @Const @ByRef QueueResponse queue_response(int index);
  public native QueueResponse add_queue_response();
}