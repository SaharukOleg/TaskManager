package com.sahar.taskmanager.app.service.mapper;

import com.sahar.taskmanager.app.domain.*;
import com.sahar.taskmanager.app.service.dto.TaskDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Task and its DTO TaskDTO.
 */
@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "user.login", target = "userLogin")
    TaskDTO toDto(Task task);

    @Mapping(source = "userId", target = "user")
    Task toEntity(TaskDTO taskDTO);

    default Task fromId(Long id) {
        if (id == null) {
            return null;
        }
        Task task = new Task();
        task.setId(id);
        return task;
    }
}
