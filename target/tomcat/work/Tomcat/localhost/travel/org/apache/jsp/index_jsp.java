/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-07 06:28:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>黑马旅游网</title>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"js/jquery-3.3.1.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!--导入布局js，共享header和footer-->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/include.js\"></script>\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--引入头部-->\n");
      out.write("<div id=\"header\"></div>\n");
      out.write("<!-- banner start-->\n");
      out.write("<section id=\"banner\">\n");
      out.write("    <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\" data-interval=\"2000\">\n");
      out.write("        <!-- Indicators -->\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("            <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("            <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("        </ol>\n");
      out.write("        <!-- Wrapper for slides -->\n");
      out.write("        <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("            <div class=\"item active\">\n");
      out.write("                <img src=\"images/banner_1.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <img src=\"images/banner_2.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <img src=\"images/banner_3.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Controls -->\n");
      out.write("        <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Previous</span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<!-- banner end-->\n");
      out.write("<!-- 旅游 start-->\n");
      out.write("<section id=\"content\">\n");
      out.write("    <!-- 黑马精选start-->\n");
      out.write("    <section class=\"hemai_jx\">\n");
      out.write("        <div class=\"jx_top\">\n");
      out.write("            <div class=\"jx_tit\">\n");
      out.write("                <img src=\"images/icon_5.jpg\" alt=\"\">\n");
      out.write("                <span>黑马精选</span>\n");
      out.write("            </div>\n");
      out.write("            <!-- Nav tabs -->\n");
      out.write("            <ul class=\"jx_tabs\" role=\"tablist\">\n");
      out.write("                <li role=\"presentation\" class=\"active\">\n");
      out.write("                    <span></span>\n");
      out.write("                    <a href=\"#popularity\" aria-controls=\"popularity\" role=\"tab\" data-toggle=\"tab\">人气旅游</a>\n");
      out.write("                </li>\n");
      out.write("                <li role=\"presentation\">\n");
      out.write("                    <span></span>\n");
      out.write("                    <a href=\"#newest\" aria-controls=\"newest\" role=\"tab\" data-toggle=\"tab\">最新旅游</a>\n");
      out.write("                </li>\n");
      out.write("                <li role=\"presentation\">\n");
      out.write("                    <span></span>\n");
      out.write("                    <a href=\"#theme\" aria-controls=\"theme\" role=\"tab\" data-toggle=\"tab\">主题旅游</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"jx_content\">\n");
      out.write("            <!-- Tab panes -->\n");
      out.write("            <div class=\"tab-content\">\n");
      out.write("                <div role=\"tabpanel\" class=\"tab-pane active\" id=\"popularity\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div role=\"tabpanel\" class=\"tab-pane\" id=\"newest\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_1.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_1.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_1.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_1.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div role=\"tabpanel\" class=\"tab-pane\" id=\"theme\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_2.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_2.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_2.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <img src=\"images/jiangxuan_2.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"has_border\">\n");
      out.write("                                    <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                    <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- 黑马精选end-->\n");
      out.write("    <!-- 国内游 start-->\n");
      out.write("    <section class=\"hemai_jx\">\n");
      out.write("        <div class=\"jx_top\">\n");
      out.write("            <div class=\"jx_tit\">\n");
      out.write("                <img src=\"images/icon_6.jpg\" alt=\"\">\n");
      out.write("                <span>国内游</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"heima_gn\">\n");
      out.write("            <div class=\"guonei_l\">\n");
      out.write("                <img src=\"images/guonei_1.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"guone_r\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- 国内游 end-->\n");
      out.write("    <!-- 境外游 start-->\n");
      out.write("    <section class=\"hemai_jx\">\n");
      out.write("        <div class=\"jx_top\">\n");
      out.write("            <div class=\"jx_tit\">\n");
      out.write("                <img src=\"images/icon_7.jpg\" alt=\"\">\n");
      out.write("                <span>境外游</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"heima_gn\">\n");
      out.write("            <div class=\"guonei_l\">\n");
      out.write("                <img src=\"images/jiangwai_1.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"guone_r\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"route_detail.html\">\n");
      out.write("                            <img src=\"images/jiangxuan_4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"has_border\">\n");
      out.write("                                <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>\n");
      out.write("                                <div class=\"price\">网付价<em>￥</em><strong>889</strong><em>起</em></div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- 境外游 end-->\n");
      out.write("</section>\n");
      out.write("<!-- 旅游 end-->\n");
      out.write("<!--导入底部-->\n");
      out.write("<div id=\"footer\"></div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
