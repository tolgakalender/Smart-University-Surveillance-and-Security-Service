package com.example.accesscontrolservice;

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
    comments = "Source: accesscontrolservice.proto")
public final class AccessControlServiceGrpc {

  private AccessControlServiceGrpc() {}

  public static final String SERVICE_NAME = "accesscontrolservice.AccessControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.accesscontrolservice.AccessRequest,
      com.example.accesscontrolservice.AccessResponse> getGrantAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrantAccess",
      requestType = com.example.accesscontrolservice.AccessRequest.class,
      responseType = com.example.accesscontrolservice.AccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.accesscontrolservice.AccessRequest,
      com.example.accesscontrolservice.AccessResponse> getGrantAccessMethod() {
    io.grpc.MethodDescriptor<com.example.accesscontrolservice.AccessRequest, com.example.accesscontrolservice.AccessResponse> getGrantAccessMethod;
    if ((getGrantAccessMethod = AccessControlServiceGrpc.getGrantAccessMethod) == null) {
      synchronized (AccessControlServiceGrpc.class) {
        if ((getGrantAccessMethod = AccessControlServiceGrpc.getGrantAccessMethod) == null) {
          AccessControlServiceGrpc.getGrantAccessMethod = getGrantAccessMethod = 
              io.grpc.MethodDescriptor.<com.example.accesscontrolservice.AccessRequest, com.example.accesscontrolservice.AccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "accesscontrolservice.AccessControlService", "GrantAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.accesscontrolservice.AccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.accesscontrolservice.AccessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessControlServiceMethodDescriptorSupplier("GrantAccess"))
                  .build();
          }
        }
     }
     return getGrantAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.accesscontrolservice.RevokeAccessRequest,
      com.example.accesscontrolservice.RevokeAccessResponse> getRevokeAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeAccess",
      requestType = com.example.accesscontrolservice.RevokeAccessRequest.class,
      responseType = com.example.accesscontrolservice.RevokeAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.accesscontrolservice.RevokeAccessRequest,
      com.example.accesscontrolservice.RevokeAccessResponse> getRevokeAccessMethod() {
    io.grpc.MethodDescriptor<com.example.accesscontrolservice.RevokeAccessRequest, com.example.accesscontrolservice.RevokeAccessResponse> getRevokeAccessMethod;
    if ((getRevokeAccessMethod = AccessControlServiceGrpc.getRevokeAccessMethod) == null) {
      synchronized (AccessControlServiceGrpc.class) {
        if ((getRevokeAccessMethod = AccessControlServiceGrpc.getRevokeAccessMethod) == null) {
          AccessControlServiceGrpc.getRevokeAccessMethod = getRevokeAccessMethod = 
              io.grpc.MethodDescriptor.<com.example.accesscontrolservice.RevokeAccessRequest, com.example.accesscontrolservice.RevokeAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "accesscontrolservice.AccessControlService", "RevokeAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.accesscontrolservice.RevokeAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.accesscontrolservice.RevokeAccessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessControlServiceMethodDescriptorSupplier("RevokeAccess"))
                  .build();
          }
        }
     }
     return getRevokeAccessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessControlServiceStub newStub(io.grpc.Channel channel) {
    return new AccessControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccessControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccessControlServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static abstract class AccessControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void grantAccess(com.example.accesscontrolservice.AccessRequest request,
        io.grpc.stub.StreamObserver<com.example.accesscontrolservice.AccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGrantAccessMethod(), responseObserver);
    }

    /**
     */
    public void revokeAccess(com.example.accesscontrolservice.RevokeAccessRequest request,
        io.grpc.stub.StreamObserver<com.example.accesscontrolservice.RevokeAccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokeAccessMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGrantAccessMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.accesscontrolservice.AccessRequest,
                com.example.accesscontrolservice.AccessResponse>(
                  this, METHODID_GRANT_ACCESS)))
          .addMethod(
            getRevokeAccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.accesscontrolservice.RevokeAccessRequest,
                com.example.accesscontrolservice.RevokeAccessResponse>(
                  this, METHODID_REVOKE_ACCESS)))
          .build();
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class AccessControlServiceStub extends io.grpc.stub.AbstractStub<AccessControlServiceStub> {
    private AccessControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void grantAccess(com.example.accesscontrolservice.AccessRequest request,
        io.grpc.stub.StreamObserver<com.example.accesscontrolservice.AccessResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGrantAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeAccess(com.example.accesscontrolservice.RevokeAccessRequest request,
        io.grpc.stub.StreamObserver<com.example.accesscontrolservice.RevokeAccessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokeAccessMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class AccessControlServiceBlockingStub extends io.grpc.stub.AbstractStub<AccessControlServiceBlockingStub> {
    private AccessControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.example.accesscontrolservice.AccessResponse> grantAccess(
        com.example.accesscontrolservice.AccessRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGrantAccessMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.accesscontrolservice.RevokeAccessResponse revokeAccess(com.example.accesscontrolservice.RevokeAccessRequest request) {
      return blockingUnaryCall(
          getChannel(), getRevokeAccessMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class AccessControlServiceFutureStub extends io.grpc.stub.AbstractStub<AccessControlServiceFutureStub> {
    private AccessControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.accesscontrolservice.RevokeAccessResponse> revokeAccess(
        com.example.accesscontrolservice.RevokeAccessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokeAccessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GRANT_ACCESS = 0;
  private static final int METHODID_REVOKE_ACCESS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GRANT_ACCESS:
          serviceImpl.grantAccess((com.example.accesscontrolservice.AccessRequest) request,
              (io.grpc.stub.StreamObserver<com.example.accesscontrolservice.AccessResponse>) responseObserver);
          break;
        case METHODID_REVOKE_ACCESS:
          serviceImpl.revokeAccess((com.example.accesscontrolservice.RevokeAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.example.accesscontrolservice.RevokeAccessResponse>) responseObserver);
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

  private static abstract class AccessControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.accesscontrolservice.AccessControlServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessControlService");
    }
  }

  private static final class AccessControlServiceFileDescriptorSupplier
      extends AccessControlServiceBaseDescriptorSupplier {
    AccessControlServiceFileDescriptorSupplier() {}
  }

  private static final class AccessControlServiceMethodDescriptorSupplier
      extends AccessControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessControlServiceFileDescriptorSupplier())
              .addMethod(getGrantAccessMethod())
              .addMethod(getRevokeAccessMethod())
              .build();
        }
      }
    }
    return result;
  }
}
