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
public final class AdminDrinkServiceGrpc {

  private AdminDrinkServiceGrpc() {}

  public static final String SERVICE_NAME = "catalog.AdminDrinkService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.DrinkCreationRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_CREATE_DRINK =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.DrinkCreationRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminDrinkService", "createDrink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DrinkCreationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.DrinkUpdateRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_UPDATE_DRINK_FIELDS =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.DrinkUpdateRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminDrinkService", "updateDrinkFields"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DrinkUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.DeletionRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_DELETE_DRINK =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.DeletionRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminDrinkService", "deleteDrink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DeletionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminDrinkServiceStub newStub(io.grpc.Channel channel) {
    return new AdminDrinkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminDrinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdminDrinkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminDrinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdminDrinkServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AdminDrinkServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createDrink(io.prodrink.catalog.generated.dto.DrinkCreationRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_DRINK, responseObserver);
    }

    /**
     */
    public void updateDrinkFields(io.prodrink.catalog.generated.dto.DrinkUpdateRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_DRINK_FIELDS, responseObserver);
    }

    /**
     */
    public void deleteDrink(io.prodrink.catalog.generated.dto.DeletionRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_DRINK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_DRINK,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.DrinkCreationRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_CREATE_DRINK)))
          .addMethod(
            METHOD_UPDATE_DRINK_FIELDS,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.DrinkUpdateRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_UPDATE_DRINK_FIELDS)))
          .addMethod(
            METHOD_DELETE_DRINK,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.DeletionRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_DELETE_DRINK)))
          .build();
    }
  }

  /**
   */
  public static final class AdminDrinkServiceStub extends io.grpc.stub.AbstractStub<AdminDrinkServiceStub> {
    private AdminDrinkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminDrinkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminDrinkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminDrinkServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDrink(io.prodrink.catalog.generated.dto.DrinkCreationRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_DRINK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDrinkFields(io.prodrink.catalog.generated.dto.DrinkUpdateRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DRINK_FIELDS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDrink(io.prodrink.catalog.generated.dto.DeletionRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_DRINK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdminDrinkServiceBlockingStub extends io.grpc.stub.AbstractStub<AdminDrinkServiceBlockingStub> {
    private AdminDrinkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminDrinkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminDrinkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminDrinkServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse createDrink(io.prodrink.catalog.generated.dto.DrinkCreationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_DRINK, getCallOptions(), request);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse updateDrinkFields(io.prodrink.catalog.generated.dto.DrinkUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_DRINK_FIELDS, getCallOptions(), request);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse deleteDrink(io.prodrink.catalog.generated.dto.DeletionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_DRINK, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdminDrinkServiceFutureStub extends io.grpc.stub.AbstractStub<AdminDrinkServiceFutureStub> {
    private AdminDrinkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminDrinkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminDrinkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminDrinkServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> createDrink(
        io.prodrink.catalog.generated.dto.DrinkCreationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_DRINK, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> updateDrinkFields(
        io.prodrink.catalog.generated.dto.DrinkUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DRINK_FIELDS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> deleteDrink(
        io.prodrink.catalog.generated.dto.DeletionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_DRINK, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DRINK = 0;
  private static final int METHODID_UPDATE_DRINK_FIELDS = 1;
  private static final int METHODID_DELETE_DRINK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdminDrinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdminDrinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DRINK:
          serviceImpl.createDrink((io.prodrink.catalog.generated.dto.DrinkCreationRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DRINK_FIELDS:
          serviceImpl.updateDrinkFields((io.prodrink.catalog.generated.dto.DrinkUpdateRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse>) responseObserver);
          break;
        case METHODID_DELETE_DRINK:
          serviceImpl.deleteDrink((io.prodrink.catalog.generated.dto.DeletionRequest) request,
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

  private static final class AdminDrinkServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.prodrink.catalog.generated.service.AdminCatalogServiceOuter.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdminDrinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminDrinkServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_DRINK)
              .addMethod(METHOD_UPDATE_DRINK_FIELDS)
              .addMethod(METHOD_DELETE_DRINK)
              .build();
        }
      }
    }
    return result;
  }
}
