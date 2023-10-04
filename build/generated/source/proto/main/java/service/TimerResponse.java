// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/timer.proto

package service;

/**
 * <pre>
 * The response message
 * </pre>
 *
 * Protobuf type {@code services.TimerResponse}
 */
public final class TimerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.TimerResponse)
    TimerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimerResponse.newBuilder() to construct.
  private TimerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimerResponse() {
    error_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TimerResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            isSuccess_ = input.readBool();
            break;
          }
          case 18: {
            service.Time.Builder subBuilder = null;
            if (timer_ != null) {
              subBuilder = timer_.toBuilder();
            }
            timer_ = input.readMessage(service.Time.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(timer_);
              timer_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            error_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return service.TimerProto.internal_static_services_TimerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return service.TimerProto.internal_static_services_TimerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            service.TimerResponse.class, service.TimerResponse.Builder.class);
  }

  public static final int ISSUCCESS_FIELD_NUMBER = 1;
  private boolean isSuccess_;
  /**
   * <code>bool isSuccess = 1;</code>
   * @return The isSuccess.
   */
  @java.lang.Override
  public boolean getIsSuccess() {
    return isSuccess_;
  }

  public static final int TIMER_FIELD_NUMBER = 2;
  private service.Time timer_;
  /**
   * <code>.services.Time timer = 2;</code>
   * @return Whether the timer field is set.
   */
  @java.lang.Override
  public boolean hasTimer() {
    return timer_ != null;
  }
  /**
   * <code>.services.Time timer = 2;</code>
   * @return The timer.
   */
  @java.lang.Override
  public service.Time getTimer() {
    return timer_ == null ? service.Time.getDefaultInstance() : timer_;
  }
  /**
   * <code>.services.Time timer = 2;</code>
   */
  @java.lang.Override
  public service.TimeOrBuilder getTimerOrBuilder() {
    return getTimer();
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  private volatile java.lang.Object error_;
  /**
   * <pre>
   * Error message, a String of your choice to show what went wrong -- isSuccess would then be false
   * </pre>
   *
   * <code>string error = 3;</code>
   * @return The error.
   */
  @java.lang.Override
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Error message, a String of your choice to show what went wrong -- isSuccess would then be false
   * </pre>
   *
   * <code>string error = 3;</code>
   * @return The bytes for error.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      error_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (isSuccess_ != false) {
      output.writeBool(1, isSuccess_);
    }
    if (timer_ != null) {
      output.writeMessage(2, getTimer());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(error_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, error_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isSuccess_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isSuccess_);
    }
    if (timer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTimer());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(error_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, error_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof service.TimerResponse)) {
      return super.equals(obj);
    }
    service.TimerResponse other = (service.TimerResponse) obj;

    if (getIsSuccess()
        != other.getIsSuccess()) return false;
    if (hasTimer() != other.hasTimer()) return false;
    if (hasTimer()) {
      if (!getTimer()
          .equals(other.getTimer())) return false;
    }
    if (!getError()
        .equals(other.getError())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ISSUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSuccess());
    if (hasTimer()) {
      hash = (37 * hash) + TIMER_FIELD_NUMBER;
      hash = (53 * hash) + getTimer().hashCode();
    }
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static service.TimerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static service.TimerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static service.TimerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static service.TimerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static service.TimerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static service.TimerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static service.TimerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static service.TimerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static service.TimerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static service.TimerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static service.TimerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static service.TimerResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(service.TimerResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The response message
   * </pre>
   *
   * Protobuf type {@code services.TimerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.TimerResponse)
      service.TimerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return service.TimerProto.internal_static_services_TimerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return service.TimerProto.internal_static_services_TimerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              service.TimerResponse.class, service.TimerResponse.Builder.class);
    }

    // Construct using service.TimerResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      isSuccess_ = false;

      if (timerBuilder_ == null) {
        timer_ = null;
      } else {
        timer_ = null;
        timerBuilder_ = null;
      }
      error_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return service.TimerProto.internal_static_services_TimerResponse_descriptor;
    }

    @java.lang.Override
    public service.TimerResponse getDefaultInstanceForType() {
      return service.TimerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public service.TimerResponse build() {
      service.TimerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public service.TimerResponse buildPartial() {
      service.TimerResponse result = new service.TimerResponse(this);
      result.isSuccess_ = isSuccess_;
      if (timerBuilder_ == null) {
        result.timer_ = timer_;
      } else {
        result.timer_ = timerBuilder_.build();
      }
      result.error_ = error_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof service.TimerResponse) {
        return mergeFrom((service.TimerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(service.TimerResponse other) {
      if (other == service.TimerResponse.getDefaultInstance()) return this;
      if (other.getIsSuccess() != false) {
        setIsSuccess(other.getIsSuccess());
      }
      if (other.hasTimer()) {
        mergeTimer(other.getTimer());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      service.TimerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (service.TimerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isSuccess_ ;
    /**
     * <code>bool isSuccess = 1;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }
    /**
     * <code>bool isSuccess = 1;</code>
     * @param value The isSuccess to set.
     * @return This builder for chaining.
     */
    public Builder setIsSuccess(boolean value) {
      
      isSuccess_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isSuccess = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsSuccess() {
      
      isSuccess_ = false;
      onChanged();
      return this;
    }

    private service.Time timer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        service.Time, service.Time.Builder, service.TimeOrBuilder> timerBuilder_;
    /**
     * <code>.services.Time timer = 2;</code>
     * @return Whether the timer field is set.
     */
    public boolean hasTimer() {
      return timerBuilder_ != null || timer_ != null;
    }
    /**
     * <code>.services.Time timer = 2;</code>
     * @return The timer.
     */
    public service.Time getTimer() {
      if (timerBuilder_ == null) {
        return timer_ == null ? service.Time.getDefaultInstance() : timer_;
      } else {
        return timerBuilder_.getMessage();
      }
    }
    /**
     * <code>.services.Time timer = 2;</code>
     */
    public Builder setTimer(service.Time value) {
      if (timerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timer_ = value;
        onChanged();
      } else {
        timerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.services.Time timer = 2;</code>
     */
    public Builder setTimer(
        service.Time.Builder builderForValue) {
      if (timerBuilder_ == null) {
        timer_ = builderForValue.build();
        onChanged();
      } else {
        timerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.services.Time timer = 2;</code>
     */
    public Builder mergeTimer(service.Time value) {
      if (timerBuilder_ == null) {
        if (timer_ != null) {
          timer_ =
            service.Time.newBuilder(timer_).mergeFrom(value).buildPartial();
        } else {
          timer_ = value;
        }
        onChanged();
      } else {
        timerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.services.Time timer = 2;</code>
     */
    public Builder clearTimer() {
      if (timerBuilder_ == null) {
        timer_ = null;
        onChanged();
      } else {
        timer_ = null;
        timerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.services.Time timer = 2;</code>
     */
    public service.Time.Builder getTimerBuilder() {
      
      onChanged();
      return getTimerFieldBuilder().getBuilder();
    }
    /**
     * <code>.services.Time timer = 2;</code>
     */
    public service.TimeOrBuilder getTimerOrBuilder() {
      if (timerBuilder_ != null) {
        return timerBuilder_.getMessageOrBuilder();
      } else {
        return timer_ == null ?
            service.Time.getDefaultInstance() : timer_;
      }
    }
    /**
     * <code>.services.Time timer = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        service.Time, service.Time.Builder, service.TimeOrBuilder> 
        getTimerFieldBuilder() {
      if (timerBuilder_ == null) {
        timerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            service.Time, service.Time.Builder, service.TimeOrBuilder>(
                getTimer(),
                getParentForChildren(),
                isClean());
        timer_ = null;
      }
      return timerBuilder_;
    }

    private java.lang.Object error_ = "";
    /**
     * <pre>
     * Error message, a String of your choice to show what went wrong -- isSuccess would then be false
     * </pre>
     *
     * <code>string error = 3;</code>
     * @return The error.
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Error message, a String of your choice to show what went wrong -- isSuccess would then be false
     * </pre>
     *
     * <code>string error = 3;</code>
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Error message, a String of your choice to show what went wrong -- isSuccess would then be false
     * </pre>
     *
     * <code>string error = 3;</code>
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Error message, a String of your choice to show what went wrong -- isSuccess would then be false
     * </pre>
     *
     * <code>string error = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Error message, a String of your choice to show what went wrong -- isSuccess would then be false
     * </pre>
     *
     * <code>string error = 3;</code>
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      error_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:services.TimerResponse)
  }

  // @@protoc_insertion_point(class_scope:services.TimerResponse)
  private static final service.TimerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new service.TimerResponse();
  }

  public static service.TimerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimerResponse>
      PARSER = new com.google.protobuf.AbstractParser<TimerResponse>() {
    @java.lang.Override
    public TimerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TimerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TimerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public service.TimerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

