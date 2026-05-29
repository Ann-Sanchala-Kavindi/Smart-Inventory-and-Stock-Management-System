package com.Smart.Inventory.Prediction.System.model;

import com.Smart.Inventory.Prediction.System.model.Enum.NotificationType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private LocalDateTime createdDate;

    @Enumerated(EnumType.STRING)
    private NotificationType type;

    @ManyToOne
    private User user;
}
