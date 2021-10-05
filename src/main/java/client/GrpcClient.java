package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.ComputeFunctionGrpc;
import proto.Protofile;

import java.util.Arrays;
import java.util.logging.Logger;

public class GrpcClient {

    private static final Logger logger=Logger.getLogger(GrpcClient.class.getName());

    public static void main(String[]args)throws InterruptedException{

        ManagedChannel channel=ManagedChannelBuilder.forAddress("localhost", 50001 ).usePlaintext().build();

        ComputeFunctionGrpc.ComputeFunctionBlockingStub stub=ComputeFunctionGrpc.newBlockingStub(channel);

        for(int x=0; x<100; x++){
            stub.compute(Protofile.DataRequest.newBuilder().setX(x).build());
            logger.info("Value of x sent : "+x);
        }
        channel.shutdown();
    }

}
