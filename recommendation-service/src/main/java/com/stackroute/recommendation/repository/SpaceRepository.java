package com.stackroute.recommendation.repository;

import com.stackroute.recommendation.domain.Address;
import com.stackroute.recommendation.domain.Space;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface SpaceRepository extends Neo4jRepository<Space,Long> {

    @Query("MATCH (n:Space) RETURN n")
    public Collection<Space> getAll();

    @Query("CREATE (u:Space) SET u.spaceId={spaceId},u.spaceName={spaceName},u.address={address}")
    public Space createNode(long spaceId, String spaceName, Address address);

    @Query("MATCH (n:Space) WHERE n.spaceName={spaceName} RETURN n")
    public Space getNode(@Param("spaceName") String spaceName);

    @Query("MATCH (n:Space) WHERE n.spaceId={spaceId} DETACH DELETE n RETURN 'node deleted' ")
    public Space deleteNode(long spaceId);

    @Query("MATCH (Space) DETACH DELETE Space")
    public Space deleteAllNodes();

    @Query("MATCH (n:Space) WHERE n.spaceId={spaceId} SET n.spaceName={spaceName} RETURN n")
    public Space updateNode( long spaceId,String spaceName);




}
