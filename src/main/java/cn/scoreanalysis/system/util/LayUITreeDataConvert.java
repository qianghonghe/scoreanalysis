package cn.scoreanalysis.system.util;

import java.util.List;
import java.util.Map;

/**
 * 转换查询结果集中的数据为layUI树形结构能解析的格式
 * [{
 *     "title":"value",//一级菜单
 *     "id":"value",
 *     children:[{
 *       "title":"value",//二级菜单
 *  *     "id":"value",
 *     }]
 * }]
 */
public class LayUITreeDataConvert {
    private Integer id;

    private String title;

    private List<Map<String,Object>> children;

    public List<Map<String, Object>> getChildren() {
        return children;
    }

    public void setChildren(List<Map<String, Object>> children) {
        this.children = children;
    }

    //private Map<String,Object> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Map<String, Object> getChildren() {
//        return children;
//    }

//    public void setChildren(Map<String, Object> children) {
//        this.children = children;
//    }
}
