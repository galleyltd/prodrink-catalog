// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog/admin-dto.proto

package io.prodrink.catalog.generated.dto;

/**
 * Protobuf type {@code catalog.DrinkUpdateRequest}
 */
public  final class DrinkUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:catalog.DrinkUpdateRequest)
    DrinkUpdateRequestOrBuilder {
  // Use DrinkUpdateRequest.newBuilder() to construct.
  private DrinkUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DrinkUpdateRequest() {
    drinkId_ = 0;
    name_ = "";
    categoryId_ = 0;
    propertyIds_ = java.util.Collections.emptyList();
    imageUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    description_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DrinkUpdateRequest(
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

            drinkId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            categoryId_ = input.readInt32();
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              propertyIds_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000008;
            }
            propertyIds_.add(input.readInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
              propertyIds_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000008;
            }
            while (input.getBytesUntilLimit() > 0) {
              propertyIds_.add(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              imageUrls_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000010;
            }
            imageUrls_.add(s);
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        propertyIds_ = java.util.Collections.unmodifiableList(propertyIds_);
      }
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        imageUrls_ = imageUrls_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_DrinkUpdateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_DrinkUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.prodrink.catalog.generated.dto.DrinkUpdateRequest.class, io.prodrink.catalog.generated.dto.DrinkUpdateRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DRINK_ID_FIELD_NUMBER = 1;
  private int drinkId_;
  /**
   * <code>int32 drink_id = 1;</code>
   */
  public int getDrinkId() {
    return drinkId_;
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

  public static final int CATEGORY_ID_FIELD_NUMBER = 3;
  private int categoryId_;
  /**
   * <code>int32 category_id = 3;</code>
   */
  public int getCategoryId() {
    return categoryId_;
  }

  public static final int PROPERTY_IDS_FIELD_NUMBER = 4;
  private java.util.List<java.lang.Integer> propertyIds_;
  /**
   * <code>repeated int32 property_ids = 4;</code>
   */
  public java.util.List<java.lang.Integer>
      getPropertyIdsList() {
    return propertyIds_;
  }
  /**
   * <code>repeated int32 property_ids = 4;</code>
   */
  public int getPropertyIdsCount() {
    return propertyIds_.size();
  }
  /**
   * <code>repeated int32 property_ids = 4;</code>
   */
  public int getPropertyIds(int index) {
    return propertyIds_.get(index);
  }
  private int propertyIdsMemoizedSerializedSize = -1;

  public static final int IMAGE_URLS_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList imageUrls_;
  /**
   * <code>repeated string image_urls = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getImageUrlsList() {
    return imageUrls_;
  }
  /**
   * <code>repeated string image_urls = 5;</code>
   */
  public int getImageUrlsCount() {
    return imageUrls_.size();
  }
  /**
   * <code>repeated string image_urls = 5;</code>
   */
  public java.lang.String getImageUrls(int index) {
    return imageUrls_.get(index);
  }
  /**
   * <code>repeated string image_urls = 5;</code>
   */
  public com.google.protobuf.ByteString
      getImageUrlsBytes(int index) {
    return imageUrls_.getByteString(index);
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 6;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 6;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 6;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    getSerializedSize();
    if (drinkId_ != 0) {
      output.writeInt32(1, drinkId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (categoryId_ != 0) {
      output.writeInt32(3, categoryId_);
    }
    if (getPropertyIdsList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(propertyIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < propertyIds_.size(); i++) {
      output.writeInt32NoTag(propertyIds_.get(i));
    }
    for (int i = 0; i < imageUrls_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, imageUrls_.getRaw(i));
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, description_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (drinkId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, drinkId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (categoryId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, categoryId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < propertyIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(propertyIds_.get(i));
      }
      size += dataSize;
      if (!getPropertyIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      propertyIdsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < imageUrls_.size(); i++) {
        dataSize += computeStringSizeNoTag(imageUrls_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getImageUrlsList().size();
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, description_);
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
    if (!(obj instanceof io.prodrink.catalog.generated.dto.DrinkUpdateRequest)) {
      return super.equals(obj);
    }
    io.prodrink.catalog.generated.dto.DrinkUpdateRequest other = (io.prodrink.catalog.generated.dto.DrinkUpdateRequest) obj;

    boolean result = true;
    result = result && (getDrinkId()
        == other.getDrinkId());
    result = result && getName()
        .equals(other.getName());
    result = result && (getCategoryId()
        == other.getCategoryId());
    result = result && getPropertyIdsList()
        .equals(other.getPropertyIdsList());
    result = result && getImageUrlsList()
        .equals(other.getImageUrlsList());
    result = result && getDescription()
        .equals(other.getDescription());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DRINK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDrinkId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CATEGORY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCategoryId();
    if (getPropertyIdsCount() > 0) {
      hash = (37 * hash) + PROPERTY_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getPropertyIdsList().hashCode();
    }
    if (getImageUrlsCount() > 0) {
      hash = (37 * hash) + IMAGE_URLS_FIELD_NUMBER;
      hash = (53 * hash) + getImageUrlsList().hashCode();
    }
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
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
  public static Builder newBuilder(io.prodrink.catalog.generated.dto.DrinkUpdateRequest prototype) {
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
   * Protobuf type {@code catalog.DrinkUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:catalog.DrinkUpdateRequest)
      io.prodrink.catalog.generated.dto.DrinkUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_DrinkUpdateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_DrinkUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.prodrink.catalog.generated.dto.DrinkUpdateRequest.class, io.prodrink.catalog.generated.dto.DrinkUpdateRequest.Builder.class);
    }

    // Construct using io.prodrink.catalog.generated.dto.DrinkUpdateRequest.newBuilder()
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
      drinkId_ = 0;

      name_ = "";

      categoryId_ = 0;

      propertyIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      imageUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      description_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_DrinkUpdateRequest_descriptor;
    }

    public io.prodrink.catalog.generated.dto.DrinkUpdateRequest getDefaultInstanceForType() {
      return io.prodrink.catalog.generated.dto.DrinkUpdateRequest.getDefaultInstance();
    }

    public io.prodrink.catalog.generated.dto.DrinkUpdateRequest build() {
      io.prodrink.catalog.generated.dto.DrinkUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.prodrink.catalog.generated.dto.DrinkUpdateRequest buildPartial() {
      io.prodrink.catalog.generated.dto.DrinkUpdateRequest result = new io.prodrink.catalog.generated.dto.DrinkUpdateRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.drinkId_ = drinkId_;
      result.name_ = name_;
      result.categoryId_ = categoryId_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        propertyIds_ = java.util.Collections.unmodifiableList(propertyIds_);
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.propertyIds_ = propertyIds_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        imageUrls_ = imageUrls_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.imageUrls_ = imageUrls_;
      result.description_ = description_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.prodrink.catalog.generated.dto.DrinkUpdateRequest) {
        return mergeFrom((io.prodrink.catalog.generated.dto.DrinkUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.prodrink.catalog.generated.dto.DrinkUpdateRequest other) {
      if (other == io.prodrink.catalog.generated.dto.DrinkUpdateRequest.getDefaultInstance()) return this;
      if (other.getDrinkId() != 0) {
        setDrinkId(other.getDrinkId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getCategoryId() != 0) {
        setCategoryId(other.getCategoryId());
      }
      if (!other.propertyIds_.isEmpty()) {
        if (propertyIds_.isEmpty()) {
          propertyIds_ = other.propertyIds_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensurePropertyIdsIsMutable();
          propertyIds_.addAll(other.propertyIds_);
        }
        onChanged();
      }
      if (!other.imageUrls_.isEmpty()) {
        if (imageUrls_.isEmpty()) {
          imageUrls_ = other.imageUrls_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureImageUrlsIsMutable();
          imageUrls_.addAll(other.imageUrls_);
        }
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
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
      io.prodrink.catalog.generated.dto.DrinkUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.prodrink.catalog.generated.dto.DrinkUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int drinkId_ ;
    /**
     * <code>int32 drink_id = 1;</code>
     */
    public int getDrinkId() {
      return drinkId_;
    }
    /**
     * <code>int32 drink_id = 1;</code>
     */
    public Builder setDrinkId(int value) {
      
      drinkId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 drink_id = 1;</code>
     */
    public Builder clearDrinkId() {
      
      drinkId_ = 0;
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

    private int categoryId_ ;
    /**
     * <code>int32 category_id = 3;</code>
     */
    public int getCategoryId() {
      return categoryId_;
    }
    /**
     * <code>int32 category_id = 3;</code>
     */
    public Builder setCategoryId(int value) {
      
      categoryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 category_id = 3;</code>
     */
    public Builder clearCategoryId() {
      
      categoryId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> propertyIds_ = java.util.Collections.emptyList();
    private void ensurePropertyIdsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        propertyIds_ = new java.util.ArrayList<java.lang.Integer>(propertyIds_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated int32 property_ids = 4;</code>
     */
    public java.util.List<java.lang.Integer>
        getPropertyIdsList() {
      return java.util.Collections.unmodifiableList(propertyIds_);
    }
    /**
     * <code>repeated int32 property_ids = 4;</code>
     */
    public int getPropertyIdsCount() {
      return propertyIds_.size();
    }
    /**
     * <code>repeated int32 property_ids = 4;</code>
     */
    public int getPropertyIds(int index) {
      return propertyIds_.get(index);
    }
    /**
     * <code>repeated int32 property_ids = 4;</code>
     */
    public Builder setPropertyIds(
        int index, int value) {
      ensurePropertyIdsIsMutable();
      propertyIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 property_ids = 4;</code>
     */
    public Builder addPropertyIds(int value) {
      ensurePropertyIdsIsMutable();
      propertyIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 property_ids = 4;</code>
     */
    public Builder addAllPropertyIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensurePropertyIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, propertyIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 property_ids = 4;</code>
     */
    public Builder clearPropertyIds() {
      propertyIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList imageUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureImageUrlsIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        imageUrls_ = new com.google.protobuf.LazyStringArrayList(imageUrls_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string image_urls = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getImageUrlsList() {
      return imageUrls_.getUnmodifiableView();
    }
    /**
     * <code>repeated string image_urls = 5;</code>
     */
    public int getImageUrlsCount() {
      return imageUrls_.size();
    }
    /**
     * <code>repeated string image_urls = 5;</code>
     */
    public java.lang.String getImageUrls(int index) {
      return imageUrls_.get(index);
    }
    /**
     * <code>repeated string image_urls = 5;</code>
     */
    public com.google.protobuf.ByteString
        getImageUrlsBytes(int index) {
      return imageUrls_.getByteString(index);
    }
    /**
     * <code>repeated string image_urls = 5;</code>
     */
    public Builder setImageUrls(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureImageUrlsIsMutable();
      imageUrls_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_urls = 5;</code>
     */
    public Builder addImageUrls(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureImageUrlsIsMutable();
      imageUrls_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_urls = 5;</code>
     */
    public Builder addAllImageUrls(
        java.lang.Iterable<java.lang.String> values) {
      ensureImageUrlsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, imageUrls_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_urls = 5;</code>
     */
    public Builder clearImageUrls() {
      imageUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_urls = 5;</code>
     */
    public Builder addImageUrlsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureImageUrlsIsMutable();
      imageUrls_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 6;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 6;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 6;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 6;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 6;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
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


    // @@protoc_insertion_point(builder_scope:catalog.DrinkUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:catalog.DrinkUpdateRequest)
  private static final io.prodrink.catalog.generated.dto.DrinkUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.prodrink.catalog.generated.dto.DrinkUpdateRequest();
  }

  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DrinkUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<DrinkUpdateRequest>() {
    public DrinkUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DrinkUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DrinkUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DrinkUpdateRequest> getParserForType() {
    return PARSER;
  }

  public io.prodrink.catalog.generated.dto.DrinkUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

