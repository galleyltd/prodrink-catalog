package io.prodrink.catalog.generated.service;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.5.0)",
    comments = "Source: catalog/catalog-service.proto")
public final class AdminCatalogServiceGrpc {

  private AdminCatalogServiceGrpc() {}

  public static final String SERVICE_NAME = "catalog.AdminCatalogService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.domain.Drink,
      io.prodrink.catalog.generated.dto.DrinkCreationResponse> METHOD_CREATE_DRINK =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.domain.Drink, io.prodrink.catalog.generated.dto.DrinkCreationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminCatalogService", "createDrink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.domain.Drink.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DrinkCreationResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.DrinkUpdateRequest,
      io.prodrink.catalog.generated.dto.DrinkUpdateResponse> METHOD_UPDATE_DRINK =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.DrinkUpdateRequest, io.prodrink.catalog.generated.dto.DrinkUpdateResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminCatalogService", "updateDrink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DrinkUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DrinkUpdateResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.DrinkDeletionRequest,
      io.prodrink.catalog.generated.dto.DrinkDeletionResponse> METHOD_DELETE_DRINK =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.DrinkDeletionRequest, io.prodrink.catalog.generated.dto.DrinkDeletionResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminCatalogService", "deleteDrink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DrinkDeletionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DrinkDeletionResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminCatalogServiceStub newStub(io.grpc.Channel channel) {
    return new AdminCatalogServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminCatalogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdminCatalogServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminCatalogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdminCatalogServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AdminCatalogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createDrink(io.prodrink.catalog.generated.domain.Drink request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkCreationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_DRINK, responseObserver);
    }

    /**
     */
    public void updateDrink(io.prodrink.catalog.generated.dto.DrinkUpdateRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_DRINK, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkDeletionRequest> deleteDrink(
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkDeletionResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_DELETE_DRINK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_DRINK,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.domain.Drink,
                io.prodrink.catalog.generated.dto.DrinkCreationResponse>(
                  this, METHODID_CREATE_DRINK)))
          .addMethod(
            METHOD_UPDATE_DRINK,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.DrinkUpdateRequest,
                io.prodrink.catalog.generated.dto.DrinkUpdateResponse>(
                  this, METHODID_UPDATE_DRINK)))
          .addMethod(
            METHOD_DELETE_DRINK,
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.DrinkDeletionRequest,
                io.prodrink.catalog.generated.dto.DrinkDeletionResponse>(
                  this, METHODID_DELETE_DRINK)))
          .build();
    }
  }

  /**
   */
  public static final class AdminCatalogServiceStub extends io.grpc.stub.AbstractStub<AdminCatalogServiceStub> {
    private AdminCatalogServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminCatalogServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminCatalogServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminCatalogServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDrink(io.prodrink.catalog.generated.domain.Drink request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkCreationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_DRINK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDrink(io.prodrink.catalog.generated.dto.DrinkUpdateRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DRINK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkDeletionRequest> deleteDrink(
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkDeletionResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_DELETE_DRINK, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AdminCatalogServiceBlockingStub extends io.grpc.stub.AbstractStub<AdminCatalogServiceBlockingStub> {
    private AdminCatalogServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminCatalogServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminCatalogServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminCatalogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.DrinkCreationResponse createDrink(io.prodrink.catalog.generated.domain.Drink request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_DRINK, getCallOptions(), request);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.DrinkUpdateResponse updateDrink(io.prodrink.catalog.generated.dto.DrinkUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_DRINK, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdminCatalogServiceFutureStub extends io.grpc.stub.AbstractStub<AdminCatalogServiceFutureStub> {
    private AdminCatalogServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminCatalogServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminCatalogServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminCatalogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.DrinkCreationResponse> createDrink(
        io.prodrink.catalog.generated.domain.Drink request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_DRINK, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.DrinkUpdateResponse> updateDrink(
        io.prodrink.catalog.generated.dto.DrinkUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DRINK, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DRINK = 0;
  private static final int METHODID_UPDATE_DRINK = 1;
  private static final int METHODID_DELETE_DRINK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdminCatalogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdminCatalogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DRINK:
          serviceImpl.createDrink((io.prodrink.catalog.generated.domain.Drink) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkCreationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DRINK:
          serviceImpl.updateDrink((io.prodrink.catalog.generated.dto.DrinkUpdateRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkUpdateResponse>) responseObserver);
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
        case METHODID_DELETE_DRINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.deleteDrink(
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.DrinkDeletionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class AdminCatalogServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.prodrink.catalog.generated.service.CatalogServiceOuter.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdminCatalogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminCatalogServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_DRINK)
              .addMethod(METHOD_UPDATE_DRINK)
              .addMethod(METHOD_DELETE_DRINK)
              .build();
        }
      }
    }
    return result;
  }
}
