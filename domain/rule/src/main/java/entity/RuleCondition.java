package entity;

import com.google.common.collect.Range;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleCondition {
    public static final String DATE_RANGE_SUM = "DATE_RANGE_SUM";
    public static final String SINGLE = "SINGLE";
    public static final String CURRENT_SUM = "CURRENT_SUM";
    public static final String CURRENT_DAY = "CURRENT_DAY";
    public static final String N_DAYS_SUM = "N_DAYS_SUM";
    public static final String ALL_TRANSIT = "ALL_TRANSIT";


    private String controlType;
    private String numeratorType;
    private String compareSide;
    private String securitySummary;
    private String fundSummary;
    private List<String> securities;
    private List<String> securityPools;
    private List<String> securityTypes;
    private String layer;
    private List<String> funds;
    private List<ThresholdValue> thresholdValues;
    private int n;
    private boolean flatPrice;
    private String denominatorType;
    private Collection<String> exchanges;

    private String delegateOrientation;
    private String aggregationType;
    private List<String> limitDateRange;
    private List<String> personnels;
    private String personnelSummary;
    private String agencyControlCategory;
    private List<String> transactionTypes;
    private List<String> organizationType;
    private boolean scaleList;

    private List<String> numeratorFixedValue;

    // H类新增
    private String controlPriceType;
    private String hDelegateOrientation;
    private Collection<String> priceTypes;
    private Collection<String> businessTypes;
    private String numeratorModel;
    private String comparativeType;

    // I类新增
    private String operationType;
    private boolean bondOutrightRepoControl;// 买断式回购控制
    private boolean debtForEquitySwapControl;// 债转股控制

    // J类新增
    private Collection<String> tradingPlatforms;
    private int comparisionDays;
    private String controlDate;
    private int comparisonDays;
    private String controlMode;
    private String operation;

    // K
    private String valueComputeType;
    private String bondRemainMaturity;
    private String depositRemainMaturity;
    private String floatBondRemainMaturity;
    private String rightBondRemainMaturity;
    private String rightBondLongType;

    //M新增
    private String controlCategory;
    private Collection<String> controlScope;
    private Collection<String> settlementModel;
    private Collection<String> opponentModel;
    private String opponentControl;
    private Collection<String> opponentControlValues;
    private String mQuotaType;

    //N新增
    private String controlCategoryN;
    private String tuoguanQualification;
    private Collection<String> depositType;
    private String depositTime;
    private String depositTimeUnit;
    private BigDecimal remainMaturity;
    private String remainMaturityComparator;
    private String remainMaturityType;
    private Collection<String> withdrawLimitType;
    private String depositRate;
    private String bankControl;
    private Collection<String> masterBank;
    private Range<BigDecimal> depositDeadline;
    private ChronoUnit depositDeadlineUnit;
    private Range<BigDecimal> remainingPeriod;

    //P新增
    private Collection<String> controlDirection;

    //R新增
    private Collection<String> positionTypes;
    private List<String> investmentTypes;
    private String priceType;


    //L类新增
    private String dateCompareSide;
    private String dueDate;

}
