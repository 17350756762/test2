package com.ssm.util;
import javax.servlet.http.HttpServletRequest;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.Emp;

/**
 * @author shkstart
 * @create 2020-09-05 11:45
 */
public class PageUtil {
    public static String getPageInfo(PageInfo<Emp> pageInfo, HttpServletRequest request) {

        String path = request.getContextPath() + "/";//返回项目名称：SSM_ssg/
        StringBuilder builder = new StringBuilder();

        //拼接首页
        builder.append("<a href='"+path+"emps/1'>首页</a>");
        builder.append("&nbsp;&nbsp;");

        //拼接上一页
        if(pageInfo.isHasPreviousPage()) {
            builder.append("<a href='"+path+"emps/"+pageInfo.getPrePage()+"'>上一页</a>");
            builder.append("&nbsp;&nbsp;");
        }else {
            builder.append("上一页");
            builder.append("&nbsp;&nbsp;");
        }

        //拼接页码
        int[] nums = pageInfo.getNavigatepageNums();//获得所有导航页号
        for (int i : nums) {
            if(i == pageInfo.getPageNum()) {//pageInfo.getPageNum()获取当前页码
                builder.append("<a style='color:red;' href='"+path+"emps/"+i+"'>"+i+"</a>");
                builder.append("&nbsp;&nbsp;");
            }else {
                builder.append("<a href='"+path+"emps/"+i+"'>"+i+"</a>");
                builder.append("&nbsp;&nbsp;");
            }
        }

        //拼接下一页
        if(pageInfo.isHasNextPage()) {
            builder.append("<a href='"+path+"emps/"+pageInfo.getNextPage()+"'>下一页</a>");
            builder.append("&nbsp;&nbsp;");
        }else {
            builder.append("下一页");
            builder.append("&nbsp;&nbsp;");
        }

        //拼接尾页
        builder.append("<a href='"+path+"emps/"+pageInfo.getPages()+"'>尾页</a>");
        builder.append("&nbsp;&nbsp;");

        return builder.toString();

    }

}
