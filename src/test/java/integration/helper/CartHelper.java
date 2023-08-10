package integration.helper;

import static integration.helper.CommonRestAssuredUtils.LONG_EXPIRED_TOKEN;
import static integration.helper.CommonRestAssuredUtils.post;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import shopping.cart.dto.request.CartItemCreationRequest;

public class CartHelper {

    public static void addCartItem(Long productId) {
        ExtractableResponse<Response> response = post("/cart", new CartItemCreationRequest(productId),
            LONG_EXPIRED_TOKEN);
    }
}
