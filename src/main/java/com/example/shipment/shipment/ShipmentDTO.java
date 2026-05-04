package com.example.shipment.shipment;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;


public class ShipmentDTO {
    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateShipmentRequest {

        @NotBlank(message = "Origin is required")
        public String origin;
        @NotBlank(message = "destination is required")
        public String destination;

        public String estimatedDelivery;
    }

    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ShipmentResponse {
        private Long id;
        private String trackingNumber;
        private String origin;
        private String destination;
        private ShipmentStatus status;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String currentLocation;
        private String estimatedDelivery;
    }

    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateStatusRequest {
        private ShipmentStatus status;
        private String currentLocation;
    }

    @Data
    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class StatusUpdateMessage {
        private Long shipmentId;
        private String trackingNumber;
        private ShipmentStatus status;
        private String currentLocation;
        private LocalDateTime timestamp;
        private String message;
    }

}
