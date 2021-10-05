package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: protofile.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ComputeFunctionGrpc {

  private ComputeFunctionGrpc() {}

  public static final String SERVICE_NAME = "proto.ComputeFunction";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Protofile.DataRequest,
      proto.Protofile.DataResponse> getComputeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "compute",
      requestType = proto.Protofile.DataRequest.class,
      responseType = proto.Protofile.DataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Protofile.DataRequest,
      proto.Protofile.DataResponse> getComputeMethod() {
    io.grpc.MethodDescriptor<proto.Protofile.DataRequest, proto.Protofile.DataResponse> getComputeMethod;
    if ((getComputeMethod = ComputeFunctionGrpc.getComputeMethod) == null) {
      synchronized (ComputeFunctionGrpc.class) {
        if ((getComputeMethod = ComputeFunctionGrpc.getComputeMethod) == null) {
          ComputeFunctionGrpc.getComputeMethod = getComputeMethod =
              io.grpc.MethodDescriptor.<proto.Protofile.DataRequest, proto.Protofile.DataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "compute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Protofile.DataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Protofile.DataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeFunctionMethodDescriptorSupplier("compute"))
              .build();
        }
      }
    }
    return getComputeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComputeFunctionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeFunctionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeFunctionStub>() {
        @java.lang.Override
        public ComputeFunctionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeFunctionStub(channel, callOptions);
        }
      };
    return ComputeFunctionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComputeFunctionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeFunctionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeFunctionBlockingStub>() {
        @java.lang.Override
        public ComputeFunctionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeFunctionBlockingStub(channel, callOptions);
        }
      };
    return ComputeFunctionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComputeFunctionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeFunctionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeFunctionFutureStub>() {
        @java.lang.Override
        public ComputeFunctionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeFunctionFutureStub(channel, callOptions);
        }
      };
    return ComputeFunctionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ComputeFunctionImplBase implements io.grpc.BindableService {

    /**
     */
    public void compute(proto.Protofile.DataRequest request,
        io.grpc.stub.StreamObserver<proto.Protofile.DataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getComputeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getComputeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.Protofile.DataRequest,
                proto.Protofile.DataResponse>(
                  this, METHODID_COMPUTE)))
          .build();
    }
  }

  /**
   */
  public static final class ComputeFunctionStub extends io.grpc.stub.AbstractAsyncStub<ComputeFunctionStub> {
    private ComputeFunctionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeFunctionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeFunctionStub(channel, callOptions);
    }

    /**
     */
    public void compute(proto.Protofile.DataRequest request,
        io.grpc.stub.StreamObserver<proto.Protofile.DataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getComputeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ComputeFunctionBlockingStub extends io.grpc.stub.AbstractBlockingStub<ComputeFunctionBlockingStub> {
    private ComputeFunctionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeFunctionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeFunctionBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Protofile.DataResponse compute(proto.Protofile.DataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getComputeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ComputeFunctionFutureStub extends io.grpc.stub.AbstractFutureStub<ComputeFunctionFutureStub> {
    private ComputeFunctionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeFunctionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeFunctionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Protofile.DataResponse> compute(
        proto.Protofile.DataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getComputeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMPUTE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ComputeFunctionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ComputeFunctionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPUTE:
          serviceImpl.compute((proto.Protofile.DataRequest) request,
              (io.grpc.stub.StreamObserver<proto.Protofile.DataResponse>) responseObserver);
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

  private static abstract class ComputeFunctionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComputeFunctionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Protofile.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComputeFunction");
    }
  }

  private static final class ComputeFunctionFileDescriptorSupplier
      extends ComputeFunctionBaseDescriptorSupplier {
    ComputeFunctionFileDescriptorSupplier() {}
  }

  private static final class ComputeFunctionMethodDescriptorSupplier
      extends ComputeFunctionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ComputeFunctionMethodDescriptorSupplier(String methodName) {
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
      synchronized (ComputeFunctionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComputeFunctionFileDescriptorSupplier())
              .addMethod(getComputeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
