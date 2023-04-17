// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: accesscontrolservice.proto

package com.example.accesscontrolservice;

public interface AccessRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:accesscontrolservice.AccessRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1;</code>
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string area_id = 2;</code>
   */
  java.lang.String getAreaId();
  /**
   * <code>string area_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getAreaIdBytes();

  /**
   * <pre>
   * in minutes
   * </pre>
   *
   * <code>int32 access_duration = 3;</code>
   */
  int getAccessDuration();
}
