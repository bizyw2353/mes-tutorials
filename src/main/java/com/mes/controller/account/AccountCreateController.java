package com.mes.controller.account;

import com.mes.controller.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AccountCreateController implements Controller {

    private static final String METHOD = "GET";

    @Override
    public String getMethod() {
        return AccountCreateController.METHOD;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        return "/account/accountCreate.jsp";
    }
}
