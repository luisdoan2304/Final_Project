package entityLombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderDetail {

	private int id;
	private int orderId;
	private int productId;
	private int price;
	private int quantity;
}
