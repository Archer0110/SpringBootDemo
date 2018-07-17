package llx.example.demo01.dao;

import llx.example.demo01.entity.Area;

import java.util.List;

//定义增删改查的方法
public interface AreaDao {
    /**
     * 获取全部区域信息
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据id查询区域信息
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 增加区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 修改区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaID
     * @return
     */
    int deleteArea(int areaID);


}
