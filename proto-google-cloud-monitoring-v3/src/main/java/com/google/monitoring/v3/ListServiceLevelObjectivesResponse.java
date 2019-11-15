/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/service_service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `ListServiceLevelObjectives` response.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.ListServiceLevelObjectivesResponse}
 */
public final class ListServiceLevelObjectivesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.ListServiceLevelObjectivesResponse)
    ListServiceLevelObjectivesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListServiceLevelObjectivesResponse.newBuilder() to construct.
  private ListServiceLevelObjectivesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListServiceLevelObjectivesResponse() {
    serviceLevelObjectives_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListServiceLevelObjectivesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                serviceLevelObjectives_ =
                    new java.util.ArrayList<com.google.monitoring.v3.ServiceLevelObjective>();
                mutable_bitField0_ |= 0x00000001;
              }
              serviceLevelObjectives_.add(
                  input.readMessage(
                      com.google.monitoring.v3.ServiceLevelObjective.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        serviceLevelObjectives_ = java.util.Collections.unmodifiableList(serviceLevelObjectives_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.ServiceMonitoringServiceProto
        .internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.ServiceMonitoringServiceProto
        .internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.ListServiceLevelObjectivesResponse.class,
            com.google.monitoring.v3.ListServiceLevelObjectivesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SERVICE_LEVEL_OBJECTIVES_FIELD_NUMBER = 1;
  private java.util.List<com.google.monitoring.v3.ServiceLevelObjective> serviceLevelObjectives_;
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective`s matching the specified filter.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;</code>
   */
  public java.util.List<com.google.monitoring.v3.ServiceLevelObjective>
      getServiceLevelObjectivesList() {
    return serviceLevelObjectives_;
  }
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective`s matching the specified filter.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;</code>
   */
  public java.util.List<? extends com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder>
      getServiceLevelObjectivesOrBuilderList() {
    return serviceLevelObjectives_;
  }
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective`s matching the specified filter.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;</code>
   */
  public int getServiceLevelObjectivesCount() {
    return serviceLevelObjectives_.size();
  }
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective`s matching the specified filter.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;</code>
   */
  public com.google.monitoring.v3.ServiceLevelObjective getServiceLevelObjectives(int index) {
    return serviceLevelObjectives_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective`s matching the specified filter.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;</code>
   */
  public com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder getServiceLevelObjectivesOrBuilder(
      int index) {
    return serviceLevelObjectives_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < serviceLevelObjectives_.size(); i++) {
      output.writeMessage(1, serviceLevelObjectives_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < serviceLevelObjectives_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, serviceLevelObjectives_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.monitoring.v3.ListServiceLevelObjectivesResponse)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.ListServiceLevelObjectivesResponse other =
        (com.google.monitoring.v3.ListServiceLevelObjectivesResponse) obj;

    if (!getServiceLevelObjectivesList().equals(other.getServiceLevelObjectivesList()))
      return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getServiceLevelObjectivesCount() > 0) {
      hash = (37 * hash) + SERVICE_LEVEL_OBJECTIVES_FIELD_NUMBER;
      hash = (53 * hash) + getServiceLevelObjectivesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.monitoring.v3.ListServiceLevelObjectivesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The `ListServiceLevelObjectives` response.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.ListServiceLevelObjectivesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.ListServiceLevelObjectivesResponse)
      com.google.monitoring.v3.ListServiceLevelObjectivesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.ServiceMonitoringServiceProto
          .internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.ServiceMonitoringServiceProto
          .internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.ListServiceLevelObjectivesResponse.class,
              com.google.monitoring.v3.ListServiceLevelObjectivesResponse.Builder.class);
    }

    // Construct using com.google.monitoring.v3.ListServiceLevelObjectivesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getServiceLevelObjectivesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (serviceLevelObjectivesBuilder_ == null) {
        serviceLevelObjectives_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        serviceLevelObjectivesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.ServiceMonitoringServiceProto
          .internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.ListServiceLevelObjectivesResponse getDefaultInstanceForType() {
      return com.google.monitoring.v3.ListServiceLevelObjectivesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.ListServiceLevelObjectivesResponse build() {
      com.google.monitoring.v3.ListServiceLevelObjectivesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.ListServiceLevelObjectivesResponse buildPartial() {
      com.google.monitoring.v3.ListServiceLevelObjectivesResponse result =
          new com.google.monitoring.v3.ListServiceLevelObjectivesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (serviceLevelObjectivesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          serviceLevelObjectives_ = java.util.Collections.unmodifiableList(serviceLevelObjectives_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.serviceLevelObjectives_ = serviceLevelObjectives_;
      } else {
        result.serviceLevelObjectives_ = serviceLevelObjectivesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.ListServiceLevelObjectivesResponse) {
        return mergeFrom((com.google.monitoring.v3.ListServiceLevelObjectivesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.ListServiceLevelObjectivesResponse other) {
      if (other == com.google.monitoring.v3.ListServiceLevelObjectivesResponse.getDefaultInstance())
        return this;
      if (serviceLevelObjectivesBuilder_ == null) {
        if (!other.serviceLevelObjectives_.isEmpty()) {
          if (serviceLevelObjectives_.isEmpty()) {
            serviceLevelObjectives_ = other.serviceLevelObjectives_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServiceLevelObjectivesIsMutable();
            serviceLevelObjectives_.addAll(other.serviceLevelObjectives_);
          }
          onChanged();
        }
      } else {
        if (!other.serviceLevelObjectives_.isEmpty()) {
          if (serviceLevelObjectivesBuilder_.isEmpty()) {
            serviceLevelObjectivesBuilder_.dispose();
            serviceLevelObjectivesBuilder_ = null;
            serviceLevelObjectives_ = other.serviceLevelObjectives_;
            bitField0_ = (bitField0_ & ~0x00000001);
            serviceLevelObjectivesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getServiceLevelObjectivesFieldBuilder()
                    : null;
          } else {
            serviceLevelObjectivesBuilder_.addAllMessages(other.serviceLevelObjectives_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.monitoring.v3.ListServiceLevelObjectivesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.monitoring.v3.ListServiceLevelObjectivesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.monitoring.v3.ServiceLevelObjective> serviceLevelObjectives_ =
        java.util.Collections.emptyList();

    private void ensureServiceLevelObjectivesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        serviceLevelObjectives_ =
            new java.util.ArrayList<com.google.monitoring.v3.ServiceLevelObjective>(
                serviceLevelObjectives_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.monitoring.v3.ServiceLevelObjective,
            com.google.monitoring.v3.ServiceLevelObjective.Builder,
            com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder>
        serviceLevelObjectivesBuilder_;

    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public java.util.List<com.google.monitoring.v3.ServiceLevelObjective>
        getServiceLevelObjectivesList() {
      if (serviceLevelObjectivesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(serviceLevelObjectives_);
      } else {
        return serviceLevelObjectivesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public int getServiceLevelObjectivesCount() {
      if (serviceLevelObjectivesBuilder_ == null) {
        return serviceLevelObjectives_.size();
      } else {
        return serviceLevelObjectivesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public com.google.monitoring.v3.ServiceLevelObjective getServiceLevelObjectives(int index) {
      if (serviceLevelObjectivesBuilder_ == null) {
        return serviceLevelObjectives_.get(index);
      } else {
        return serviceLevelObjectivesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public Builder setServiceLevelObjectives(
        int index, com.google.monitoring.v3.ServiceLevelObjective value) {
      if (serviceLevelObjectivesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceLevelObjectivesIsMutable();
        serviceLevelObjectives_.set(index, value);
        onChanged();
      } else {
        serviceLevelObjectivesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public Builder setServiceLevelObjectives(
        int index, com.google.monitoring.v3.ServiceLevelObjective.Builder builderForValue) {
      if (serviceLevelObjectivesBuilder_ == null) {
        ensureServiceLevelObjectivesIsMutable();
        serviceLevelObjectives_.set(index, builderForValue.build());
        onChanged();
      } else {
        serviceLevelObjectivesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public Builder addServiceLevelObjectives(com.google.monitoring.v3.ServiceLevelObjective value) {
      if (serviceLevelObjectivesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceLevelObjectivesIsMutable();
        serviceLevelObjectives_.add(value);
        onChanged();
      } else {
        serviceLevelObjectivesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public Builder addServiceLevelObjectives(
        int index, com.google.monitoring.v3.ServiceLevelObjective value) {
      if (serviceLevelObjectivesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceLevelObjectivesIsMutable();
        serviceLevelObjectives_.add(index, value);
        onChanged();
      } else {
        serviceLevelObjectivesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public Builder addServiceLevelObjectives(
        com.google.monitoring.v3.ServiceLevelObjective.Builder builderForValue) {
      if (serviceLevelObjectivesBuilder_ == null) {
        ensureServiceLevelObjectivesIsMutable();
        serviceLevelObjectives_.add(builderForValue.build());
        onChanged();
      } else {
        serviceLevelObjectivesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public Builder addServiceLevelObjectives(
        int index, com.google.monitoring.v3.ServiceLevelObjective.Builder builderForValue) {
      if (serviceLevelObjectivesBuilder_ == null) {
        ensureServiceLevelObjectivesIsMutable();
        serviceLevelObjectives_.add(index, builderForValue.build());
        onChanged();
      } else {
        serviceLevelObjectivesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public Builder addAllServiceLevelObjectives(
        java.lang.Iterable<? extends com.google.monitoring.v3.ServiceLevelObjective> values) {
      if (serviceLevelObjectivesBuilder_ == null) {
        ensureServiceLevelObjectivesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, serviceLevelObjectives_);
        onChanged();
      } else {
        serviceLevelObjectivesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public Builder clearServiceLevelObjectives() {
      if (serviceLevelObjectivesBuilder_ == null) {
        serviceLevelObjectives_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        serviceLevelObjectivesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public Builder removeServiceLevelObjectives(int index) {
      if (serviceLevelObjectivesBuilder_ == null) {
        ensureServiceLevelObjectivesIsMutable();
        serviceLevelObjectives_.remove(index);
        onChanged();
      } else {
        serviceLevelObjectivesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public com.google.monitoring.v3.ServiceLevelObjective.Builder getServiceLevelObjectivesBuilder(
        int index) {
      return getServiceLevelObjectivesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder
        getServiceLevelObjectivesOrBuilder(int index) {
      if (serviceLevelObjectivesBuilder_ == null) {
        return serviceLevelObjectives_.get(index);
      } else {
        return serviceLevelObjectivesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public java.util.List<? extends com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder>
        getServiceLevelObjectivesOrBuilderList() {
      if (serviceLevelObjectivesBuilder_ != null) {
        return serviceLevelObjectivesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(serviceLevelObjectives_);
      }
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public com.google.monitoring.v3.ServiceLevelObjective.Builder
        addServiceLevelObjectivesBuilder() {
      return getServiceLevelObjectivesFieldBuilder()
          .addBuilder(com.google.monitoring.v3.ServiceLevelObjective.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public com.google.monitoring.v3.ServiceLevelObjective.Builder addServiceLevelObjectivesBuilder(
        int index) {
      return getServiceLevelObjectivesFieldBuilder()
          .addBuilder(index, com.google.monitoring.v3.ServiceLevelObjective.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective`s matching the specified filter.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;
     * </code>
     */
    public java.util.List<com.google.monitoring.v3.ServiceLevelObjective.Builder>
        getServiceLevelObjectivesBuilderList() {
      return getServiceLevelObjectivesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.monitoring.v3.ServiceLevelObjective,
            com.google.monitoring.v3.ServiceLevelObjective.Builder,
            com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder>
        getServiceLevelObjectivesFieldBuilder() {
      if (serviceLevelObjectivesBuilder_ == null) {
        serviceLevelObjectivesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.monitoring.v3.ServiceLevelObjective,
                com.google.monitoring.v3.ServiceLevelObjective.Builder,
                com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder>(
                serviceLevelObjectives_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        serviceLevelObjectives_ = null;
      }
      return serviceLevelObjectivesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.ListServiceLevelObjectivesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.ListServiceLevelObjectivesResponse)
  private static final com.google.monitoring.v3.ListServiceLevelObjectivesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.ListServiceLevelObjectivesResponse();
  }

  public static com.google.monitoring.v3.ListServiceLevelObjectivesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListServiceLevelObjectivesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListServiceLevelObjectivesResponse>() {
        @java.lang.Override
        public ListServiceLevelObjectivesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListServiceLevelObjectivesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListServiceLevelObjectivesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListServiceLevelObjectivesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.ListServiceLevelObjectivesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
