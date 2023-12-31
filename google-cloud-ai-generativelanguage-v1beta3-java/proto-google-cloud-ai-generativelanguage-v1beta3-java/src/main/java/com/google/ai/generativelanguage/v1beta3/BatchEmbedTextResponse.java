// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/text_service.proto

package com.google.ai.generativelanguage.v1beta3;

/**
 * <pre>
 * The response to a EmbedTextRequest.
 * </pre>
 *
 * Protobuf type {@code google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse}
 */
public final class BatchEmbedTextResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse)
    BatchEmbedTextResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchEmbedTextResponse.newBuilder() to construct.
  private BatchEmbedTextResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchEmbedTextResponse() {
    embeddings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchEmbedTextResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ai.generativelanguage.v1beta3.TextServiceProto.internal_static_google_ai_generativelanguage_v1beta3_BatchEmbedTextResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ai.generativelanguage.v1beta3.TextServiceProto.internal_static_google_ai_generativelanguage_v1beta3_BatchEmbedTextResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse.class, com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse.Builder.class);
  }

  public static final int EMBEDDINGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ai.generativelanguage.v1beta3.Embedding> embeddings_;
  /**
   * <pre>
   * Output only. The embeddings generated from the input text.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ai.generativelanguage.v1beta3.Embedding> getEmbeddingsList() {
    return embeddings_;
  }
  /**
   * <pre>
   * Output only. The embeddings generated from the input text.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ai.generativelanguage.v1beta3.EmbeddingOrBuilder> 
      getEmbeddingsOrBuilderList() {
    return embeddings_;
  }
  /**
   * <pre>
   * Output only. The embeddings generated from the input text.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public int getEmbeddingsCount() {
    return embeddings_.size();
  }
  /**
   * <pre>
   * Output only. The embeddings generated from the input text.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.ai.generativelanguage.v1beta3.Embedding getEmbeddings(int index) {
    return embeddings_.get(index);
  }
  /**
   * <pre>
   * Output only. The embeddings generated from the input text.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.ai.generativelanguage.v1beta3.EmbeddingOrBuilder getEmbeddingsOrBuilder(
      int index) {
    return embeddings_.get(index);
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
    for (int i = 0; i < embeddings_.size(); i++) {
      output.writeMessage(1, embeddings_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < embeddings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, embeddings_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse)) {
      return super.equals(obj);
    }
    com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse other = (com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse) obj;

    if (!getEmbeddingsList()
        .equals(other.getEmbeddingsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getEmbeddingsCount() > 0) {
      hash = (37 * hash) + EMBEDDINGS_FIELD_NUMBER;
      hash = (53 * hash) + getEmbeddingsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse parseFrom(
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
  public static Builder newBuilder(com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse prototype) {
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
   * The response to a EmbedTextRequest.
   * </pre>
   *
   * Protobuf type {@code google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse)
      com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ai.generativelanguage.v1beta3.TextServiceProto.internal_static_google_ai_generativelanguage_v1beta3_BatchEmbedTextResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ai.generativelanguage.v1beta3.TextServiceProto.internal_static_google_ai_generativelanguage_v1beta3_BatchEmbedTextResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse.class, com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse.Builder.class);
    }

    // Construct using com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (embeddingsBuilder_ == null) {
        embeddings_ = java.util.Collections.emptyList();
      } else {
        embeddings_ = null;
        embeddingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ai.generativelanguage.v1beta3.TextServiceProto.internal_static_google_ai_generativelanguage_v1beta3_BatchEmbedTextResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse getDefaultInstanceForType() {
      return com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse build() {
      com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse buildPartial() {
      com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse result = new com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse result) {
      if (embeddingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          embeddings_ = java.util.Collections.unmodifiableList(embeddings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.embeddings_ = embeddings_;
      } else {
        result.embeddings_ = embeddingsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse) {
        return mergeFrom((com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse other) {
      if (other == com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse.getDefaultInstance()) return this;
      if (embeddingsBuilder_ == null) {
        if (!other.embeddings_.isEmpty()) {
          if (embeddings_.isEmpty()) {
            embeddings_ = other.embeddings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEmbeddingsIsMutable();
            embeddings_.addAll(other.embeddings_);
          }
          onChanged();
        }
      } else {
        if (!other.embeddings_.isEmpty()) {
          if (embeddingsBuilder_.isEmpty()) {
            embeddingsBuilder_.dispose();
            embeddingsBuilder_ = null;
            embeddings_ = other.embeddings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            embeddingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEmbeddingsFieldBuilder() : null;
          } else {
            embeddingsBuilder_.addAllMessages(other.embeddings_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.ai.generativelanguage.v1beta3.Embedding m =
                  input.readMessage(
                      com.google.ai.generativelanguage.v1beta3.Embedding.parser(),
                      extensionRegistry);
              if (embeddingsBuilder_ == null) {
                ensureEmbeddingsIsMutable();
                embeddings_.add(m);
              } else {
                embeddingsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ai.generativelanguage.v1beta3.Embedding> embeddings_ =
      java.util.Collections.emptyList();
    private void ensureEmbeddingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        embeddings_ = new java.util.ArrayList<com.google.ai.generativelanguage.v1beta3.Embedding>(embeddings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ai.generativelanguage.v1beta3.Embedding, com.google.ai.generativelanguage.v1beta3.Embedding.Builder, com.google.ai.generativelanguage.v1beta3.EmbeddingOrBuilder> embeddingsBuilder_;

    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<com.google.ai.generativelanguage.v1beta3.Embedding> getEmbeddingsList() {
      if (embeddingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(embeddings_);
      } else {
        return embeddingsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public int getEmbeddingsCount() {
      if (embeddingsBuilder_ == null) {
        return embeddings_.size();
      } else {
        return embeddingsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ai.generativelanguage.v1beta3.Embedding getEmbeddings(int index) {
      if (embeddingsBuilder_ == null) {
        return embeddings_.get(index);
      } else {
        return embeddingsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setEmbeddings(
        int index, com.google.ai.generativelanguage.v1beta3.Embedding value) {
      if (embeddingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmbeddingsIsMutable();
        embeddings_.set(index, value);
        onChanged();
      } else {
        embeddingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setEmbeddings(
        int index, com.google.ai.generativelanguage.v1beta3.Embedding.Builder builderForValue) {
      if (embeddingsBuilder_ == null) {
        ensureEmbeddingsIsMutable();
        embeddings_.set(index, builderForValue.build());
        onChanged();
      } else {
        embeddingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addEmbeddings(com.google.ai.generativelanguage.v1beta3.Embedding value) {
      if (embeddingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmbeddingsIsMutable();
        embeddings_.add(value);
        onChanged();
      } else {
        embeddingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addEmbeddings(
        int index, com.google.ai.generativelanguage.v1beta3.Embedding value) {
      if (embeddingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmbeddingsIsMutable();
        embeddings_.add(index, value);
        onChanged();
      } else {
        embeddingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addEmbeddings(
        com.google.ai.generativelanguage.v1beta3.Embedding.Builder builderForValue) {
      if (embeddingsBuilder_ == null) {
        ensureEmbeddingsIsMutable();
        embeddings_.add(builderForValue.build());
        onChanged();
      } else {
        embeddingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addEmbeddings(
        int index, com.google.ai.generativelanguage.v1beta3.Embedding.Builder builderForValue) {
      if (embeddingsBuilder_ == null) {
        ensureEmbeddingsIsMutable();
        embeddings_.add(index, builderForValue.build());
        onChanged();
      } else {
        embeddingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addAllEmbeddings(
        java.lang.Iterable<? extends com.google.ai.generativelanguage.v1beta3.Embedding> values) {
      if (embeddingsBuilder_ == null) {
        ensureEmbeddingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, embeddings_);
        onChanged();
      } else {
        embeddingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearEmbeddings() {
      if (embeddingsBuilder_ == null) {
        embeddings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        embeddingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder removeEmbeddings(int index) {
      if (embeddingsBuilder_ == null) {
        ensureEmbeddingsIsMutable();
        embeddings_.remove(index);
        onChanged();
      } else {
        embeddingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ai.generativelanguage.v1beta3.Embedding.Builder getEmbeddingsBuilder(
        int index) {
      return getEmbeddingsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ai.generativelanguage.v1beta3.EmbeddingOrBuilder getEmbeddingsOrBuilder(
        int index) {
      if (embeddingsBuilder_ == null) {
        return embeddings_.get(index);  } else {
        return embeddingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<? extends com.google.ai.generativelanguage.v1beta3.EmbeddingOrBuilder> 
         getEmbeddingsOrBuilderList() {
      if (embeddingsBuilder_ != null) {
        return embeddingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(embeddings_);
      }
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ai.generativelanguage.v1beta3.Embedding.Builder addEmbeddingsBuilder() {
      return getEmbeddingsFieldBuilder().addBuilder(
          com.google.ai.generativelanguage.v1beta3.Embedding.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ai.generativelanguage.v1beta3.Embedding.Builder addEmbeddingsBuilder(
        int index) {
      return getEmbeddingsFieldBuilder().addBuilder(
          index, com.google.ai.generativelanguage.v1beta3.Embedding.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. The embeddings generated from the input text.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<com.google.ai.generativelanguage.v1beta3.Embedding.Builder> 
         getEmbeddingsBuilderList() {
      return getEmbeddingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ai.generativelanguage.v1beta3.Embedding, com.google.ai.generativelanguage.v1beta3.Embedding.Builder, com.google.ai.generativelanguage.v1beta3.EmbeddingOrBuilder> 
        getEmbeddingsFieldBuilder() {
      if (embeddingsBuilder_ == null) {
        embeddingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ai.generativelanguage.v1beta3.Embedding, com.google.ai.generativelanguage.v1beta3.Embedding.Builder, com.google.ai.generativelanguage.v1beta3.EmbeddingOrBuilder>(
                embeddings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        embeddings_ = null;
      }
      return embeddingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse)
  private static final com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse();
  }

  public static com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchEmbedTextResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchEmbedTextResponse>() {
    @java.lang.Override
    public BatchEmbedTextResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BatchEmbedTextResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchEmbedTextResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

