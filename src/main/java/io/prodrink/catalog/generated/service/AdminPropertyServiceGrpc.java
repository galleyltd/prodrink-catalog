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
public final class AdminPropertyServiceGrpc {

  private AdminPropertyServiceGrpc() {}

  public static final String SERVICE_NAME = "catalog.AdminPropertyService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_CREATE_PROPERTY_TYPE =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminPropertyService", "createPropertyType"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.PropertyTypeUpdateRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_UPDATE_PROPERTY_TYPE =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.PropertyTypeUpdateRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminPropertyService", "updatePropertyType"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.PropertyTypeUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.DeletionRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_DELETE_PROPERTY_TYPE =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.DeletionRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminPropertyService", "deletePropertyType"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DeletionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.PropertyCreationRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_ADD_PROPERTIES_TO_DRINK =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.PropertyCreationRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminPropertyService", "addPropertiesToDrink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.PropertyCreationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.PropertyUpdateRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_UPDATE_PROPERTY =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.PropertyUpdateRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminPropertyService", "updateProperty"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.PropertyUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.DeletionRequest,
      io.prodrink.catalog.generated.dto.AdminServiceCallResponse> METHOD_DELETE_PROPERTY =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.DeletionRequest, io.prodrink.catalog.generated.dto.AdminServiceCallResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.AdminPropertyService", "deleteProperty"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DeletionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.AdminServiceCallResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminPropertyServiceStub newStub(io.grpc.Channel channel) {
    return new AdminPropertyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminPropertyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdminPropertyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminPropertyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdminPropertyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AdminPropertyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPropertyType(io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PROPERTY_TYPE, responseObserver);
    }

    /**
     */
    public void updatePropertyType(io.prodrink.catalog.generated.dto.PropertyTypeUpdateRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PROPERTY_TYPE, responseObserver);
    }

    /**
     */
    public void deletePropertyType(io.prodrink.catalog.generated.dto.DeletionRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_PROPERTY_TYPE, responseObserver);
    }

    /**
     */
    public void addPropertiesToDrink(io.prodrink.catalog.generated.dto.PropertyCreationRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_PROPERTIES_TO_DRINK, responseObserver);
    }

    /**
     */
    public void updateProperty(io.prodrink.catalog.generated.dto.PropertyUpdateRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PROPERTY, responseObserver);
    }

    /**
     */
    public void deleteProperty(io.prodrink.catalog.generated.dto.DeletionRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_PROPERTY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_PROPERTY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_CREATE_PROPERTY_TYPE)))
          .addMethod(
            METHOD_UPDATE_PROPERTY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.PropertyTypeUpdateRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_UPDATE_PROPERTY_TYPE)))
          .addMethod(
            METHOD_DELETE_PROPERTY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.DeletionRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_DELETE_PROPERTY_TYPE)))
          .addMethod(
            METHOD_ADD_PROPERTIES_TO_DRINK,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.PropertyCreationRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_ADD_PROPERTIES_TO_DRINK)))
          .addMethod(
            METHOD_UPDATE_PROPERTY,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.PropertyUpdateRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_UPDATE_PROPERTY)))
          .addMethod(
            METHOD_DELETE_PROPERTY,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.DeletionRequest,
                io.prodrink.catalog.generated.dto.AdminServiceCallResponse>(
                  this, METHODID_DELETE_PROPERTY)))
          .build();
    }
  }

  /**
   */
  public static final class AdminPropertyServiceStub extends io.grpc.stub.AbstractStub<AdminPropertyServiceStub> {
    private AdminPropertyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminPropertyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminPropertyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminPropertyServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPropertyType(io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PROPERTY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePropertyType(io.prodrink.catalog.generated.dto.PropertyTypeUpdateRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PROPERTY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePropertyType(io.prodrink.catalog.generated.dto.DeletionRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_PROPERTY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPropertiesToDrink(io.prodrink.catalog.generated.dto.PropertyCreationRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_PROPERTIES_TO_DRINK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProperty(io.prodrink.catalog.generated.dto.PropertyUpdateRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PROPERTY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProperty(io.prodrink.catalog.generated.dto.DeletionRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_PROPERTY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdminPropertyServiceBlockingStub extends io.grpc.stub.AbstractStub<AdminPropertyServiceBlockingStub> {
    private AdminPropertyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminPropertyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminPropertyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminPropertyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse createPropertyType(io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PROPERTY_TYPE, getCallOptions(), request);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse updatePropertyType(io.prodrink.catalog.generated.dto.PropertyTypeUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PROPERTY_TYPE, getCallOptions(), request);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse deletePropertyType(io.prodrink.catalog.generated.dto.DeletionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_PROPERTY_TYPE, getCallOptions(), request);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse addPropertiesToDrink(io.prodrink.catalog.generated.dto.PropertyCreationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_PROPERTIES_TO_DRINK, getCallOptions(), request);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse updateProperty(io.prodrink.catalog.generated.dto.PropertyUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PROPERTY, getCallOptions(), request);
    }

    /**
     */
    public io.prodrink.catalog.generated.dto.AdminServiceCallResponse deleteProperty(io.prodrink.catalog.generated.dto.DeletionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_PROPERTY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdminPropertyServiceFutureStub extends io.grpc.stub.AbstractStub<AdminPropertyServiceFutureStub> {
    private AdminPropertyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminPropertyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminPropertyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminPropertyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> createPropertyType(
        io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PROPERTY_TYPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> updatePropertyType(
        io.prodrink.catalog.generated.dto.PropertyTypeUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PROPERTY_TYPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> deletePropertyType(
        io.prodrink.catalog.generated.dto.DeletionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_PROPERTY_TYPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> addPropertiesToDrink(
        io.prodrink.catalog.generated.dto.PropertyCreationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_PROPERTIES_TO_DRINK, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> updateProperty(
        io.prodrink.catalog.generated.dto.PropertyUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PROPERTY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.dto.AdminServiceCallResponse> deleteProperty(
        io.prodrink.catalog.generated.dto.DeletionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_PROPERTY, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROPERTY_TYPE = 0;
  private static final int METHODID_UPDATE_PROPERTY_TYPE = 1;
  private static final int METHODID_DELETE_PROPERTY_TYPE = 2;
  private static final int METHODID_ADD_PROPERTIES_TO_DRINK = 3;
  private static final int METHODID_UPDATE_PROPERTY = 4;
  private static final int METHODID_DELETE_PROPERTY = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdminPropertyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdminPropertyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROPERTY_TYPE:
          serviceImpl.createPropertyType((io.prodrink.catalog.generated.dto.PropertyTypeCreationRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROPERTY_TYPE:
          serviceImpl.updatePropertyType((io.prodrink.catalog.generated.dto.PropertyTypeUpdateRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROPERTY_TYPE:
          serviceImpl.deletePropertyType((io.prodrink.catalog.generated.dto.DeletionRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse>) responseObserver);
          break;
        case METHODID_ADD_PROPERTIES_TO_DRINK:
          serviceImpl.addPropertiesToDrink((io.prodrink.catalog.generated.dto.PropertyCreationRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROPERTY:
          serviceImpl.updateProperty((io.prodrink.catalog.generated.dto.PropertyUpdateRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.dto.AdminServiceCallResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROPERTY:
          serviceImpl.deleteProperty((io.prodrink.catalog.generated.dto.DeletionRequest) request,
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

  private static final class AdminPropertyServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.prodrink.catalog.generated.service.AdminCatalogServiceOuter.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdminPropertyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminPropertyServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_PROPERTY_TYPE)
              .addMethod(METHOD_UPDATE_PROPERTY_TYPE)
              .addMethod(METHOD_DELETE_PROPERTY_TYPE)
              .addMethod(METHOD_ADD_PROPERTIES_TO_DRINK)
              .addMethod(METHOD_UPDATE_PROPERTY)
              .addMethod(METHOD_DELETE_PROPERTY)
              .build();
        }
      }
    }
    return result;
  }
}
