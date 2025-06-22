package com.harifrahman.tasks.mapper;

import com.harifrahman.tasks.domain.dto.TaskDto;
import com.harifrahman.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
