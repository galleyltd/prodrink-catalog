// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog/domain.proto

package io.prodrink.catalog.generated.domain;

public interface DrinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:catalog.Drink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.catalog.Category category = 3;</code>
   */
  boolean hasCategory();
  /**
   * <code>.catalog.Category category = 3;</code>
   */
  io.prodrink.catalog.generated.domain.Category getCategory();
  /**
   * <code>.catalog.Category category = 3;</code>
   */
  io.prodrink.catalog.generated.domain.CategoryOrBuilder getCategoryOrBuilder();

  /**
   * <code>repeated .catalog.Property properties = 4;</code>
   */
  java.util.List<io.prodrink.catalog.generated.domain.Property> 
      getPropertiesList();
  /**
   * <code>repeated .catalog.Property properties = 4;</code>
   */
  io.prodrink.catalog.generated.domain.Property getProperties(int index);
  /**
   * <code>repeated .catalog.Property properties = 4;</code>
   */
  int getPropertiesCount();
  /**
   * <code>repeated .catalog.Property properties = 4;</code>
   */
  java.util.List<? extends io.prodrink.catalog.generated.domain.PropertyOrBuilder> 
      getPropertiesOrBuilderList();
  /**
   * <code>repeated .catalog.Property properties = 4;</code>
   */
  io.prodrink.catalog.generated.domain.PropertyOrBuilder getPropertiesOrBuilder(
      int index);

  /**
   * <code>repeated string image_urls = 5;</code>
   */
  java.util.List<java.lang.String>
      getImageUrlsList();
  /**
   * <code>repeated string image_urls = 5;</code>
   */
  int getImageUrlsCount();
  /**
   * <code>repeated string image_urls = 5;</code>
   */
  java.lang.String getImageUrls(int index);
  /**
   * <code>repeated string image_urls = 5;</code>
   */
  com.google.protobuf.ByteString
      getImageUrlsBytes(int index);

  /**
   * <code>string description = 6;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 6;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
