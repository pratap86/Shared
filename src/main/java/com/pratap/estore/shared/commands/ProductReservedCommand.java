package com.pratap.estore.shared.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class ProductReservedCommand {

    @TargetAggregateIdentifier
    private final String productId;
    private final Integer quantity;
    private final String orderId;
    private final String userId;
}
