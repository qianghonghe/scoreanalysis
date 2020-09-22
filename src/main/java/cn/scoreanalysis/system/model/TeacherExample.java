package cn.scoreanalysis.system.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTeachernumberIsNull() {
            addCriterion("teachernumber is null");
            return (Criteria) this;
        }

        public Criteria andTeachernumberIsNotNull() {
            addCriterion("teachernumber is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernumberEqualTo(String value) {
            addCriterion("teachernumber =", value, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberNotEqualTo(String value) {
            addCriterion("teachernumber <>", value, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberGreaterThan(String value) {
            addCriterion("teachernumber >", value, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberGreaterThanOrEqualTo(String value) {
            addCriterion("teachernumber >=", value, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberLessThan(String value) {
            addCriterion("teachernumber <", value, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberLessThanOrEqualTo(String value) {
            addCriterion("teachernumber <=", value, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberLike(String value) {
            addCriterion("teachernumber like", value, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberNotLike(String value) {
            addCriterion("teachernumber not like", value, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberIn(List<String> values) {
            addCriterion("teachernumber in", values, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberNotIn(List<String> values) {
            addCriterion("teachernumber not in", values, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberBetween(String value1, String value2) {
            addCriterion("teachernumber between", value1, value2, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernumberNotBetween(String value1, String value2) {
            addCriterion("teachernumber not between", value1, value2, "teachernumber");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("teachername is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("teachername is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("teachername =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("teachername <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("teachername >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("teachername >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("teachername <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("teachername <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("teachername like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("teachername not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("teachername in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("teachername not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("teachername between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("teachername not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeacherageIsNull() {
            addCriterion("teacherage is null");
            return (Criteria) this;
        }

        public Criteria andTeacherageIsNotNull() {
            addCriterion("teacherage is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherageEqualTo(Integer value) {
            addCriterion("teacherage =", value, "teacherage");
            return (Criteria) this;
        }

        public Criteria andTeacherageNotEqualTo(Integer value) {
            addCriterion("teacherage <>", value, "teacherage");
            return (Criteria) this;
        }

        public Criteria andTeacherageGreaterThan(Integer value) {
            addCriterion("teacherage >", value, "teacherage");
            return (Criteria) this;
        }

        public Criteria andTeacherageGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherage >=", value, "teacherage");
            return (Criteria) this;
        }

        public Criteria andTeacherageLessThan(Integer value) {
            addCriterion("teacherage <", value, "teacherage");
            return (Criteria) this;
        }

        public Criteria andTeacherageLessThanOrEqualTo(Integer value) {
            addCriterion("teacherage <=", value, "teacherage");
            return (Criteria) this;
        }

        public Criteria andTeacherageIn(List<Integer> values) {
            addCriterion("teacherage in", values, "teacherage");
            return (Criteria) this;
        }

        public Criteria andTeacherageNotIn(List<Integer> values) {
            addCriterion("teacherage not in", values, "teacherage");
            return (Criteria) this;
        }

        public Criteria andTeacherageBetween(Integer value1, Integer value2) {
            addCriterion("teacherage between", value1, value2, "teacherage");
            return (Criteria) this;
        }

        public Criteria andTeacherageNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherage not between", value1, value2, "teacherage");
            return (Criteria) this;
        }

        public Criteria andTeachergenderIsNull() {
            addCriterion("teachergender is null");
            return (Criteria) this;
        }

        public Criteria andTeachergenderIsNotNull() {
            addCriterion("teachergender is not null");
            return (Criteria) this;
        }

        public Criteria andTeachergenderEqualTo(String value) {
            addCriterion("teachergender =", value, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderNotEqualTo(String value) {
            addCriterion("teachergender <>", value, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderGreaterThan(String value) {
            addCriterion("teachergender >", value, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderGreaterThanOrEqualTo(String value) {
            addCriterion("teachergender >=", value, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderLessThan(String value) {
            addCriterion("teachergender <", value, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderLessThanOrEqualTo(String value) {
            addCriterion("teachergender <=", value, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderLike(String value) {
            addCriterion("teachergender like", value, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderNotLike(String value) {
            addCriterion("teachergender not like", value, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderIn(List<String> values) {
            addCriterion("teachergender in", values, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderNotIn(List<String> values) {
            addCriterion("teachergender not in", values, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderBetween(String value1, String value2) {
            addCriterion("teachergender between", value1, value2, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeachergenderNotBetween(String value1, String value2) {
            addCriterion("teachergender not between", value1, value2, "teachergender");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardIsNull() {
            addCriterion("teacheridentitycard is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardIsNotNull() {
            addCriterion("teacheridentitycard is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardEqualTo(String value) {
            addCriterion("teacheridentitycard =", value, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardNotEqualTo(String value) {
            addCriterion("teacheridentitycard <>", value, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardGreaterThan(String value) {
            addCriterion("teacheridentitycard >", value, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardGreaterThanOrEqualTo(String value) {
            addCriterion("teacheridentitycard >=", value, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardLessThan(String value) {
            addCriterion("teacheridentitycard <", value, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardLessThanOrEqualTo(String value) {
            addCriterion("teacheridentitycard <=", value, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardLike(String value) {
            addCriterion("teacheridentitycard like", value, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardNotLike(String value) {
            addCriterion("teacheridentitycard not like", value, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardIn(List<String> values) {
            addCriterion("teacheridentitycard in", values, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardNotIn(List<String> values) {
            addCriterion("teacheridentitycard not in", values, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardBetween(String value1, String value2) {
            addCriterion("teacheridentitycard between", value1, value2, "teacheridentitycard");
            return (Criteria) this;
        }

        public Criteria andTeacheridentitycardNotBetween(String value1, String value2) {
            addCriterion("teacheridentitycard not between", value1, value2, "teacheridentitycard");
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