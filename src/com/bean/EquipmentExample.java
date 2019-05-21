package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEqIdIsNull() {
            addCriterion("eq_id is null");
            return (Criteria) this;
        }

        public Criteria andEqIdIsNotNull() {
            addCriterion("eq_id is not null");
            return (Criteria) this;
        }

        public Criteria andEqIdEqualTo(Integer value) {
            addCriterion("eq_id =", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdNotEqualTo(Integer value) {
            addCriterion("eq_id <>", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdGreaterThan(Integer value) {
            addCriterion("eq_id >", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eq_id >=", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdLessThan(Integer value) {
            addCriterion("eq_id <", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdLessThanOrEqualTo(Integer value) {
            addCriterion("eq_id <=", value, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdIn(List<Integer> values) {
            addCriterion("eq_id in", values, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdNotIn(List<Integer> values) {
            addCriterion("eq_id not in", values, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdBetween(Integer value1, Integer value2) {
            addCriterion("eq_id between", value1, value2, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eq_id not between", value1, value2, "eqId");
            return (Criteria) this;
        }

        public Criteria andEqNameIsNull() {
            addCriterion("eq_name is null");
            return (Criteria) this;
        }

        public Criteria andEqNameIsNotNull() {
            addCriterion("eq_name is not null");
            return (Criteria) this;
        }

        public Criteria andEqNameEqualTo(String value) {
            addCriterion("eq_name =", value, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameNotEqualTo(String value) {
            addCriterion("eq_name <>", value, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameGreaterThan(String value) {
            addCriterion("eq_name >", value, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameGreaterThanOrEqualTo(String value) {
            addCriterion("eq_name >=", value, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameLessThan(String value) {
            addCriterion("eq_name <", value, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameLessThanOrEqualTo(String value) {
            addCriterion("eq_name <=", value, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameLike(String value) {
            addCriterion("eq_name like", value, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameNotLike(String value) {
            addCriterion("eq_name not like", value, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameIn(List<String> values) {
            addCriterion("eq_name in", values, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameNotIn(List<String> values) {
            addCriterion("eq_name not in", values, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameBetween(String value1, String value2) {
            addCriterion("eq_name between", value1, value2, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNameNotBetween(String value1, String value2) {
            addCriterion("eq_name not between", value1, value2, "eqName");
            return (Criteria) this;
        }

        public Criteria andEqNumberIsNull() {
            addCriterion("eq_number is null");
            return (Criteria) this;
        }

        public Criteria andEqNumberIsNotNull() {
            addCriterion("eq_number is not null");
            return (Criteria) this;
        }

        public Criteria andEqNumberEqualTo(String value) {
            addCriterion("eq_number =", value, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberNotEqualTo(String value) {
            addCriterion("eq_number <>", value, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberGreaterThan(String value) {
            addCriterion("eq_number >", value, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberGreaterThanOrEqualTo(String value) {
            addCriterion("eq_number >=", value, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberLessThan(String value) {
            addCriterion("eq_number <", value, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberLessThanOrEqualTo(String value) {
            addCriterion("eq_number <=", value, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberLike(String value) {
            addCriterion("eq_number like", value, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberNotLike(String value) {
            addCriterion("eq_number not like", value, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberIn(List<String> values) {
            addCriterion("eq_number in", values, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberNotIn(List<String> values) {
            addCriterion("eq_number not in", values, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberBetween(String value1, String value2) {
            addCriterion("eq_number between", value1, value2, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andEqNumberNotBetween(String value1, String value2) {
            addCriterion("eq_number not between", value1, value2, "eqNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andLoanIsNull() {
            addCriterion("loan is null");
            return (Criteria) this;
        }

        public Criteria andLoanIsNotNull() {
            addCriterion("loan is not null");
            return (Criteria) this;
        }

        public Criteria andLoanEqualTo(Integer value) {
            addCriterion("loan =", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanNotEqualTo(Integer value) {
            addCriterion("loan <>", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanGreaterThan(Integer value) {
            addCriterion("loan >", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan >=", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanLessThan(Integer value) {
            addCriterion("loan <", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanLessThanOrEqualTo(Integer value) {
            addCriterion("loan <=", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanIn(List<Integer> values) {
            addCriterion("loan in", values, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanNotIn(List<Integer> values) {
            addCriterion("loan not in", values, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanBetween(Integer value1, Integer value2) {
            addCriterion("loan between", value1, value2, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanNotBetween(Integer value1, Integer value2) {
            addCriterion("loan not between", value1, value2, "loan");
            return (Criteria) this;
        }

        public Criteria andNumberUseIsNull() {
            addCriterion("number_use is null");
            return (Criteria) this;
        }

        public Criteria andNumberUseIsNotNull() {
            addCriterion("number_use is not null");
            return (Criteria) this;
        }

        public Criteria andNumberUseEqualTo(Integer value) {
            addCriterion("number_use =", value, "numberUse");
            return (Criteria) this;
        }

        public Criteria andNumberUseNotEqualTo(Integer value) {
            addCriterion("number_use <>", value, "numberUse");
            return (Criteria) this;
        }

        public Criteria andNumberUseGreaterThan(Integer value) {
            addCriterion("number_use >", value, "numberUse");
            return (Criteria) this;
        }

        public Criteria andNumberUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_use >=", value, "numberUse");
            return (Criteria) this;
        }

        public Criteria andNumberUseLessThan(Integer value) {
            addCriterion("number_use <", value, "numberUse");
            return (Criteria) this;
        }

        public Criteria andNumberUseLessThanOrEqualTo(Integer value) {
            addCriterion("number_use <=", value, "numberUse");
            return (Criteria) this;
        }

        public Criteria andNumberUseIn(List<Integer> values) {
            addCriterion("number_use in", values, "numberUse");
            return (Criteria) this;
        }

        public Criteria andNumberUseNotIn(List<Integer> values) {
            addCriterion("number_use not in", values, "numberUse");
            return (Criteria) this;
        }

        public Criteria andNumberUseBetween(Integer value1, Integer value2) {
            addCriterion("number_use between", value1, value2, "numberUse");
            return (Criteria) this;
        }

        public Criteria andNumberUseNotBetween(Integer value1, Integer value2) {
            addCriterion("number_use not between", value1, value2, "numberUse");
            return (Criteria) this;
        }

        public Criteria andEqDateIsNull() {
            addCriterion("eq_date is null");
            return (Criteria) this;
        }

        public Criteria andEqDateIsNotNull() {
            addCriterion("eq_date is not null");
            return (Criteria) this;
        }

        public Criteria andEqDateEqualTo(Date value) {
            addCriterion("eq_date =", value, "eqDate");
            return (Criteria) this;
        }

        public Criteria andEqDateNotEqualTo(Date value) {
            addCriterion("eq_date <>", value, "eqDate");
            return (Criteria) this;
        }

        public Criteria andEqDateGreaterThan(Date value) {
            addCriterion("eq_date >", value, "eqDate");
            return (Criteria) this;
        }

        public Criteria andEqDateGreaterThanOrEqualTo(Date value) {
            addCriterion("eq_date >=", value, "eqDate");
            return (Criteria) this;
        }

        public Criteria andEqDateLessThan(Date value) {
            addCriterion("eq_date <", value, "eqDate");
            return (Criteria) this;
        }

        public Criteria andEqDateLessThanOrEqualTo(Date value) {
            addCriterion("eq_date <=", value, "eqDate");
            return (Criteria) this;
        }

        public Criteria andEqDateIn(List<Date> values) {
            addCriterion("eq_date in", values, "eqDate");
            return (Criteria) this;
        }

        public Criteria andEqDateNotIn(List<Date> values) {
            addCriterion("eq_date not in", values, "eqDate");
            return (Criteria) this;
        }

        public Criteria andEqDateBetween(Date value1, Date value2) {
            addCriterion("eq_date between", value1, value2, "eqDate");
            return (Criteria) this;
        }

        public Criteria andEqDateNotBetween(Date value1, Date value2) {
            addCriterion("eq_date not between", value1, value2, "eqDate");
            return (Criteria) this;
        }

        public Criteria andEqAdminIsNull() {
            addCriterion("eq_admin is null");
            return (Criteria) this;
        }

        public Criteria andEqAdminIsNotNull() {
            addCriterion("eq_admin is not null");
            return (Criteria) this;
        }

        public Criteria andEqAdminEqualTo(String value) {
            addCriterion("eq_admin =", value, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminNotEqualTo(String value) {
            addCriterion("eq_admin <>", value, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminGreaterThan(String value) {
            addCriterion("eq_admin >", value, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminGreaterThanOrEqualTo(String value) {
            addCriterion("eq_admin >=", value, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminLessThan(String value) {
            addCriterion("eq_admin <", value, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminLessThanOrEqualTo(String value) {
            addCriterion("eq_admin <=", value, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminLike(String value) {
            addCriterion("eq_admin like", value, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminNotLike(String value) {
            addCriterion("eq_admin not like", value, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminIn(List<String> values) {
            addCriterion("eq_admin in", values, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminNotIn(List<String> values) {
            addCriterion("eq_admin not in", values, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminBetween(String value1, String value2) {
            addCriterion("eq_admin between", value1, value2, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andEqAdminNotBetween(String value1, String value2) {
            addCriterion("eq_admin not between", value1, value2, "eqAdmin");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}