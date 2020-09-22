package cn.scoreanalysis.system.util;

/**
 *layUI数据表格渲染工具类
 */
public class DataTableUtil {

    private String msg;//返回的消息

    private Integer code;//状态码

    private Integer count;//总记录数

    private Object data;//数据

    private Integer page;

    private Integer limit;//每页显示的数据条数

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public DataTableUtil() {
    }

    public DataTableUtil(String msg, Integer code, Integer count, Object data) {
        this.msg = msg;
        this.code = code;
        this.count = count;
        this.data = data;
    }


}
