package com.harifrahman.tasks.domain.dto;

import com.harifrahman.tasks.domain.entities.TaskPriority;
import com.harifrahman.tasks.domain.entities.TaskStatus;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder(toBuilder = true)
public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
