// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/safety.proto

package com.google.ai.generativelanguage.v1beta3;

/**
 * <pre>
 * The category of a rating.
 *
 * These categories cover various kinds of harms that developers
 * may wish to adjust.
 * </pre>
 *
 * Protobuf enum {@code google.ai.generativelanguage.v1beta3.HarmCategory}
 */
public enum HarmCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Category is unspecified.
   * </pre>
   *
   * <code>HARM_CATEGORY_UNSPECIFIED = 0;</code>
   */
  HARM_CATEGORY_UNSPECIFIED(0),
  /**
   * <pre>
   * Negative or harmful comments targeting identity and/or protected attribute.
   * </pre>
   *
   * <code>HARM_CATEGORY_DEROGATORY = 1;</code>
   */
  HARM_CATEGORY_DEROGATORY(1),
  /**
   * <pre>
   * Content that is rude, disrepspectful, or profane.
   * </pre>
   *
   * <code>HARM_CATEGORY_TOXICITY = 2;</code>
   */
  HARM_CATEGORY_TOXICITY(2),
  /**
   * <pre>
   * Describes scenarios depictng violence against an individual or group, or
   * general descriptions of gore.
   * </pre>
   *
   * <code>HARM_CATEGORY_VIOLENCE = 3;</code>
   */
  HARM_CATEGORY_VIOLENCE(3),
  /**
   * <pre>
   * Contains references to sexual acts or other lewd content.
   * </pre>
   *
   * <code>HARM_CATEGORY_SEXUAL = 4;</code>
   */
  HARM_CATEGORY_SEXUAL(4),
  /**
   * <pre>
   * Promotes unchecked medical advice.
   * </pre>
   *
   * <code>HARM_CATEGORY_MEDICAL = 5;</code>
   */
  HARM_CATEGORY_MEDICAL(5),
  /**
   * <pre>
   * Dangerous content that promotes, facilitates, or encourages harmful acts.
   * </pre>
   *
   * <code>HARM_CATEGORY_DANGEROUS = 6;</code>
   */
  HARM_CATEGORY_DANGEROUS(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Category is unspecified.
   * </pre>
   *
   * <code>HARM_CATEGORY_UNSPECIFIED = 0;</code>
   */
  public static final int HARM_CATEGORY_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Negative or harmful comments targeting identity and/or protected attribute.
   * </pre>
   *
   * <code>HARM_CATEGORY_DEROGATORY = 1;</code>
   */
  public static final int HARM_CATEGORY_DEROGATORY_VALUE = 1;
  /**
   * <pre>
   * Content that is rude, disrepspectful, or profane.
   * </pre>
   *
   * <code>HARM_CATEGORY_TOXICITY = 2;</code>
   */
  public static final int HARM_CATEGORY_TOXICITY_VALUE = 2;
  /**
   * <pre>
   * Describes scenarios depictng violence against an individual or group, or
   * general descriptions of gore.
   * </pre>
   *
   * <code>HARM_CATEGORY_VIOLENCE = 3;</code>
   */
  public static final int HARM_CATEGORY_VIOLENCE_VALUE = 3;
  /**
   * <pre>
   * Contains references to sexual acts or other lewd content.
   * </pre>
   *
   * <code>HARM_CATEGORY_SEXUAL = 4;</code>
   */
  public static final int HARM_CATEGORY_SEXUAL_VALUE = 4;
  /**
   * <pre>
   * Promotes unchecked medical advice.
   * </pre>
   *
   * <code>HARM_CATEGORY_MEDICAL = 5;</code>
   */
  public static final int HARM_CATEGORY_MEDICAL_VALUE = 5;
  /**
   * <pre>
   * Dangerous content that promotes, facilitates, or encourages harmful acts.
   * </pre>
   *
   * <code>HARM_CATEGORY_DANGEROUS = 6;</code>
   */
  public static final int HARM_CATEGORY_DANGEROUS_VALUE = 6;


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
  public static HarmCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HarmCategory forNumber(int value) {
    switch (value) {
      case 0: return HARM_CATEGORY_UNSPECIFIED;
      case 1: return HARM_CATEGORY_DEROGATORY;
      case 2: return HARM_CATEGORY_TOXICITY;
      case 3: return HARM_CATEGORY_VIOLENCE;
      case 4: return HARM_CATEGORY_SEXUAL;
      case 5: return HARM_CATEGORY_MEDICAL;
      case 6: return HARM_CATEGORY_DANGEROUS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HarmCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HarmCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HarmCategory>() {
          public HarmCategory findValueByNumber(int number) {
            return HarmCategory.forNumber(number);
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
    return com.google.ai.generativelanguage.v1beta3.SafetyProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final HarmCategory[] VALUES = values();

  public static HarmCategory valueOf(
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

  private HarmCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.ai.generativelanguage.v1beta3.HarmCategory)
}

