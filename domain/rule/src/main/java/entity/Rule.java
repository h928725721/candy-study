package entity;

import com.google.common.collect.Range;
import jdk.jfr.Threshold;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class Rule implements Serializable {
	private static final long serialVersionUID = -661082587599137867L;
	private String ruleId;
	private String ruleType;
	private String ruleTypeName;
	private String name;
	private String riskLevel;
	private String computeType;
	private String description;
	private String[] scopes;
	private List<Threshold> thresholds;
	private Range<LocalDate> dateRange;
	private Range<LocalTime> timeRange;
	private boolean on;
	private int priority;

	private RuleCondition conditions;

	private BigDecimal denominator = BigDecimal.ONE;

	public Rule(RuleCondition conditions) {
		this.conditions = conditions;
	}





}
