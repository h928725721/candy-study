package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThresholdValue {
	private BigDecimal lower;
	private BigDecimal upper;
	private RiskAction operation;// 触警操作





	@Data
	private static class RiskAction {
		private String name, label;

		public String name() {
			return name;
		}
	}
}
