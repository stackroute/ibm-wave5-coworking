package com.stackroute.workspaceService.service;

import com.stackroute.kafka.domain.Space;

public interface SpaceService {
    public Space saveSpace(Space space);
    public Space findBySpaceName(String spaceName);
}
