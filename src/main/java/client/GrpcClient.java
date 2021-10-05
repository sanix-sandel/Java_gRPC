package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.ComputeFunctionGrpc;
import proto.Protofile;

public class GrpcClient {


    public static void main(String[]args)throws InterruptedException{

        ManagedChannel channel=ManagedChannelBuilder.forAddress("localhost", 50001 ).usePlaintext().build();

        ComputeFunctionGrpc.ComputeFunctionBlockingStub stub=ComputeFunctionGrpc.newBlockingStub(channel);

        stub.compute(Protofile.DataRequest.newBuilder().setX(45.0).build());
        channel.shutdown();
    }

}
