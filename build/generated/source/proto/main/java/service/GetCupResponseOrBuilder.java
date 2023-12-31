// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/coffepot.proto

package service;

public interface GetCupResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.GetCupResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *True if a cup was retrieved, false if the pot was empty.
   * </pre>
   *
   * <code>bool isSuccess = 1;</code>
   * @return The isSuccess.
   */
  boolean getIsSuccess();

  /**
   * <pre>
   *Message back to user in success case.
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   *Message back to user in success case.
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   *Error message if isSuccess is false. If pot is brewing should return time left.
   * </pre>
   *
   * <code>string error = 3;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <pre>
   *Error message if isSuccess is false. If pot is brewing should return time left.
   * </pre>
   *
   * <code>string error = 3;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
