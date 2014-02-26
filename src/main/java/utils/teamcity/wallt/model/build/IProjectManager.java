package utils.teamcity.wallt.model.build;

import java.util.List;
import java.util.Optional;

/**
 * Date: 23/02/14
 *
 * @author Cedric Longo
 */
public interface IProjectManager {

    void registerProjects( List<ProjectData> projects );

    List<ProjectData> getProjects( );

    List<ProjectData> getMonitoredProjects( );

    void activateMonitoring( ProjectData projectData );

    void unactivateMonitoring( ProjectData projectData );

    int getPosition( ProjectData data );

    void requestPosition( ProjectData data, int newValue );

    Optional<ProjectData> getProject( String id );

    List<ProjectData> getAllChildrenOf( ProjectData data );
}