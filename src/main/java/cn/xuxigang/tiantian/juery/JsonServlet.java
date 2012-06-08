/**
 * 
 */
package cn.xuxigang.tiantian.juery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xuxigang
 * 
 */
public class JsonServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");

        // juery 不支持单引号
        String json = "{\"name\":\"xuxigang\",\"age\":\"29\"}";

        PrintWriter out = resp.getWriter();
        out.print(json);
        out.flush();
        out.close();
    }

}
