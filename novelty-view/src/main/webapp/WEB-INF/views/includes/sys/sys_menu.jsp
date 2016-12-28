<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${not empty menuList }">
    <c:forEach items="${menuList }" var="menu">
        <li class="menu-dropdown classic-menu-dropdown "><a href="javascript:;"><i class="${menu.icon }"></i>
                ${menu.name } <span class="arrow"></span> </a>
            <ul class="dropdown-menu pull-left ${menu.subClassName }">
                <c:if test="${not empty menu.subMenuList }">
                    <c:forEach items="${menu.subMenuList }" var="subMenu">
                        <li class=" "><a
                            href="${empty subMenu.url ? 'javascript:;' : context_root.concat(subMenu.url) }"
                            class="nav-link freedom-menu-a" data-test="${subMenu.name }"
                            data-freedom-page-title="${subMenu.name }"> <i class="${subMenu.icon }"></i>
                                ${subMenu.name }
                        </a></li>
                    </c:forEach>
                </c:if>
            </ul></li>
    </c:forEach>
</c:if>

<li class="menu-dropdown mega-menu-dropdown  mega-menu-full"><a href="javascript:;"> 界面组件 <span class="arrow"></span>
</a>
    <ul class="dropdown-menu" style="min-width:">
        <li>
            <div class="mega-menu-content">
                <div class="row">
                    <div class="col-md-3">
                        <ul class="mega-menu-submenu">
                            <li>
                                <h3>Components 1</h3>
                            </li>
                            <li><a class="freedom-menu-a" href="${context_root }/ui/font_awesome"> Font Awesome
                            </a></li>
                        </ul>
                    </div>
                    <div class="col-md-3">
                        <ul class="mega-menu-submenu">
                            <li>
                                <h3>Components 2</h3>
                            </li>
                            <li><a class="freedom-menu-a" href="${context_root }/ui/bootstrap_switch"> Bootstrap Switch </a></li>
                        </ul>
                    </div>
                    <div class="col-md-3">
                        <ul class="mega-menu-submenu">
                            <li>
                                <h3>Components 3</h3>
                            </li>
                            <li><a href="javascript:;"> Bootstrap File Input </a></li>
                        </ul>
                    </div>
                    <div class="col-md-3">
                        <ul class="mega-menu-submenu">
                            <li>
                                <h3>Components 4</h3>
                            </li>
                            <li><a href="javascript:;"> Code Editors </a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </li>
    </ul></li>
