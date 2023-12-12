// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/model_service.proto

package com.google.ai.generativelanguage.v1beta3;

public interface GetTunedModelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ai.generativelanguage.v1beta3.GetTunedModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the model.
   *
   * Format: `tunedModels/my-model-id`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the model.
   *
   * Format: `tunedModels/my-model-id`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
