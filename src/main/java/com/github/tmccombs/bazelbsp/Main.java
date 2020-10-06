package com.github.tmccombs.bazelbsp;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

import ch.epfl.scala.bsp4j.BuildClient;
import org.eclipse.lsp4j.jsonrpc.Launcher;

public class Main {
    public static void main(String[] argv) {
        var server = new BazelBuildServer();
        var launcher = new Launcher.Builder<BuildClient>()
            .setInput(System.in)
            .setOutput(System.out)
            .setLocalService(server)
            .setRemoteInterface(BuildClient.class)
            .create();

        try {
            launcher.startListening().get(); // listen until BSP session is over.
        } catch (InterruptedException|CancellationException exc) {
            System.err.println("Execution interrupted, exiting");
            System.exit(1);
        } catch (ExecutionException exc) {
            exc.printStackTrace(System.err);
            System.exit(1);
        }
    }
}
