// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/model_service.proto

package com.google.ai.generativelanguage.v1beta3;

public interface CreateTunedModelMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ai.generativelanguage.v1beta3.CreateTunedModelMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the tuned model associated with the tuning operation.
   * </pre>
   *
   * <code>string tuned_model = 5 [(.google.api.resource_reference) = { ... }</code>
   * @return The tunedModel.
   */
  java.lang.String getTunedModel();
  /**
   * <pre>
   * Name of the tuned model associated with the tuning operation.
   * </pre>
   *
   * <code>string tuned_model = 5 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for tunedModel.
   */
  com.google.protobuf.ByteString
      getTunedModelBytes();

  /**
   * <pre>
   * The total number of tuning steps.
   * </pre>
   *
   * <code>int32 total_steps = 1;</code>
   * @return The totalSteps.
   */
  int getTotalSteps();

  /**
   * <pre>
   * The number of steps completed.
   * </pre>
   *
   * <code>int32 completed_steps = 2;</code>
   * @return The completedSteps.
   */
  int getCompletedSteps();

  /**
   * <pre>
   * The completed percentage for the tuning operation.
   * </pre>
   *
   * <code>float completed_percent = 3;</code>
   * @return The completedPercent.
   */
  float getCompletedPercent();

  /**
   * <pre>
   * Metrics collected during tuning.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.TuningSnapshot snapshots = 4;</code>
   */
  java.util.List<com.google.ai.generativelanguage.v1beta3.TuningSnapshot> 
      getSnapshotsList();
  /**
   * <pre>
   * Metrics collected during tuning.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.TuningSnapshot snapshots = 4;</code>
   */
  com.google.ai.generativelanguage.v1beta3.TuningSnapshot getSnapshots(int index);
  /**
   * <pre>
   * Metrics collected during tuning.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.TuningSnapshot snapshots = 4;</code>
   */
  int getSnapshotsCount();
  /**
   * <pre>
   * Metrics collected during tuning.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.TuningSnapshot snapshots = 4;</code>
   */
  java.util.List<? extends com.google.ai.generativelanguage.v1beta3.TuningSnapshotOrBuilder> 
      getSnapshotsOrBuilderList();
  /**
   * <pre>
   * Metrics collected during tuning.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.TuningSnapshot snapshots = 4;</code>
   */
  com.google.ai.generativelanguage.v1beta3.TuningSnapshotOrBuilder getSnapshotsOrBuilder(
      int index);
}
