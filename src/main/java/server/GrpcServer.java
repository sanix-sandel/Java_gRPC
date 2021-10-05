package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class GrpcServer {

    private static final Logger logger=Logger.getLogger(GrpcServer.class.getName());
    private Server server;

    private void start()throws IOException{
        int port=50001;
        server = ServerBuilder.forPort(port)
                .addService(new ComputeFunction())
                .build()
                .start();
        logger.info("Server started, listening on "+port);
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            logger.info("Shutting down gRPC server since JVM is shutting down");
            //stop server
            GrpcServer.this.stop();
            logger.info("Server shut down");
        }));

    }

    private void stop(){
        if (server !=null){
            server.shutdown();
        }
    }

    private void blockUntilShutdown()throws InterruptedException{
        if(server!=null){
            server.awaitTermination();
        }
    }

   public static void main(String[]args)throws IOException, InterruptedException {

        final GrpcServer server=new GrpcServer();
        server.start();
        server.blockUntilShutdown();
    }

}
