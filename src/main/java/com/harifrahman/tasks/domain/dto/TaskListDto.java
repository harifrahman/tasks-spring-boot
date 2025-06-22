package com.harifrahman.tasks.domain.dto;

import com.harifrahman.tasks.domain.entities.TaskPriority;
import com.harifrahman.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record TaskListDto(
        UUID id,
        String title,
        String description,
        Integer count,
        Double progress,
        List<TaskDto> tasks,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
