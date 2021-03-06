// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageRequestPing.proto

package ProtoMessages;

public final class MessageRequestPingBase {
  private MessageRequestPingBase() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface MessageRequestPingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MessageRequestPing)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>required string someText = 1 [default = ""];</code>
     */
    boolean hasSomeText();
    /**
     * <code>required string someText = 1 [default = ""];</code>
     */
    java.lang.String getSomeText();
    /**
     * <code>required string someText = 1 [default = ""];</code>
     */
    com.google.protobuf.ByteString
        getSomeTextBytes();
  }
  /**
   * Protobuf type {@code MessageRequestPing}
   */
  public  static final class MessageRequestPing extends
      com.google.protobuf.GeneratedMessageLite<
          MessageRequestPing, MessageRequestPing.Builder> implements
      // @@protoc_insertion_point(message_implements:MessageRequestPing)
      MessageRequestPingOrBuilder {
    private MessageRequestPing(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      someText_ = "";
      com.google.protobuf.UnknownFieldSetLite.Builder unknownFields =
          com.google.protobuf.UnknownFieldSetLite.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              String s = input.readString();
              bitField0_ |= 0x00000001;
              someText_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        this.unknownFields = unknownFields.build();
      }
    }
    private int bitField0_;
    public static final int SOMETEXT_FIELD_NUMBER = 1;
    private java.lang.Object someText_;
    /**
     * <code>required string someText = 1 [default = ""];</code>
     */
    public boolean hasSomeText() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string someText = 1 [default = ""];</code>
     */
    public java.lang.String getSomeText() {
      java.lang.Object ref = someText_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          someText_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string someText = 1 [default = ""];</code>
     */
    public com.google.protobuf.ByteString
        getSomeTextBytes() {
      java.lang.Object ref = someText_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        someText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string someText = 1 [default = ""];</code>
     */
    private void setSomeText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      someText_ = value;
    }
    /**
     * <code>required string someText = 1 [default = ""];</code>
     */
    private void clearSomeText() {
      bitField0_ = (bitField0_ & ~0x00000001);
      someText_ = getDefaultInstance().getSomeText();
    }
    /**
     * <code>required string someText = 1 [default = ""];</code>
     */
    private void setSomeTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      someText_ = value;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getSomeTextBytes());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getSomeTextBytes());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ProtoMessages.MessageRequestPingBase.MessageRequestPing prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code MessageRequestPing}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ProtoMessages.MessageRequestPingBase.MessageRequestPing, Builder> implements
        // @@protoc_insertion_point(builder_implements:MessageRequestPing)
        ProtoMessages.MessageRequestPingBase.MessageRequestPingOrBuilder {
      // Construct using ProtoMessages.MessageRequestPingBase.MessageRequestPing.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>required string someText = 1 [default = ""];</code>
       */
      public boolean hasSomeText() {
        return instance.hasSomeText();
      }
      /**
       * <code>required string someText = 1 [default = ""];</code>
       */
      public java.lang.String getSomeText() {
        return instance.getSomeText();
      }
      /**
       * <code>required string someText = 1 [default = ""];</code>
       */
      public com.google.protobuf.ByteString
          getSomeTextBytes() {
        return instance.getSomeTextBytes();
      }
      /**
       * <code>required string someText = 1 [default = ""];</code>
       */
      public Builder setSomeText(
          java.lang.String value) {
        copyOnWrite();
        instance.setSomeText(value);
        return this;
      }
      /**
       * <code>required string someText = 1 [default = ""];</code>
       */
      public Builder clearSomeText() {
        copyOnWrite();
        instance.clearSomeText();
        return this;
      }
      /**
       * <code>required string someText = 1 [default = ""];</code>
       */
      public Builder setSomeTextBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSomeTextBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MessageRequestPing)
    }
    private byte memoizedIsInitialized = -1;
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object... args) {
      switch (method) {
        case PARSE_PARTIAL_FROM: {
          return new ProtoMessages.MessageRequestPingBase.MessageRequestPing(          (com.google.protobuf.CodedInputStream) args[0],
              (com.google.protobuf.ExtensionRegistryLite) args[1]);
        }
        case NEW_INSTANCE: {
          return new ProtoMessages.MessageRequestPingBase.MessageRequestPing(
              com.google.protobuf.Internal.EMPTY_CODED_INPUT_STREAM,
              com.google.protobuf.ExtensionRegistryLite
                  .getEmptyRegistry());
        }
        case IS_INITIALIZED: {
          byte isInitialized = memoizedIsInitialized;
          if (isInitialized == 1) return DEFAULT_INSTANCE;
          if (isInitialized == 0) return null;

          boolean shouldMemoize = ((Boolean) args[0]).booleanValue();
          if (!hasSomeText()) {
            if (shouldMemoize) {
              memoizedIsInitialized = 0;
            }
            return null;
          }
          if (shouldMemoize) memoizedIsInitialized = 1;
          return DEFAULT_INSTANCE;

        }
        case MAKE_IMMUTABLE: {
          return null;}
        case NEW_BUILDER: {
          return new Builder();}
        case MERGE_FROM: {
          Object arg = args[0];
          if (arg == ProtoMessages.MessageRequestPingBase.MessageRequestPing.getDefaultInstance()) return this;
          ProtoMessages.MessageRequestPingBase.MessageRequestPing other = (ProtoMessages.MessageRequestPingBase.MessageRequestPing) arg;
          if (other.hasSomeText()) {
            bitField0_ |= 0x00000001;
            someText_ = other.someText_;
            
          }
          this.mergeUnknownFields(other.unknownFields);
          return this;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:MessageRequestPing)
    private static final ProtoMessages.MessageRequestPingBase.MessageRequestPing DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MessageRequestPing(
          com.google.protobuf.Internal
              .EMPTY_CODED_INPUT_STREAM,
          com.google.protobuf.ExtensionRegistryLite
              .getEmptyRegistry());
    }

    public static ProtoMessages.MessageRequestPingBase.MessageRequestPing getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.Parser<MessageRequestPing> PARSER =
        new DefaultInstanceBasedParser(DEFAULT_INSTANCE);

    static {
      com.google.protobuf.GeneratedMessageLite.onLoad(
          ProtoMessages.MessageRequestPingBase.MessageRequestPing.class, new com.google.protobuf.GeneratedMessageLite
              .PrototypeHolder<ProtoMessages.MessageRequestPingBase.MessageRequestPing, Builder>(
                  DEFAULT_INSTANCE, PARSER));}

  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
