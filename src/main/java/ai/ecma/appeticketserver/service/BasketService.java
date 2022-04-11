package ai.ecma.appeticketserver.service;

import ai.ecma.appeticketserver.annotation.CurrentUser;
import ai.ecma.appeticketserver.entity.User;
import ai.ecma.appeticketserver.payload.ApiResult;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;


public interface BasketService {
    ApiResult<?> addTicket(UUID ticketId, User user);

    ApiResult<?> removeTicket(UUID ticketId, User user);

    ApiResult<?> clearBasket(User user);

    ApiResult<?> buy(User user, String cardToken);
}
