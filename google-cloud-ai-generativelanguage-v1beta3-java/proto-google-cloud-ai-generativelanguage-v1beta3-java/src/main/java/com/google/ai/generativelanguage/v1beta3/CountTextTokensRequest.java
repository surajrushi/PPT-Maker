// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/text_service.proto

package com.google.ai.generativelanguage.v1beta3;

/**
 * <pre>
 * Counts the number of tokens in the `prompt` sent to a model.
 *
 * Models may tokenize text differently, so each model may return a different
 * `token_count`.
 * </pre>
 *
 * Protobuf type {@code google.ai.generativelanguage.v1beta3.CountTextTokensRequest}
 */
public final class CountTextTokensRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ai.generativelanguage.v1beta3.CountTextTokensRequest)
    CountTextTokensRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CountTextTokensRequest.newBuilder() to construct.
  private CountTextTokensRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CountTextTokensRequest() {
    model_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CountTextTokensRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ai.generativelanguage.v1beta3.TextServiceProto.internal_static_google_ai_generativelanguage_v1beta3_CountTextTokensRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ai.generativelanguage.v1beta3.TextServiceProto.internal_static_google_ai_generativelanguage_v1beta3_CountTextTokensRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest.class, com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest.Builder.class);
  }

  public static final int MODEL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object model_ = "";
  /**
   * <pre>
   * Required. The model's resource name. This serves as an ID for the Model to
   * use.
   *
   * This name should match a model name returned by the `ListModels` method.
   *
   * Format: `models/{model}`
   * </pre>
   *
   * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The model's resource name. This serves as an ID for the Model to
   * use.
   *
   * This name should match a model name returned by the `ListModels` method.
   *
   * Format: `models/{model}`
   * </pre>
   *
   * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROMPT_FIELD_NUMBER = 2;
  private com.google.ai.generativelanguage.v1beta3.TextPrompt prompt_;
  /**
   * <pre>
   * Required. The free-form input text given to the model as a prompt.
   * </pre>
   *
   * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the prompt field is set.
   */
  @java.lang.Override
  public boolean hasPrompt() {
    return prompt_ != null;
  }
  /**
   * <pre>
   * Required. The free-form input text given to the model as a prompt.
   * </pre>
   *
   * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The prompt.
   */
  @java.lang.Override
  public com.google.ai.generativelanguage.v1beta3.TextPrompt getPrompt() {
    return prompt_ == null ? com.google.ai.generativelanguage.v1beta3.TextPrompt.getDefaultInstance() : prompt_;
  }
  /**
   * <pre>
   * Required. The free-form input text given to the model as a prompt.
   * </pre>
   *
   * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ai.generativelanguage.v1beta3.TextPromptOrBuilder getPromptOrBuilder() {
    return prompt_ == null ? com.google.ai.generativelanguage.v1beta3.TextPrompt.getDefaultInstance() : prompt_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, model_);
    }
    if (prompt_ != null) {
      output.writeMessage(2, getPrompt());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, model_);
    }
    if (prompt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPrompt());
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
    if (!(obj instanceof com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest)) {
      return super.equals(obj);
    }
    com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest other = (com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest) obj;

    if (!getModel()
        .equals(other.getModel())) return false;
    if (hasPrompt() != other.hasPrompt()) return false;
    if (hasPrompt()) {
      if (!getPrompt()
          .equals(other.getPrompt())) return false;
    }
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
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    if (hasPrompt()) {
      hash = (37 * hash) + PROMPT_FIELD_NUMBER;
      hash = (53 * hash) + getPrompt().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest parseFrom(
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
  public static Builder newBuilder(com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest prototype) {
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
   * Counts the number of tokens in the `prompt` sent to a model.
   *
   * Models may tokenize text differently, so each model may return a different
   * `token_count`.
   * </pre>
   *
   * Protobuf type {@code google.ai.generativelanguage.v1beta3.CountTextTokensRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ai.generativelanguage.v1beta3.CountTextTokensRequest)
      com.google.ai.generativelanguage.v1beta3.CountTextTokensRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ai.generativelanguage.v1beta3.TextServiceProto.internal_static_google_ai_generativelanguage_v1beta3_CountTextTokensRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ai.generativelanguage.v1beta3.TextServiceProto.internal_static_google_ai_generativelanguage_v1beta3_CountTextTokensRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest.class, com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest.Builder.class);
    }

    // Construct using com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest.newBuilder()
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
      model_ = "";
      prompt_ = null;
      if (promptBuilder_ != null) {
        promptBuilder_.dispose();
        promptBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ai.generativelanguage.v1beta3.TextServiceProto.internal_static_google_ai_generativelanguage_v1beta3_CountTextTokensRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest getDefaultInstanceForType() {
      return com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest build() {
      com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest buildPartial() {
      com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest result = new com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.model_ = model_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.prompt_ = promptBuilder_ == null
            ? prompt_
            : promptBuilder_.build();
      }
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
      if (other instanceof com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest) {
        return mergeFrom((com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest other) {
      if (other == com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest.getDefaultInstance()) return this;
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPrompt()) {
        mergePrompt(other.getPrompt());
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
              model_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPromptFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object model_ = "";
    /**
     * <pre>
     * Required. The model's resource name. This serves as an ID for the Model to
     * use.
     *
     * This name should match a model name returned by the `ListModels` method.
     *
     * Format: `models/{model}`
     * </pre>
     *
     * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The model's resource name. This serves as an ID for the Model to
     * use.
     *
     * This name should match a model name returned by the `ListModels` method.
     *
     * Format: `models/{model}`
     * </pre>
     *
     * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The model's resource name. This serves as an ID for the Model to
     * use.
     *
     * This name should match a model name returned by the `ListModels` method.
     *
     * Format: `models/{model}`
     * </pre>
     *
     * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      model_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The model's resource name. This serves as an ID for the Model to
     * use.
     *
     * This name should match a model name returned by the `ListModels` method.
     *
     * Format: `models/{model}`
     * </pre>
     *
     * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearModel() {
      model_ = getDefaultInstance().getModel();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The model's resource name. This serves as an ID for the Model to
     * use.
     *
     * This name should match a model name returned by the `ListModels` method.
     *
     * Format: `models/{model}`
     * </pre>
     *
     * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      model_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.ai.generativelanguage.v1beta3.TextPrompt prompt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ai.generativelanguage.v1beta3.TextPrompt, com.google.ai.generativelanguage.v1beta3.TextPrompt.Builder, com.google.ai.generativelanguage.v1beta3.TextPromptOrBuilder> promptBuilder_;
    /**
     * <pre>
     * Required. The free-form input text given to the model as a prompt.
     * </pre>
     *
     * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the prompt field is set.
     */
    public boolean hasPrompt() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The free-form input text given to the model as a prompt.
     * </pre>
     *
     * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The prompt.
     */
    public com.google.ai.generativelanguage.v1beta3.TextPrompt getPrompt() {
      if (promptBuilder_ == null) {
        return prompt_ == null ? com.google.ai.generativelanguage.v1beta3.TextPrompt.getDefaultInstance() : prompt_;
      } else {
        return promptBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The free-form input text given to the model as a prompt.
     * </pre>
     *
     * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPrompt(com.google.ai.generativelanguage.v1beta3.TextPrompt value) {
      if (promptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prompt_ = value;
      } else {
        promptBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The free-form input text given to the model as a prompt.
     * </pre>
     *
     * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPrompt(
        com.google.ai.generativelanguage.v1beta3.TextPrompt.Builder builderForValue) {
      if (promptBuilder_ == null) {
        prompt_ = builderForValue.build();
      } else {
        promptBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The free-form input text given to the model as a prompt.
     * </pre>
     *
     * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergePrompt(com.google.ai.generativelanguage.v1beta3.TextPrompt value) {
      if (promptBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          prompt_ != null &&
          prompt_ != com.google.ai.generativelanguage.v1beta3.TextPrompt.getDefaultInstance()) {
          getPromptBuilder().mergeFrom(value);
        } else {
          prompt_ = value;
        }
      } else {
        promptBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The free-form input text given to the model as a prompt.
     * </pre>
     *
     * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearPrompt() {
      bitField0_ = (bitField0_ & ~0x00000002);
      prompt_ = null;
      if (promptBuilder_ != null) {
        promptBuilder_.dispose();
        promptBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The free-form input text given to the model as a prompt.
     * </pre>
     *
     * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ai.generativelanguage.v1beta3.TextPrompt.Builder getPromptBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPromptFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The free-form input text given to the model as a prompt.
     * </pre>
     *
     * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ai.generativelanguage.v1beta3.TextPromptOrBuilder getPromptOrBuilder() {
      if (promptBuilder_ != null) {
        return promptBuilder_.getMessageOrBuilder();
      } else {
        return prompt_ == null ?
            com.google.ai.generativelanguage.v1beta3.TextPrompt.getDefaultInstance() : prompt_;
      }
    }
    /**
     * <pre>
     * Required. The free-form input text given to the model as a prompt.
     * </pre>
     *
     * <code>.google.ai.generativelanguage.v1beta3.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ai.generativelanguage.v1beta3.TextPrompt, com.google.ai.generativelanguage.v1beta3.TextPrompt.Builder, com.google.ai.generativelanguage.v1beta3.TextPromptOrBuilder> 
        getPromptFieldBuilder() {
      if (promptBuilder_ == null) {
        promptBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ai.generativelanguage.v1beta3.TextPrompt, com.google.ai.generativelanguage.v1beta3.TextPrompt.Builder, com.google.ai.generativelanguage.v1beta3.TextPromptOrBuilder>(
                getPrompt(),
                getParentForChildren(),
                isClean());
        prompt_ = null;
      }
      return promptBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ai.generativelanguage.v1beta3.CountTextTokensRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ai.generativelanguage.v1beta3.CountTextTokensRequest)
  private static final com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest();
  }

  public static com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CountTextTokensRequest>
      PARSER = new com.google.protobuf.AbstractParser<CountTextTokensRequest>() {
    @java.lang.Override
    public CountTextTokensRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CountTextTokensRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CountTextTokensRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ai.generativelanguage.v1beta3.CountTextTokensRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

