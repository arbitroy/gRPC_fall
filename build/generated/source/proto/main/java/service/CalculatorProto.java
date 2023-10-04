// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/calculator.proto

package service;

public final class CalculatorProto {
  private CalculatorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_EvaluateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_EvaluateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_EvaluateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_EvaluateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_HistoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_HistoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_Expression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_Expression_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031services/calculator.proto\022\010services\032\033g" +
      "oogle/protobuf/empty.proto\";\n\017EvaluateRe" +
      "quest\022(\n\nexpression\030\001 \001(\0132\024.services.Exp" +
      "ression\"D\n\020EvaluateResponse\022\021\n\tisSuccess" +
      "\030\001 \001(\005\022\016\n\006result\030\002 \001(\005\022\r\n\005error\030\003 \001(\t\"<\n" +
      "\017HistoryResponse\022)\n\013expressions\030\001 \003(\0132\024." +
      "services.Expression\"\227\001\n\nExpression\022\014\n\004nu" +
      "m1\030\001 \001(\005\022\014\n\004num2\030\002 \001(\005\0221\n\toperation\030\003 \001(" +
      "\0162\036.services.Expression.Operation\":\n\tOpe" +
      "ration\022\010\n\004PLUS\020\000\022\t\n\005MINUS\020\001\022\014\n\010MULTIPLY\020" +
      "\002\022\n\n\006DIVIDE\020\0032\215\001\n\006Recipe\022C\n\010evaluate\022\031.s" +
      "ervices.EvaluateRequest\032\032.services.Evalu" +
      "ateResponse\"\000\022>\n\007history\022\026.google.protob" +
      "uf.Empty\032\031.services.HistoryResponse\"\000B\034\n" +
      "\007serviceB\017CalculatorProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_services_EvaluateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_EvaluateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_EvaluateRequest_descriptor,
        new java.lang.String[] { "Expression", });
    internal_static_services_EvaluateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_EvaluateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_EvaluateResponse_descriptor,
        new java.lang.String[] { "IsSuccess", "Result", "Error", });
    internal_static_services_HistoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_HistoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_HistoryResponse_descriptor,
        new java.lang.String[] { "Expressions", });
    internal_static_services_Expression_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_Expression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_Expression_descriptor,
        new java.lang.String[] { "Num1", "Num2", "Operation", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}