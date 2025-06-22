package com.harifrahman.tasks.mapper.impl;

import com.harifrahman.tasks.domain.dto.TaskDto;
import com.harifrahman.tasks.domain.entities.Task;
import com.harifrahman.tasks.mapper.TaskMapper;

public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromDto(TaskDto taskDto) {
        return Task.builder()
                .id(taskDto.id())
                .title(taskDto.title())
                .description(taskDto.description())
                .dueDate(taskDto.dueDate())
                .status(taskDto.status())
                .priority(taskDto.priority())
                .build();
    }

    @Override
    public TaskDto toDto(Task task) {
        return TaskDto.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .dueDate(task.getDueDate())
                .priority(task.getPriority())
                .status(task.getStatus())
                .build();
    }
}
