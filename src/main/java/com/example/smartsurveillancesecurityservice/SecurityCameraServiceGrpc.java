package com.example.smartsurveillancesecurityservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *Service Definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: securitycameraservice.proto")
public final class SecurityCameraServiceGrpc {

  private SecurityCameraServiceGrpc() {}

  public static final String SERVICE_NAME = "securitycameraservice.SecurityCameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.smartsurveillancesecurityservice.CameraRequest,
      com.example.smartsurveillancesecurityservice.CameraResponse> getStartCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartCamera",
      requestType = com.example.smartsurveillancesecurityservice.CameraRequest.class,
      responseType = com.example.smartsurveillancesecurityservice.CameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartsurveillancesecurityservice.CameraRequest,
      com.example.smartsurveillancesecurityservice.CameraResponse> getStartCameraMethod() {
    io.grpc.MethodDescriptor<com.example.smartsurveillancesecurityservice.CameraRequest, com.example.smartsurveillancesecurityservice.CameraResponse> getStartCameraMethod;
    if ((getStartCameraMethod = SecurityCameraServiceGrpc.getStartCameraMethod) == null) {
      synchronized (SecurityCameraServiceGrpc.class) {
        if ((getStartCameraMethod = SecurityCameraServiceGrpc.getStartCameraMethod) == null) {
          SecurityCameraServiceGrpc.getStartCameraMethod = getStartCameraMethod = 
              io.grpc.MethodDescriptor.<com.example.smartsurveillancesecurityservice.CameraRequest, com.example.smartsurveillancesecurityservice.CameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "securitycameraservice.SecurityCameraService", "StartCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartsurveillancesecurityservice.CameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartsurveillancesecurityservice.CameraResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityCameraServiceMethodDescriptorSupplier("StartCamera"))
                  .build();
          }
        }
     }
     return getStartCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartsurveillancesecurityservice.CameraRequest,
      com.example.smartsurveillancesecurityservice.CameraResponse> getStopCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopCamera",
      requestType = com.example.smartsurveillancesecurityservice.CameraRequest.class,
      responseType = com.example.smartsurveillancesecurityservice.CameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartsurveillancesecurityservice.CameraRequest,
      com.example.smartsurveillancesecurityservice.CameraResponse> getStopCameraMethod() {
    io.grpc.MethodDescriptor<com.example.smartsurveillancesecurityservice.CameraRequest, com.example.smartsurveillancesecurityservice.CameraResponse> getStopCameraMethod;
    if ((getStopCameraMethod = SecurityCameraServiceGrpc.getStopCameraMethod) == null) {
      synchronized (SecurityCameraServiceGrpc.class) {
        if ((getStopCameraMethod = SecurityCameraServiceGrpc.getStopCameraMethod) == null) {
          SecurityCameraServiceGrpc.getStopCameraMethod = getStopCameraMethod = 
              io.grpc.MethodDescriptor.<com.example.smartsurveillancesecurityservice.CameraRequest, com.example.smartsurveillancesecurityservice.CameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "securitycameraservice.SecurityCameraService", "StopCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartsurveillancesecurityservice.CameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartsurveillancesecurityservice.CameraResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityCameraServiceMethodDescriptorSupplier("StopCamera"))
                  .build();
          }
        }
     }
     return getStopCameraMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityCameraServiceStub newStub(io.grpc.Channel channel) {
    return new SecurityCameraServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityCameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecurityCameraServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityCameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecurityCameraServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static abstract class SecurityCameraServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void startCamera(com.example.smartsurveillancesecurityservice.CameraRequest request,
        io.grpc.stub.StreamObserver<com.example.smartsurveillancesecurityservice.CameraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartCameraMethod(), responseObserver);
    }

    /**
     */
    public void stopCamera(com.example.smartsurveillancesecurityservice.CameraRequest request,
        io.grpc.stub.StreamObserver<com.example.smartsurveillancesecurityservice.CameraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopCameraMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartCameraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartsurveillancesecurityservice.CameraRequest,
                com.example.smartsurveillancesecurityservice.CameraResponse>(
                  this, METHODID_START_CAMERA)))
          .addMethod(
            getStopCameraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartsurveillancesecurityservice.CameraRequest,
                com.example.smartsurveillancesecurityservice.CameraResponse>(
                  this, METHODID_STOP_CAMERA)))
          .build();
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class SecurityCameraServiceStub extends io.grpc.stub.AbstractStub<SecurityCameraServiceStub> {
    private SecurityCameraServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityCameraServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityCameraServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityCameraServiceStub(channel, callOptions);
    }

    /**
     */
    public void startCamera(com.example.smartsurveillancesecurityservice.CameraRequest request,
        io.grpc.stub.StreamObserver<com.example.smartsurveillancesecurityservice.CameraResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopCamera(com.example.smartsurveillancesecurityservice.CameraRequest request,
        io.grpc.stub.StreamObserver<com.example.smartsurveillancesecurityservice.CameraResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopCameraMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class SecurityCameraServiceBlockingStub extends io.grpc.stub.AbstractStub<SecurityCameraServiceBlockingStub> {
    private SecurityCameraServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityCameraServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityCameraServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityCameraServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.smartsurveillancesecurityservice.CameraResponse startCamera(com.example.smartsurveillancesecurityservice.CameraRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartCameraMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.smartsurveillancesecurityservice.CameraResponse stopCamera(com.example.smartsurveillancesecurityservice.CameraRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopCameraMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class SecurityCameraServiceFutureStub extends io.grpc.stub.AbstractStub<SecurityCameraServiceFutureStub> {
    private SecurityCameraServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityCameraServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityCameraServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityCameraServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartsurveillancesecurityservice.CameraResponse> startCamera(
        com.example.smartsurveillancesecurityservice.CameraRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartCameraMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartsurveillancesecurityservice.CameraResponse> stopCamera(
        com.example.smartsurveillancesecurityservice.CameraRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopCameraMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_CAMERA = 0;
  private static final int METHODID_STOP_CAMERA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecurityCameraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecurityCameraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_CAMERA:
          serviceImpl.startCamera((com.example.smartsurveillancesecurityservice.CameraRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartsurveillancesecurityservice.CameraResponse>) responseObserver);
          break;
        case METHODID_STOP_CAMERA:
          serviceImpl.stopCamera((com.example.smartsurveillancesecurityservice.CameraRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartsurveillancesecurityservice.CameraResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SecurityCameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecurityCameraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.smartsurveillancesecurityservice.SecurityCameraServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecurityCameraService");
    }
  }

  private static final class SecurityCameraServiceFileDescriptorSupplier
      extends SecurityCameraServiceBaseDescriptorSupplier {
    SecurityCameraServiceFileDescriptorSupplier() {}
  }

  private static final class SecurityCameraServiceMethodDescriptorSupplier
      extends SecurityCameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecurityCameraServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SecurityCameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityCameraServiceFileDescriptorSupplier())
              .addMethod(getStartCameraMethod())
              .addMethod(getStopCameraMethod())
              .build();
        }
      }
    }
    return result;
  }
}
