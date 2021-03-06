package com.thirdlife.thirddonation.api.notification.dto;

import com.thirdlife.thirddonation.db.notification.entity.Notification;
import com.thirdlife.thirddonation.db.notification.entity.NotificationType;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

/**
 * 알림 정보.
 */
@Builder
@Data
public class NotificationInfoDto {

    private Long id;
    private NotificationType type;
    private String description;
    private LocalDateTime dateCreated;

    /**
     * 엔티티를 DTO로 변환.
     *
     * @param notification Notification
     * @return NotificationInfoDto
     */
    public static NotificationInfoDto of(Notification notification) {
        return NotificationInfoDto.builder()
                .id(notification.getId())
                .type(notification.getType())
                .description(notification.getDescription())
                .dateCreated(notification.getDateCreated())
                .build();
    }
}
