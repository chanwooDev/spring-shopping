package integration;

import static org.assertj.core.api.Assertions.assertThat;

import integration.helper.CartHelper;
import integration.helper.OrderHelper;
import integration.helper.ProductHelper;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import shopping.product.dto.request.ProductCreationRequest;

@DisplayName("주문 통합 테스트")
class OrderIntegrationTest extends IntegrationTest{

    @Test
    @DisplayName("장바구니에 담긴 상품을 주문한다")
    void order() {
        // given
        ProductCreationRequest productCreationRequest = ProductHelper.createProductCreationRequest();
        Long productId = ProductHelper.createProductAndGetId(productCreationRequest);
        CartHelper.addCartItem(productId);

        // when
        ExtractableResponse<Response> response = OrderHelper.addOrder();

        // then
        response.jsonPath().get("id");
        assertThat(response.statusCode()).isEqualTo(201);
    }

//    장바구니에 아이템이 없는 경우 주문이 실패한다

// 모든 주문 목록을 조회한다

//    주문을 조회한다
//    본인 주문이 아니면 조회할 수 없다

//   주문을 했으면 장바구니에 담긴 상품을 삭제한다
//    본인 주문이 아니면 조회할 수 없다
//    장바구니에 아이템이 없는 경우 주문이 실패한
//    본인 주문을 조회한다
//    주문 상세 정보를 조회한다

}
