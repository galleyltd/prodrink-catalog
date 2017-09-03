// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog/admin-dto.proto

package io.prodrink.catalog.generated.dto;

/**
 * Protobuf type {@code catalog.PropertyTypeCreationRequest}
 */
public  final class PropertyTypeCreationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:catalog.PropertyTypeCreationRequest)
    PropertyTypeCreationRequestOrBuilder {
  // Use PropertyTypeCreationRequest.newBuilder() to construct.
  private PropertyTypeCreationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PropertyTypeCreationRequest() {
    categoryId_ = 0;
    name_ = "";
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PropertyTypeCreationRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            categoryId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_PropertyTypeCreationRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_PropertyTypeCreationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest.class, io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest.Builder.class);
  }

  public static final int CATEGORY_ID_FIELD_NUMBER = 1;
  private int categoryId_;
  /**
   * <code>int32 category_id = 1;</code>
   */
  public int getCategoryId() {
    return categoryId_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <code>.catalog.ValueType type = 3;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.catalog.ValueType type = 3;</code>
   */
  public io.prodrink.catalog.generated.domain.ValueType getType() {
    io.prodrink.catalog.generated.domain.ValueType result = io.prodrink.catalog.generated.domain.ValueType.valueOf(type_);
    return result == null ? io.prodrink.catalog.generated.domain.ValueType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (categoryId_ != 0) {
      output.writeInt32(1, categoryId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (type_ != io.prodrink.catalog.generated.domain.ValueType.INT32.getNumber()) {
      output.writeEnum(3, type_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (categoryId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, categoryId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (type_ != io.prodrink.catalog.generated.domain.ValueType.INT32.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest)) {
      return super.equals(obj);
    }
    io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest other = (io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest) obj;

    boolean result = true;
    result = result && (getCategoryId()
        == other.getCategoryId());
    result = result && getName()
        .equals(other.getName());
    result = result && type_ == other.type_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CATEGORY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCategoryId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code catalog.PropertyTypeCreationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:catalog.PropertyTypeCreationRequest)
      io.prodrink.catalog.generated.dto.PropertyTypeCreationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_PropertyTypeCreationRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_PropertyTypeCreationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest.class, io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest.Builder.class);
    }

    // Construct using io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      categoryId_ = 0;

      name_ = "";

      type_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_PropertyTypeCreationRequest_descriptor;
    }

    public io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest getDefaultInstanceForType() {
      return io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest.getDefaultInstance();
    }

    public io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest build() {
      io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest buildPartial() {
      io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest result = new io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest(this);
      result.categoryId_ = categoryId_;
      result.name_ = name_;
      result.type_ = type_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest) {
        return mergeFrom((io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest other) {
      if (other == io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest.getDefaultInstance()) return this;
      if (other.getCategoryId() != 0) {
        setCategoryId(other.getCategoryId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int categoryId_ ;
    /**
     * <code>int32 category_id = 1;</code>
     */
    public int getCategoryId() {
      return categoryId_;
    }
    /**
     * <code>int32 category_id = 1;</code>
     */
    public Builder setCategoryId(int value) {
      
      categoryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 category_id = 1;</code>
     */
    public Builder clearCategoryId() {
      
      categoryId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.catalog.ValueType type = 3;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.catalog.ValueType type = 3;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.catalog.ValueType type = 3;</code>
     */
    public io.prodrink.catalog.generated.domain.ValueType getType() {
      io.prodrink.catalog.generated.domain.ValueType result = io.prodrink.catalog.generated.domain.ValueType.valueOf(type_);
      return result == null ? io.prodrink.catalog.generated.domain.ValueType.UNRECOGNIZED : result;
    }
    /**
     * <code>.catalog.ValueType type = 3;</code>
     */
    public Builder setType(io.prodrink.catalog.generated.domain.ValueType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.catalog.ValueType type = 3;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:catalog.PropertyTypeCreationRequest)
  }

  // @@protoc_insertion_point(class_scope:catalog.PropertyTypeCreationRequest)
  private static final io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest();
  }

  public static io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropertyTypeCreationRequest>
      PARSER = new com.google.protobuf.AbstractParser<PropertyTypeCreationRequest>() {
    public PropertyTypeCreationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PropertyTypeCreationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PropertyTypeCreationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropertyTypeCreationRequest> getParserForType() {
    return PARSER;
  }

  public io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

