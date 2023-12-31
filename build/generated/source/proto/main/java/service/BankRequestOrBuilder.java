// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/bank.proto

package service;

public interface BankRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.BankRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the account
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the account
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Amount to deposit/withdraw
   * </pre>
   *
   * <code>double amount = 2;</code>
   * @return The amount.
   */
  double getAmount();
}
