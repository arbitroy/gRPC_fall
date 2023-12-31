// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/bank.proto

package service;

public interface BankAccountStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.BankAccountStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * true if success, false and error if account did not exist
   * </pre>
   *
   * <code>bool isSuccess = 1;</code>
   * @return The isSuccess.
   */
  boolean getIsSuccess();

  /**
   * <pre>
   * Account that was retrieved
   * </pre>
   *
   * <code>.services.Account account = 2;</code>
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   * <pre>
   * Account that was retrieved
   * </pre>
   *
   * <code>.services.Account account = 2;</code>
   * @return The account.
   */
  service.Account getAccount();
  /**
   * <pre>
   * Account that was retrieved
   * </pre>
   *
   * <code>.services.Account account = 2;</code>
   */
  service.AccountOrBuilder getAccountOrBuilder();

  /**
   * <pre>
   * Error message 
   * </pre>
   *
   * <code>string error = 3;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <pre>
   * Error message 
   * </pre>
   *
   * <code>string error = 3;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
