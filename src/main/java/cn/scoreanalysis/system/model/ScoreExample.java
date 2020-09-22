package cn.scoreanalysis.system.model;

import java.util.ArrayList;
import java.util.List;

public class ScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreExample() {
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

        public Criteria andStudentidIsNull() {
            addCriterion("studentid is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentid is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentid =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentid <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentid >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentid >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentid <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentid <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentid in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentid not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentid between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentid not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseid is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseid =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseid <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseid >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseid >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseid <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseid <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseid in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseid not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseid between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseid not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andUsualscoreIsNull() {
            addCriterion("usualscore is null");
            return (Criteria) this;
        }

        public Criteria andUsualscoreIsNotNull() {
            addCriterion("usualscore is not null");
            return (Criteria) this;
        }

        public Criteria andUsualscoreEqualTo(Float value) {
            addCriterion("usualscore =", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreNotEqualTo(Float value) {
            addCriterion("usualscore <>", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreGreaterThan(Float value) {
            addCriterion("usualscore >", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("usualscore >=", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreLessThan(Float value) {
            addCriterion("usualscore <", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreLessThanOrEqualTo(Float value) {
            addCriterion("usualscore <=", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreIn(List<Float> values) {
            addCriterion("usualscore in", values, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreNotIn(List<Float> values) {
            addCriterion("usualscore not in", values, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreBetween(Float value1, Float value2) {
            addCriterion("usualscore between", value1, value2, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreNotBetween(Float value1, Float value2) {
            addCriterion("usualscore not between", value1, value2, "usualscore");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreIsNull() {
            addCriterion("middlescore is null");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreIsNotNull() {
            addCriterion("middlescore is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreEqualTo(Float value) {
            addCriterion("middlescore =", value, "middlescore");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreNotEqualTo(Float value) {
            addCriterion("middlescore <>", value, "middlescore");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreGreaterThan(Float value) {
            addCriterion("middlescore >", value, "middlescore");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreGreaterThanOrEqualTo(Float value) {
            addCriterion("middlescore >=", value, "middlescore");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreLessThan(Float value) {
            addCriterion("middlescore <", value, "middlescore");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreLessThanOrEqualTo(Float value) {
            addCriterion("middlescore <=", value, "middlescore");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreIn(List<Float> values) {
            addCriterion("middlescore in", values, "middlescore");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreNotIn(List<Float> values) {
            addCriterion("middlescore not in", values, "middlescore");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreBetween(Float value1, Float value2) {
            addCriterion("middlescore between", value1, value2, "middlescore");
            return (Criteria) this;
        }

        public Criteria andMiddlescoreNotBetween(Float value1, Float value2) {
            addCriterion("middlescore not between", value1, value2, "middlescore");
            return (Criteria) this;
        }

        public Criteria andEndscoreIsNull() {
            addCriterion("endscore is null");
            return (Criteria) this;
        }

        public Criteria andEndscoreIsNotNull() {
            addCriterion("endscore is not null");
            return (Criteria) this;
        }

        public Criteria andEndscoreEqualTo(Float value) {
            addCriterion("endscore =", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreNotEqualTo(Float value) {
            addCriterion("endscore <>", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreGreaterThan(Float value) {
            addCriterion("endscore >", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("endscore >=", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreLessThan(Float value) {
            addCriterion("endscore <", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreLessThanOrEqualTo(Float value) {
            addCriterion("endscore <=", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreIn(List<Float> values) {
            addCriterion("endscore in", values, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreNotIn(List<Float> values) {
            addCriterion("endscore not in", values, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreBetween(Float value1, Float value2) {
            addCriterion("endscore between", value1, value2, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreNotBetween(Float value1, Float value2) {
            addCriterion("endscore not between", value1, value2, "endscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreIsNull() {
            addCriterion("finalscore is null");
            return (Criteria) this;
        }

        public Criteria andFinalscoreIsNotNull() {
            addCriterion("finalscore is not null");
            return (Criteria) this;
        }

        public Criteria andFinalscoreEqualTo(Float value) {
            addCriterion("finalscore =", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreNotEqualTo(Float value) {
            addCriterion("finalscore <>", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreGreaterThan(Float value) {
            addCriterion("finalscore >", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("finalscore >=", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreLessThan(Float value) {
            addCriterion("finalscore <", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreLessThanOrEqualTo(Float value) {
            addCriterion("finalscore <=", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreIn(List<Float> values) {
            addCriterion("finalscore in", values, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreNotIn(List<Float> values) {
            addCriterion("finalscore not in", values, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreBetween(Float value1, Float value2) {
            addCriterion("finalscore between", value1, value2, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreNotBetween(Float value1, Float value2) {
            addCriterion("finalscore not between", value1, value2, "finalscore");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreIsNull() {
            addCriterion("supplementaryscore is null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreIsNotNull() {
            addCriterion("supplementaryscore is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreEqualTo(Float value) {
            addCriterion("supplementaryscore =", value, "supplementaryscore");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreNotEqualTo(Float value) {
            addCriterion("supplementaryscore <>", value, "supplementaryscore");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreGreaterThan(Float value) {
            addCriterion("supplementaryscore >", value, "supplementaryscore");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("supplementaryscore >=", value, "supplementaryscore");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreLessThan(Float value) {
            addCriterion("supplementaryscore <", value, "supplementaryscore");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreLessThanOrEqualTo(Float value) {
            addCriterion("supplementaryscore <=", value, "supplementaryscore");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreIn(List<Float> values) {
            addCriterion("supplementaryscore in", values, "supplementaryscore");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreNotIn(List<Float> values) {
            addCriterion("supplementaryscore not in", values, "supplementaryscore");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreBetween(Float value1, Float value2) {
            addCriterion("supplementaryscore between", value1, value2, "supplementaryscore");
            return (Criteria) this;
        }

        public Criteria andSupplementaryscoreNotBetween(Float value1, Float value2) {
            addCriterion("supplementaryscore not between", value1, value2, "supplementaryscore");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreIsNull() {
            addCriterion("rebuildscore is null");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreIsNotNull() {
            addCriterion("rebuildscore is not null");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreEqualTo(Float value) {
            addCriterion("rebuildscore =", value, "rebuildscore");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreNotEqualTo(Float value) {
            addCriterion("rebuildscore <>", value, "rebuildscore");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreGreaterThan(Float value) {
            addCriterion("rebuildscore >", value, "rebuildscore");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("rebuildscore >=", value, "rebuildscore");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreLessThan(Float value) {
            addCriterion("rebuildscore <", value, "rebuildscore");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreLessThanOrEqualTo(Float value) {
            addCriterion("rebuildscore <=", value, "rebuildscore");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreIn(List<Float> values) {
            addCriterion("rebuildscore in", values, "rebuildscore");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreNotIn(List<Float> values) {
            addCriterion("rebuildscore not in", values, "rebuildscore");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreBetween(Float value1, Float value2) {
            addCriterion("rebuildscore between", value1, value2, "rebuildscore");
            return (Criteria) this;
        }

        public Criteria andRebuildscoreNotBetween(Float value1, Float value2) {
            addCriterion("rebuildscore not between", value1, value2, "rebuildscore");
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