// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: securitycameraservice.proto

package com.example.smartsurveillancesecurityservice;

public final class SecurityCameraServiceProto {
  private SecurityCameraServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_securitycameraservice_CameraRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_securitycameraservice_CameraRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_securitycameraservice_CameraResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_securitycameraservice_CameraResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033securitycameraservice.proto\022\025securityc" +
      "ameraservice\"\"\n\rCameraRequest\022\021\n\tcamera_" +
      "id\030\001 \001(\t\"E\n\016CameraResponse\022\021\n\tcamera_id\030" +
      "\001 \001(\t\022\017\n\007success\030\002 \001(\010\022\017\n\007message\030\003 \001(\t2" +
      "\316\001\n\025SecurityCameraService\022Z\n\013StartCamera" +
      "\022$.securitycameraservice.CameraRequest\032%" +
      ".securitycameraservice.CameraResponse\022Y\n" +
      "\nStopCamera\022$.securitycameraservice.Came" +
      "raRequest\032%.securitycameraservice.Camera" +
      "ResponseBL\n,com.example.smartsurveillanc" +
      "esecurityserviceB\032SecurityCameraServiceP" +
      "rotoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_securitycameraservice_CameraRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_securitycameraservice_CameraRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_securitycameraservice_CameraRequest_descriptor,
        new java.lang.String[] { "CameraId", });
    internal_static_securitycameraservice_CameraResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_securitycameraservice_CameraResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_securitycameraservice_CameraResponse_descriptor,
        new java.lang.String[] { "CameraId", "Success", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}