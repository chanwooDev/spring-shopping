package shopping.cart.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import shopping.cart.domain.CartItem;
import shopping.cart.dto.ProductCartItemDto;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    @Query("select new shopping.cart.dto.ProductCartItemDto(p, c) from CartItem c join Product p on p.id = c.productId")
    List<ProductCartItemDto> findAllDtoByMemberId(Long memberId);
}
