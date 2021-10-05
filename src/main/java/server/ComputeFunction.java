package server;

import io.grpc.stub.StreamObserver;
import proto.ComputeFunctionGrpc;
import proto.Protofile;

public class ComputeFunction extends ComputeFunctionGrpc.ComputeFunctionImplBase {

    @Override
    public void compute(Protofile.DataRequest request, StreamObserver<Protofile.DataResponse> responseObserver) {
        //super.compute(request, responseObserver);
        double y=2* request.getX()+1;
        System.out.println("Received x: "+request.getX());
        responseObserver.onNext(Protofile.DataResponse.newBuilder().setY(y).build());
        responseObserver.onCompleted();
    }

}
