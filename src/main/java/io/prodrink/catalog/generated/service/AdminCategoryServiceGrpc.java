package io.prodrink.catalog.generated.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.5.0)",
    comments = "Source: catalog/admin-catalog-service.proto")
public final class AdminCategoryServiceGrpc {

  private AdminCategoryServiceGrpc() {}

  public static final String SERVICE_NAME = "catalog.AdminCategoryService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.CategoryCreationRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_CREATE_CATEGORY =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.CategoryCreationRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminCategoryService", "createCategory"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.CategoryCreationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.CategoryUpdateRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_UPDATE_CATEGORY =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.CategoryUpdateRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminCategoryService", "updateCategory"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.CategoryUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.DeletionRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_DELETE_CATEGORY =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.DeletionRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminCategoryService", "deleteCategory"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DeletionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminCategoryServiceStub newStub(io.grpc.Channel channel) {
    return new AdminCategoryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminCategoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdminCategoryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminCategoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdminCategoryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AdminCategoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCategory(io.prodrink.catalog.generated.dto.CategoryCreationRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CATEGORY, responseObserver);
    }

    /**
     */
    public void updateCategory(io.prodrink.catalog.generated.dto.CategoryUpdateRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_CATEGORY, responseObserver);
    }

    /**
     */
    public void deleteCategory(io.prodrink.catalog.generated.dto.DeletionRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_CATEGORY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_CATEGORY,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.CategoryCreationRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_CREATE_CATEGORY)))
          .addMethod(
            METHOD_UPDATE_CATEGORY,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.CategoryUpdateRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_UPDATE_CATEGORY)))
          .addMethod(
            METHOD_DELETE_CATEGORY,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.DeletionRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_DELETE_CATEGORY)))
          .build();
    }
  }

  /**
   */
  public static final class AdminCategoryServiceStub extends io.grpc.stub.AbstractStub<AdminCategoryServiceStub> {
    private AdminCategoryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminCategoryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminCategoryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminCategoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCategory(io.prodrink.catalog.generated.dto.CategoryCreationRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CATEGORY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCategory(io.prodrink.catalog.generated.dto.CategoryUpdateRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CATEGORY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCategory(io.prodrink.catalog.generated.dto.DeletionRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_CATEGORY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdminCategoryServiceBlockingStub extends io.grpc.stub.AbstractStub<AdminCategoryServiceBlockingStub> {
    private AdminCategoryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminCategoryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminCategoryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminCategoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse createCategory(io.prodrink.catalog.generated.dto.CategoryCreationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CATEGORY, getCallOptions(), request);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse updateCategory(io.prodrink.catalog.generated.dto.CategoryUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_CATEGORY, getCallOptions(), request);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse deleteCategory(io.prodrink.catalog.generated.dto.DeletionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_CATEGORY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdminCategoryServiceFutureStub extends io.grpc.stub.AbstractStub<AdminCategoryServiceFutureStub> {
    private AdminCategoryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminCategoryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminCategoryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminCategoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> createCategory(
        io.prodrink.catalog.generated.dto.CategoryCreationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CATEGORY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> updateCategory(
        io.prodrink.catalog.generated.dto.CategoryUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CATEGORY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> deleteCategory(
        io.prodrink.catalog.generated.dto.DeletionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_CATEGORY, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CATEGORY = 0;
  private static final int METHODID_UPDATE_CATEGORY = 1;
  private static final int METHODID_DELETE_CATEGORY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdminCategoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdminCategoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CATEGORY:
          serviceImpl.createCategory((io.prodrink.catalog.generated.dto.CategoryCreationRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CATEGORY:
          serviceImpl.updateCategory((io.prodrink.catalog.generated.dto.CategoryUpdateRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse>) responseObserver);
          break;
        case METHODID_DELETE_CATEGORY:
          serviceImpl.deleteCategory((io.prodrink.catalog.generated.dto.DeletionRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse>) responseObserver);
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

  private static final class AdminCategoryServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.prodrink.catalog.generated.service.AdminCatalogServiceOuter.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdminCategoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminCategoryServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_CATEGORY)
              .addMethod(METHOD_UPDATE_CATEGORY)
              .addMethod(METHOD_DELETE_CATEGORY)
              .build();
        }
      }
    }
    return result;
  }
}
