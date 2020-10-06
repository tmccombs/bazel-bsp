package com.github.tmccombs.bazelbsp;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import ch.epfl.scala.bsp4j.*;

public class BazelBuildServer implements BuildServer {
    public CompletableFuture<InitializeBuildResult> buildInitialize(InitializeBuildParams params){
        return null;
    }

    public void onBuildInitialized(){
    }

    public CompletableFuture<Object> buildShutdown(){
        return null;
    }

    public void onBuildExit(){
    }

    public CompletableFuture<WorkspaceBuildTargetsResult> workspaceBuildTargets(){
        return null;
    }

    public CompletableFuture<Object> workspaceReload(){
        return null;
    }

    public CompletableFuture<SourcesResult> buildTargetSources(SourcesParams params){
        return null;
    }

    public CompletableFuture<InverseSourcesResult> buildTargetInverseSources(InverseSourcesParams params){
        return null;
    }

    public CompletableFuture<DependencySourcesResult> buildTargetDependencySources(DependencySourcesParams params){
        return null;
    }

    public CompletableFuture<ResourcesResult> buildTargetResources(ResourcesParams params){
        return null;
    }

    public CompletableFuture<CompileResult> buildTargetCompile(CompileParams params){
        return null;
    }

    public CompletableFuture<TestResult> buildTargetTest(TestParams params){
        return null;
    }

    public CompletableFuture<RunResult> buildTargetRun(RunParams params){
        return null;
    }

    public CompletableFuture<CleanCacheResult> buildTargetCleanCache(CleanCacheParams params){
        return null;
    }
}
