package integration.helper;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class OrderHelper {

    public static ExtractableResponse<Response> addOrder() {
        return CommonRestAssuredUtils.post("/orders",
                                                 CommonRestAssuredUtils.LONG_EXPIRED_TOKEN);
    }

}
