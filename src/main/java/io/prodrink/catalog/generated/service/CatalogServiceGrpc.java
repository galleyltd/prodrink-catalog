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
public final class CatalogServiceGrpc {

  private CatalogServiceGrpc() {}

  public static final String SERVICE_NAME = "catalog.CatalogService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.DrinkRequest,
      io.prodrink.catalog.generated.domain.Drink> METHOD_GET_DRINK_BY_ID =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.DrinkRequest, io.prodrink.catalog.generated.domain.Drink>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "catalog.CatalogService", "getDrinkById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DrinkRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.domain.Drink.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.TopLevelCategoriesRequest,
      io.prodrink.catalog.generated.domain.Category> METHOD_GET_TOP_LEVEL_CATEGORIES =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.TopLevelCategoriesRequest, io.prodrink.catalog.generated.domain.Category>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "catalog.CatalogService", "getTopLevelCategories"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.TopLevelCategoriesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.domain.Category.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.prodrink.catalog.generated.dto.DrinksFromCategoryRequest,
      io.prodrink.catalog.generated.domain.Drink> METHOD_GET_DRINKS_FROM_CATEGORY =
      io.grpc.MethodDescriptor.<io.prodrink.catalog.generated.dto.DrinksFromCategoryRequest, io.prodrink.catalog.generated.domain.Drink>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "catalog.CatalogService", "getDrinksFromCategory"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.dto.DrinksFromCategoryRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.prodrink.catalog.generated.domain.Drink.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CatalogServiceStub newStub(io.grpc.Channel channel) {
    return new CatalogServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CatalogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CatalogServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CatalogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CatalogServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CatalogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDrinkById(io.prodrink.catalog.generated.dto.DrinkRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.domain.Drink> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DRINK_BY_ID, responseObserver);
    }

    /**
     */
    public void getTopLevelCategories(io.prodrink.catalog.generated.dto.TopLevelCategoriesRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.domain.Category> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOP_LEVEL_CATEGORIES, responseObserver);
    }

    /**
     */
    public void getDrinksFromCategory(io.prodrink.catalog.generated.dto.DrinksFromCategoryRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.domain.Drink> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DRINKS_FROM_CATEGORY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_DRINK_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.DrinkRequest,
                io.prodrink.catalog.generated.domain.Drink>(
                  this, METHODID_GET_DRINK_BY_ID)))
          .addMethod(
            METHOD_GET_TOP_LEVEL_CATEGORIES,
            asyncServerStreamingCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.TopLevelCategoriesRequest,
                io.prodrink.catalog.generated.domain.Category>(
                  this, METHODID_GET_TOP_LEVEL_CATEGORIES)))
          .addMethod(
            METHOD_GET_DRINKS_FROM_CATEGORY,
            asyncServerStreamingCall(
              new MethodHandlers<
                io.prodrink.catalog.generated.dto.DrinksFromCategoryRequest,
                io.prodrink.catalog.generated.domain.Drink>(
                  this, METHODID_GET_DRINKS_FROM_CATEGORY)))
          .build();
    }
  }

  /**
   */
  public static final class CatalogServiceStub extends io.grpc.stub.AbstractStub<CatalogServiceStub> {
    private CatalogServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CatalogServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatalogServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatalogServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDrinkById(io.prodrink.catalog.generated.dto.DrinkRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.domain.Drink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DRINK_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTopLevelCategories(io.prodrink.catalog.generated.dto.TopLevelCategoriesRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.domain.Category> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_TOP_LEVEL_CATEGORIES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDrinksFromCategory(io.prodrink.catalog.generated.dto.DrinksFromCategoryRequest request,
        io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.domain.Drink> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_DRINKS_FROM_CATEGORY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CatalogServiceBlockingStub extends io.grpc.stub.AbstractStub<CatalogServiceBlockingStub> {
    private CatalogServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CatalogServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatalogServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatalogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.prodrink.catalog.generated.domain.Drink getDrinkById(io.prodrink.catalog.generated.dto.DrinkRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DRINK_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<io.prodrink.catalog.generated.domain.Category> getTopLevelCategories(
        io.prodrink.catalog.generated.dto.TopLevelCategoriesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_TOP_LEVEL_CATEGORIES, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<io.prodrink.catalog.generated.domain.Drink> getDrinksFromCategory(
        io.prodrink.catalog.generated.dto.DrinksFromCategoryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_DRINKS_FROM_CATEGORY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CatalogServiceFutureStub extends io.grpc.stub.AbstractStub<CatalogServiceFutureStub> {
    private CatalogServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CatalogServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatalogServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatalogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.prodrink.catalog.generated.domain.Drink> getDrinkById(
        io.prodrink.catalog.generated.dto.DrinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DRINK_BY_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DRINK_BY_ID = 0;
  private static final int METHODID_GET_TOP_LEVEL_CATEGORIES = 1;
  private static final int METHODID_GET_DRINKS_FROM_CATEGORY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CatalogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CatalogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DRINK_BY_ID:
          serviceImpl.getDrinkById((io.prodrink.catalog.generated.dto.DrinkRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.domain.Drink>) responseObserver);
          break;
        case METHODID_GET_TOP_LEVEL_CATEGORIES:
          serviceImpl.getTopLevelCategories((io.prodrink.catalog.generated.dto.TopLevelCategoriesRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.domain.Category>) responseObserver);
          break;
        case METHODID_GET_DRINKS_FROM_CATEGORY:
          serviceImpl.getDrinksFromCategory((io.prodrink.catalog.generated.dto.DrinksFromCategoryRequest) request,
              (io.grpc.stub.StreamObserver<io.prodrink.catalog.generated.domain.Drink>) responseObserver);
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

  private static final class CatalogServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.prodrink.catalog.generated.service.CatalogServiceOuter.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CatalogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CatalogServiceDescriptorSupplier())
              .addMethod(METHOD_GET_DRINK_BY_ID)
              .addMethod(METHOD_GET_TOP_LEVEL_CATEGORIES)
              .addMethod(METHOD_GET_DRINKS_FROM_CATEGORY)
              .build();
        }
      }
    }
    return result;
  }
}
