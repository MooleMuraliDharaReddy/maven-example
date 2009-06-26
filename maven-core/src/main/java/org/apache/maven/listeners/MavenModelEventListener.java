package org.apache.maven.listeners;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.model.ModelEventListener;


public interface MavenModelEventListener
    extends ModelEventListener
{
    void processModelContainers( MavenSession session );
}