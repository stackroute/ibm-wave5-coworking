package com.stackroute.workspaceService.service;

import com.stackroute.kafka.domain.Space;
import com.stackroute.workspaceService.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpaceServiceImpl implements SpaceService {
    SpaceRepository spaceRepository;

    @Autowired
    public SpaceServiceImpl(SpaceRepository spaceRepository)
    {

        this.spaceRepository = spaceRepository;
    }

    @Override
    public Space saveSpace(Space space) {

        return spaceRepository.save(space);
    }

    @Override
    public Space findBySpaceName(String spaceName)  {
        return spaceRepository.findBySpaceName(spaceName);
    }

}
