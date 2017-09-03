// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog/admin-dto.proto

package io.prodrink.catalog.generated.dto;

/**
 * Protobuf type {@code catalog.CategoryUpdateRequest}
 */
public  final class CategoryUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:catalog.CategoryUpdateRequest)
    CategoryUpdateRequestOrBuilder {
  // Use CategoryUpdateRequest.newBuilder() to construct.
  private CategoryUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CategoryUpdateRequest() {
    categoryId_ = 0;
    name_ = "";
    parentCategoryId_ = 0;
    propertyTypes_ = java.util.Collections.emptyList();
    imageUrl_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CategoryUpdateRequest(
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

            parentCategoryId_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              propertyTypes_ = new java.util.ArrayList<io.prodrink.catalog.generated.domain.PropertyType>();
              mutable_bitField0_ |= 0x00000008;
            }
            propertyTypes_.add(
                input.readMessage(io.prodrink.catalog.generated.domain.PropertyType.parser(), extensionRegistry));
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            imageUrl_ = s;
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
        propertyTypes_ = java.util.Collections.unmodifiableList(propertyTypes_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_CategoryUpdateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_CategoryUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.prodrink.catalog.generated.dto.CategoryUpdateRequest.class, io.prodrink.catalog.generated.dto.CategoryUpdateRequest.Builder.class);
  }

  private int bitField0_;
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

  public static final int PARENT_CATEGORY_ID_FIELD_NUMBER = 3;
  private int parentCategoryId_;
  /**
   * <code>int32 parent_category_id = 3;</code>
   */
  public int getParentCategoryId() {
    return parentCategoryId_;
  }

  public static final int PROPERTY_TYPES_FIELD_NUMBER = 4;
  private java.util.List<io.prodrink.catalog.generated.domain.PropertyType> propertyTypes_;
  /**
   * <code>repeated .catalog.PropertyType property_types = 4;</code>
   */
  public java.util.List<io.prodrink.catalog.generated.domain.PropertyType> getPropertyTypesList() {
    return propertyTypes_;
  }
  /**
   * <code>repeated .catalog.PropertyType property_types = 4;</code>
   */
  public java.util.List<? extends io.prodrink.catalog.generated.domain.PropertyTypeOrBuilder> 
      getPropertyTypesOrBuilderList() {
    return propertyTypes_;
  }
  /**
   * <code>repeated .catalog.PropertyType property_types = 4;</code>
   */
  public int getPropertyTypesCount() {
    return propertyTypes_.size();
  }
  /**
   * <code>repeated .catalog.PropertyType property_types = 4;</code>
   */
  public io.prodrink.catalog.generated.domain.PropertyType getPropertyTypes(int index) {
    return propertyTypes_.get(index);
  }
  /**
   * <code>repeated .catalog.PropertyType property_types = 4;</code>
   */
  public io.prodrink.catalog.generated.domain.PropertyTypeOrBuilder getPropertyTypesOrBuilder(
      int index) {
    return propertyTypes_.get(index);
  }

  public static final int IMAGE_URL_FIELD_NUMBER = 5;
  private volatile java.lang.Object imageUrl_;
  /**
   * <code>string image_url = 5;</code>
   */
  public java.lang.String getImageUrl() {
    java.lang.Object ref = imageUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string image_url = 5;</code>
   */
  public com.google.protobuf.ByteString
      getImageUrlBytes() {
    java.lang.Object ref = imageUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageUrl_ = b;
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
    if (categoryId_ != 0) {
      output.writeInt32(1, categoryId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (parentCategoryId_ != 0) {
      output.writeInt32(3, parentCategoryId_);
    }
    for (int i = 0; i < propertyTypes_.size(); i++) {
      output.writeMessage(4, propertyTypes_.get(i));
    }
    if (!getImageUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, imageUrl_);
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
    if (parentCategoryId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, parentCategoryId_);
    }
    for (int i = 0; i < propertyTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, propertyTypes_.get(i));
    }
    if (!getImageUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, imageUrl_);
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
    if (!(obj instanceof io.prodrink.catalog.generated.dto.CategoryUpdateRequest)) {
      return super.equals(obj);
    }
    io.prodrink.catalog.generated.dto.CategoryUpdateRequest other = (io.prodrink.catalog.generated.dto.CategoryUpdateRequest) obj;

    boolean result = true;
    result = result && (getCategoryId()
        == other.getCategoryId());
    result = result && getName()
        .equals(other.getName());
    result = result && (getParentCategoryId()
        == other.getParentCategoryId());
    result = result && getPropertyTypesList()
        .equals(other.getPropertyTypesList());
    result = result && getImageUrl()
        .equals(other.getImageUrl());
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
    hash = (37 * hash) + PARENT_CATEGORY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getParentCategoryId();
    if (getPropertyTypesCount() > 0) {
      hash = (37 * hash) + PROPERTY_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getPropertyTypesList().hashCode();
    }
    hash = (37 * hash) + IMAGE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getImageUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest parseFrom(
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
  public static Builder newBuilder(io.prodrink.catalog.generated.dto.CategoryUpdateRequest prototype) {
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
   * Protobuf type {@code catalog.CategoryUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:catalog.CategoryUpdateRequest)
      io.prodrink.catalog.generated.dto.CategoryUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_CategoryUpdateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_CategoryUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.prodrink.catalog.generated.dto.CategoryUpdateRequest.class, io.prodrink.catalog.generated.dto.CategoryUpdateRequest.Builder.class);
    }

    // Construct using io.prodrink.catalog.generated.dto.CategoryUpdateRequest.newBuilder()
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
        getPropertyTypesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      categoryId_ = 0;

      name_ = "";

      parentCategoryId_ = 0;

      if (propertyTypesBuilder_ == null) {
        propertyTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        propertyTypesBuilder_.clear();
      }
      imageUrl_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.prodrink.catalog.generated.dto.AdminDrinkDtoOuter.internal_static_catalog_CategoryUpdateRequest_descriptor;
    }

    public io.prodrink.catalog.generated.dto.CategoryUpdateRequest getDefaultInstanceForType() {
      return io.prodrink.catalog.generated.dto.CategoryUpdateRequest.getDefaultInstance();
    }

    public io.prodrink.catalog.generated.dto.CategoryUpdateRequest build() {
      io.prodrink.catalog.generated.dto.CategoryUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.prodrink.catalog.generated.dto.CategoryUpdateRequest buildPartial() {
      io.prodrink.catalog.generated.dto.CategoryUpdateRequest result = new io.prodrink.catalog.generated.dto.CategoryUpdateRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.categoryId_ = categoryId_;
      result.name_ = name_;
      result.parentCategoryId_ = parentCategoryId_;
      if (propertyTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          propertyTypes_ = java.util.Collections.unmodifiableList(propertyTypes_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.propertyTypes_ = propertyTypes_;
      } else {
        result.propertyTypes_ = propertyTypesBuilder_.build();
      }
      result.imageUrl_ = imageUrl_;
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
      if (other instanceof io.prodrink.catalog.generated.dto.CategoryUpdateRequest) {
        return mergeFrom((io.prodrink.catalog.generated.dto.CategoryUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.prodrink.catalog.generated.dto.CategoryUpdateRequest other) {
      if (other == io.prodrink.catalog.generated.dto.CategoryUpdateRequest.getDefaultInstance()) return this;
      if (other.getCategoryId() != 0) {
        setCategoryId(other.getCategoryId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getParentCategoryId() != 0) {
        setParentCategoryId(other.getParentCategoryId());
      }
      if (propertyTypesBuilder_ == null) {
        if (!other.propertyTypes_.isEmpty()) {
          if (propertyTypes_.isEmpty()) {
            propertyTypes_ = other.propertyTypes_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensurePropertyTypesIsMutable();
            propertyTypes_.addAll(other.propertyTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.propertyTypes_.isEmpty()) {
          if (propertyTypesBuilder_.isEmpty()) {
            propertyTypesBuilder_.dispose();
            propertyTypesBuilder_ = null;
            propertyTypes_ = other.propertyTypes_;
            bitField0_ = (bitField0_ & ~0x00000008);
            propertyTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPropertyTypesFieldBuilder() : null;
          } else {
            propertyTypesBuilder_.addAllMessages(other.propertyTypes_);
          }
        }
      }
      if (!other.getImageUrl().isEmpty()) {
        imageUrl_ = other.imageUrl_;
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
      io.prodrink.catalog.generated.dto.CategoryUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.prodrink.catalog.generated.dto.CategoryUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private int parentCategoryId_ ;
    /**
     * <code>int32 parent_category_id = 3;</code>
     */
    public int getParentCategoryId() {
      return parentCategoryId_;
    }
    /**
     * <code>int32 parent_category_id = 3;</code>
     */
    public Builder setParentCategoryId(int value) {
      
      parentCategoryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 parent_category_id = 3;</code>
     */
    public Builder clearParentCategoryId() {
      
      parentCategoryId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<io.prodrink.catalog.generated.domain.PropertyType> propertyTypes_ =
      java.util.Collections.emptyList();
    private void ensurePropertyTypesIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        propertyTypes_ = new java.util.ArrayList<io.prodrink.catalog.generated.domain.PropertyType>(propertyTypes_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.prodrink.catalog.generated.domain.PropertyType, io.prodrink.catalog.generated.domain.PropertyType.Builder, io.prodrink.catalog.generated.domain.PropertyTypeOrBuilder> propertyTypesBuilder_;

    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public java.util.List<io.prodrink.catalog.generated.domain.PropertyType> getPropertyTypesList() {
      if (propertyTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(propertyTypes_);
      } else {
        return propertyTypesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public int getPropertyTypesCount() {
      if (propertyTypesBuilder_ == null) {
        return propertyTypes_.size();
      } else {
        return propertyTypesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public io.prodrink.catalog.generated.domain.PropertyType getPropertyTypes(int index) {
      if (propertyTypesBuilder_ == null) {
        return propertyTypes_.get(index);
      } else {
        return propertyTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public Builder setPropertyTypes(
        int index, io.prodrink.catalog.generated.domain.PropertyType value) {
      if (propertyTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertyTypesIsMutable();
        propertyTypes_.set(index, value);
        onChanged();
      } else {
        propertyTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public Builder setPropertyTypes(
        int index, io.prodrink.catalog.generated.domain.PropertyType.Builder builderForValue) {
      if (propertyTypesBuilder_ == null) {
        ensurePropertyTypesIsMutable();
        propertyTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        propertyTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public Builder addPropertyTypes(io.prodrink.catalog.generated.domain.PropertyType value) {
      if (propertyTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertyTypesIsMutable();
        propertyTypes_.add(value);
        onChanged();
      } else {
        propertyTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public Builder addPropertyTypes(
        int index, io.prodrink.catalog.generated.domain.PropertyType value) {
      if (propertyTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertyTypesIsMutable();
        propertyTypes_.add(index, value);
        onChanged();
      } else {
        propertyTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public Builder addPropertyTypes(
        io.prodrink.catalog.generated.domain.PropertyType.Builder builderForValue) {
      if (propertyTypesBuilder_ == null) {
        ensurePropertyTypesIsMutable();
        propertyTypes_.add(builderForValue.build());
        onChanged();
      } else {
        propertyTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public Builder addPropertyTypes(
        int index, io.prodrink.catalog.generated.domain.PropertyType.Builder builderForValue) {
      if (propertyTypesBuilder_ == null) {
        ensurePropertyTypesIsMutable();
        propertyTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        propertyTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public Builder addAllPropertyTypes(
        java.lang.Iterable<? extends io.prodrink.catalog.generated.domain.PropertyType> values) {
      if (propertyTypesBuilder_ == null) {
        ensurePropertyTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, propertyTypes_);
        onChanged();
      } else {
        propertyTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public Builder clearPropertyTypes() {
      if (propertyTypesBuilder_ == null) {
        propertyTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        propertyTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public Builder removePropertyTypes(int index) {
      if (propertyTypesBuilder_ == null) {
        ensurePropertyTypesIsMutable();
        propertyTypes_.remove(index);
        onChanged();
      } else {
        propertyTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public io.prodrink.catalog.generated.domain.PropertyType.Builder getPropertyTypesBuilder(
        int index) {
      return getPropertyTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public io.prodrink.catalog.generated.domain.PropertyTypeOrBuilder getPropertyTypesOrBuilder(
        int index) {
      if (propertyTypesBuilder_ == null) {
        return propertyTypes_.get(index);  } else {
        return propertyTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public java.util.List<? extends io.prodrink.catalog.generated.domain.PropertyTypeOrBuilder> 
         getPropertyTypesOrBuilderList() {
      if (propertyTypesBuilder_ != null) {
        return propertyTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(propertyTypes_);
      }
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public io.prodrink.catalog.generated.domain.PropertyType.Builder addPropertyTypesBuilder() {
      return getPropertyTypesFieldBuilder().addBuilder(
          io.prodrink.catalog.generated.domain.PropertyType.getDefaultInstance());
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public io.prodrink.catalog.generated.domain.PropertyType.Builder addPropertyTypesBuilder(
        int index) {
      return getPropertyTypesFieldBuilder().addBuilder(
          index, io.prodrink.catalog.generated.domain.PropertyType.getDefaultInstance());
    }
    /**
     * <code>repeated .catalog.PropertyType property_types = 4;</code>
     */
    public java.util.List<io.prodrink.catalog.generated.domain.PropertyType.Builder> 
         getPropertyTypesBuilderList() {
      return getPropertyTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.prodrink.catalog.generated.domain.PropertyType, io.prodrink.catalog.generated.domain.PropertyType.Builder, io.prodrink.catalog.generated.domain.PropertyTypeOrBuilder> 
        getPropertyTypesFieldBuilder() {
      if (propertyTypesBuilder_ == null) {
        propertyTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.prodrink.catalog.generated.domain.PropertyType, io.prodrink.catalog.generated.domain.PropertyType.Builder, io.prodrink.catalog.generated.domain.PropertyTypeOrBuilder>(
                propertyTypes_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        propertyTypes_ = null;
      }
      return propertyTypesBuilder_;
    }

    private java.lang.Object imageUrl_ = "";
    /**
     * <code>string image_url = 5;</code>
     */
    public java.lang.String getImageUrl() {
      java.lang.Object ref = imageUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string image_url = 5;</code>
     */
    public com.google.protobuf.ByteString
        getImageUrlBytes() {
      java.lang.Object ref = imageUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string image_url = 5;</code>
     */
    public Builder setImageUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string image_url = 5;</code>
     */
    public Builder clearImageUrl() {
      
      imageUrl_ = getDefaultInstance().getImageUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string image_url = 5;</code>
     */
    public Builder setImageUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageUrl_ = value;
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


    // @@protoc_insertion_point(builder_scope:catalog.CategoryUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:catalog.CategoryUpdateRequest)
  private static final io.prodrink.catalog.generated.dto.CategoryUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.prodrink.catalog.generated.dto.CategoryUpdateRequest();
  }

  public static io.prodrink.catalog.generated.dto.CategoryUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CategoryUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<CategoryUpdateRequest>() {
    public CategoryUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CategoryUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CategoryUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CategoryUpdateRequest> getParserForType() {
    return PARSER;
  }

  public io.prodrink.catalog.generated.dto.CategoryUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

