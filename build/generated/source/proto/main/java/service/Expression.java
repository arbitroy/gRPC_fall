// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/calculator.proto

package service;

/**
 * <pre>
 *expressions type
 * </pre>
 *
 * Protobuf type {@code services.Expression}
 */
public final class Expression extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.Expression)
    ExpressionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Expression.newBuilder() to construct.
  private Expression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Expression() {
    operation_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Expression();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Expression(
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

            num1_ = input.readInt32();
            break;
          }
          case 16: {

            num2_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            operation_ = rawValue;
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
    return service.CalculatorProto.internal_static_services_Expression_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return service.CalculatorProto.internal_static_services_Expression_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            service.Expression.class, service.Expression.Builder.class);
  }

  /**
   * Protobuf enum {@code services.Expression.Operation}
   */
  public enum Operation
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PLUS = 0;</code>
     */
    PLUS(0),
    /**
     * <code>MINUS = 1;</code>
     */
    MINUS(1),
    /**
     * <code>MULTIPLY = 2;</code>
     */
    MULTIPLY(2),
    /**
     * <code>DIVIDE = 3;</code>
     */
    DIVIDE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PLUS = 0;</code>
     */
    public static final int PLUS_VALUE = 0;
    /**
     * <code>MINUS = 1;</code>
     */
    public static final int MINUS_VALUE = 1;
    /**
     * <code>MULTIPLY = 2;</code>
     */
    public static final int MULTIPLY_VALUE = 2;
    /**
     * <code>DIVIDE = 3;</code>
     */
    public static final int DIVIDE_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operation valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Operation forNumber(int value) {
      switch (value) {
        case 0: return PLUS;
        case 1: return MINUS;
        case 2: return MULTIPLY;
        case 3: return DIVIDE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operation>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operation> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
            public Operation findValueByNumber(int number) {
              return Operation.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return service.Expression.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operation[] VALUES = values();

    public static Operation valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Operation(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:services.Expression.Operation)
  }

  public static final int NUM1_FIELD_NUMBER = 1;
  private int num1_;
  /**
   * <pre>
   *First Number
   * </pre>
   *
   * <code>int32 num1 = 1;</code>
   * @return The num1.
   */
  @java.lang.Override
  public int getNum1() {
    return num1_;
  }

  public static final int NUM2_FIELD_NUMBER = 2;
  private int num2_;
  /**
   * <pre>
   *Second number
   * </pre>
   *
   * <code>int32 num2 = 2;</code>
   * @return The num2.
   */
  @java.lang.Override
  public int getNum2() {
    return num2_;
  }

  public static final int OPERATION_FIELD_NUMBER = 3;
  private int operation_;
  /**
   * <pre>
   * Enum from above
   * </pre>
   *
   * <code>.services.Expression.Operation operation = 3;</code>
   * @return The enum numeric value on the wire for operation.
   */
  @java.lang.Override public int getOperationValue() {
    return operation_;
  }
  /**
   * <pre>
   * Enum from above
   * </pre>
   *
   * <code>.services.Expression.Operation operation = 3;</code>
   * @return The operation.
   */
  @java.lang.Override public service.Expression.Operation getOperation() {
    @SuppressWarnings("deprecation")
    service.Expression.Operation result = service.Expression.Operation.valueOf(operation_);
    return result == null ? service.Expression.Operation.UNRECOGNIZED : result;
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
    if (num1_ != 0) {
      output.writeInt32(1, num1_);
    }
    if (num2_ != 0) {
      output.writeInt32(2, num2_);
    }
    if (operation_ != service.Expression.Operation.PLUS.getNumber()) {
      output.writeEnum(3, operation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (num1_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, num1_);
    }
    if (num2_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, num2_);
    }
    if (operation_ != service.Expression.Operation.PLUS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, operation_);
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
    if (!(obj instanceof service.Expression)) {
      return super.equals(obj);
    }
    service.Expression other = (service.Expression) obj;

    if (getNum1()
        != other.getNum1()) return false;
    if (getNum2()
        != other.getNum2()) return false;
    if (operation_ != other.operation_) return false;
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
    hash = (37 * hash) + NUM1_FIELD_NUMBER;
    hash = (53 * hash) + getNum1();
    hash = (37 * hash) + NUM2_FIELD_NUMBER;
    hash = (53 * hash) + getNum2();
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + operation_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static service.Expression parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static service.Expression parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static service.Expression parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static service.Expression parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static service.Expression parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static service.Expression parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static service.Expression parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static service.Expression parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static service.Expression parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static service.Expression parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static service.Expression parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static service.Expression parseFrom(
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
  public static Builder newBuilder(service.Expression prototype) {
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
   *expressions type
   * </pre>
   *
   * Protobuf type {@code services.Expression}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.Expression)
      service.ExpressionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return service.CalculatorProto.internal_static_services_Expression_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return service.CalculatorProto.internal_static_services_Expression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              service.Expression.class, service.Expression.Builder.class);
    }

    // Construct using service.Expression.newBuilder()
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
      num1_ = 0;

      num2_ = 0;

      operation_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return service.CalculatorProto.internal_static_services_Expression_descriptor;
    }

    @java.lang.Override
    public service.Expression getDefaultInstanceForType() {
      return service.Expression.getDefaultInstance();
    }

    @java.lang.Override
    public service.Expression build() {
      service.Expression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public service.Expression buildPartial() {
      service.Expression result = new service.Expression(this);
      result.num1_ = num1_;
      result.num2_ = num2_;
      result.operation_ = operation_;
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
      if (other instanceof service.Expression) {
        return mergeFrom((service.Expression)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(service.Expression other) {
      if (other == service.Expression.getDefaultInstance()) return this;
      if (other.getNum1() != 0) {
        setNum1(other.getNum1());
      }
      if (other.getNum2() != 0) {
        setNum2(other.getNum2());
      }
      if (other.operation_ != 0) {
        setOperationValue(other.getOperationValue());
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
      service.Expression parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (service.Expression) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int num1_ ;
    /**
     * <pre>
     *First Number
     * </pre>
     *
     * <code>int32 num1 = 1;</code>
     * @return The num1.
     */
    @java.lang.Override
    public int getNum1() {
      return num1_;
    }
    /**
     * <pre>
     *First Number
     * </pre>
     *
     * <code>int32 num1 = 1;</code>
     * @param value The num1 to set.
     * @return This builder for chaining.
     */
    public Builder setNum1(int value) {
      
      num1_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *First Number
     * </pre>
     *
     * <code>int32 num1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum1() {
      
      num1_ = 0;
      onChanged();
      return this;
    }

    private int num2_ ;
    /**
     * <pre>
     *Second number
     * </pre>
     *
     * <code>int32 num2 = 2;</code>
     * @return The num2.
     */
    @java.lang.Override
    public int getNum2() {
      return num2_;
    }
    /**
     * <pre>
     *Second number
     * </pre>
     *
     * <code>int32 num2 = 2;</code>
     * @param value The num2 to set.
     * @return This builder for chaining.
     */
    public Builder setNum2(int value) {
      
      num2_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Second number
     * </pre>
     *
     * <code>int32 num2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum2() {
      
      num2_ = 0;
      onChanged();
      return this;
    }

    private int operation_ = 0;
    /**
     * <pre>
     * Enum from above
     * </pre>
     *
     * <code>.services.Expression.Operation operation = 3;</code>
     * @return The enum numeric value on the wire for operation.
     */
    @java.lang.Override public int getOperationValue() {
      return operation_;
    }
    /**
     * <pre>
     * Enum from above
     * </pre>
     *
     * <code>.services.Expression.Operation operation = 3;</code>
     * @param value The enum numeric value on the wire for operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperationValue(int value) {
      
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enum from above
     * </pre>
     *
     * <code>.services.Expression.Operation operation = 3;</code>
     * @return The operation.
     */
    @java.lang.Override
    public service.Expression.Operation getOperation() {
      @SuppressWarnings("deprecation")
      service.Expression.Operation result = service.Expression.Operation.valueOf(operation_);
      return result == null ? service.Expression.Operation.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Enum from above
     * </pre>
     *
     * <code>.services.Expression.Operation operation = 3;</code>
     * @param value The operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperation(service.Expression.Operation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enum from above
     * </pre>
     *
     * <code>.services.Expression.Operation operation = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperation() {
      
      operation_ = 0;
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


    // @@protoc_insertion_point(builder_scope:services.Expression)
  }

  // @@protoc_insertion_point(class_scope:services.Expression)
  private static final service.Expression DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new service.Expression();
  }

  public static service.Expression getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Expression>
      PARSER = new com.google.protobuf.AbstractParser<Expression>() {
    @java.lang.Override
    public Expression parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Expression(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Expression> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Expression> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public service.Expression getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

